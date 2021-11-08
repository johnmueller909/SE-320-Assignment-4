import java.util.*;

public class Problem_1 {
	
	public static void main(String[] args) {
		
		//creation of the 2 linked hash sets
		Set<String> setA = new LinkedHashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
		Set<String> setB = new LinkedHashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

		// This is how you would display the union of the sets
		Set<String> union = new LinkedHashSet<>(setA);
		union.addAll(setB);
		System.out.println("The union of set A and set B is " + union);

		// This is how you would display the difference of the sets
		Set<String> difference = new LinkedHashSet<>(setA);
		difference.removeAll(setB);
		System.out.println("The difference of set A and set b is " + difference);

		//This is how you would display the intersection of the sets
		Set<String> intersection = new LinkedHashSet<>();
		for (String z: setB) {
			if (setA.contains(z))
				intersection.add(z);
		}
		
		System.out.println("The intersection of set A and set B is " + intersection);
	}
}
