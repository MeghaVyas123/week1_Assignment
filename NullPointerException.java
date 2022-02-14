package com.example.exception;

public class NullPointerException {
		   public static void main(String[] args) {
		      Object ref = null;
		      ref.toString(); // this will throw a NullPointerException
		   }
		}


		/*
		 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
		 * "Object.toString()" because "ref" is null at
		 * com.example.exception.NullPointerException.main(NullPointerException.java:6)
		 */


	// It is not a checked exception