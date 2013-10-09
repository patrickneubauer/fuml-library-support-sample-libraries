package vehiclelibrary.persons;

/**
 * This class represents a Driver.
 * 
 * @author patrickneubauer
 *
 */
public class Driver extends Person {
	
	// public (!) fields
	public boolean carLicense;
	public boolean motorcycleLicense;
	public boolean truckLicense;
	
	// by default, the Driver has only a Car license
	public Driver() {
		setCarLicense(true);
		setMotorCycleLicense(false);
		setTruckLicense(false);
	}
	
	public Driver(boolean carLicense, boolean motorcycleLicense, boolean truckLicense) {
		setCarLicense(carLicense);
		setMotorCycleLicense(motorcycleLicense);
		setTruckLicense(truckLicense);
	}
	
	public boolean hasCarLicense() {
		return carLicense;
	}

	public void setCarLicense(boolean carLicense) {
		this.carLicense = carLicense;
	}

	public boolean hasMotorCycleLicense() {
		return motorcycleLicense;
	}

	public void setMotorCycleLicense(boolean motorcycleLicense) {
		this.motorcycleLicense = motorcycleLicense;
	}

	public boolean hasTruckLicense() {
		return truckLicense;
	}

	public void setTruckLicense(boolean truckLicense) {
		this.truckLicense = truckLicense;
	}
	
	public void setLicenses(boolean carLicense, boolean motorcycleLicense, boolean truckLicense) {
		this.carLicense = carLicense;
		this.motorcycleLicense = motorcycleLicense;
		this.truckLicense = motorcycleLicense;
	}
	
	public String toString() {
		String toString = "The Driver " + super.toString() + " has licenses to drive ";
		if (hasCarLicense()) {
			toString = toString.concat("cars; ");
		}
		if (hasMotorCycleLicense()) {
			toString = toString.concat("motorcycles; ");
		}
		if (hasTruckLicense()) {
			toString = toString.concat("trucks; ");
		}
		if (!hasCarLicense() && !hasMotorCycleLicense() && !hasTruckLicense()) {
			toString = "The Driver " + super.toString() + " has no car, motorcycle or truck license.";
		}
		return toString;
	}

}
