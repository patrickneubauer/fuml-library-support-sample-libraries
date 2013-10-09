package vehiclelibrary.vehicles;

import vehiclelibrary.persons.Aviator;

/**
 * This class represents an Airplane.
 * 
 * @author patrickneubauer
 *
 */
public class Airplane extends Vehicle {

	// public (!) fields
	public String manufacturer;
	public String model;
	public String type;
	
	public Aviator aviator;
	public ComplexEngine engine;
	
	// by default, the Airplane is a multi engine Boeing 737-700
	public Airplane() {
		setManufacturer("Boeing");
		setModel("737-700");
		setType("multi-engine");
		setAviator(new Aviator());
		setEngine(new ComplexEngine());
	}
	
	public Airplane(String manufacturer, String model, String type, Aviator aviator, ComplexEngine engine) {
		setManufacturer(manufacturer);
		setModel(model);
		setType(type);
		setAviator(aviator);
		setEngine(engine);
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Aviator getAviator() {
		return aviator;
	}

	public void setAviator(Aviator aviator) {
		this.aviator = aviator;
	}

	public ComplexEngine getEngine() {
		return engine;
	}

	public void setEngine(ComplexEngine engine) {
		this.engine = engine;
	}
	
	public String toString() {
		return "This " + getType() + " airplane " + getManufacturer() + " " + getModel() + " is aviated by " + getAviator().getFirstName() + " " + getAviator().getLastName() + " (" + getAviator().getNationality() + ")";
	}

}//Airplane
