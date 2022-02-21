package com.collection.Treeset;

import java.util.TreeSet;
 
public class TreeSetWithLambda {
	
    public static void main(String a[]){

    	TreeSet<Product> ts = new TreeSet<>((p1, p2)->p1.getName().compareTo(p2.getName()));

        ts.add(new Product(1,"LAPTOP",200000));
        ts.add(new Product(2,"CHARGER",500));
        ts.add(new Product(3,"SPEAKER",2000));       
        ts.add(new Product(4,"BLUETOOTH",500));
        ts.add(new Product(5,"HEADPHONES",700));
        ts.add(new Product(6,"PENDRIVE",200));
        
        System.out.println(ts);
    }
}
 

