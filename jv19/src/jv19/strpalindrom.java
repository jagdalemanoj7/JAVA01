package jv19;

public class strpalindrom {
public static void main(String[] args) {
	
	String s="KADAK";
	String s1="";
	for (int i= s.length()-1; i>=0; i--) {
		s1=s1+s.charAt(i);
		
	}
	
	if(s.equals(s1)) {
		System.out.println(s+ " is Palindrom...");
	}
	else
		System.out.println(s+ " is not a Palindrom..");
	
}
}
