package jv19;

public class PalindromeCount {
	
	public static void main(String[] args) {
		
		int num,rem,div;		
		
		System.out.println("Palindrome number from 1 to 100 : ");
		for (int i = 1; i <= 100; i++) 
		{
			int sum=0;
			num=i;
			while(num>0)
			{
				rem = num % 10;
				sum = (sum * 10) + rem;
				num = num / 10;
			}
			
			if(sum==i)
				System.out.print(i+ ", ");			
		}		
		System.out.println("endOfSeries.");
	}
}