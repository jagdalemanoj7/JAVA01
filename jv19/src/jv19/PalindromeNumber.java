package jv19;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num=s.nextInt();
		int sum=0,mod=0;
		int temp=num;
		
		while(num!=0 || num>0)
		{
			mod=num%10;
			sum=(sum*10)+mod;
			num=num/10;
		}
		
		if(temp==sum)
			System.out.println(temp+" is a Palindrome Number.");
		else	
			System.out.println(temp+" is not a Palindrome Number.");
		
	}
}