package org.tnsif.staticdemo;

public class StaticBlockExceuter {

	public static void main(String[] args) {
		System.out.println(StaticBlock.getName());
		
		//to get the non-static variable value we have to create a object of that class
		StaticBlock s = new StaticBlock();
		s.setNum(145);
		System.out.println(s.getNum());
	}

}
