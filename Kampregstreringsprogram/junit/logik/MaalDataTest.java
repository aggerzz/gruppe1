package logik;

import java.sql.Time;

import org.junit.Test;

import domain.Maal;
import logic.KampRegProImpl;
import logic.KampRegProInterface;

public class MaalDataTest {

	@Test
	public void opdaterMaal() {
		KampRegProInterface kpri = new KampRegProImpl();
		Maal maal = new Maal();
		maal.setKampid(1);
		maal.setHoldnavn("FCM");
		maal.setMaal(1);
		maal.setTid(Time.valueOf("00:02:15"));
		kpri.opdaterMaal(maal);
		//fail("Not yet implemented");
	}

}
