package vehiclelibrary.vehicles;

import vehiclelibrary.persons.Driver;

/**
 * This class represents a Motorcycle.
 * 
 * @author patrickneubauer
 *
 */
public class MotorCycle extends Vehicle {
	
	public Driver driver;
	
	public MotorCycle() {
		setSeats(1);
		setDoors(0);
		setWheels(2);
		setDriver(new Driver(false, true, false));
	}
		
	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}	
	
	public String toString() {
		return "This motorcycle has " + getSeats() + " seat(s), " + getDoors() + " door(s) and " + getWheels() + " wheels."; 
	}
}
