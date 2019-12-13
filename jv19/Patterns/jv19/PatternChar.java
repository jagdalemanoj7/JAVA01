package jv19;

import java.util.Scanner;

public class PatternChar {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Enter the height of Pyramid: ");
		int len=scan.nextInt();
		System.out.println("\n Enter the Ascii Number: ");
		int ascii=scan.nextInt();
		char str;
		System.out.println();
		for (int i = 0; i <= len-1; i++) {
			for (int j = 0; j <= i ; j++) {
				str = (char)ascii;		
				System.out.print(str);				
				ascii++;	
			}
			
			System.out.println();
		}	

	}

}
