package jv19;

public class Superclass {

	public void show()
	{
		System.out.println(" Show() called in Super Class..");
	}
}

 class Subclass extends Superclass{
	public void show() {
		System.out.println(" Show() called in Sub Class.");
	}
}
