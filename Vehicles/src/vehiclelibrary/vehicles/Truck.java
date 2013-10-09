package vehiclelibrary.vehicles;

import vehiclelibrary.persons.Driver;

/**
 * This class represents a Truck.
 * 
 * @author patrickneubauer
 *
 */
public class Truck extends Vehicle {
	public boolean isPickup;
	
	public Driver driver;

	// by default, the Truck is a Pickup Truck
	public Truck() {
		setWheels(4);
		setDoors(2);
		setSeats(3);
		setDriver(new Driver(true, false, true));
		isPickup = true;
	}
	
	public Truck(boolean aPickup) {
		this();
		isPickup = aPickup;
	}
	
	public Truck(int numberOfDoors, int numberOfSeats, int numberOfWheels, boolean aPickup) {
		setDoors(numberOfDoors);
		setSeats(numberOfSeats);
		setWheels(numberOfWheels);
		isPickup = aPickup;
	}
	
	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public String toString() {
		return "This " + (isPickup ? "pickup-" : "") + "truck has " + getSeats() + " seats, " + getDoors() + " doors and " + getWheels() + " wheels.";
	}
	
}
