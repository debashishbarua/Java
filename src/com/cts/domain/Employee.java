package com.cts.domain;

public abstract class Employee extends Object{
	
	private String name;
	
	private String city;
	
	private double salary;
	
	public Employee() {
		
	}
	
	
	public abstract double getNetSalary();

	public Employee(String name, String city, double salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDetails() {
		return name + " " + city + " " + salary;
	}
	
	@Override
	public String toString() {
		
		return name + " " + city + " " + salary;
	}

}
