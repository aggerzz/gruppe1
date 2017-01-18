package logic;

import java.util.List;

import domain.Kamp;
import domain.Liga;
import domain.Maal;
import domain.Udvisning;

public interface KampRegProInterface {
	public Kamp opretKamp(String hjemmehold, String udehold);
	public void opdaterKamp(Kamp kamp);
	public List<Kamp> visKampe(String holdnavn);
	public void opdaterLiga(Liga liga);
	public void opdaterMaal(Maal maal);
	public void opdaterUdvisning(Udvisning udvisning);
	public Liga visLiga_Oversigt(String liganavn);
}
