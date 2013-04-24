/**
 * 
 */
package vehiclelibrary;

/**
 * This class represents Fuel (member field of {@link ComplexEngine})
 * 
 * @author Patrick Neubauer
 *
 */
public class Fuel {

	// public (!) fields
	public FUEL_TYPE fuelType;
	
	public enum FUEL_TYPE {
		SOLID, LIQUID, GAS;
	}

	public Fuel() {
		fuelType = FUEL_TYPE.LIQUID;
	}
	
	public Fuel(FUEL_TYPE fuelType) {
		this.fuelType = fuelType;
	}
	
	public FUEL_TYPE getFuelType() {
		return fuelType;
	}
	
	public void setFuelType(FUEL_TYPE fuelType) {
		this.fuelType = fuelType;
	}
	
}// Fuel