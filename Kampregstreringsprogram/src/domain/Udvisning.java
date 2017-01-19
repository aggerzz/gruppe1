package domain;

import java.sql.Time;

public class Udvisning {
	private Kamp kampid;
	private String holdnavn;
	private Time tid;
	private int udvisning;
	
	
	public Time getTid() {
		return tid;
	}
	public void setTid(Time tid) {
		this.tid = tid;
	}
	public Kamp getKampid() {
		return kampid;
	}
	public void setKampid(Kamp kampid) {
		this.kampid = kampid;
	}
	public String getHoldnavn() {
		return holdnavn;
	}
	public void setHoldnavn(String holdnavn) {
		this.holdnavn = holdnavn;
	}
	public int getUdvisning() {
		return udvisning;
	}
	public void setUdvisning(int udvisning) {
		this.udvisning = udvisning;
	}
	
	
}
