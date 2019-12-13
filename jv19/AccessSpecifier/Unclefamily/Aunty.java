package Unclefamily;

import Sambafamily.Father;

public class Aunty{
	
	public static void main(String[] args) {
		System.out.println("Aunty can access: ");
		Father f=new Father();
		
			// f.atm();				//	not allowed.
			// f.goldchain();		//	not allowed.
			// f.bike();	
			f.cycle();
			
	}
}