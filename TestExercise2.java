package lambda;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestExercise2 {
	
	private Exercise2 instance;

	@Before
	public void setUp() throws Exception {
		
		instance = new Exercise2();
	}
	
	@Test
	public void sortArrayContainsE_OneContainsE_Test() {

		String[] intialArray = {"Two", "Z-One"};
		String[] expectedArray = {"Z-One", "Two"};
		String[] resultArray = instance.sortArrayContainsEFirst(intialArray);
		assertArrayEquals(expectedArray, resultArray);
	}
	
	@Test
	public void sortArrayContainsE_BothContainE_Test() {

		String[] intialArray = {"Twoe", "Z-One"};
		String[] expectedArray = {"Twoe", "Z-One"};
		String[] resultArray = instance.sortArrayContainsEFirst(intialArray);
		assertArrayEquals(expectedArray, resultArray);
	}
	
	
	@Test
	public void sortArrayContainsE_NeitherContainsE_Test() {

		String[] intialArray = {"Two_", "Z-On_"};
		String[] expectedArray = {"Two_", "Z-On_"};
		String[] resultArray = instance.sortArrayContainsEFirst(intialArray);
		assertArrayEquals(expectedArray, resultArray);
	}
}
