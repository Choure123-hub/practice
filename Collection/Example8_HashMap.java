package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.checkerframework.checker.units.qual.h;

public class Example8_HashMap {
	
	
	//1 Put: to add key value,info hashmap
	//2 containkey: to verify perticular key present or not
	//3 get: to get value of perticular key
	//4 keyset: to get keys from map object
	
	//allow one null key
	//allow any null value
	
public static void main(String[] args) {
	HashMap<Integer, String> mp=new HashMap<Integer,String>();
	 mp.put(101, "rahul");
	 mp.put(102, "ajit");
	 mp.put(103, "deepak");
	 mp.put(104, "komal");
	 mp.put(103, "raje");
	 
	 //mp.put(105, null);
	 //mp.put(106, null);
	// mp.put(null, "aa");
	 
	 
	 System.out.println(mp.containsKey(101)); //true
	 System.out.println(mp.get(102));  //ajit
	    System.out.println(mp);
	    System.out.println("---get all keys---");
	    
	    Set<Integer> allkeys = mp.keySet();
	    
	   for(  Integer key:allkeys)
	    {
	    	System.out.println(key);
	    }
	 System.out.println("-----------get all keys & value----- ");
	 for(Integer key:allkeys)
	 {
		 System.out.println(key+":"+mp.get(key));
	 }
	 
}
}
