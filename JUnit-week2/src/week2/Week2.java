package week2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class Week2 {

	// Question 1
	@Test
	public void Writing_Sometext_Backwards() {

		StringBuilder word = new StringBuilder("Jag");
		String reversed = word.reverse().toString();

		assertEquals("checking reverse", "gaJ", reversed);
	}

	// Question 2
	@Test
	public void JustASimpleAssert() {
		String name = "My name";
		assertEquals("My name", name);
	}

	// Question 3
	public class Person {
		String firstname = "first name";
		String lastname = "last name";
		int phonenumber = 0701111111;
		String streetaddress = "my cool street";
	}

	Person person = new Person();

	@Test
	public void TestingFirstName() {
		assertEquals("first name", person.firstname);
	}

	@Test
	public void TestingLastName() {
		assertEquals("last name", person.lastname);
	}

	@Test
	public void TestingPhoneNumber() {
		assertEquals(0701111111, person.phonenumber);
	}

	@Test
	public void TestingStreetAdress() {
		assertEquals("my cool street", person.streetaddress);
	}

	// Question 4
	@Test
	public void TestingLengthOfString() {

		System.out.println("Junit 5");

		String word = "Junit 5";
		assertEquals("Checking length", 7, word.length());
	}

	// Question 5
	@Test
	public void GiveMeASimpleVerification() {
		assertEquals(100, 100);
	}

	// Question 6
	@Test
	public void CheckingSame() {
		String s1 = new String("S1");
		String s2 = s1;
		assertSame(s1, s2);
	}

	// Question 7
	@Test
	public void CheckingBytes() {
		byte smallByte1 = 100;
		byte smallByte2 = smallByte1;
		assertTrue(smallByte1 == smallByte2);
	}

	// Question 9

	@Test
	public void CheckingTrue() {
		Object obj1 = new Object();
		Object obj2 = obj1;
		assertTrue(obj1 == obj2);
	}

	@Test
	public void CheckingTrue2() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertTrue(obj1.getClass().equals(obj2.getClass()));
	}

	// Question 10
	@Test
	public void CheckingFalse() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertFalse(obj1 == obj2);
	}

	// Question 10-1
	@Test
	public void CheckingFalse2() {
		Object obj1 = new Object();
		Object obj2 = obj1;
		assertFalse(obj1 != obj2);
	}
}