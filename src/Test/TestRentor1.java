package Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Model.Rentor;

import org.junit.Before;

/**
 * @author andrewmccoy - agmccoy
 * CIS175 - Fall 2021
 * Jan 20, 2023
 */
public class TestRentor1 {
	String fullName = "Andrew Grant McCoy";
	String fullName2 = "Joshua David Solt";
	int oneRoom = 1;
	int twoRooms = 2;	
	Rentor rentor = new Rentor(fullName, twoRooms);	
	Rentor rentor2 = new Rentor (fullName2, oneRoom);
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testRentorInformation() {
		String expected = "Thanks " + fullName + ", your bill is $1200";
		rentor.setHasPets(true);		
		var actual = rentor.getRenterInformation();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDetermineCostOfRent() {
		int expected = 775;
		rentor2.setHasPets(true);		
		var actual = rentor2.determineCostOfRent();
		assertEquals(expected, actual, 0);
	}

}
