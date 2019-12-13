package jv19;

import java.util.Scanner;

public class Pattern3Reverse {

	public static void main(String[] args) {
		
		// int row = 4;   //  for testing 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Enter the heigh of Pyramid: ");
		int rows = scan.nextInt();
		
		for (int i = 0; i <= rows-1; i++) {
			
			for (int j = 0; j <i; j++) {
				System.out.print(" ");
			}
			
			for (int k = rows-1; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}