package vehiclelibrary;

/**
 * This class represents a Motorcycle.
 * 
 * @author patrickneubauer
 *
 */
public class MotorCycle extends Vehicle {
	public MotorCycle() {
		setSeats(1);
		setDoors(0);
		setWheels(2);
	}	
	
	public String toString() {
		return "This motorcycle has " + getSeats() + " seat(s), " + getDoors() + " door(s) and " + getWheels() + " wheels."; 
	}
}
