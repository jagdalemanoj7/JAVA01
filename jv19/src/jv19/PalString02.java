package jv19;

public class PalString02 {
	public static void main(String[] args) {
		
		String s1="OPPO";
		String s2="";
		
		for (int i = s1.length()-1; i >= 0; i--) {
			
			s2+=s1.charAt(i);
			
		}
		
		if(s1.equals(s2))
			System.out.println(s1+" is a Palindrome String.");
		else
			System.out.println(s1+" is not a Palindrome String.");
		
	}
}
