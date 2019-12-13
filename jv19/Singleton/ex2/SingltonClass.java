package ex2;

public class SingltonClass {

	//	private 
	static SingltonClass object;
	
	private SingltonClass() {
		System.out.println(" Private Constructor Called...");
	}
	
	public static SingltonClass getInstance() {
		
		if(object==null) {
			object=new SingltonClass();			
			System.out.println("-------------- 1'st Instance -------------------");
		}
		System.out.println("-------------- Copy of 1'st Instance -------------------");
		return object;
	}
	
}