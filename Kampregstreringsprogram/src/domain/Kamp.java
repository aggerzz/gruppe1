package domain;

import java.util.List;

public class Kamp {
	private int kampid;
	private String hjemmehold;
	private String udehold;
	private int hjemmehold_maal;
	private int hjemmehold_udvisning;
	private int udehold_maal;
	private int udehold_udvisning;
	private int kampstatus;
	
	public int getKampid() {
		return kampid;
	}
	public void setKampid(int kampid) {
		this.kampid = kampid;
	}
	public String getHjemmehold() {
		return hjemmehold;
	}
	public void setHjemmehold(String hjemmehold) {
		this.hjemmehold = hjemmehold;
	}
	public String getUdehold() {
		return udehold;
	}
	public void setUdehold(String udehold) {
		this.udehold = udehold;
	}
	public int getHjemmehold_maal() {
		return hjemmehold_maal;
	}
	public void setHjemmehold_maal(int hjemmehold_maal) {
		this.hjemmehold_maal = hjemmehold_maal;
	}
	public int getHjemmehold_udvisning() {
		return hjemmehold_udvisning;
	}
	public void setHjemmehold_udvisning(int hjemmehold_udvisning) {
		this.hjemmehold_udvisning = hjemmehold_udvisning;
	}
	public int getUdehold_maal() {
		return udehold_maal;
	}
	public void setUdehold_maal(int udehold_maal) {
		this.udehold_maal = udehold_maal;
	}
	public int getUdehold_udvisning() {
		return udehold_udvisning;
	}
	public void setUdehold_udvisning(int udehold_udvisning) {
		this.udehold_udvisning = udehold_udvisning;
	}
	public int getKampstatus() {
		return kampstatus;
	}
	public void setKampstatus(int kampstatus) {
		this.kampstatus = kampstatus;
	}

	
}
