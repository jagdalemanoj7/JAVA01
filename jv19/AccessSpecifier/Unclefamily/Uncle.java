package Unclefamily;

import Sambafamily.Father;

//package Sambafamily.Family;

public class Uncle extends Father {
	
	public static void main(String[] args) {
		
		System.out.println("Uncle can Access: ");
		
		//Father u=new Father();
		Uncle u = new Uncle();
		
		// 	u.atm();			//	not allowed.
		//  u.goldchain();		//	not allowed.
		
		u.bike();			
		u.cycle();
		
	}
}
