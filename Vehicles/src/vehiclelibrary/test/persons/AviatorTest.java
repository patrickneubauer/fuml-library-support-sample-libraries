package vehiclelibrary.test.persons;

import static org.junit.Assert.*;

import org.junit.Test;

import vehiclelibrary.persons.Aviator;

/**
 * This class tests the {@link Aviator} class.
 * 
 * @author patrickneubauer
 *
 */
public class AviatorTest {

	@Test
	public void AviatorConstructorTest() {
		Aviator aviator = new Aviator();
		assertTrue(aviator instanceof Aviator);
		assertTrue(aviator.hasSingleEngineLicense());
		assertFalse(aviator.hasMultiEngineLicense());
		assertFalse(aviator.hasRotorcraftLicense());
		assertFalse(aviator.hasPoweredParachuteLicense());
	}
	
	@Test
	public void AviatorToStringTest() {
		Aviator aviator = new Aviator();
		assertEquals("The Aviator John Public (American) has licenses to fly single-engine airplanes; ", aviator.toString());
	}
	
	@Test
	public void AviatorNoLicenseToStringTest() {
		Aviator aviator = new Aviator(false, false, false, false);
		assertEquals("The Aviator John Public (American) has no private pilot license.", aviator.toString());
	}
	
}
