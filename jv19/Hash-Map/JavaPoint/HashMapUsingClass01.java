package JavaPoint;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapUsingClass01 {

	public static void main(String[] args) {
		
		HashMap<Integer, Book> hmap=new HashMap<Integer,Book>();

		Book book1=new Book(101,"Java",454.34);
		Book book2=new Book(102,"Manual",324.25);
		Book book3=new Book(103,"Selenium",1225.50);
		
		System.out.println("-------- Adding Books to Map  ----------");
		hmap.put(1, book1);
		hmap.put(2, book2);
		hmap.put(3, book3);
		
		
		System.out.println("key | Value \n---------------------------------");
		Set set = hmap.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
		 Map.Entry entry = (Map.Entry)i.next();
		
		//for(Map.Entry<Integer, Book> entry:hmap.entrySet()){    	
			
			int key=(int)entry.getKey();
			Book b = (Book)entry.getValue();
			System.out.println(key+"  | "+b.id+" "+b.name+" "+b.price+"\n---------------------------------");
		}
		
		
	}

}
