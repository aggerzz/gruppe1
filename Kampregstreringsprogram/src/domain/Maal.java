package domain;

import java.sql.Time;

public class Maal {
	private Kamp kampid;
	private Hold holdnavn;
	private Time tid;
	private int maal;

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

	public int getMaal() {
		return maal;
	}

	public void setMaal(int maal) {
		this.maal = maal;
	}

	
}
