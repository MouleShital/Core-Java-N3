package org.tnsif.genericsdemo;


class GenericMethod{
	public static <E>void print(E[] elements)
	{
		for(E itr:elements) {
			System.out.print(itr+" ");
		}
		System.out.println();
	}
}

public class GenericMethodDemo {

	public static void main(String[] args) {
		GenericMethod m = new GenericMethod();
		Integer[] array1 = {10, 40, 35, 61};
		Character[] array2 = {'S', 'A', 'M', 'P'};
		
		System.out.println("This is an Integer Array: ");
		m.print(array1);
		System.out.println("This is an Character Array: ");
		m.print(array2);

	}

}
