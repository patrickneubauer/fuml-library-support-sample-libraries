/**
 * 
 */
package vehiclelibrary.test.vehicles;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import vehiclelibrary.vehicles.SimpleEngine;

/**
 * This class tests the SimpleEngine class.
 *  
 * @author Patrick Neubauer
 *
 */
public class SimpleEngineTest {
	
	@Test
	public void noArgumentConstructorTest() {
		SimpleEngine simpleEngine = new SimpleEngine();
		assertEquals(0, simpleEngine.getHorsePower());
		assertEquals("NoVendor", simpleEngine.getVendor());
	}
	
	@Test
	public void horsePowerArgumentConstructorTest() {
		SimpleEngine simpleEngine = new SimpleEngine(100);
		assertEquals(100, simpleEngine.getHorsePower());
		assertEquals("NoVendor", simpleEngine.getVendor());
	}

}
