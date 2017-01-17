package domain;

public class Hold {
	private boolean hjemme;
	private boolean ude;
	private String navn;
	private int kampevundet;
	private int kampetabt;
	private int kampeuafgjort;
	private int kampespillet;

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public boolean isHjemme() {
		return hjemme;
	}

	public void setHjemme(boolean hjemme) {
		this.hjemme = hjemme;
	}

	public boolean isUde() {
		return ude;
	}

	public void setUde(boolean ude) {
		this.ude = ude;
	}

	public int getKampevundet() {
		return kampevundet;
	}

	public void setKampevundet(int kampevundet) {
		this.kampevundet = kampevundet;
	}

	public int getKampetabt() {
		return kampetabt;
	}

	public void setKampetabt(int kampetabt) {
		this.kampetabt = kampetabt;
	}

	public int getKampeuafgjort() {
		return kampeuafgjort;
	}

	public void setKampeuafgjort(int kampeuafgjort) {
		this.kampeuafgjort = kampeuafgjort;
	}

	public int getKampespillet() {
		return kampespillet;
	}

	public void setKampespillet(int kampespillet) {
		this.kampespillet = kampespillet;
	}

}
