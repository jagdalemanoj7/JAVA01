package jv19;

public class TestSample {
	public static void main(String[] args) {

		Sample s = new Sample(568);
		System.out.println("Old Value is: " + s.getValue());
		
		System.out.println("------------------------------------------------------");
		s.setValue(213);
		System.out.println("New Value is: " + s.getValue());
		
	}
}