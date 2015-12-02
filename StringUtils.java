package lambda;

public class StringUtils {
	
	public static final int LESS_THAN = -1;
	public static final int MORE_THAN = 1;
	
	public static int eChecker(String o1, String o2) {
		
		final String priorityCharacter = "e";

		boolean o1ContainsPriorityCharacter =  o1.contains(priorityCharacter);
		boolean o2ContainsPriorityCharacter =  o2.contains(priorityCharacter);
		
		if (o1ContainsPriorityCharacter && o2ContainsPriorityCharacter || !(o1ContainsPriorityCharacter || o2ContainsPriorityCharacter)) {
			return o1.compareTo(o2);
		}
		return o1ContainsPriorityCharacter ? LESS_THAN : MORE_THAN;
	}
}
