package org.tnsif.abstractiondemo;

public class AbstractionExecuter {

	public static void main(String[] args) {
		
		ButterChicken b = new ButterChicken();
		/* we cannot instantiate the abstract class
		Menu m =new Menu();
		*/
		b.receipe();
		b.menuType();
		b.foodType();
	}

}
