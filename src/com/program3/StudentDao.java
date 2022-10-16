package com.program3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentDao {
	Scanner scanner = new Scanner(System.in);
	List<Student> std = new ArrayList<Student>();

	public void addStudents() {
		System.out.println("student id :");
		int id = scanner.nextInt();
		System.out.println("student name :");
		String name = scanner.next();
		System.out.println("student add :");
		String add = scanner.next();
		Student student = new Student(id, name, add);
		std.add(student);
		System.out.println(name + " added successfully..!");
	}

	public void viewStudents() {
		Iterator<Student> student = std.iterator();
		while (student.hasNext()) {
			Student obj = student.next();
			System.out.println("Id : " + obj.getId() + ", Name : " + obj.getName() + ", Address : " + obj.getAdd());
		}
	}
}
