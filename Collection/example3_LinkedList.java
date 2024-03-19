package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example3_LinkedList {
public static void main(String[] args) {
	LinkedList ll= new LinkedList();
	
	ll.add("bhagvanta");
	ll.add(100);
	ll.add("A");
	ll.add(105.6f);
	ll.add(null);
	ll.add(null);
	ll.add(100);
	System.out.println(ll);
	
	System.out.println(ll.size());
	System.out.println(ll.isEmpty());
	System.out.println(ll.get(1));
	System.out.println(ll.contains(100));
	System.out.println(ll);
	//add or insert  data in between LinkedList
	ll.add(2, 50.5f);
	System.out.println(ll);
	//remove or delete data in between LinkedList
	ll.remove(2);
	System.out.println(ll);
	
	//update or modify data 
	ll.set(0, "choure");
	System.out.println(ll);
	
	
	System.out.println("------print all data using iterator cursor---");
	
	Iterator itr = ll.iterator();
	
	while(itr.hasNext())
	{
		
		System.out.println(itr.next());
	}
	
	
	System.out.println("------print all data using listiterator cursor---");
	ListIterator ltr = ll.listIterator();
	while(ltr.hasNext())
	{
		System.out.println(ltr.next());
	}
	
	System.out.println("------print all data using For loop---");
	for(int i=0;i<=ll.size()-1;i++)
	{
		System.out.println(ll.get(i));
	}
	
	
	System.out.println("------print all data using Foreach loop--");
	for(Object S1:ll)
	{
		System.out.println(S1);
	}
	
}
}
