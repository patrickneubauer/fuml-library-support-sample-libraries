package vehiclelibrary.test;

import static org.junit.Assert.*;

import org.junit.Test;

import vehiclelibrary.Ship;

/**
 * This class tests the ship class.
 * 
 * @author patrickneubauer
 *
 */
public class ShipTest {

	@Test
	public void ShipDefaultConstructorTest() {
		Ship ship1 = new Ship();
		assertTrue(ship1 instanceof Ship);
		assertEquals(true, ship1.oceanLiner);
	}
	
	@Test
	public void ShipPickupContructorTest() {
		Ship ship1 = new Ship(false);
		assertTrue(ship1 instanceof Ship);
		assertEquals(false, ship1.oceanLiner);
	}
	
	@Test
	public void ShipAllValuesConstructorTest() {
		String shipName = "Titanic";
		int shipLength = 882;
		int numberOfDoors = 200;
		int numberOfSeats = 500;
		boolean anOceanLiner = true;
		
		Ship ship1 = new Ship(shipName, shipLength, numberOfDoors, numberOfSeats, anOceanLiner);
		assertTrue(ship1 instanceof Ship);
		assertEquals(shipName, ship1.getName());
		assertEquals(shipLength, ship1.length);
		assertEquals(numberOfDoors, ship1.getDoors());
		assertEquals(numberOfSeats, ship1.getSeats());
		assertEquals(anOceanLiner, ship1.oceanLiner);
	}
	
	@Test
	public void toStringTest() {
		Ship ship1 = new Ship();
		assertEquals("This ocean liner ship, named NoName, with a length of 0 ft and has 4 seats, 4 doors.", ship1.toString());
	}
	
}
