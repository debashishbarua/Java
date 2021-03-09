package com.cts.domain;



public class Manager extends Employee {	
	
	private String department;
	
	public Manager() {
		//Implicit call of super()
		super();
	}

	public Manager(String name, String city, double salary, String department) {
		super(name, city, salary);
		this.department =department;		
		
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " "  + department;
	}

	@Override
	public double getNetSalary() {
		if(department.equals("CS")) {
			return super.getSalary() + 100;
		}else {
			return super.getSalary() + 200;
		}
	}
	
}
