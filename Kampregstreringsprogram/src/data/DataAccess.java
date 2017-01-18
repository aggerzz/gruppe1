package data;


import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataAccess implements Closeable {

	private Connection conn;
	
	public DataAccess() {
		try{
			this.conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			this.conn.setAutoCommit(false);
		}catch(SQLException e) {
			throw new RuntimeException(" Connection kunne ikke blive oprettet " , e);
		}
	}
	public void commit(){
		try{
			this.conn.commit();
		}catch(SQLException e){
			throw new RuntimeException(" Exception caught ", e );
		}
	}
	public void rollback(){
		try{
			this.conn.rollback();
		}catch(SQLException e){
			throw new RuntimeException(" Exception caught ", e);
		}
	}
	public void close(){
		try{
			this.conn.close();
		}catch(SQLException e){
			throw new RuntimeException(" Exception caught ", e);
		}
	}
	public Connection getConnection(){
		return this.conn;
	}
}