package com.example.finalexample;

final class FinalExample { // final class
	final int rollno = 1; // final instance variable
	
	final void submitBook(final String subject) { // final method with final parameter
		final int bookNo = 1;  // local variable
		System.out.println("Book Number " + bookNo + " is submitted");
		// bookNo = 2;  // final variable's value cannot be changed once it is assigned.
	}
	
	public static void main(String[] args) {
		FinalExample example = new FinalExample();
		example.submitBook("Maths");
	}
}

/*  Final class cannot be subclassed.
 * 
 * class Book extends FinalExample{
 * 
 * }
 */
