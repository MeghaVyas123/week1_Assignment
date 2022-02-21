package com.example.interfaceexample;

interface InterfaceEg
{
	void met1();
	default int met2()
	{
		return 10;
	}
}

class Example implements InterfaceEg
{
	public void met1()
	{
		System.out.println("Example");
	}
	public int met2()
	{
		return 0;
	}
}
public class InterfaceDefaultMethod {

	public static void main(String[] args) {
		InterfaceEg i=new Example();
		i.met2();
		i.met1();
	}

}

/*  ABSTRACT CLASS EXAMPLE
 * abstract class a { int i; void met5() { System.out.println("Megha"); } }
 * 
 * class xyz extends a { void met5() { System.out.println("MeghaVyas"); } }
 * 
 * class main { public static void main(String args[]) { a a=new xyz();
 * a.met5(); }
 * 
 * }
 * 
 * 
 */