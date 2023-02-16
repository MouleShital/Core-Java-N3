package org.tnsif.polymorphismdemo;

//program to demonstrate on constructor overloading
public class HondaCity {
	
	//private data members
	private int speed;
	private String color;
	
	//constructor overloading
	
	//default constructor
	public HondaCity() {
		System.out.println("I like to drive a HondaCity");
	}
	
	//parameterized constructor
	public HondaCity(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
		System.out.println("Speed is: " +speed+ ",Color is: "+color);
	}
	
	
	
	

}
