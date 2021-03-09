package com.cts.domain;


public class Director extends Employee {	
	
	private String level;
	
	public Director() {
		//Implicit call of super()
		super();
	}

	public Director(String name, String city, double salary, String level) {
		super(name, city, salary);
		this.level =level;		
		
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	public String getLevel() {
		return level;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " "  + level;
	}
	

	@Override
	public double getNetSalary() {
		if(level.equals("Level-1")) {
			return super.getSalary() + 100;
		}else {
			return super.getSalary() + 200;
		}
	}
}
