package domain;

import java.time.LocalTime;

public class Maal {
	private int kampid;
	private String holdnavn;
	private LocalTime tid;
	private int maal;

	public LocalTime getTid() {
		return tid;
	}

	public void setTid(LocalTime tid) {
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
