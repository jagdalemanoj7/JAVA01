package jv19;

public class strman2 {
	public static void main(String[] args) {
	
		String str="Ganga is river";
		String[] words=str.split(" ");
		
		// To Print count of each word
		System.out.println("1. Count of each word");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]+"-"+words[i].length()+" ");
		}
		
		
		System.out.println("\n2. Reverse whole sentence");
		// reverse whole sentence
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println("\n\n3. Reverse each word of sentence");
		System.out.println(str);
		for (int i = 0; i < words.length; i++) {
			char[] ch=words[i].toCharArray();
			//System.out.print(words[i]); System.out.print(" ");
			for (int j = words[i].length()-1; j >=0; j--) {				
				System.out.print(ch[j]);
				
			}
			System.out.print(" ");
		}
		
		
		
		
		/*
		System.out.println("\n-----Output 3 --------");
		for (int i = s.length()-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println("\n-----Output 4 --------");
		*/
	}	
}
