package lambda;

import java.util.Arrays;

public class Exercise2 {

	public String[] sortArrayContainsEFirst (String[] stringArray) {
		
		String[] newStringArray = new String[stringArray.length];
		System.arraycopy(stringArray, 0, newStringArray, 0, stringArray.length);
		Arrays.sort(newStringArray, StringUtils::eChecker);
		return newStringArray;
	}
}
