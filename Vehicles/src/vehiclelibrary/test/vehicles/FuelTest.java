/**
 * 
 */
package vehiclelibrary.test.vehicles;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import vehiclelibrary.vehicles.Fuel;
import vehiclelibrary.vehicles.Fuel.FUEL_TYPE;

/**
 * This class tests the Fuel class.
 *  
 * @author Patrick Neubauer
 *
 */
public class FuelTest {
	
	@Test
	public void noArgumentConstructorTest() {
		Fuel fuel1 = new Fuel();
		assertEquals(FUEL_TYPE.LIQUID, fuel1.getFuelType());
	}
	
	@Test
	public void fuelTypeArgumentConstructorTest() {
		Fuel fuel1 = new Fuel(FUEL_TYPE.GAS);
		assertEquals(FUEL_TYPE.GAS, fuel1.getFuelType());
	}
	
	@Test
	public void getFuelTypeTest() {
		Fuel fuel1 = new Fuel();
		assertEquals(FUEL_TYPE.LIQUID, fuel1.getFuelType());
	}
	
	@Test
	public void setFuelTypeTest() {
		Fuel fuel1 = new Fuel();
		fuel1.setFuelType(FUEL_TYPE.GAS);
		assertEquals(FUEL_TYPE.GAS, fuel1.getFuelType());
	}

}
