package com.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProducts {

	public static void main(String[] args) {
	    ArrayList<String> products = new ArrayList<String>();
	    products.add("Books");
	    products.add("Pens");
	    products.add("Pencils");
	    products.add("Erasers");
	    System.out.println(products);

	    Collections.sort(products);  // Sort products
	    	for (String i : products) {
	    		System.out.println(i);
    }
	}
}
