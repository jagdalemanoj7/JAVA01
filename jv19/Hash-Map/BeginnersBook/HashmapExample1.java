package BeginnersBook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapExample1 {
	public static void main(String[] args) {
		
		/*Declaring Hashmap and insert key & values*/ 
		HashMap<Integer, String> hmap=new HashMap<Integer,String>();
		hmap.put(12, "Ravi");
		hmap.put(31, "Rajesh");
		hmap.put(25, "Tushar");
		hmap.put(54, "abhijit");
		
		
		/*Display content using HashMap*/
		System.out.print("key | Value ");
		System.out.println("\n--------------");
		Set set = hmap.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Entry entry = (Map.Entry)it.next();
			
			System.out.println(entry.getKey()+"  | "+entry.getValue()+"\n--------------");
		}
		
		System.out.println("\n\n/*-------- Get values based on key  ---------------*/");
		String val = hmap.get(31);
		System.out.println(val);
		
		
		hmap.put(25, "Atul"); // replacing old value on same key
		System.out.println(hmap.containsValue("Atul"));
		hmap.put(04, "Nirmal");
		System.out.println(hmap.containsKey(04));
		hmap.put(99, "Ravi");
					
		System.out.println("\n\n/*-------- Remove values based on key  ---------------*/");
		hmap.remove(54);
		System.out.println("\n\n/*-------- Display values after Removal  ---------------*/");
		
		Set set1 = hmap.entrySet();
		Iterator it1 = set1.iterator();
		System.out.print("key | Value ");
		while(it1.hasNext()) {
			Entry entry1 = (Map.Entry)it1.next();
			System.out.println(entry1.getKey()+"  | "+entry1.getValue()+"\n--------------");
		}
		
		
		hmap.put(04, "Nirm");
		System.out.println(hmap.containsKey(04));
		System.out.println(hmap.get(4));
		
		
		
		
		
		
		
		
		
		
		
	}
}