package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the song number: ");
		int song_no = s.nextInt();
		switch(song_no)
		{
		case 1:
			System.out.println("Kesariya");
			break;
		case 2:
			System.out.println("ved");
			break;
		case 3:
			System.out.println("Calm Down");
			break;
		case 4:
			System.out.println("Senorita");
			break;
		default:
			System.out.println("Thank you");
		}

	}

}
