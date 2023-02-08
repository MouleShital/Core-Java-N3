package org.tnsif.accessspecifierdemo;

public class AccessSpecifierExecuter {

	public static void main(String[] args) {
		AccessSpecifierExample a =new AccessSpecifierExample();
			
		a.setName("welcome to MET");
//		a.display();
		System.out.println(a.getName());
	}
	

}
