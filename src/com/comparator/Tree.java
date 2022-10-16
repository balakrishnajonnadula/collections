package com.comparator;

import java.util.TreeSet;

public class Tree {
	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>(new MyComparator());
		tSet.add(10);
		tSet.add(15);
		tSet.add(9);
		tSet.add(5);
		tSet.add(20);
		tSet.add(20);
		System.out.println(tSet);// customized sorting order
	}
}
