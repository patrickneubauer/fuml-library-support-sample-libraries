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
		oceanLiner = true;
	}
	
	public Ship(boolean anOceanLiner) {
		this();
		oceanLiner = anOceanLiner;
	}
	
	public Ship(int numberOfDoors, int numberOfSeats, boolean anOceanLiner) {
		this();
		setDoors(numberOfDoors);
		setSeats(numberOfSeats);
		oceanLiner = anOceanLiner;
	}

}
