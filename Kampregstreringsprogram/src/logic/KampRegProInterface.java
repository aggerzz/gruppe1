package logic;

import java.util.List;

import domain.Kamp;
import domain.Liga;

public interface KampRegProInterface {
	public Kamp opretKamp(String hjemmehold, String udehold);
	public void opdaterKamp(Kamp kamp);
	public List<Kamp> visKampe(String holdnavn);
	public void opdaterLiga(Liga liga);
}
