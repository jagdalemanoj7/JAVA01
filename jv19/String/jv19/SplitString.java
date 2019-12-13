package jv19;

public class SplitString {
	public static void main(String[] args) {
		
		String s1 = "t u t o r i a l s";				
								
		String [] words = s1.split("\\s");
		
		System.out.println("\n Splitted String is : \n");
		for (String w:words) {
			System.out.print("\t" +w);
			// System.out.println();
		}
		
	}
}