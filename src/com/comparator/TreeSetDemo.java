package com.comparator;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>(new MyComp());
		set.add(new Student("Jbk", 87, "Hyd"));
		set.add(new Student("Ravi", 32, "Hyd"));
		set.add(new Student("Balu", 56, "Hyd"));
		set.add(new Student("Sai", 21, "Hyd"));
		set.add(new Student("Mani", 1, "Hyd"));
		set.add(new Student("Loki", 76, "Hyd"));

		for (Student st : set) {
			System.out.println(st);
		}
	}

}
