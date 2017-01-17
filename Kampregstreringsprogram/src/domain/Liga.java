package domain;

import java.util.List;

public class Liga {
	private List<Hold> hold;
	private int point;
	private String navn;

	public List<Hold> getHold() {
		return hold;
	}

	public void addHold(Hold hold) {
		this.hold.add(hold);
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

}
