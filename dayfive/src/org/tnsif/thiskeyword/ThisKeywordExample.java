package org.tnsif.thiskeyword;
//this keyword in terms of constructor
public class ThisKeywordExample {

	int num;
	
	//default constructor
	public ThisKeywordExample() {

	}
	
	//parameterized constructor
	public ThisKeywordExample(int num) {
		this.num = num;	//class variable = constructor method parameter
	}

	public static void main(String[] args) {
		ThisKeywordExample obj = new ThisKeywordExample(5);
		System.out.println("Num value:"+obj.num);

	}

}
