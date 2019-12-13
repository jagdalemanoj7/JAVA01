package jv19;

public class TestArchitect {
public static void main(String[] args) {
	Architect a1=new Developer();
	a1.login();
	a1.register();
	//a1.test();
	System.out.println("-------------------");
	
	Developer d1=(Developer)a1;
	d1.login();
	d1.register();
	d1.test();
	
}
}
