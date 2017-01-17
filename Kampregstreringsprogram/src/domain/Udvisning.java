package domain;

import java.sql.Time;
import java.util.List;

public class Udvisning {
	private Kamp kampid;
	private Hold holdnavn;
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
	public Hold getHoldnavn() {
		return holdnavn;
	}
	public void setHoldnavn(Hold holdnavn) {
		this.holdnavn = holdnavn;
	}
	public int getUdvisning() {
		return udvisning;
	}
	public void setUdvisning(int udvisning) {
		this.udvisning = udvisning;
	}
	
	
}
