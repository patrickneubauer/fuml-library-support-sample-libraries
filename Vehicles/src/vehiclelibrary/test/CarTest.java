package vehiclelibrary.test;

import static org.junit.Assert.*;

import org.junit.Test;

import vehiclelibrary.Car;

/**
 * This class tests the car class.
 * 
 * @author patrickneubauer
 *
 */
public class CarTest {
	
	@Test
	public void CarConstructorTest() {
		Car car1 = new Car();
		assertTrue(car1 instanceof Car);
		assertEquals(car1.getDoors(), 4);
		assertEquals(car1.getSeats(), 4);
		assertEquals(car1.getWheels(), 4);
	}
	
	@Test
	public void toStringTest() {
		Car car1 = new Car();
		assertEquals("This car has 4 seats, 4 doors and 4 wheels.", car1.toString());
	}
	
}
