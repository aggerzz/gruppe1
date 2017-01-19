package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import domain.Hold;

public class Ligadata {
	public Hold visLiga_Oversigt(String liganavn){
		try(DataAccess access = new DataAccess()){
			try{
				Hold liga = visLiga_Oversigt(access, liganavn);
				access.commit();
			return liga;
			}catch(Exception e){
				access.rollback();
				throw e; 
			}
		}
		
	}
	public Hold visLiga_Oversigt(DataAccess access, String liganavn){
		Hold hold = new Hold();
		try (PreparedStatement statement = access.getConnection().prepareStatement("SELECT holdnavn FROM hold where liganavn = ?")){
					statement.setString(1, liganavn);
					try (ResultSet resultset = statement.executeQuery();){
						if (resultset.next()){
							String holdnavn = resultset.getString("holdnavn");
							hold.setHoldnavn(holdnavn);
							hold.setLiganavn(liganavn);
						}
						else {
							throw new RuntimeException("Liga findes ikke");
							
						}
					}
					
					
				}
				catch (SQLException e){
					e.printStackTrace();
				}
		return hold;
	}

}
