package jv19;

import java.util.Scanner;

public class Pattern1Reverse {
	public static void main(String[] args) {
		
		// int row = 4;   //  for testing 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Enter the height of Pyramid: ");
		int rows = scan.nextInt();
		System.out.println();
		
		for (int i = 0; i <= rows; i++) {
			for (int j = rows-1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
				
	}
}
