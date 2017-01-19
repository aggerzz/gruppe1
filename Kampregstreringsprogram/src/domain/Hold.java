package domain;

public class Hold {
	
	private int holdid;
	private String holdnavn;
	private int ligaid;
	private String liganavn;
	
	public Hold(String holdnavn,String liganavn){
		this.holdnavn=holdnavn;
		this.liganavn=liganavn;
	}
	

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

	public String getLiganavn() {
		return liganavn;
	}

	public void setLiganavn(String liganavn) {
		this.liganavn = liganavn;
	}

	
}
