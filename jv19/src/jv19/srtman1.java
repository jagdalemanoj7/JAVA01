package jv19;
/*
 OUTPUT
 
 ------Output 1----------
Sun3 Rises5 In2 East4 

------output 2--------
tsaE nI sesiR nuS

------output 3--------
nuS sesiR nI tsaE 

------output 4--------
East Rises In Sun 

------output 5--------
tsaE Rises  In  nuS 

 */
public class srtman1
{
	
	public static void main(String[] args) {
		String s="Sun Rises In East";
		
		String[] splittedWords = s.split(" ");			

		System.out.println("------Output 1----------");
		// Find length of each word of sentence.
		for (int i = 0; i <splittedWords.length; i++) 
		{
			System.out.print(splittedWords[i]+"-" + splittedWords[i].length()+" ");
		}
			
		System.out.println("\n\n------output 2--------");	
		// Reverse the String.
		for (int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println("\n\n------output 3--------");
		// Reverse each word of sentence.
		for (int i =0; i<splittedWords.length; i++) {
			char c[] = splittedWords[i].toCharArray();
			for (int j = c.length-1; j>=0; j--) {
				System.out.print(c[j]);
			}
			System.out.print(" ");
		}
		
		
		System.out.println("\n\n------output 4--------");
		// Replace first and last Word of sentence.
		String temp = splittedWords[0]; 						   // Fetching first word of sentence & insert into temp variable.
		splittedWords[0] = splittedWords[splittedWords.length-1];  // Fetching last word of sentence insert into splittedWords array index first position.
		splittedWords[splittedWords.length-1] = temp;  			   // Insert first word into splittedWords array index at last position.
		
		for (int i = 0; i < splittedWords.length; i++) {
			
			System.out.print(splittedWords[i]+" ");				   // Fetching array elements.
		}

		splittedWords = null;
		splittedWords = s.split(" ");
		
		System.out.println("\n\n------output 5--------");
		// Reverse first and last word of sentence.
		for (int i = 0; i < splittedWords.length; i++) {
			
			if(i == 0 || i == splittedWords.length-1)				//   
			{
				char c[] = splittedWords[i].toCharArray();
			
				for (int j = c.length-1; j>=0; j--) {
					System.out.print(c[j]);
				}
			}
			else{
					System.out.print(splittedWords[i]+" ");				
			}
			System.out.print(" ");

		}
				
	} 
}