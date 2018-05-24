package com.core.prac;

import java.util.HashMap;

public class MainClass {
	
	/**
	 * @param args
	 */
	public static void main(String [] args) {
		Employee e1 = new Employee(101,"rajan");
		Employee e2 = new Employee(101,"rajan");
		
		
		/*System.out.println(e1.equals(e2));
		System.out.println("first employee object " + e1);
		System.out.println("second employee object" +e2);
		
		System.out.println("checking hash code of both objects");
		System.out.println(e1.hashCode()+" : "+e2.hashCode());
		
		HashMap<Employee, String> employeeMap = new HashMap<Employee, String>();
		employeeMap.put(e1,"rajan");
		employeeMap.put(e2, "sandeep");
		
		System.out.println("getting employee from map");
		System.out.println(employeeMap.get(new Employee(101,"rajan")));*/
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e1.equals(e2));
	}
}
