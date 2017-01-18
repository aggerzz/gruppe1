package logic;

import java.util.List;

import data.KampData;
import domain.Kamp;
import domain.Liga;
import domain.Maal;
import domain.Udvisning;

public class KampRegProImpl implements KampRegProInterface {
	private KampData kam = new KampData();

	@Override
	public Kamp opretKamp(String hjemmehold, String udehold) {
		Kamp kamp = new Kamp();
		kamp.setHjemmehold(hjemmehold);
		kamp.setUdehold(udehold);
		boolean transaktionstatus = kam.gemKamp(kamp);
		if(transaktionstatus == true)
			return kamp;
		else 
			return null;
	}

	@Override
	public void opdaterKamp(Kamp kamp) {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void opdaterUdvisning(Udvisning udvisning) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Liga visLiga_Oversigt(Liga liga) {
		// TODO Auto-generated method stub
		return null;
	}

	
}