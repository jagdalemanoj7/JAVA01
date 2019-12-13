package jv19;

public class Vehical implements iCar, iBike
{
	@Override
	public void innova()
	{
		System.out.println("This is Innova..");
	}
	
	@Override
	public void zest()
	{
		System.out.println("This is Zest..");
	}
	
	@Override
	public void honda()
	{
		System.out.println("This is Honda..");
	}
	
}
