package org.tnsif.usingrunnable;
//driver class
//program to demonstrate on runnable interface for a thread
public class MarathonExecuter {

	public static void main(String[] args) {
		Marathon m = new Marathon();
		m.setSpeed(400);
		m.setCity("Nashik");
		m.run();
	}

}
