package com.utility;

public class Employee {
	
	private String name;
	private double marks;

	public Employee() {
		
	}

	public Employee(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		
		return name + " - " + marks;
	}

}
