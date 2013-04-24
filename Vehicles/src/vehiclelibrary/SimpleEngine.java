/**
 * 
 */
package vehiclelibrary;

/**
 * This class represents a simple Engine (only contains primitive types)
 * 
 * @author Patrick Neubauer
 *
 */
public class SimpleEngine {
	
	// public (!) fields
	public int horsePower;
	public String vendor;

	public SimpleEngine() {
		horsePower = 0;
		vendor = "NoVendor";
	}
	
	public SimpleEngine(int horsePower) {
		this();
		this.horsePower = horsePower;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}// SimpleEngine