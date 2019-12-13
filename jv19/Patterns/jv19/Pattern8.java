package jv19;
/*
 OUTPUT
 
*   *
 * * 
  *  
 * * 
*   *
   
 */
public class Pattern8 {
	public static void main(String[] args) {
		int rows = 5;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				if((i==j) || (i==0 && j==4) ||(i==1 && j==3) || (i==3 && j==1) ||(i==4 && j==0))
					System.out.print("*");
				
				else
					System.out.print(" ");
			}System.out.println();
		}
	}
}