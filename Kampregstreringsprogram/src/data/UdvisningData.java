package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import domain.Kamp;
import domain.Udvisning;

public class UdvisningData {

	Kamp kamp = new Kamp();
	public void opdaterUdvisning(Udvisning udvisning){
		try(DataAccess access = new DataAccess()){
			try{
				opdaterUdvisning(access, udvisning);
				access.commit();
			}catch(Exception e){
				access.rollback();
				throw e; 
			}
		}
	}
	public void opdaterUdvisning(DataAccess access, Udvisning udvisning){
		try(PreparedStatement statement = access.getConnection().prepareStatement("INSERT INTO udvisning(kampid, holdnavn, udvisning, tid)VALUES (?, ?, ?, ?)");){
			statement.setInt(1, kamp.getKampid());
			statement.setString(2, udvisning.getHoldnavn());
			statement.setInt(3, udvisning.getUdvisning());
			statement.setTime(4, udvisning.getTid());
			int antal = statement.executeUpdate();
			System.out.println("Antal rækker berørt : "+ antal);
		}catch(SQLException e){
			throw new RuntimeException("Udvisning kunne ikke opdateres"); 
		}
				
	}
}
