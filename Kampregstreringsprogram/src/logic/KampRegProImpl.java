package logic;

import java.util.List;

import data.KampData;
import domain.Hold;
import domain.Kamp;
import domain.Liga;

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
		// TODO Auto-generated method stub

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

	
}