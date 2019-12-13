package jv19;

public class Gadget implements iMobile, iLaptop 
{
	public void brand(String company)
	{
		System.out.println(" Company is: "+company);
	}
	
	public void display(double size)
	{
		System.out.println(" Size is: "+size);
	}
		
	public void price(double price)
	{
		System.out.println(" Price is: "+price);
	}
}
