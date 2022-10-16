package com.program2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListDemo {
	Scanner scanner = new Scanner(System.in);
	List<Employee> employees = new LinkedList<Employee>();

	public void addEmployee() {
		System.out.println("Employee id :");
		int id = scanner.nextInt();
		System.out.println("Employee name :");
		String name = scanner.next();
		System.out.println("Employee basic :");
		double basic = scanner.nextDouble();
		Employee emp = new Employee(id, name, basic);
		employees.add(emp);
		System.out.println(name + " added successfully..!");
	}

	public void viewEmployee() {
		if (employees != null) {
			for (Employee emp : employees) {
				System.out.println("Id : " + emp.getId() + ", Name : " + emp.getName() + ", Basic : " + emp.getBasic());
			}
		} else {
			System.out.println("Source not found..!");
		}
	}
}
