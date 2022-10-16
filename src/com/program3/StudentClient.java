package com.program3;

import java.util.Scanner;

import com.program2.LinkedListDemo;

public class StudentClient {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentDao std = new StudentDao();
		while (true) {
			System.out.println("1)add student");
			System.out.println("2)view student");
			switch (scanner.nextInt()) {
			case 1: {
				std.addStudents();
				break;
			}
			case 2: {
				std.viewStudents();
				break;
			}
			default: {
				System.out.println("Enter valid input..!");
			}
			}
		}
	}

}
