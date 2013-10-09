package vehiclelibrary.test.persons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import vehiclelibrary.persons.Captain;

/**
 * This class tests the {@link Captain} class.
 * 
 * @author patrickneubauer
 *
 */
public class CaptainTest {

	@Test
	public void CaptainConstructorTest() {
		Captain captain = new Captain();
		assertTrue(captain instanceof Captain);
		assertTrue(captain.hasSeaShipLicense());
		assertFalse(captain.hasSpaceShipLicense());
	}
	
	@Test
	public void CaptainToStringTest() {
		Captain captain = new Captain();
		assertEquals("The Captain NoFirstName NoLastName (NoNationality) has licenses to command seaships; ", captain.toString());
	}
	
	@Test
	public void CaptainNoLicenseToStringTest() {
		Captain captain = new Captain(false, false);
		assertEquals("The Captain NoFirstName NoLastName (NoNationality) has no sea- or spaceship license.", captain.toString());
	}
	
}
