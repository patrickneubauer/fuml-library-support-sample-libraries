/**
 * 
 */
package vehiclelibrary;

/**
 * This class represents a Ship
 * 
 * @author patrickneubauer
 *
 */
public class Ship extends Vehicle {
	
	// public (!) fields
	public int length;
	public String name;
	public boolean oceanLiner;
	
	// by default, the Ship is an ocean liner
	public Ship() {
		setWheels(0);
		setName("NoName");
		length = 0;
		oceanLiner = true;
	}
	
	public Ship(boolean anOceanLiner) {
		this();
		oceanLiner = anOceanLiner;
	}
	
	public Ship(String name, int length, int numberOfDoors, int numberOfSeats, boolean anOceanLiner) {
		this();
		setName(name);
		this.length = length;
		setDoors(numberOfDoors);
		setSeats(numberOfSeats);
		oceanLiner = anOceanLiner;
	}
	
	public void setName(String shipName) {
		name = shipName;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setOceanLiner(boolean oceanLiner) {
		this.oceanLiner = oceanLiner;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLength() {
		return length;
	}
	
	public boolean isOceanLiner() {
		return oceanLiner;
	}
	
	public String toString() {
		return "This " + (oceanLiner ? "ocean liner " : "") + "ship, named " + getName() + ", with a length of " + length + " ft and has " + getSeats() + " seats, " + getDoors() + " doors.";
	}

}
