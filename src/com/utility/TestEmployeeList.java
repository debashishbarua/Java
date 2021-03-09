package com.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeList {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student("Akash", 80));
		students.add(new Student("Ajay", 70));
		students.add(new Student("Amol", 60));
		students.add(new Student("Alak", 90));
		students.add(new Student("Abbash", 85));

		System.out.println("Student List");

		for (Student student : students) {
			System.out.println(student);
		}

		// Print list order by name
		System.out.println("Sorted list By Name");
		Collections.sort(students,new NameCompare());
		for (Student student : students) {
			System.out.println(student);
		}
		// Print list order by marks
		System.out.println("Sorted list By Name");
		Collections.sort(students,new MarksCompare());
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
