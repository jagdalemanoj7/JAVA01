package jv19;
/*
 // If condition is present
   *
  * *
 *   *
  * *
   *

---------------------------

   *
  * *
 * * *
  * *
   *

 */

public class Pattern6Diamond {
	public static void main(String[] args) {
		
		int rows=2,j=2;
		
		for (int i = 0; i <= 2; i++) {
			for ( j = 2; j > i ; j--) {
				System.out.print(" ");
			}
			
			
			for (int k = 0; k <= i; k++) {
				if(k!=1 || i!=2) {				// for space in diamond
					System.out.print(" *");
				}				
				else
					System.out.print("  ");  // two spaces
			}
			System.out.println();
		}
		
		for (int p = 0; p < 2; p++) {
			for (int q = 0; q <= p ; q++) {
				System.out.print(" ");
			}
			
			for (int r = 2; r > p; r--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}