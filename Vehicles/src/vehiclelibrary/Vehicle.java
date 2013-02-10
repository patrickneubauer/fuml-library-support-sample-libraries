package vehiclelibrary;

import java.util.Random;

/**
 * This class represents a Vehicle.
 * 
 * @author patrickneubauer
 *
 */
public class Vehicle {
	private int doors;
	private int seats;
	private int wheels;
	private VehicleTurn lastTurn;
	
	public Vehicle() {
		setDoors(4);
		setSeats(4);
		setWheels(4);
		lastTurn = VehicleTurn.NOTURN;
	}
	
	/**
	 * This method returns the current average wheel air pressure.
	 * 
	 * @return the current average wheel air pressure.
	 */
	public double currentAverageWheelAirPressure() {
		Random random = new java.util.Random();
		return random.nextDouble();
	}
	
	/**
	 * This method returns the last turn performed by the vehicle.
	 * 
	 * @return last vehicle turn.
	 */
	public VehicleTurn lastTurn() {
		return lastTurn;
	}
	
	/**
	 * This method performs the next vehicle turn.
	 * 
	 * @return the turn the vehicle has performed.
	 */
	public VehicleTurn nextTurn() {
		Random random = new java.util.Random();
		int randomInt = random.nextInt(3);
		VehicleTurn turn;
		if (randomInt == 0) {
			turn = VehicleTurn.LEFT;
		} else if (randomInt == 1) {
			turn = VehicleTurn.RIGHT;
		} else if (randomInt == 2) {
			turn = VehicleTurn.UTURN;
		} else {
			turn = VehicleTurn.NOTURN;
		}
		lastTurn = turn;
		return lastTurn;
	}

	/**
	 * @return the doors
	 */
	public int getDoors() {
		return doors;
	}

	/**
	 * @param doors the doors to set
	 */
	public void setDoors(int doors) {
		this.doors = doors;
	}

	/**
	 * @return the seats
	 */
	public int getSeats() {
		return seats;
	}

	/**
	 * @param seats the seats to set
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}

	/**
	 * @return the wheels
	 */
	public int getWheels() {
		return wheels;
	}

	/**
	 * @param wheels the wheels to set
	 */
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	/**
	 * @return the lastTurn the vehicle has performed
	 */
	public VehicleTurn getLastTurn() {
		return lastTurn;
	}

}
