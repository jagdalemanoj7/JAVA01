package jv19;

import java.util.Scanner;

public class CountChar1 {

	public static void main(String[] args) {
		String str= "Krushna is a good football player";
		// char anyChar='o';
		char anyChar;	
		int count=0;
		
		System.out.println("\n\n----------------------------------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Enter Any Character which you want to count: ");
		System.out.print("\t");
		anyChar=scan.next(".").toLowerCase().charAt(0);
	
		// Count each character except space TO TOTAL COUNT...
		// Count any one character of sentence TO COUNT A CHARACTER..
	
		for (int i = 0; i < str.length(); i++) {
		// if(str.charAt(i) != ' ')
		if(str.charAt(i)==anyChar)
			count++;
		}
	
		if(count>0)
		//System.out.println("Total Count of Characters are :" +count );
		System.out.println("\n Total Count of "+anyChar+" is " +count+ " times.");
		else
			System.out.println("\n Character "+anyChar+" is not present in the Sentence.... ");
		
		System.out.println(" \n\n----------------------------------------------------");
	}
}