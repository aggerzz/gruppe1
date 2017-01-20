package logik;

import java.sql.Time;

import org.junit.Test;

import domain.Udvisning;
import logic.KampRegProImpl;
import logic.KampRegProInterface;

public class UdvisningDataTest {

	@Test
	public void opdaterUdvisning() {
		KampRegProInterface krpi = new KampRegProImpl();
		Udvisning udvisning = new Udvisning(); 
		udvisning.setKampid(1);
		udvisning.setHoldnavn("FCM");
		udvisning.setUdvisning(1);
		udvisning.setTid(Time.valueOf("00:10:30"));
		krpi.opdaterUdvisning(udvisning);
		//fail("Not yet implemented");
	}

}
