package data;

import domain.Liga;

public class Ligadata {
	public Liga visliga(String liganavn){
		try(DataAccess access = new DataAccess()){
			try{
				visliga(access, liganavn);
				access.commit();
			}catch(Exception e){
				access.rollback();
				throw e; 
			}
		}
		return ;
	}

}
