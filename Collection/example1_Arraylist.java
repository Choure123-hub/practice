package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example1_Arraylist 
{
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	
	al.add(100);
	al.add("raj");
	al.add(105.6f);
	al.add(null);
	al.add(null);
	al.add(100);
	
	System.out.println(al);
	//insert info between 
	al.add(4, 100);
	System.out.println(al);
	
	//to remove info
	al.remove(4);
	System.out.println(al);
	//update info
	al.set(4, 5);
	System.out.println(al);
	
	System.out.println("..............pint data using itreator.................");
	
	Iterator itr = al.iterator();
	while(itr.hasNext())
	System.out.println(itr.next());
	System.out.println("'''''''''''''''''''''''''''print data using listiterator''''''''''''''''''''");
	
	ListIterator ltr = al.listIterator();
	while(ltr.hasNext())
	{
		System.out.println(ltr.next());
	}
	
	System.out.println("print data using for loop");
	for(int i=0;i<=al.size()-1;i++)
	{
		System.out.println(al.get(i));
		
	}
	System.out.println("..............................fetch the data using for each loop...................");
for(Object S1:al)
{
System.out.println(S1);	
}
}
}
