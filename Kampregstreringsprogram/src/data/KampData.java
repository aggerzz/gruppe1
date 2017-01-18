package data;

import java.sql.PreparedStatement;

import domain.Kamp;

public class KampData {
	public boolean gemKamp(Kamp kamp){
		return false;
	}
	public Kamp opretKamp(String hjemmehold, String udehold){
		Kamp kamp = new Kamp();
		try(DataAccess access = new DataAccess()){
			try{
				opretKamp(access, hjemmehold, udehold);
				access.commit();
			}catch(Exception e){
				access.rollback();
				throw e; 
			}
		}
		return kamp;
	}
	public Kamp opretKamp(DataAccess access, String hjemmehold, String udehold){
		try(PreparedStatement statement = access.getConnection().prepareStatement(""))
	}
}
