package jv19;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		
		String Original="Hello Java", Reverse="";	
		
		int StrLeng=Original.length();
		//Scanner scan=new Scanner(sys.in);
		// 0 - 5
		for (int i = StrLeng-1; i >= 0; i--) {
			Reverse = Reverse + Original.charAt(i);
		}
		
		System.out.println("Reverse String is: "+Reverse);
				
	}	
}