package com.collection;

import java.util.ArrayList;

public class NestedArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> arr = new ArrayList<>();
		ArrayList<String> arrayList = new ArrayList<String>();
		
			arrayList.add("Megha");
			arrayList.add("Atul");
			arrayList.add("Vyas");

			for(ArrayList<String> s : arr ) {
				System.out.println(s);
			}
	}
}
