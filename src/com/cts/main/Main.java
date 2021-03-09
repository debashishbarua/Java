package com.cts.main;

import com.cts.domain.Director;
import com.cts.domain.Employee;
import com.cts.domain.Manager;

public class Main {
	
	public static void main(String[] args) {
		
		// Array Objects
		Employee e1 =null;
		Manager m1 = new Manager("Mr. X", "Delhi", 50000, "CS");
		Director d1 = new Director("Mr. X", "Delhi", 50000, "Level-1");
		
		Employee []employees =new Employee[5];
		
		employees[0] =m1;
		employees[1] =d1;
		employees[2] =e1;
		employees[3] =new Manager("Mr. Y", "Delhi", 50000, "IT");
		employees[4] =new Director("Mr. Z", "Delhi", 50000, "Level-2");
		
		for (Employee employee : employees) {
			
			if(employee instanceof Director) {				
				Director dtmp = (Director)employee;
				System.out.println(dtmp.getName() + " " + dtmp.getLevel());
			}else if(employee instanceof Manager) {
				Manager mtmp = (Manager)employee;
				System.out.println(mtmp.getName() + " " + mtmp.getDepartment());
			}else {
				System.out.println(employee);
			}
			
		}
		
	
	}

	public static void main1(String[] args) {
//
//		Employee e = new Employee();
//		//Employee e1 = new Employee("Akash", "Kolkata", 60000.0);
//		
//		System.out.println(e1.getDetails());
//		//System.out.println(e1.detDepartment());
//		
//		
//		Manager m = new Manager();
//		Manager m1 = new Manager("Mr. X", "Delhi", 50000, "CS");
//		System.out.println(m1.getDetails());
//
//		// Type casting
//		// Base class reference can refer to the derive class object
//		e = m1; // Implicit Casting
//		System.out.println(e.getDetails());
//		//System.out.println(e.getDepartment());
//		
//		//Explicit
//		Manager mref= (Manager)e;// ExplicitCasting
//		System.out.println(mref.getDetails());
//		System.out.println(mref.getDepartment());
//		
//		
//
////		m = (Manager) e1; // Explicit Casting
////		System.out.println(m.getDetails());// ClassCastException
	}

}
