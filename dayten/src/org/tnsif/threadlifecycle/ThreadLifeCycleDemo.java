package org.tnsif.threadlifecycle;
//driver class
//program to demonstrate on thread life cycle
public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		Tech t = new Tech();
		SoftSkill s = new SoftSkill();
		t.start();
		t.yield();	//move control to the another state
		
		s.start();

	}

}
