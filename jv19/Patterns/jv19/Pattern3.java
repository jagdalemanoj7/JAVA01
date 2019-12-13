package jv19;

import java.util.Scanner;

/*
 
 Enter the height of Pyramid: 
5
    *
   **
  ***
 ****
*****

 */
public class Pattern3 {
	public static void main(String[] args) {
		
		// int rows=4;   // For Testing 
		
				Scanner scan = new Scanner(System.in);
				System.out.println("\n Enter the height of Pyramid: ");
				int rows=scan.nextInt();
			
				for (int i = 0; i <= rows-1; i++) {
			
					for (int j = rows-1; j > i; j--) {
						System.out.print(" ");
					}
					for (int k = 0; k <= i; k++) {
						System.out.print("*");
					}
					System.out.println();
				}			
	}
}