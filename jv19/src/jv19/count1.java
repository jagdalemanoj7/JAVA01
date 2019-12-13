package jv19;

import java.util.Scanner;

public class count1 {

	public static void main(String[] args) {
		
		 int [] arr = new int[15];
		 int [] freq = new int[15];
		 int size, i, j, count;

		 						/* Input size of array */
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter size of array: ");
		 size = s.nextInt();

		    /* Input elements in array */
	     System.out.println("Enter elements in array: ");
		 for(i=0; i<size; i++)
		 {
		   	  arr[i]=s.nextInt();
		        /* Initially initialize frequencies to -1 */
		      freq[i] = -1;
		 }

		 for(i=0; i<size; i++)
		 {
		        count = 1;
		        for(j=i+1; j<size; j++)
		        {
		            /* If duplicate element is found */
		            if(arr[i]==arr[j])
		            {
		                count++;
		                /* Make sure not to count frequency of same element again */
		                freq[j] = 0;
		            }
		        }

		        /* If frequency of current element is not counted */
		        if(freq[i] != 0)
		        {
		            freq[i] = count;
		        }
		 }

		// Print frequency of each element
		    
		    System.out.println("\nFrequency of all elements of array : \n");
 		    for(i=0; i<size; i++)
		    {
		        if(freq[i] != 0 && freq[i]>1)
		        {
		        	System.out.println(arr[i]+" occurs "+freq[i]+" times\n");
		        }
		    }

	}
}