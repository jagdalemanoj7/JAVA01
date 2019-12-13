package jv19;

public abstract class Calculation1 {

	int a=10; int b=5;
	
	abstract void add();
	abstract void substract();
}

abstract class Addition extends Calculation1
{
	@Override
	void add()
	{
		System.out.println("Addition Result is : "+ (a+b));
	}

}

class Substraction extends Addition
{
	@Override
	void substract()
	{
		System.out.println("Substraction is: "+ (a-b));
	}
}
