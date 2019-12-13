package jv19;

public class InsertStringIntoAnother {
	public static void main(String[] args) {
		
		String newString=new String();
		String originalString="The Pen",StringToBeInserted= " New";
		int index = 2;
		
		for (int i = 0; i < originalString.length(); i++) {
			
			newString+=originalString.charAt(i);
			if(i==index)
			{
				newString += StringToBeInserted;
			}
		}
		
		System.out.println("The String : " +newString);
	}
}