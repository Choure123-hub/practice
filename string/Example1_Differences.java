package string;

public class Example1_Differences {
public static void main(String[] args) {
	// StringBuffer
	
	StringBuffer s=new StringBuffer("Welcome");
	
	System.out.println("reverse String: "+s.reverse());
	
	// StringBuilder
	
	StringBuilder s1=new StringBuilder("Welcome");
	
	 System.out.println("reverse String : "+s1.reverse());
	
}
}
