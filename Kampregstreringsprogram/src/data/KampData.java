package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Kamp;

public class KampData {
	public boolean gemKamp(Kamp kamp) {
		return false;
	}

	public Kamp opretKamp(Kamp kamp) {

		try (DataAccess access = new DataAccess()) {
			try {
				opretKamp(access, kamp);
				access.commit();
			} catch (Exception e) {
				access.rollback();
				throw e;
			}
		}
		return kamp;
	}

	public Kamp opretKamp(DataAccess access, Kamp kamp) {
		try (PreparedStatement statement = access.getConnection().prepareStatement(
				"INSERT INTO kamp(kampid, hjemmehold, hjemmehold_maal, hjemmehold_udvisninger, udehold, udehold_maal, udehold_udvisninger, kampstatus) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");) {
			statement.setInt(1, kamp.getKampid());
			statement.setString(2, kamp.getHjemmehold());
			statement.setInt(3, kamp.getHjemmehold_maal());
			statement.setInt(4, kamp.getHjemmehold_udvisning());
			statement.setString(5, kamp.getUdehold());
			statement.setInt(6, kamp.getUdehold_maal());
			statement.setInt(7, kamp.getUdehold_udvisning());
			statement.setInt(8, kamp.getKampstatus());
			int antal = statement.executeUpdate();
			System.out.println("Antal rækker berørt : " + antal);
		} catch (SQLException e) {
			throw new RuntimeException("Noget gik galt", e);
		}
		return kamp;
	}

	public void opdaterKamp(Kamp kamp) {
		try (DataAccess access = new DataAccess()) {
			try {
				opdaterKamp(access, kamp);
				access.commit();
			} catch (Exception e) {
				access.rollback();
				throw e;
			}
		}

	}

	public void opdaterKamp(DataAccess access, Kamp kamp) {
		try (PreparedStatement statement = access.getConnection().prepareStatement(
				"UPDATE kamp SET hjemmehold_maal=?, hjemmehold_udvisninger=? WHERE kampid=? AND hjemmehold=?");
				PreparedStatement statement1 = access.getConnection().prepareStatement(
						"UPDATE kamp SET udehold_maal=?, udehold_udvisninger=? WHERE kampid=? AND udehold=?");) {

			statement.setInt(1, kamp.getHjemmehold_maal());
			statement.setInt(2, kamp.getHjemmehold_udvisning());
			statement.setInt(3, kamp.getKampid());
			statement.setString(4, kamp.getHjemmehold());
			int antal = statement.executeUpdate();
			System.out.println("Antal rækker berørt : " + antal);
			if (antal != 1) {
				throw new RuntimeException("Kamp kunne ikke opdateres");
			}
			statement1.setInt(1, kamp.getUdehold_maal());
			statement1.setInt(2, kamp.getUdehold_udvisning());
			statement1.setInt(3, kamp.getKampid());
			statement1.setString(4, kamp.getUdehold());
			int antal1 = statement1.executeUpdate();
			System.out.println("Antal rækker betørt : " + antal1);
			if (antal1 != 1) {
				throw new RuntimeException("Kamp kunne ikke opdateres");
			}

		} catch (SQLException e) {
			throw new RuntimeException("SQLException caught", e);
		}

	}

	public List<Kamp> sogKampe(Kamp kamp) {
		List<Kamp> list = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
				PreparedStatement statement = connection.prepareStatement(
						"SELECT * FROM kamp WHERE upper(hjemmehold) LIKE ? OR upper(udehold) LIKE ?;");) {
//			SELECT hjemmehold, udehold 
//			FROM kamp 
//			WHERE upper(hjemmehold) LIKE ''
//			OR upper(udehold) LIKE 'FCK';
			statement.setString(1, "%" + kamp.getHjemmehold().toUpperCase() + "%");
			statement.setString(2, "%" + kamp.getUdehold().toUpperCase() + "%");

			try (ResultSet resultset = statement.executeQuery();) {

				while (resultset.next()) {
					Kamp kampe = new Kamp();
					kampe.setHjemmehold(resultset.getString("Hjemmehold"));
					kampe.setUdehold(resultset.getString("Udehold"));
					kampe.setKampid(resultset.getInt("Kampid"));
					kampe.setHjemmehold_maal(resultset.getInt("Hjemmehold_maal"));
					kampe.setHjemmehold_udvisning(resultset.getInt("Hjemmehold_udvisninger"));
					kampe.setUdehold_maal(resultset.getInt("Udehold_maal"));
					kampe.setUdehold_udvisning(resultset.getInt("Udehold_udvisninger"));
					kampe.setKampid(resultset.getInt("Kampid"));

					list.add(kampe);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return list;
	}
}
