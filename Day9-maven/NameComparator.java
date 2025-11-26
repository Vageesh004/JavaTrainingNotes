package com.nov26.Day9_maven;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.get.compareTo(o2.getCity());
	}

}
