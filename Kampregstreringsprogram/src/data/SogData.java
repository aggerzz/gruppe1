package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Soeg;

public class SogData {
	public List<Soeg> sogListe(Soeg sog) {
		List<Soeg> list = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
				PreparedStatement statement = connection.prepareStatement(
						"SELECT holdid, holdnavn FROM hold WHERE (holdid) LIKE ? and (holdnavn) LIKE ?");) {

			statement.setString(1, "%" + sog.getHoldid() + "%");
			statement.setString(2, "%" + sog.getHoldnavn() + "%");

			try (ResultSet resultset = statement.executeQuery();) {

				while (resultset.next()) {
					Soeg soeg = new Soeg();
					soeg.setHoldid(resultset.getInt("holdid"));
					soeg.setHoldnavn(resultset.getString("holdnavn"));
					list.add(soeg);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return list;
	}
}