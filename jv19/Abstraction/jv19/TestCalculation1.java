package jv19;

public class TestCalculation1 {

	public static void main(String[] args) {
	
	Substraction s1=new Substraction();	
	s1.add();
	s1.substract();
	System.out.println("---------------------");
	
	Addition a1=new Substraction();
	a1.add();
	a1.substract();
	System.out.println("---------------------");
	
	Calculation1 c1= (Calculation1) a1;
	c1.add();
	c1.substract();
	
}

}
