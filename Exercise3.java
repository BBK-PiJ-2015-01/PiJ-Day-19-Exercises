package lambda;

public class Exercise3 {
	
	public String betterString(String s1, String s2, TwoStringPredicate l) {
		
		return l.isBetter(s1, s2) ? s1 : s2;	
	}
}
