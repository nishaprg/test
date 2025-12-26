package pragya;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Testduplicate {

	
		public static List<String> findDuplicatesUsingSet(List<String> list) {
	        Set<String> uniqueElements = new HashSet<>();
	        List<String> duplicates = new ArrayList<>();

	        for (String element : list) {
	            if (!uniqueElements.add(element)) { // add() returns false if element already exists
	                duplicates.add(element);
	            }
	        }
	        return duplicates;
	    }

	    public static void main(String[] args) {
	        List<String> myList = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "grape"));
	        List<String> duplicateElements = findDuplicatesUsingSet(myList);
	        System.out.println("Duplicate elements: " + duplicateElements); // Output: Duplicate elements: [apple, banana]
	    }

	}


