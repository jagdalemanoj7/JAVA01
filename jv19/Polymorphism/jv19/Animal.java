package jv19;

abstract class Animal {
	abstract void eat();
	abstract void sleep();
}

class Cat extends Animal {
	@Override
	void eat()
	{
		System.out.println("Cat must eat..");
	}
	
	@Override
	void sleep()
	{
		System.out.println("Cat must sleep..");
	}
}

class Rat extends Animal{
	@Override
	void eat()
	{
		System.out.println("Rat may eat..");
	}
	
	@Override
	void sleep()
	{
		System.out.println("Rat may sleep..");
	}
	
}