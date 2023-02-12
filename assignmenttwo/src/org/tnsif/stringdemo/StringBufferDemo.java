package org.tnsif.stringdemo;
//program to demonstrate on string buffer
public class StringBufferDemo {

	public static void main(String[] args) {
		//length vs capacity
		StringBuffer sb = new StringBuffer("Shital");
		System.out.println(sb);
		//16 by default + length of the string(6) = 22
		System.out.println(sb.length());
		System.out.println(sb.capacity()); 	//by default its 16
		
		String str;
		int a=34;
		sb=new StringBuffer(40);
		str=sb.append(a).toString();
		System.out.println(str);	//34
		System.out.println(sb.reverse());	//43
	}

}
