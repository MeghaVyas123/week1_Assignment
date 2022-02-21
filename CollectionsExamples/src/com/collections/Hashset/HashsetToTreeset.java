package com.collections.Hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetToTreeset {

	public static void main(String[] args) {
		Set<String> obj = new HashSet<String>();
		obj.add("This");
		obj.add("is an");
		obj.add("example");
		obj.add("of");
		obj.add("Parameterized HashSet");
		System.out.println("Hi" + obj);
		
		Set<String> hashSetToTreeSet = new TreeSet<String>(obj);
		
		System.out.println("TreeSet: " + hashSetToTreeSet);
	}
}
