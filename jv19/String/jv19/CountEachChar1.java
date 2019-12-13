package jv19;

import java.io.IOException;
import java.util.Scanner;

public class CountEachChar1 {

	static  final int MAX_CHAR	=256;
	
	public static void main(String[] args) throws IOException {
		
		//String str="Kushu is a good boy";
		String str="ab ab";
		char originalStr=' ';
			
		int count[]=new int[MAX_CHAR];
		int len=str.length();
		try {
				for (int k = 0; k < len; k++) 
					count[str.charAt(k)]++;
					
					// Create an array of given string.
					char ch[]=new char[str.length()];
					for (int i = 0; i < len; i++) {
							ch[i]=str.charAt(i);
							int find=0;
							
							for (int j = 0; j <= i; j++) {
								
								// If any match found..
								if(str.charAt(i)==ch[j] &&ch[i]!=32)
									find++;
							}
						
							if(find==1) {
								System.out.println("Number of Occourrence of "+str.charAt(i)+ " is: " + count[str.charAt(i)]);
							}
					
					}
						
/*
		// Convert String to Char Array..
		char convert[]=str.toCharArray();
		int len=convert.length;
		int count=0;
		
		// Count each character of sentence.
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {					
				if((convert[i]==convert[j])&&((convert[i]>=65&&convert[i]<=91)||(convert[i]>=97&&convert[i]<=123)))
				{
					count++;
				}
			}
			if(count!=0) {
				// Print all repeated characters.
				System.out.println(convert[i]+" "+count+" Times");
			}		  
			//str=str.replace(""+convert[i],"");
		  
		  }
		  */
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
	
}