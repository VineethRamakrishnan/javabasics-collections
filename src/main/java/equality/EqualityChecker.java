package main.java.equality;

import main.java.model.Employee;

public class EqualityChecker {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101, "Vineeth", "Chennai", 50000.0);
		Employee emp2 = new Employee(101, "Vineeth", "Chennai", 50000.0);
		
		System.out.println("Checking equality using == operator");
		
		if(emp1 == emp2) {
			System.out.println("Both objects are equal");
		}
		else {
			System.out.println("Both objects are not equal");
		}

		/**
		 *To Know: 	
		 *
		 * 1. how does hashCode improves performance of hash tables
		 */
		System.out.println("\nChecking equality using equals method");
		
		System.out.println("Before modifying salary");
		System.out.println("Hashcode of object1 :"+emp1.hashCode());
		System.out.println("Hashcode of object2 :"+emp2.hashCode());
		
		emp2.setSalary(60000d);
		
		if(emp2.equals(emp1)) {
			
			/**
			 * This works, even hashcodes are different for the objects but it will degrade the hashtable(HT) performance.
			 * Thus, maintaining consistency between equals() and hashCode() will improve the HT perf.
			 * Consistency : equal objects (as per equals()) should have same hashCode, unequal have differing hashCode.
			 */
			
			System.out.println("Both objects are equal even hashCode differing");
			System.out.println("Hashcode of object1 (after salary update):"+emp1.hashCode());
			System.out.println("Hashcode of object2 (after salary update):"+emp2.hashCode());
		}
		else {
			System.out.println("Both objects are not equal");
		}
	}

}
