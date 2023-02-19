package org.tnsif.annotations;
//Program on Override Annotation
class Parent{
	public void print() {
		System.out.println("Parent class method");
	}
}

class Child extends Parent{
	
	@Override
	public void print() {
		super.print();
		System.out.println("Child class method");
	}
}

public class OverrideAnnotationsDemo {

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.print();
	}

}
