package logic;

import java.util.List;

import data.KampData;
import domain.Hold;
import domain.Kamp;
import domain.Liga;

public class KampRegProImpl implements KampRegProInterface {
	private KampData kam = new KampData();

	@Override
	public Kamp opretKamp(Hold hjemmehold, Hold udehold) {
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

	@Override
	public List<Hold> visHold(String holdnavn) {
		// TODO Auto-generated method stub
		public List<Hold> listHold() throws SQLException {
			System.out.println("Liste over hold");
			List<Postering> holdlist = new ArrayList<>();
			start();
			statement = connection.prepareStatement("select holdnavn from hold");
			resultset = statement.executeQuery();

			while (resultset.next()) {
				String holdnavn = resultset.getString("holdnavn");
								
				Holdliste tmphold = new Holdliste(holdnavn);
				holdlist.add(tmphold);
			}
			return holdlist;
		}
		return null;
	}
}