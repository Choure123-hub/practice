package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class example2_Vector {
public static void main(String[] args) {
	Vector V=new Vector();
	
	V.add("Bhagvanta");
	V.add(100);
	V.add("A");
	V.add(100);
	V.add(65.5f);
	V.add(null);
	V.add(null);
	
	System.out.println(V.get(0));
	System.out.println(V);
	System.out.println(V.isEmpty());
	System.out.println(V.contains("A"));
	System.out.println(V.size());
	
	System.out.println(V);
	
	//add or insert info in between Arraylist--------->Right shift operation
	V.add(2, "B");
	System.out.println(V);
	
	//Remove/Delete  info in between Arraylist--------->Left shift operation
	V.remove(6);
	System.out.println(V);
	// modify/Update info in between Arraylist
	V.set(2, 200);
	System.out.println(V);
	
	System.out.println("-----------print Vector info using iterator cursor------------------");
	Iterator itr = V.iterator();
 while(itr.hasNext())
 {
	 System.out.println(itr.next());
 }
	 
 System.out.println("-----------print Vector info using for loop------------------");
	 for(int i=0;i<=V.size()-1;i++)
	 {
		 System.out.println(V.get(i));
		 
	 }
System.out.println("-----------print Vector info using foreach loop------------------");
	 for(Object S1:V)
	 {
		 System.out.println(S1);
	 }
	 
	 System.out.println("-----------print Vector data Enumeration Cursor------------------");
      Enumeration enu = V.elements();
      
      while(enu.hasMoreElements())
      {
    	  System.out.println(enu.nextElement());
      }
}
 
	
	
}

