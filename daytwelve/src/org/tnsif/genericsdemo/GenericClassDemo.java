package org.tnsif.genericsdemo;
//Program to demonstrate on Generic Class
//Generic class definition
class GenericClass<T>{
	T x;
	//to add the elements in the GenericClass
	void display(T x) {
		this.x = x;
	}
	T accept() {
		return x;
	}
}
public class GenericClassDemo {

	public static void main(String[] args) {
		GenericClass<String> obj1 = new GenericClass<String>();
		obj1.display("TechnoServe India");
//		obj1.display(11);
		System.out.println(obj1.accept());
	}

}
