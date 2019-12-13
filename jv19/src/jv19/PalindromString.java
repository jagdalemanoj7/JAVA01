package jv19;

public class PalindromString {
public static void main(String[] args) {
	
	String string="OPPs";
	String reversestring="";
	for (int i= string.length()-1; i>=0; i--) {
		reversestring=reversestring+string.charAt(i);
		
	}
	
		if(string.equals(reversestring)) {
			System.out.println(string+ " is Palindrom...");
		}
		else
			System.out.println(string+ " is not a Palindrom..");
	
	}
}
