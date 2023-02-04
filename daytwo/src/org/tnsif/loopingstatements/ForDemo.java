package org.tnsif.loopingstatements;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//to print 1 to n
		/*for(int i=1; i<=n; i++)
		{
			System.out.print(i + " ");
		}*/
		
		//to print n to 1
		for(int i=n; i>=1; i--)
		{
			System.out.print(i + " ");
		}

	}

}
