package vehiclelibrary.vehicles;

import vehiclelibrary.persons.Driver;

/**
 * This class represents a Car.
 * 
 * @author patrickneubauer
 *
 */
public class Car extends Vehicle {
	
	public Driver driver;
	public SimpleEngine engine;
	
	public Car() {
		setDoors(5);
		setSeats(5);
		setWheels(4);
		setEngine(new SimpleEngine());
		setDriver(new Driver(true, false, false));
	}

	public SimpleEngine getEngine() {
		return engine;
	}

	public void setEngine(SimpleEngine engine) {
		this.engine = engine;
	}
	
	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public String toString() {
		return "This car has " + getSeats() + " seats, " + getDoors() + " doors and " + getWheels() + " wheels.";
	}
	
}
