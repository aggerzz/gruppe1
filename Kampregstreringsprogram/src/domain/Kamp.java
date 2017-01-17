package domain;

import java.util.List;

public class Kamp {
	private Hold hjemmehold;
	private Hold udehold;
	private List<Maal> maal;
	private List<Udvisning> udvisninger;

	public Hold getHjemmehold() {
		return hjemmehold;
	}

	public void setHjemmehold(Hold hjemmehold) {
		this.hjemmehold = hjemmehold;
		hjemmehold.setHjemme(true);

	}

	public Hold getUdehold() {
		return udehold;
	}

	public void setUdehold(Hold udehold) {
		this.udehold = udehold;
		udehold.setUde(true);

	}

	public List<Maal> getMaal() {
		return maal;
	}

	public void setMaal(List<Maal> maal) {
		this.maal = maal;
	}

	public List<Udvisning> getUdvisninger() {
		return udvisninger;
	}

	public void setUdvisninger(List<Udvisning> udvisninger) {
		this.udvisninger = udvisninger;
	}
}
