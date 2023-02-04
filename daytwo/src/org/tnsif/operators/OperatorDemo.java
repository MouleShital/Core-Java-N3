package org.tnsif.operators;

//to demonstrate the example on types of operators
import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values of x and y:");
		int x=s.nextInt();
		int y=s.nextInt();
		
		//Arithmetic Operators
		/*System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		*/
		
		//Relational Operators
		/*
		boolean result1=x<y;
		System.out.println(result1);
		boolean result2=x>y;
		System.out.println(result2);
		boolean result3=x<=y;
		System.out.println(result3);
		boolean result4=x>=y;
		System.out.println(result4);
		boolean result5=x==y;
		System.out.println(result5);
		boolean result6=x!=y;
		System.out.println(result6);
		*/
		
		
		//Assignment Operator
		/*x+=y;	//x=x+y
		System.out.println(x);
		x-=y;	//x=x-y
		System.out.println(x);
		x*=y;	//x=x*y
		System.out.println(x);
		x/=y;	//x=x/y
		System.out.println(x);
		x%=y;	//x=x%y
		System.out.println(x);
		*/
		
		//Logical Operator
		/*boolean res2=(5==5)&&(5>3); //logical AND
		System.out.println(res2);	//true
		boolean res3=(5==3)||(5>2);	//logical OR
		System.out.println(res3);	//true
		boolean res4=!(5==4);		//logical NOT
		System.out.println(res4);	//true
		*/

		//Bitwise Operators
		/*int a=12 & 5;
		System.out.println(a);
		int b=12 | 5;
		System.out.println(b);
		int c=12 ^ 5;
		System.out.println(c);
		*/
		
		//Ternary Operator
		/*String res=(12%2==0)?"true":"false";
		System.out.println(res);
		*/
		
		//Increment and Decrement
		/*int p = x++;
		int q = --x;
		System.out.println(q);
		*/
	}

}
