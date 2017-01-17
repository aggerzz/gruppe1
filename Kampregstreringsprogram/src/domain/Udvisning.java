package domain;

import java.sql.Time;
import java.util.List;

public class Udvisning {
	private Time tid;
	private List <Hold> hold;
	
	
	public Time getTid() {
		return tid;
	}
	public void setTid(Time tid) {
		this.tid = tid;
	}
	public List <Hold> getHold() {
		return hold;
	}
	public void setHold(Hold hold) {
		this.hold.add(hold);
	}
	
}
