package com.comparator;


import java.util.Comparator;
import java.util.TreeSet;

class MyCompa implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return -s1.compareTo(s2);
	}

}

public class StringBufferComparator {

	public static void main(String[] args) {
		TreeSet tSet = new TreeSet(new MyCompa());
		tSet.add(new StringBuffer("A"));
		tSet.add(new StringBuffer("Z"));
		tSet.add(new StringBuffer("L"));
		tSet.add(new StringBuffer("M"));
		System.out.println(tSet);

	}

}
