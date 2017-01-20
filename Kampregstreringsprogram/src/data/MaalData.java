package data;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import domain.Kamp;
import domain.Maal;

public class MaalData {
	Kamp kamp = new Kamp(); 
	
	public void opdaterMaal(Maal maal){
		try(DataAccess access = new DataAccess()){
			try{
				opdaterMaal(access, maal);
				access.commit();
			}catch(Exception e){
				access.rollback();
				throw e; 
			}
		}
	}
	public void opdaterMaal(DataAccess access, Maal maal){
		try(PreparedStatement statement = access.getConnection().prepareStatement("INSERT INTO maal(kampid, holdnavn, maal,tid) VALUES(?, ?, ?, ?)");){
			statement.setInt(1, maal.getKampid());
			statement.setString(2, maal.getHoldnavn());
			statement.setInt(3, maal.getMaal());
			statement.setTime(4, maal.getTid());
			int antal = statement.executeUpdate();
			System.out.println("Antal rækker berørt : " + antal);
			
		}catch(SQLException e){
			throw new RuntimeException("Maal kunne ikke gemmes"); 
		}
				
	}
}
