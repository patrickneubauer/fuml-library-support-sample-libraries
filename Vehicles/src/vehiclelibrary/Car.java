package vehiclelibrary;

/**
 * This class represents a Car.
 * 
 * @author patrickneubauer
 *
 */
public class Car extends Vehicle {
	
	public SimpleEngine engine;
	
	public Car() {
		setDoors(5);
		setSeats(5);
		setWheels(4);
		setEngine(new SimpleEngine());
	}

	public SimpleEngine getEngine() {
		return engine;
	}

	public void setEngine(SimpleEngine engine) {
		this.engine = engine;
	}

	public String toString() {
		return "This car has " + getSeats() + " seats, " + getDoors() + " doors and " + getWheels() + " wheels.";
	}
	
}
