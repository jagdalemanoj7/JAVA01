package jv19;

/* ----------OUTPUT------------
    Found Hello readers at index 0
*/


public class PositionOfWord {
	public static void main(String[] args) {
		
		String Orig="Hello readers";
		int index=Orig.indexOf("Hello");
		
		if(index == -1)
			System.out.println("\n\n Hello not found..");
		else
			System.out.println("\n\n Found "+Orig+" at index " + index);
		
	}
}