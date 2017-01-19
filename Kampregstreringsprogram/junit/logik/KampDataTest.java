package logik;

import org.junit.Test;

import domain.Kamp;
import logic.KampRegProImpl;
import logic.KampRegProInterface;

public class KampDataTest {

	@Test
	public void opretKamp() {
		KampRegProInterface krpi = new KampRegProImpl();
		Kamp kamp = new Kamp();
		kamp.setKampid(1);
		kamp.setHjemmehold("FCM");
		kamp.setHjemmehold_maal(0);
		kamp.setHjemmehold_udvisning(0);
		kamp.setUdehold("FCK");
		kamp.setUdehold_maal(0);
		kamp.setUdehold_udvisning(0);
		kamp.setKampstatus(0);
		krpi.opretKamp(kamp);
		
		//fail("Not yet implemented");
	}

	@Test
	public void opdaterKamp(){
		KampRegProInterface krpi = new KampRegProImpl();
		Kamp kamp = new Kamp();
		kamp.setHjemmehold_maal(1);
		kamp.setHjemmehold_udvisning(0);
		kamp.setUdehold_maal(1);
		kamp.setUdehold_udvisning(0);
		kamp.setKampid(1);
		kamp.setHjemmehold("FCM");
		kamp.setUdehold("FCK");
		krpi.opdaterKamp(kamp);
	}

}
