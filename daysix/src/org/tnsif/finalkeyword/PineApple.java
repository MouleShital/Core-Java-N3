package org.tnsif.finalkeyword;

//child class
public class PineApple extends Apple {

	private int price;
	/*if any method is declared as final in class and we are going to use that 
	method inside the child class then we can't override but we can overload.
	*/
	/*
	void display()
	{
		System.out.println("This is child class of ");
	}
	*/
	final void display(int price)
	{
		System.out.println("The price is: "+price);
	}
	
	//getters and setters
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
