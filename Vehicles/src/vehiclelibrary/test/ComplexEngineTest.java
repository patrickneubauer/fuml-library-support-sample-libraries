/**
 * 
 */
package vehiclelibrary.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import vehiclelibrary.ComplexEngine;
import vehiclelibrary.Fuel.FUEL_TYPE;

/**
 * This class tests the ComplexEngine class.
 *  
 * @author Patrick Neubauer
 *
 */
public class ComplexEngineTest {
	
	@Test
	public void constructorTest() {
		ComplexEngine complexEngine = new ComplexEngine();
		assertEquals(0, complexEngine.getHorsePower());
		assertEquals("NoVendor", complexEngine.getVendor());
		assertEquals(FUEL_TYPE.LIQUID, complexEngine.getFuel().getFuelType());
	}

}
