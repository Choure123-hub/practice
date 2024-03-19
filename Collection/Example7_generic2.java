package Collection;

import java.util.ArrayList;

public class Example7_generic2 {
public static void main(String[] args) {
	
	ArrayList<String> al=new ArrayList<String>();
	
	al.add("Raja");
	al.add("Engineer");
	al.add("Designeer");
	System.out.println(al);
	
	System.out.println("--------------print data using foreach loop---------------");
	for( String s1:al)
	{
		System.out.println(s1);
	}
}
}
