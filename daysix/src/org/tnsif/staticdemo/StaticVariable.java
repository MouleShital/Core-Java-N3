package org.tnsif.staticdemo;

//program to demonstarte on static variable
public class StaticVariable {
	
	//non-static variable
	private String name;
	
	//static variable
	public static String companyname="Technoserve India";

	//parameterized constructor
	public StaticVariable(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "StaticVariable [name=" + name + "]";
	}
	
	
	
	
	
}
