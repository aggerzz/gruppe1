package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
