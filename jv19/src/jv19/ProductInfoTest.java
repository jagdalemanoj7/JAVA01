package jv19;

public class ProductInfoTest {

	public static void main(String[] args) {
		
		ProductInfo prod1=new ProductInfo("Table", 2050.00, 200,"P");
		System.out.println(prod1.toString());
		
		ProductInfo prod2=new ProductInfo("Chair", 850.00, 360);
		System.out.println(prod2.toString());
		
		ProductInfo prod3=new ProductInfo("Door", 1850.00, 60);
		System.out.println(prod3.toString());

	}

}