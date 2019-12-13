package jv19;

import java.util.Scanner;

/*

 Enter the height of Pyramid: 
6

*
**
***
****
*****
******

 */
public class Pattern1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Enter the height of Pyramid: ");
		int len=scan.nextInt();
		
		System.out.println();
		for (int i = 0; i <= len-1; i++) {
			for (int j = 0; j <= i ; j++) {
				
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
