package BeginnersBook;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo1 {
	public static void main(String[] args) {
		
		ArrayList el = new ArrayList();
		el.add(12);
		el.add("asdf");
		el.add('c');
		el.add(12.2);
		el.add(null);

		System.out.println("------- Adding item at specific location --------");
		el.add(2, 45.3232);
		for (Object object : el) {
			System.out.print(" | "+object);
		}
		
		
		System.out.println("\n\n------- Remove item at specific location --------");
		el.remove(2);
		for (Object object : el) {
			System.out.print(" | "+object);
		}
				
		System.out.println("\n\n------- Replace item at specific location -------");
		el.add(2,43.32);
		el.set(2,null);
		for (Object object : el) {
			System.out.print(" | "+object);
		}
		
		
		System.out.println("\n\n--------  Random Access	--------");
		int loc=3;
		System.out.println("Item found at Location [" +loc+ "] : "+el.get(loc));
//		--------------------------------		
				
		System.out.println("\n\n-------- Bulk Access	--------");		
		System.out.println("\n--------------------------------------");
		
		Iterator i=el.iterator();
		while(i.hasNext()) {			
				System.out.print(" | "+i.next());			
		}
//		---------------------------------
		
		System.out.println();
		System.out.print("  --------------------------------------");
		
		System.out.println("\n\n-------- TO check arraylist empty or not--------");
		if(el.isEmpty())
		System.out.println("ArrayList is Empty... \n Result is "+el.isEmpty()+")");
		else
		System.out.println("ArrayList is Filled with items... \n (Result is "+el.isEmpty()+")");
		
		
		//System.out.println("\n\n--------- Size");
		System.out.println("\n--------- ArrayList Size is " + el.size() +" --------------------");
		
		
		
		
	}
}
/*	---------------------	OUTPUT	-------------------------

------- Adding item at specific location --------
| 12 | asdf | 45.3232 | c | 12.2 | null

------- Remove item at specific location --------
| 12 | asdf | c | 12.2 | null

------- Replace item at specific location -------
| 12 | asdf | null | c | 12.2 | null

--------  Random Access	--------
Item found at Location [3] : c


-------- Bulk Access	--------

--------------------------------------
| 12 | asdf | null | c | 12.2 | null
 --------------------------------------

-------- TO check arraylist empty or not--------
ArrayList is Filled with items... 
(Result is false)

--------- ArrayList Size is 6 --------------------


Methods of ArrayList class

In the above example we have used methods such as add() and remove(). However there are number of methods available which can be used directly using object of ArrayList class. Let’s discuss few important methods of ArrayList class.

1) add( Object o): This method adds an object o to the arraylist.

obj.add("hello");

This statement would add a string hello in the arraylist at last position.

2) add(int index, Object o): It adds the object o to the array list at the given index.

obj.add(2, "bye");

It will add the string bye to the 2nd index (3rd position as the array list starts with index 0) of array list.

3) remove(Object o): Removes the object o from the ArrayList.

obj.remove("Chaitanya");

This statement will remove the string “Chaitanya” from the ArrayList.

4) remove(int index): Removes element from a given index.

obj.remove(3);

It would remove the element of index 3 (4th element of the list – List starts with o).

5) set(int index, Object o): Used for updating an element. It replaces the element present at the specified index with the object o.

obj.set(2, "Tom");

It would replace the 3rd element (index =2 is 3rd element) with the value Tom.

6) int indexOf(Object o): Gives the index of the object o. If the element is not found in the list then this method returns the value -1.

int pos = obj.indexOf("Tom");

This would give the index (position) of the string Tom in the list.

7) Object get(int index): It returns the object of list which is present at the specified index.

String str= obj.get(2);

Function get would return the string stored at 3rd position (index 2) and would be assigned to the string “str”. We have stored the returned value in string variable because in our example we have defined the ArrayList is of String type. If you are having integer array list then the returned value should be stored in an integer variable.

8) int size(): It gives the size of the ArrayList – Number of elements of the list.

int numberofitems = obj.size();

9) boolean contains(Object o): It checks whether the given object o is present in the array list if its there then it returns true else it returns false.

obj.contains("Steve");

It would return true if the string “Steve” is present in the list else we would get false.

10) clear(): It is used for removing all the elements of the array list in one go. The below code will remove all the elements of ArrayList whose object is obj.

obj.clear();

*/