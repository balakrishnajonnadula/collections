package com.ass1.program1;

import java.util.Scanner;

public class StudentClient {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSetDemo std = new HashSetDemo();
		while (true) {
			System.out.println("1)add student");
			System.out.println("2)view student");
			switch (scanner.nextInt()) {
			case 1: {
				std.addStudent();
				break;
			}
			case 2: {
				std.displayStudent();
				break;
			}
			default: {
				System.out.println("Enter valid input..!");
			}
			}
		}
	}

}
