package jv19;

public class stringDemo {
public static void main(String[] args) {
	String s1="pune";
	String s2 =new String("pune");
	String s3="pune";
	String s4=new String("pune");

	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println("----------Checking Address-----------");
	//Checking address
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s1==s4);
	System.out.println(s2==s4);
	System.out.println("---------Checking Data-------------");
	//
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
	System.out.println(s2.equals(s4));
	
}	
}
