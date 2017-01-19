package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Hold;

public class Ligadata {
	public Hold visLiga_Oversigt(String liganavn) throws Exception{
		try(DataAccess access = new DataAccess()){
			try{
				Hold liga = (Hold) visLiga_Oversigt(access, liganavn);
				access.commit();
			return liga;
			}catch(Exception e){
				access.rollback();
				throw e; 
			}
		}
		
	}
	public List<Hold> visLiga_Oversigt(DataAccess access, String liganavn)throws SQLException{
		String holdnavn;
		List<Hold> holdlist = new ArrayList<Hold>();
		PreparedStatement statement = access.getConnection().prepareStatement("SELECT holdnavn FROM hold where liganavn = ?");
					statement.setString(1, liganavn);
					ResultSet resultset = statement.executeQuery();
						while (resultset.next()){
							holdnavn = resultset.getString("holdnavn");
							holdlist.add(new Hold(holdnavn,liganavn));
						}
					
		return holdlist;
	}

}
