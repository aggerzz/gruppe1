package domain;

import java.sql.Time;

public class Maal {
	private Time tid;
	private Hold hold;

	public Time getTid() {
		return tid;
	}

	public void setTid(Time tid) {
		this.tid = tid;
	}

	public Hold getHold() {
		return hold;
	}

	public void setHold(Hold hold) {
		this.hold = hold;
	}
}
