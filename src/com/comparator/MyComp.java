package com.comparator;

import java.util.Comparator;

public class MyComp implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		if(obj2.getId() > obj1.getId())
			return +1;
		else if(obj2.getId() < obj1.getId()) {
			return -1;
		}
		return 0;
	}

}
