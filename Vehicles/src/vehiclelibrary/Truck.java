package vehiclelibrary;

/**
 * This class represents a Truck.
 * 
 * @author patrickneubauer
 *
 */
public class Truck extends Vehicle {
	public boolean isPickup;
	
	// by default, the Truck is a Pickup Truck
	public Truck() {
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
	
	public String toString() {
		return "This " + (isPickup ? "pickup-" : "") + "truck has " + getSeats() + " seats, " + getDoors() + " doors and " + getWheels() + " wheels.";
	}
	
}
