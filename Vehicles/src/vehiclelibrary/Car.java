package vehiclelibrary;

/**
 * This class represents a Car.
 * 
 * @author patrickneubauer
 *
 */
public class Car extends Vehicle {

	public String toString() {
		return "This car has " + getSeats() + " seats, " + getDoors() + " doors and " + getWheels() + " wheels.";
	}
	
}
