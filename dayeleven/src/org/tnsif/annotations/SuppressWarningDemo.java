package org.tnsif.annotations;
import java.util.Scanner;

//program on suppress warning
public class SuppressWarningDemo {

	public static void main(String[] args) {
		//these annotation is used to remove the warnings which occur at the compile time
		@SuppressWarnings("resource")	
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		System.out.println(x);
		
	}

}
