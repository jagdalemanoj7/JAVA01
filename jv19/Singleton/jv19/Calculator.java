package jv19;

public class Calculator {

	int a=5, b=10;
	static Calculator c1=new Calculator();
	
	private Calculator()
	{
		System.out.println("Object Created...");
	}
	
	public void add()
	{
		System.out.println("\n Sum is: "+(a+b));
	}
	
	static Calculator getobject()
	{
		return c1;
	}
	
}