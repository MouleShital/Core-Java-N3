package org.tnsif.finalkeyword;

/*if any parent class is declared as final we can't 
 * inherit that class into child class
 */

final class Currency{
	void print() {
		System.out.println("American Currency");
	}
}

class Dollar{
//	public String a;
	void print() {
		System.out.println("Dollar");
	}
}


public class FinalClassDemo {

	public static void main(String[] args) {
		
		Currency c= new Currency();
		c.print();
		Dollar d= new Dollar();
		d.print();
		

	}

}
