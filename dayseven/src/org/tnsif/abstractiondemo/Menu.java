package org.tnsif.abstractiondemo;

//program to demonstrate on abstract class and abstract method

//this is a abstract class
//class cannot be final abstract
public abstract class Menu {
	
	//abstract method
	abstract void receipe();
	abstract void foodType();
	
	//concrete method or non-abstract method
	void menuType() 
	{
		System.out.println("Veg and Nonveg");
	}
}
