package org.tnsif.arraysdemo;
import java.util.Arrays;
//program to demonstrate an array using user inputs
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n = s.nextInt();
		//array declaration
		int arr[] = new int[n];
		//to allocate the values to an array
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Array Elements are: ");
		//to prints the elements of an array
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		//to sort an array elements
		/* System.out.println("\nAfter Sorting the Array: ");
		Arrays.sort(arr);
		for (int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		*/
		
		//sorting the array using enhanced for loop
		System.out.println("\nSorted elements are: ");
		Arrays.sort(arr);
		for (int itr: arr)
		{
			System.out.print(itr+" ");
		}
		s.close();
	}

}
