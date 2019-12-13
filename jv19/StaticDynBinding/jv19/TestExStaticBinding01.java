package jv19;

public class TestExStaticBinding01 extends ExStaticBinding01{		// Child Class
		
		 void run() {
			System.out.println(" Derived Class run method calling..");
		}
		
		public static void main(String[] args) {
						
			ExStaticBinding01 objq = new TestExStaticBinding01();
			objq.run();
		}
		
}