package com.practice;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector vec = new Vector();
		vec.add("A");
		vec.add("B");
		vec.add("C");
		vec.add("D");
		System.out.println(vec);
		Vector vec1 = new Vector<>(vec);
		System.out.println(vec1);

		Object[] array = vec.toArray();
		for (Object obj : array) {
			System.out.print(obj + " ");
		}
		System.out.println();
//		in Vector we can declare initialize initial capacity and growable capacity.
		Vector vector = new Vector<>(6, 6);
		System.out.println(vector.capacity());
		for (int i = 1; i <= 7; i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity());
		for (int i = 8; i <= 13; i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity());
	}

}
