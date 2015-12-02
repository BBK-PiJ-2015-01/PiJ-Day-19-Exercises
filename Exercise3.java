package lambda;

public class Exercise3<T> {
	
//	public String betterString(String s1, String s2, TwoStringPredicate l) {
//		
//		return l.isBetter(s1, s2) ? s1 : s2;	
//	}
	
	public T betterElement(T s1, T s2, TwoElementPredicate<T> l) {
		
		return l.isBetter(s1, s2) ? s1 : s2;	
	}
}
