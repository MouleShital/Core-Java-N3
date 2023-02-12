package org.tnsif.staticdemo;

public class StaticVariableExecuter {

	public static void main(String[] args) {
		StaticVariable s=new StaticVariable("Nia Lopez");
		System.out.println(s);
		//use classname.variablename to print static variable
		System.out.println(StaticVariable.companyname);
	}

}
