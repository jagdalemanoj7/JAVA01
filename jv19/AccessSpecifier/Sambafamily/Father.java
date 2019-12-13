package Sambafamily;

public class Father {
	
	private void atm()
	{
		System.out.println("Fathers private ATM");
	}
	
	void goldchain()
	{
		System.out.println("Fathers default GoldChain.");
	}
		
	protected void bike() {
		System.out.println("Fathers protected Bike..");
		
	}

	public void cycle() {
		System.out.println("Fathers public Cycle....");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Father can access: ");
		Father f = new Father();
		f.atm();
		f.goldchain();
		f.bike();
		f.cycle();
	}
	
}