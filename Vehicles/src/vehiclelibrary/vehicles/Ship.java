/**
 * 
 */
package vehiclelibrary.vehicles;

import vehiclelibrary.persons.Captain;

/**
 * This class represents a Ship
 * 
 * @author Patrick Neubauer
 *
 */
public class Ship extends Vehicle {
	
	// public (!) fields
	public int length;
	public String name;
	public boolean oceanLiner;
	
	// static (!) field
	public static boolean hasNoWheels = true;
	
	private Captain captain;
	
	// by default, the Ship is an ocean liner
	public Ship() {
		setWheels(0);
		setName("NoName");
		length = 0;
		oceanLiner = true;
		setCaptain(new Captain(true, false));
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
	
	/*
	 * Static method
	 */
	public static boolean hasNoWheels() {
		return hasNoWheels;
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
	
	public Ship getShip() {
		return this;
	}
	
	public void setNameLenghtOceanLiner(String name, int length, boolean oceanLiner) {
		this.name = name;
		this.length = length;
		this.oceanLiner = oceanLiner;
	}

	/**
	 * @return the captain
	 */
	public Captain getCaptain() {
		return captain;
	}

	/**
	 * @param captain the captain to set
	 */
	public void setCaptain(Captain captain) {
		this.captain = captain;
	}	
	
}
