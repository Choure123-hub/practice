package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class example4_Hashset {
public static void main(String[] args) 
{
	HashSet hs=new HashSet();
	hs.add("rahul");
	hs.add(100);
	hs.add('A');
	hs.add(55.6f);
	hs.add(100);
	hs.add(null);
	hs.add(null);
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.contains(100));
	//true
	System.out.println(hs.isEmpty());
	//false

	hs.remove('A');
	System.out.println(hs);
	System.out.println("-------print hashset data using iterator cursor-------");
	Iterator itr = hs.iterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
	System.out.println("-------print hashset data using for each-------");
	for(Object s1:hs)
	{
	System.out.println(s1);
	}
	hs.clear();
	System.out.println(hs.size());
}
}
