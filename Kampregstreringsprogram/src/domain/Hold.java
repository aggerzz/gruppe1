package domain;

public class Hold {
	
	private int holdid;
	private String holdnavn;
	private int ligaid;
	private Liga liganavn;
	

	public String getHoldnavn() {
		return holdnavn;
	}

	public void setHoldnavn(String holdnavn) {
		this.holdnavn = holdnavn;
	}

	public int getHoldid() {
		return holdid;
	}

	public void setHoldid(int holdid) {
		this.holdid = holdid;
	}

	public int getLigaid() {
		return ligaid;
	}

	public void setLigaid(int ligaid) {
		this.ligaid = ligaid;
	}

	public Liga getLiganavn() {
		return liganavn;
	}

	public void setLiganavn(Liga liganavn) {
		this.liganavn = liganavn;
	}

	
}
