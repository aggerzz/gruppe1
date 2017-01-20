package domain;

import java.sql.Time;

public class Maal {
	private int kampid;
	private String holdnavn;
	private Time tid;
	private int maal;

	public Time getTid() {
		return tid;
	}

	public void setTid(Time tid) {
		this.tid = tid;
	}

	public int getKampid() {
		return kampid;
	}

	public void setKampid(int kampid) {
		this.kampid = kampid;
	}

	public String getHoldnavn() {
		return holdnavn;
	}

	public void setHoldnavn(String holdnavn) {
		this.holdnavn = holdnavn;
	}

	public int getMaal() {
		return maal;
	}

	public void setMaal(int maal) {
		this.maal = maal;
	}

	
}
