package jv19;

public class TestGadget {
	
public static void main(String[] args) {
	
		Gadget g1=new Gadget();
		g1.brand("HP");
		g1.display(5.5);
		g1.price(25250.25);
		System.out.println("---------------------");
	
		iMobile m1=new Gadget();
		m1.display(6.8);
		m1.price(12252.25);
		System.out.println("---------------------");
	
		iLaptop l1=new Gadget();
		l1.brand("Dell");
		l1.price(23142.12);
		
    }

}