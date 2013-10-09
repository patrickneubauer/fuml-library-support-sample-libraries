package vehiclelibrary.persons;

/**
 * This class represents a Captain.
 * 
 * @author patrickneubauer
 *
 */
public class Captain extends Person {

	// public (!) fields
	public boolean seaShipLicense;
	public boolean spaceShipLicense;
	
	// by default, the Captain has only a sea ship license
	public Captain() {
		setSeaShipLicense(true);
		setSpaceShipLicense(false);
	}
	
	public Captain(boolean seaShipLicense, boolean spaceShipLicense) {
		setSeaShipLicense(seaShipLicense);
		setSpaceShipLicense(spaceShipLicense);
	}
	
	public boolean hasSeaShipLicense() {
		return seaShipLicense;
	}

	public void setSeaShipLicense(boolean seaShipLicense) {
		this.seaShipLicense = seaShipLicense;
	}

	public boolean hasSpaceShipLicense() {
		return spaceShipLicense;
	}

	public void setSpaceShipLicense(boolean spaceShipLicense) {
		this.spaceShipLicense = spaceShipLicense;
	}
	
	public void setLicenses(boolean seaShipLicense, boolean spaceShipLicense) {
		this.seaShipLicense = seaShipLicense;
		this.spaceShipLicense = spaceShipLicense;
	}
	
	public String toString() {
		String toString = "The Captain " + super.toString() + " has licenses to command ";
		if (hasSeaShipLicense()) {
			toString = toString.concat("seaships; ");
		}
		if (hasSpaceShipLicense()) {
			toString = toString.concat("spaceships; ");
		}
		if (!hasSeaShipLicense() && !hasSpaceShipLicense()) {
			toString = "The Captain " + super.toString() + " has no sea- or spaceship license.";
		}
		return toString;
	}
}
