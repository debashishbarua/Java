package com.utility;

import java.util.Comparator;

public class MarksCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {		
		return new Double(o1.getMarks()).compareTo(new Double(o2.getMarks()));
	}

}
