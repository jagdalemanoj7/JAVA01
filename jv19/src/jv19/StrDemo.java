package jv19;

public class StrDemo {
	public static void main(String[] args) {
		
		String s = "kushu Is Good Boy";		
		String w[] = s.split(" ");
		
		System.out.println("\n");
		System.out.println("--- 1. Print length of each word of sentence ----------");
		for (int i = 0; i < w.length; i++) {
			System.out.print(w[i] + "-" + w[i].length() + " ");
		}
			
				
		System.out.println("\n\n");
		System.out.println("--- 2. Reverse whole Sentence ----------");
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		
		
		System.out.println("\n\n");
		System.out.println("--- 3. Reverse each word of sentence ------------");		
		for (int i = 0; i < w.length; i++) {
			char ch[] = w[i].toCharArray();
			
			for (int j = w[i].length()-1; j >= 0; j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
		
		
		System.out.println("\n\n");		// kushu is good boy 
		System.out.println("--- 4. Reverse position of first and last word of sentence ------------");
		String temp = w[0];
		w[0] = w[w.length-1];
		w[w.length-1] = temp;
		
		for (int i = 0; i < w.length; i++) {
			System.out.print(" "+w[i]);
		}

		
		w = null;
		w=s.split(" ");		
		System.out.println("\n\n");
		System.out.println("--- 5. Reverse first and last word of sentence ----------- ");
		
		for (int i = 0; i < w.length; i++) {
			
			if(i==0 || i==w.length-1)
			{
				char c[]=w[i].toCharArray();
				for (int j = c.length-1; j >= 0; j--) {
					System.out.print(c[j]);
				}
			}
			else
				System.out.print(w[i]+" ");
		}	
		
		System.out.print(" ");
						
	}
}