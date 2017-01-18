package data;

import java.sql.SQLException;

import domain.Liga;

public class Ligadata {
	public Liga visLiga_Oversigt(String liganavn)throws SQLException{
		try(DataAccess access = new DataAccess()){
			try{
				Liga liga = visLiga_Oversigt(access, liganavn);
				access.commit();
			return liga;
			}catch(Exception e){
				access.rollback();
				throw e; 
			}
		}
		
	}

}
