package logic;

import java.util.List;

import data.KampData;
import data.MaalData;
import data.UdvisningData;
import domain.Hold;
import domain.Kamp;
import domain.Liga;
import domain.Maal;
import domain.Udvisning;

public class KampRegProImpl implements KampRegProInterface {
	private KampData kam = new KampData();
	private MaalData md = new MaalData(); 
	private UdvisningData ud = new UdvisningData(); 

	@Override
	public Kamp opretKamp(Kamp kamp) {
		kam.opretKamp(kamp);
		boolean transaktionstatus = kam.gemKamp(kamp);
		if(transaktionstatus == true)
			return kamp;
		else 
			return null;
	}

	@Override
	public void opdaterKamp(Kamp kamp) {
		kam.opdaterKamp(kamp);
		// TODO Auto-generated method stub.

	}

	@Override
	public List<Kamp> visKampe(String holdnavn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void opdaterLiga(Liga liga) {
		// TODO Auto-generated method stub

	}

	@Override
	public void opdaterMaal(Maal maal) {
		md.opdaterMaal(maal);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void opdaterUdvisning(Udvisning udvisning) {
		ud.opdaterUdvisning(udvisning);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Hold visLiga_Oversigt(String liganavn) {
		// TODO Auto-generated method stub
		return null;
	}

	
}