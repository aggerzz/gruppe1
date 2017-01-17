package logic;

import java.util.List;

import domain.Hold;
import domain.Kamp;
import domain.Liga;

public interface KampRegProInterface {
	public Kamp opretKamp(Hold hjemmehold, Hold udehold);
	public void opdaterKamp(Kamp kamp);
	public List<Kamp> visKampe(String holdnavn);
	public void opdaterLiga(Liga liga);
}
