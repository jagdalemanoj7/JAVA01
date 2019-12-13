package jv19;

import java.util.Scanner;

public class Pattern2Reverse
{
	public static void main(String[] args) {
		
		//	int rows=4;   // For Testing 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Enter the height1 of Pyramid: ");
		int rows=scan.nextInt();
				System.out.println();
				
		for (int i = 0; i <= rows-1; i++) {
					
			for (int j = 0; j < i; j++) {
					System.out.print(" ");
			}
			
			for (int k = rows-1; k >= i; k--) {
					System.out.print(" *");
			}
			System.out.println();
		}
				
	}
}