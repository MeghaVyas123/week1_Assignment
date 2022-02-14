package com.example.abstractexample;

// Abstract class as a reference

	abstract class ReferenceAbstract { 
		
	} 
	
	class DeclaredClass extends ReferenceAbstract { 
		ReferenceAbstract a = new ReferenceAbstract(); // Cannot instantiate the type ReferenceAbstract
		
		ReferenceAbstract c = new DeclaredClass(); // With reference of derived class,we can instantiate
												   // the object of an abstract class.
	}
