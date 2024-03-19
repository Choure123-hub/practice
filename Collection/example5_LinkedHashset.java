package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class example5_LinkedHashset {
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();

			lhs.add("rahul");
			lhs.add(100);
			lhs.add('A');
			lhs.add(56.5f);
			lhs.add(100);
			lhs.add(100);
			lhs.add(null);
			lhs.add(null);
			System.out.println(lhs);
			System.out.println(lhs.size());
			System.out.println(lhs.contains('A'));
			System.out.println(lhs.isEmpty());
			System.out.println("---printlhs data using iterator cursor---");
			
			Iterator itr = lhs.iterator();
			while(itr.hasNext())
			{
			System.out.println(itr.next());
			}
			
			System.out.println("---printlhs data using for each loop---");
			for( Object s1: lhs)
			{
			System.out.println(s1);
			}
}
}
