package main.java.compare;

import main.java.model.Employee;

public class DefaultComparator {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101, "Vineeth", "Chennai", 50000.0);
		Employee emp2 = new Employee(101, "Vineeth", "Chennai", 50000.0);
		compareEmpObjects(emp1,emp2);
		
		System.out.println("Updating emp2 id to 100 from 101");
		emp2.setId(100);
		compareEmpObjects(emp1,emp2);

		System.out.println("Updating emp2 id to 102 from 100");
		emp2.setId(102);
		compareEmpObjects(emp1,emp2);
		
		System.out.println("Comparing Employee object with non-Employee one");
		emp1.compareTo(65);
		
		System.out.println("Comparing with null value");
		emp1.compareTo(null);	//throw NullPointerException as in the compareTo we implemented
	}

	private static void compareEmpObjects(Employee emp1, Employee emp2) {
		
		if(emp1.compareTo(emp2) == 0) {
			System.out.println("CustomComparator :: Main ::	both objects are equal..");
		}
		else if (emp1.compareTo(emp2) < 0) {
			System.out.println("CustomComparator :: Main ::	emp1 object is less than emp2..");
		}
		else if (emp1.compareTo(emp2) > 0) {
			System.out.println("CustomComparator :: Main ::	emp1 object is greather than emp2..");
		}
	}
}
