package lambda;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestExercise3 {
	
	private Exercise3<String> instance;

	@Before
	public void setUp() throws Exception {
		
		instance = new Exercise3<>();
	}
	
	@Test
	public void isBetterStringTest_LongerIsBetter_Test() {

		String expectedWorseString = "short";
		String expectedBetterString = "much longer string";
		String resultBetterString = instance.betterElement(expectedWorseString, expectedBetterString, (s1,s2) ->  s1.length() > s2.length() );
		assertEquals(expectedBetterString, resultBetterString);
	}
	
	@Test
	public void isBetterStringTest_ShorterIsBetter_Test() {

		String expectedBetterString = "short";
		String expectedWorseString = "much longer string";
		String resultBetterString = instance.betterElement(expectedWorseString, expectedBetterString, (s1,s2) ->  s2.length() > s1.length() );
		assertEquals(expectedBetterString, resultBetterString);
	}
	
	@Test
	public void isBetterStringTest_GreaterLastCharacter_Test() {

		String expectedBetterString = "short";
		String expectedWorseString = "much longer string";
		String resultBetterString = instance.betterElement(expectedWorseString, expectedBetterString, (s1,s2) ->  s1.charAt(s1.length()-1) > s2.charAt(s2.length()-1) );
		assertEquals(expectedBetterString, resultBetterString);
	}
}
