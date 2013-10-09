package vehiclelibrary.test.vehicles;

import static org.junit.Assert.*;

import org.junit.Test;

import vehiclelibrary.vehicles.MotorCycle;

/**
 * This class tests the motor cycle class.
 * 
 * @author patrickneubauer
 *
 */
public class MotorCycleTest {
	
	@Test
	public void MotorCycleConstructorTest() {
		MotorCycle motorCycle1 = new MotorCycle();
		assertTrue(motorCycle1 instanceof MotorCycle);
		assertEquals(motorCycle1.getSeats(), 1);
		assertEquals(motorCycle1.getDoors(), 0);
		assertEquals(motorCycle1.getWheels(), 2);
	}
	
	@Test
	public void setSeatsTest() {
		MotorCycle motorCycle1 = new MotorCycle();
		int numberOfSeats = 2;
		assertEquals(motorCycle1.getSeats(), 1);
		motorCycle1.setSeats(numberOfSeats);
		assertEquals(motorCycle1.getSeats(), numberOfSeats);
	}
	
	@Test
	public void toStringTest() {
		MotorCycle motorCycle1 = new MotorCycle();
		assertEquals("This motorcycle has 1 seat(s), 0 door(s) and 2 wheels.", motorCycle1.toString());
	}
}
