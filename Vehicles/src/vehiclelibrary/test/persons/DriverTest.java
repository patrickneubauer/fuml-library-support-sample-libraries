package vehiclelibrary.test.persons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import vehiclelibrary.persons.Driver;
import vehiclelibrary.persons.Driver;

/**
 * This class tests the {@link Driver} class.
 * 
 * @author patrickneubauer
 *
 */
public class DriverTest {
	
	@Test
	public void DriverConstructorTest() {
		Driver driver = new Driver();
		assertTrue(driver instanceof Driver);
		assertTrue(driver.hasCarLicense());
		assertFalse(driver.hasMotorCycleLicense());
		assertFalse(driver.hasTruckLicense());
	}
	
	@Test
	public void DriverToStringTest() {
		Driver driver = new Driver();
		assertEquals("The Driver John Public (American) has licenses to drive cars; ", driver.toString());
	}
	
	@Test
	public void DriverNoLicenseToStringTest() {
		Driver driver = new Driver(false, false, false);
		assertEquals("The Driver John Public (American) has no car, motorcycle or truck license.", driver.toString());
	}

}
