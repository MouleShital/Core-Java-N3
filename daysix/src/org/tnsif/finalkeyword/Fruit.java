package org.tnsif.finalkeyword;

//driver class of PineApple and Apple\

//to demonstrate the program for final method
public class Fruit {

	public static void main(String[] args) {
		PineApple p = new PineApple();
		p.fruitname="Apple";
		p.display();
		p.setPrice(250);
		p.display(p.getPrice());

	}

}
