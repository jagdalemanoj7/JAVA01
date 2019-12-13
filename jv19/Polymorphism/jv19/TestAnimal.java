package jv19;

public class TestAnimal {
	public static void main(String[] args) {
		
		System.out.println("-----------------");
		Animal a1 = new Cat();		
		a1.eat();
		a1.sleep();
		
		System.out.println("-----------------");
		Animal b1=new Rat();
		b1.eat();
		b1.sleep();
		
		System.out.println("-----------------");
	}
}
