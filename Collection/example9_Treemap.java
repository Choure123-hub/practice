package Collection;

import java.util.Set;
import java.util.TreeMap;

public class example9_Treemap {
  public static void main(String[] args) {
	  //1 containsKey:get equal & greater than value
	  //2 floorEntry:get equal & less than value
	  
	    // not allow  null key
		//allow any null value
	  
	  TreeMap<Integer,String>mp=new TreeMap<Integer,String>();
	  
	     mp.put(106, "Ramesh");
	    
	     mp.put(105, "rahul");
		 mp.put(103, "ajit");
		 mp.put(102, "deepak");
		 mp.put(101, "komal");
		 mp.put(108, "raje");
		 //mp.put(null, "abc");
		// mp.put(107, null);
		// mp.put(108, null);
		 System.out.println(mp);
		 System.out.println(mp.containsKey(104));
		 System.out.println(mp.get(102));
		 System.out.println(mp.ceilingEntry(104));
		 System.out.println(mp.ceilingKey(101));
		 //mp.clear();
		 System.out.println(mp.firstEntry());
		 System.out.println(mp.floorEntry(104));
		 System.out.println("-----get all keys----");
		 
		 Set<Integer> allkeys = mp.keySet();
		 
		 for(Integer key:allkeys)
		 {
			 System.out.println(key);
		 }
		 System.out.println("----get all keys & value---");
		 for(Integer key:allkeys)
		 {
			 System.out.println(key+":"+mp.get(key));
		 }
}
}
