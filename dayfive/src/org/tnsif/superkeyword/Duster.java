package org.tnsif.superkeyword;

//child class
public class Duster extends Renault {
	private int speed = 120;
	
	public void print()
	{
		super.print();  //it will call to parent class method
		System.out.println("The speed of Duster is: " +speed+ "km/hr");
	}
	
}
