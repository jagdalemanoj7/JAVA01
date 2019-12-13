package jv19;


/* ----------OUTPUT------------
     String contains in the Sentence. 
*/

public class SearchAWord {
	public static void main(String[] args) {
		String text="Java is the fantastic language";
		
		// System.out.println(text.contains("is"));
		boolean result = text.contains("Java");
		
		if(result == true)
			System.out.println("\n\n String contains in the Sentence..");
		else
			System.out.println("\n\n String doesn't contains in the Sentence. ");
		
	}
}