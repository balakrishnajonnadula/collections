package com.treemap;

import java.util.Comparator;
import java.util.TreeMap;

class MyComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return -s1.compareTo(s2);
	}

}

public class TreeMapCustmisedSorting {

	public static void main(String[] args) {
		TreeMap tmp = new TreeMap(new MyComp());
		tmp.put(100, "Hello");
		tmp.put(104, "Hi");
		tmp.put(101, "He");
		tmp.put(106, "She");
		System.out.println(tmp);
	}

}
