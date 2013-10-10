package vehiclelibrary.persons;

/**
 * This class represents a Person.
 * 
 * @author patrickneubauer
 *
 */
public class Person {

	private String firstName;
	private String lastName;
	private String nationality;
	
	public Person() {
		setFirstName("John");
		setLastName("Public");
		setNationality("American");
	}
	
	public Person(String firstName, String lastName, String nationality) {
		setFirstName(firstName);
		setLastName(lastName);
		setNationality(nationality);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public String toString() {
		return getFirstName() + " " + getLastName() + " (" + getNationality() + ")";
	}
	
}
