package vehiclelibrary.persons;

/**
 * This class represents a Pilot.
 * 
 * @author patrickneubauer
 *
 */
public class Aviator extends Person {

	// public (!) fields
	public boolean singleEngineLicense;
	public boolean multiEngineLicense;
	public boolean rotorcraftLicense;
	public boolean poweredParachuteLicense;
	
	// by default, the Aviator has only single engine license
	public Aviator() {
		setSingleEngineLicense(true);
		setMultiEngineLicense(false);
		setRotorcraftLicense(false);
		setPoweredParachuteLicense(false);
	}
	
	public Aviator(boolean singleEngineLicense, boolean multiEngineLicense, boolean rotorcraftLicense, boolean poweredParachuteLicense) {
		setSingleEngineLicense(singleEngineLicense);
		setMultiEngineLicense(multiEngineLicense);
		setRotorcraftLicense(rotorcraftLicense);
		setPoweredParachuteLicense(poweredParachuteLicense);
	}
	
	public boolean hasSingleEngineLicense() {
		return singleEngineLicense;
	}
	
	public void setSingleEngineLicense(boolean singleEngineLicense) {
		this.singleEngineLicense = singleEngineLicense;
	}
	
	public boolean hasMultiEngineLicense() {
		return multiEngineLicense;
	}
	
	public void setMultiEngineLicense(boolean multiEngineLicense) {
		this.multiEngineLicense = multiEngineLicense;
	}
	
	public boolean hasRotorcraftLicense() {
		return rotorcraftLicense;
	}
	
	public void setRotorcraftLicense(boolean rotorcraftLicense) {
		this.rotorcraftLicense = rotorcraftLicense;
	}
	
	public boolean hasPoweredParachuteLicense() {
		return poweredParachuteLicense;
	}
	
	public void setPoweredParachuteLicense(boolean poweredParachuteLicense) {
		this.poweredParachuteLicense = poweredParachuteLicense;
	}
	
	public void setLicenses(boolean singleEngineLicense, boolean multiEngineLicense, boolean rotorcraftLicense, boolean poweredParachuteLicense) {
		this.singleEngineLicense = singleEngineLicense;
		this.multiEngineLicense = multiEngineLicense;
		this.rotorcraftLicense = rotorcraftLicense;
		this.poweredParachuteLicense = poweredParachuteLicense;
	}
	
	public String toString() {
		String toString = "The Aviator " + super.toString() + " has licenses to fly ";
		if (hasSingleEngineLicense()) {
			toString = toString.concat("single-engine airplanes; ");
		}
		if (hasMultiEngineLicense()) {
			toString = toString.concat("multi-engine airplanes; ");
		}
		if (hasRotorcraftLicense()) {
			toString = toString.concat("rotorcrafts; ");
		}
		if (hasPoweredParachuteLicense()) {
			toString = toString.concat("powered parachutes; ");
		}
		if (!hasSingleEngineLicense() && !hasMultiEngineLicense() && !hasRotorcraftLicense() && !hasPoweredParachuteLicense()) {
			toString = "The Aviator " + super.toString() + " has no private pilot license.";
		}
		return toString;
	}
	
}
