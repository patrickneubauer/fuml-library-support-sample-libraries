/**
 * 
 */
package vehiclelibrary.test.vehicles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import vehiclelibrary.vehicles.ComplexEngine;
import vehiclelibrary.vehicles.Fuel;
import vehiclelibrary.vehicles.SpaceShip;
import vehiclelibrary.vehicles.Fuel.FUEL_TYPE;

/**
 * This class tests the SpaceShip class.
 * 
 * @author Patrick Neubauer
 *
 */
public class SpaceShipTest {
	
	@Test
	public void constructorTest() {
		SpaceShip spaceShip = new SpaceShip();
		assertEquals(0, spaceShip.getWheels());
		assertEquals("NoName", spaceShip.getName());
		assertEquals(3, spaceShip.getMaxWarpSpeed());
		
		assertTrue(spaceShip.getEngine() instanceof ComplexEngine);
		assertTrue(spaceShip.getEngine().getFuel() instanceof Fuel);
	}
	
	@Test
	public void setNameMaxWarpSpeedTest() {
		SpaceShip spaceShip = new SpaceShip();
		spaceShip.setNameMaxWarpSpeed("Enterprise", 10);
		assertEquals("Enterprise", spaceShip.getName());
		assertEquals(10, spaceShip.getMaxWarpSpeed());
	}
	
	@Test
	public void setNameMaxWarpSpeedFuelTest() {
		SpaceShip spaceShip = new SpaceShip();
		spaceShip.setNameMaxWarpSpeedFuel("Enterprise", 10, new Fuel(FUEL_TYPE.GAS));
		assertEquals("Enterprise", spaceShip.getName());
		assertEquals(10, spaceShip.getMaxWarpSpeed());
	}

}
