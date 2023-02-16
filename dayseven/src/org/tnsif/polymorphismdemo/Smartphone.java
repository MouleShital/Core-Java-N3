package org.tnsif.polymorphismdemo;

//program to demonstrate on Method overloading
public class Smartphone {

	//private data members
	private int resolution;
	private String slottype;
	
	//method overloading in terms by passing number of arguments
	void display(int resolution)
	{
		System.out.println("Camera Resolution: "+resolution);
	}
	
	void display(int resoltuion, String slottype)
	{
		System.out.println("Camera Resolution: " + resolution + "," +"Slot Type: "+slottype);
	}

	//getters and setters
	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public String getSlottype() {
		return slottype;
	}

	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	
	
}
