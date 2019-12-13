package jv19;

/* OUTPUT
 
*****
  *  
*****

 */

public class Pattern7Rect {
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {		// TRY DIFFERENT CONDITIONS FOR DIFFERENT PATTERNS
			    if((i==1 && j==2) || (i!=1 && j!=0) || (i!=1 && j!=1) || (i!=1 && j!=3) || (i!=1 && j!=4))
			    	
					System.out.print("*");
				else
					System.out.print(" ");
			}	
			System.out.println();
		}
	}
}