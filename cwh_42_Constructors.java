package CWH_Java;

class Employee2 {
	// First constructor
	    Employee2(String s, int i){
	        System.out.println("The name of the first employee is : " + s);
	        System.out.println("The id of the first employee is : " + i);
	    }
//	    Constructor overloaded
	    Employee2(String s, int i, int salary){
	        System.out.println("The name of the second employee is : " + s);
	        System.out.println("The id of the second employee is : " + i);
	        System.out.println("The salary of second employee is : " + salary);
	    }

	}

public class cwh_42_Constructors {
	public static void main(String[] args) {
  
	      Employee2 shubham = new Employee2("Shubham",1,5000);
	     // Employee2 harry = new Employee2("Harry",2,70000);
		
	}
}
