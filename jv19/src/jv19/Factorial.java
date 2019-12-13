package jv19;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int num, fact=1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		num = s.nextInt(); 
		
		// 3!= 3*2*1				
		
		for (int i = num; i >= 1; i--) {
					
			fact = fact * i;
			
			// 3 = 3 * 1			// num 3 2   
			// 6 = 3 * 2
			
		}

		if(num==0)
			System.out.println("FActorial of "+num+"! = "+"1");
					
		else			
			System.out.println(" FActorial of "+num+"! = "+ fact);

	}

}