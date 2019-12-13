package ex2;

public class SingltonClassTest {

	public static void main(String[] args) {
		
		/*System.out.println("--------------- 1st instance output-----------------");*/
		 SingltonClass ojb1 = SingltonClass.object;
		 System.out.println(ojb1);
		SingltonClass obj2 = SingltonClass.getInstance();
		System.out.println(obj2);
		/*System.out.println("--------------- 2nd instance output ----------------");*/
		SingltonClass obj3 = SingltonClass.getInstance();
		System.out.println(obj2);
		/*System.out.println("--------------- 3rd instance output ----------------");*/
		SingltonClass obj4 = SingltonClass.getInstance();
		System.out.println(obj2);
		/*System.out.println("--------------- 4th instance output ----------------");*/
		SingltonClass obj5 = SingltonClass.getInstance();
		System.out.println(obj2);

	}

}