package com.practice;

import java.util.Enumeration;
import java.util.Vector;

public class EnumertionDemo {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add(200);
		vector.add(300);
		vector.add(400);
		vector.add(100);
		System.out.println(vector);
		
//		Enumeration is not universal iterator it is only for legacy classes.				
		Enumeration elements = vector.elements();
		while(elements.hasMoreElements()) {
			System.out.print(elements.nextElement() + " ");
		}
		System.out.println();
	}

}
