/**
 * 
 */
package vehiclelibrary;

/**
 * This class represents a SpaceShip
 * 
 * @author Patrick Neubauer
 *
 */
public class SpaceShip extends Vehicle {

	// public (!) fields
	public String name;
	public int maxWarpSpeed;

	public ComplexEngine engine;

	public SpaceShip() {
		setWheels(0);
		setName("NoName");
		setMaxWarpSpeed(3);
		
		this.engine = new ComplexEngine();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ComplexEngine getEngine() {
		return engine;
	}
	
	public void setEngine(ComplexEngine engine) {
		this.engine = engine;
	}
	
	public int getMaxWarpSpeed() {
		return maxWarpSpeed;
	}
	
	public void setMaxWarpSpeed(int maxWarpSpeed) {
		this.maxWarpSpeed = maxWarpSpeed;
	}
	
	public void setNameMaxWarpSpeed(String name, int maxWarpSpeed) {
		this.name = name;
		this.maxWarpSpeed = maxWarpSpeed;
	}
	
	public void setNameMaxWarpSpeedFuel(String name, int maxWarpSpeed, Fuel fuel) {
		this.name = name;
		this.maxWarpSpeed = maxWarpSpeed;
		this.engine.setFuel(fuel);
	}
	
}// SpaceShip
