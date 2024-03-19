package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Example7_generic {
public static void main(String[] args) {
	LinkedHashSet<Integer>tr=new LinkedHashSet<Integer>();
	tr.add(100);
	tr.add(200);
	tr.add(300);
	tr.add(400);
	tr.add(500);
	tr.add(700);
	tr.add(800);
	System.out.println(tr);
	System.out.println("--------------print data using foreach loop---------------");
	for(Integer S1:tr)
	{
		System.out.println(S1);
	}
}
}
