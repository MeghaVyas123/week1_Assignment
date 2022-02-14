package com.example.interfaceexample;

// Interface as a reference

 interface ReferenceInterface {

 }

 class DerivedInterface implements ReferenceInterface{
	 ReferenceInterface ri = new ReferenceInterface(); // Cannot instantiate the type ReferenceInterface
	 
	 ReferenceInterface di = new DerivedInterface(); // With reference of derived class,we can instantiate
	   												// the object of an Interface.
			 
 }
