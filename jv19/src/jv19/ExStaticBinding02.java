package jv19;

public class ExStaticBinding02 {		// Base Class

	void run() {
		System.out.println("Base Class run mwthod calling..");
	}
}

class TestExStaticBinding02 extends ExStaticBinding01{		// Child Class
	
	void run() {
		System.out.println(" Derived Class run method calling..");
	}
	
	public static void main(String[] args) {
		
		ExStaticBinding01 obj=new ExStaticBinding01();
		obj.run();
		
	}
	
}