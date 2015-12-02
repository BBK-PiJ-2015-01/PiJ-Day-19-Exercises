package lambda;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestExercise1 {
	
	private Exercise1 instance;

	@Before
	public void setUp() throws Exception {
		
		instance = new Exercise1();
	}

	@Test
	public void sortArrayByLengthTest() {

		String[] intialArray = {"One", "Two", "3", "Fore"};
		String[] expectedArray = {"3", "One", "Two", "Fore"};
		String[] resultArray = instance.sortArrayByLength(intialArray);
		assertArrayEquals(expectedArray, resultArray);
	}

	@Test
	public void sortArrayByReverseLengthTest() {

		String[] intialArray = {"One", "Two", "3", "Fore"};
		String[] expectedArray = {"Fore", "One",  "Two", "3"};
		String[] resultArray = instance.sortArrayByReverseLength(intialArray);
		assertArrayEquals(expectedArray, resultArray);
	}	
	
	@Test
	public void sortArrayByFirstCharacterTest() {

		String[] intialArray = {"One", "Two", "3", "Fore"};
		String[] expectedArray = {"3", "Fore", "One",  "Two"};
		String[] resultArray = instance.sortArrayByFirstCharacter(intialArray);
		assertArrayEquals(expectedArray, resultArray);
	}
	
	@Test
	public void sortArrayStartsWithEFirstTest() {

		String[] intialArray = {"One", "Two", "expected first after sort", "Fore"};
		String[] expectedArray = {"expected first after sort", "Fore", "One",  "Two"};
		String[] resultArray = instance.sortArrayStartsWithEFirst(intialArray);
		assertArrayEquals(expectedArray, resultArray);
	}
}
