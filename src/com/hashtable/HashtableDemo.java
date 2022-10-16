package com.hashtable;

import java.util.Hashtable;

class Temp {
	int i;

	Temp(int i) {
		this.i = i;
	}

	public int hashCode() {
		return i;
	}
	public String toString() {
		return i + "";
		
	}
}

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable(50);
		ht.put(new Temp(10), "A");
		ht.put(new Temp(20), "B");
		ht.put(new Temp(31), "C");
		ht.put(new Temp(41), "D");
		ht.put(new Temp(15), "E");
		ht.put(new Temp(23), "F");
		System.out.println(ht);
	}
}
