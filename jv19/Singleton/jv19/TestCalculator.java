package jv19;

public class TestCalculator 
{
	public static void main(String[] args) 
	{
		Calculator c2 = Calculator.getobject();
		System.out.println("----- "+c2);
		c2.add();
		System.out.println("----- "+c2);
		System.out.println("-----------------------------");
		c2.a=10;
		c2.b=40;
		c2.add();
		System.out.println("----- "+c2);
	}
}