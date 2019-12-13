package jv19;

import java.util.Scanner;
/*
 
 Enter the height of Pyramid: 
6
       *
      * *
     * * *
    * * * *
   * * * * *
  * * * * * *
  
 */
public class Pattern2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Enter the height of Pyramid: ");
		int len=scan.nextInt();
		
		for (int i = 0; i <= len-1; i++) {
			for (int j = len-1; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int k = 0; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}