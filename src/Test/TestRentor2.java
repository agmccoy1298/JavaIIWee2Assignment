package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.Rentor;

/**
 * @author andrewmccoy - agmccoy
 * CIS175 - Fall 2021
 * Jan 20, 2023
 */
public class TestRentor2 {
	String fullName = "Martha Marie Jones";
	int oneRoom = 1;
	Rentor seniorRentor = new Rentor(fullName, oneRoom);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRentorCareCategory() {
		seniorRentor.setAge(75);		
		boolean actual = seniorRentor.determineCareCategory();
		assertTrue(actual);
	}

}
