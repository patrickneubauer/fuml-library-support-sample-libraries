package vehiclelibrary.test.vehicles;

import static org.junit.Assert.*;

import org.junit.Test;

import vehiclelibrary.vehicles.Airplane;

public class AirplaneTest {
	
	@Test
	public void AirplaneConstructorTest() {
		Airplane airplane = new Airplane();
		assertTrue(airplane instanceof Airplane);
		assertEquals("Boeing", airplane.getManufacturer());
		assertEquals("737-700", airplane.getModel());
		assertEquals("multi-engine", airplane.getType());
	}
	
	@Test
	public void toStringTest() {
		Airplane airplane = new Airplane();
		assertEquals("This multi-engine airplane Boeing 737-700 is aviated by John Public (American)", airplane.toString());
	}

}
