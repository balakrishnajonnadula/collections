package com.comparator;

import java.util.Comparator;
import java.util.TreeSet;

class MyCom implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return -o1.compareTo(o2);
	}

}

public class StringCompatator {

	public static void main(String[] args) {
		TreeSet<String> tSet = new TreeSet<String>(new MyCom());
		tSet.add("Ramakrishna");
		tSet.add("Ramesh");
		tSet.add("Ramu");
		tSet.add("Rakesh");
		tSet.add("Rani");
		System.out.println(tSet);

	}

}
