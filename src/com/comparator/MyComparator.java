package com.comparator;

import java.io.Reader;
import java.util.Comparator;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptException;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 < o2) {
			return +1;
		} else if (o1 > o2) {
			return -1;
		} else {
			return 0;
		}
	}

}
