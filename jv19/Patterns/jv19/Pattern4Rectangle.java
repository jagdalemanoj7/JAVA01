package jv19;

public class Pattern4Rectangle {
	public static void main(String[] args) {
		
		int rows = 4;
		// int rows=3, columns=4;
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < rows; j++) {
				// For 4 * 4 Rectangle 
				 if((i==1 && j==1) || (i==1 && j==2) || (i==2 && j==1) || (i==2 && j==2))
				
				// For 3 * 4 Rectangle
				//if((i==1 && j==1) || (i==1 && j==2) ) 
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*   Output
 
4 * 4

****
*  *
*  *
****

3 * 4

****
*  *
****

*/
