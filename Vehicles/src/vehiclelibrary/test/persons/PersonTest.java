package vehiclelibrary.test.persons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import vehiclelibrary.persons.Person;

/**
 * This class tests the {@link Person} class.
 * 
 * @author patrickneubauer
 *
 */
public class PersonTest {

	@Test
	public void PersonDefaultConstructorTest() {
		Person person = new Person();
		assertTrue(person instanceof Person);
		assertEquals(person.getFirstName(), "John");
		assertEquals(person.getLastName(), "Public");
		assertEquals(person.getNationality(), "American");
	}
	
	@Test
	public void PersonConstructorTest() {
		Person person = new Person("Franz", "Mair", "Austria");
		assertTrue(person instanceof Person);
		assertEquals(person.getFirstName(), "Franz");
		assertEquals(person.getLastName(), "Mair");
		assertEquals(person.getNationality(), "Austria");
	}
	
	@Test
	public void PersonToStringTest() {
		Person person = new Person();
		assertTrue(person instanceof Person);
		assertEquals(person.toString(), "John Public (American)");
	}
	
}
