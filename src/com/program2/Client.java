package com.program2;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedListDemo emp = new LinkedListDemo();
		while (true) {
			System.out.println("1)add employee");
			System.out.println("2)view employees");
			switch (scanner.nextInt()) {
			case 1: {
				emp.addEmployee();
				break;
			}
			case 2: {
				emp.viewEmployee();
				break;
			}
			default: {
				System.out.println("Enter valid input..!");
			}
			}
		}
	}
}
