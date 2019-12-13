package jv19;


public class This_demo1 {

	This_demo1()
	{
		System.out.println("Running zero-arg Constructor...");
	}
	
	This_demo1(int a)
	{
		this('z');
		System.out.println("Running int-arg Constructor..");
	}
	
	This_demo1(char a)
	{
		this();
		System.out.println("Running char-arg Constructor..");
	}
}


class TestDemo1
{
	public static void main(String[] args) {
		This_demo1 td1=new This_demo1();
	}
}
