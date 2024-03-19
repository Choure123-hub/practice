package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class example6_Treeset {
public static void main(String[] args) {
	TreeSet tr=new TreeSet();
	tr.add(400);
	tr.add(100);
	tr.add(200);
	tr.add(500);
	tr.add(300);
	tr.add(300);
	tr.add(700);
	tr.add(600);
	System.out.println(tr);
	System.out.println(tr.size());
	System.out.println(tr.isEmpty());
	System.out.println(tr.contains(300));
	tr.remove(400);
	System.out.println(tr);
	System.out.println(tr.first()); //100
	System.out.println(tr.last()); //700
	tr.pollFirst(); //
	System.out.println(tr);
	tr.pollLast();
	System.out.println(tr);
	System.out.println("---------print treeset info using iterator cursor------------");
	
	Iterator itr = tr.iterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}

	System.out.println("---------print treeset info using for each loop------------");
	for(Object s1:tr)
	{
	System.out.println(s1);
	}
}
}
