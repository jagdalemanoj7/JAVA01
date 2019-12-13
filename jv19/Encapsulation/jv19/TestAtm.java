package jv19;

public class TestAtm {
	public static void main(String[] args) {
		
		Atm a1 = new Atm();
		
		System.out.println("Old Pin: "+ a1.getPin());
		System.out.println("-------------------------------------");
		a1.setPin(485);
		System.out.println("New Pin: "+a1.getPin());
	}
}
