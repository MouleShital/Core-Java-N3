package org.tnsif.thiskeyword;
//it can be used to refer instance variable of current class
class Account{
	int a, b;
	void setdata(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public void showdata() 
	{
		System.out.println("Value of A = "+a);
		System.out.println("Value of B = "+b);
	}
}
public class ThisKeywordDemo{
	public static void main(String[] args) {
		Account obj = new Account();
		obj.setdata(55, 66);
//		obj.a=55;
//		obj.b=45;
		obj.showdata();

	}
}

