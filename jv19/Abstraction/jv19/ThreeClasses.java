package jv19;

public abstract class ThreeClasses {

	public abstract void m1();
}

	abstract class subclass1 extends ThreeClasses{
		public void m2() {
			System.out.println("Calling from parent class");
		}
	}
	
		class subclass2 extends subclass1{
			public void m1() {
				System.out.println("Calling from parent class");
			}
		}