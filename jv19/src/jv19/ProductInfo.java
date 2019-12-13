package jv19;

public class ProductInfo {
	
	static int nocount=0;
	private int pno;
	final static private String factoryName="abc";
	private String pname;
	private double cost;
	private int	qty;
	private String status;
	
	
	
	public ProductInfo(String pname, double cost, int qty, String status) {
		
		this.pno = ++nocount;
		this.pname = pname;
		this.cost = cost;
		this.qty = qty;
		this.status = status;
	}

	public ProductInfo(String pname, double cost, int qty) {
	
		this.pno = ++nocount;
		this.pname = pname;
		this.cost = cost;
		this.qty = qty;
	}

	//@Override
	public String toString() {
		return "ProductInfo [Product_No= " + pno + ", Product_Name= " + pname + ", Cost= " + cost + ", Quantity= " + qty + "]";
	}
			
}