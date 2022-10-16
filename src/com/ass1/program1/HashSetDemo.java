package com.ass1.program1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetDemo {
	Scanner scanner = new Scanner(System.in);
	Set<Student> students = new HashSet<Student>();

	public void addStudent() {
		System.out.println("Enter roll number");
		int roll = scanner.nextInt();
		System.out.println("Enter name.");
		String name = scanner.next();
		Student std = new Student(roll, name);
		students.add(std);
		System.out.println(name + " successfully added..!");
	}

	public void displayStudent() {
		if (students != null) {
			for (Student std : students) {
				System.out.println("Roll number : " + std.getRollNum() + ", Name : " + std.getName());
			}
		} else {
			System.out.println("Source not found..!");
		}
	}
}
