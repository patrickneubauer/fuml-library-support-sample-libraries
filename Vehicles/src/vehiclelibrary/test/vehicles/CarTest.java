package vehiclelibrary.test.vehicles;

import static org.junit.Assert.*;

import org.junit.Test;

import vehiclelibrary.vehicles.Car;

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
		assertEquals(car1.getDoors(), 5);
		assertEquals(car1.getSeats(), 5);
		assertEquals(car1.getWheels(), 4);
	}
	
	@Test
	public void toStringTest() {
		Car car1 = new Car();
		assertEquals("This car has 5 seats, 5 doors and 4 wheels.", car1.toString());
	}
	
}
