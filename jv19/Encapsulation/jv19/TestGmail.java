package jv19;

public class TestGmail {
	public static void main(String[] args) {
		
		Gmail g = new Gmail("techworld","world@1");
		
		System.out.println("-----------------------------");
		System.out.println("UserName is: " + g.getUsername());
		System.out.println("Password is: "+g.getPassword());
		System.out.println("-----------------------------");
		
		g.setPassword("techno@954");
		System.out.println("UserName is: " + g.getUsername());
		System.out.println("Password is: " +g.getPassword());
		System.out.println("-----------------------------");
		
	}
}
