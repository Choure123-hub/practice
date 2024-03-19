package ExceptionHandling;

public class example2 
{
public static void main(String[] args) {
	String s1="abcd";
	
	//System.out.println(s1.charAt(8));
	try 
	{
		//risky code
		System.out.println(s1.charAt(7));	
	}
	catch(Exception e)
	{
		System.out.println("StringIndexOutOfBoundsException is handled");
		//e.printStackTrace();
		System.out.println(e);
	}
	System.out.println("hii");
}
}
//StringIndexOutOfBoundsException