package jv19;

public class TestSwitch {
	public static void main(String[] args) {
		iSwitch c1=new Cflbulb();
		c1.on();
		c1.off();
		
		System.out.println("------------------");
		iSwitch l1=new Ledbulb();
		l1.on();
		l1.off();
		
	}
}
