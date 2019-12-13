package jv19;

class base1 {
	
	void show()
	{
		//System.out.println("\n\n");
		System.out.println(" BaSe method get overrided....");	 
	}

}

class derived extends base1
{
	//@Override
	void show()
	{
		System.out.println(" Child class get.");
	}

}