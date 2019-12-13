package jv19;

public class Architect {

	void register()
	{
		System.out.println("register from base class..");
	}
	
	void login()
	{
		System.out.println("login from base class..");
	}

}

class Developer extends Architect
{
	void register()
	{
		System.out.println("register from child class..");
	}
	
	void test()
	{
		System.out.println("test from child class..");
	}

}
