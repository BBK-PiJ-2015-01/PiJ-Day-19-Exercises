package lambda;

import java.util.Arrays;

public class Exercise1 {

	public String[] sortArrayByLength(String[] stringArray) {
		
		String[] newStringArray = new String[stringArray.length];
		System.arraycopy(stringArray, 0, newStringArray, 0, stringArray.length);
		
		Arrays.sort(newStringArray, (s1, s2) -> s1.length() - s2.length() );	
		
		return newStringArray;
	}

	public String[] sortArrayByReverseLength(String[] stringArray) {

		String[] newStringArray = new String[stringArray.length];
		System.arraycopy(stringArray, 0, newStringArray, 0, stringArray.length);
		Arrays.sort(newStringArray, (s1, s2) -> s2.length() - s1.length() );	
		return newStringArray;
	}
	
	public String[] sortArrayByFirstCharacter(String[] stringArray) {

		String[] newStringArray = new String[stringArray.length];
		System.arraycopy(stringArray, 0, newStringArray, 0, stringArray.length);
		Arrays.sort(newStringArray, (s1, s2) -> s1.charAt(0) - s2.charAt(0) );	
		return newStringArray;
	}
	
	public String[] _sortArrayStartsWithEFirst (String[] stringArray) {
		
		final String priorityCharacter = "e";
		final char[] minCharArray = {Character.MIN_VALUE};
		final String minCharString = new String(minCharArray);
		String[] newStringArray = new String[stringArray.length];
		System.arraycopy(stringArray, 0, newStringArray, 0, stringArray.length);
		Arrays.sort(newStringArray, (s1, s2) -> {
			String replacedS1 = ((String)s1).replaceFirst(priorityCharacter, minCharString);
			String replacedS2 = ((String)s2).replaceFirst(priorityCharacter, minCharString);
			return replacedS1.charAt(0) - replacedS2.charAt(0);
		});
		return newStringArray;
	}
	
	public String[] sortArrayStartsWithEFirst (String[] stringArray) {
		
		final String priorityCharacter = "e";
		final char[] minCharArray = {Character.MIN_VALUE};
		final String minCharString = new String(minCharArray);
		String[] newStringArray = new String[stringArray.length];
		System.arraycopy(stringArray, 0, newStringArray, 0, stringArray.length);
		Arrays.sort(newStringArray, (s1, s2) -> {
			String replacedS1 = ((String)s1).replaceFirst(priorityCharacter, minCharString);
			String replacedS2 = ((String)s2).replaceFirst(priorityCharacter, minCharString);
			return replacedS1.charAt(0) - replacedS2.charAt(0);
		});
		return newStringArray;
	}
}
