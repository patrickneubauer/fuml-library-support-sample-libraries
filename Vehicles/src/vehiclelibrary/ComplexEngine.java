/**
 * 
 */
package vehiclelibrary;

/**
 * This class represents a simple Engine (contain non-primitive field)
 * 
 * @author Patrick Neubauer
 *
 */
public class ComplexEngine extends SimpleEngine {
	
	// public (!) field
	public Fuel fuel;

	public ComplexEngine() {
		fuel = new Fuel();
	}
		
	public Fuel getFuel() {
		return fuel;
	}
	
	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}
	
}// ComplexEngine
