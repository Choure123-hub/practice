package Practice_program;

public class Palindrome
{

	public static void main(String[] args) 
	{
		String org="abcd";
		String rev=" ";
		for(int i=org.length()-1; i>=0; i--) 
		{
			rev=rev+org.charAt(i);
			
		}
			 
	System.out.println(org);
	System.out.println(rev);
	if(org.equals(rev));
	
		
	
	{	
	System.out.println("given string is pallindrome");
	}
	 
	{
	System.out.println("given string is not pallindrome");
		
	}
	}

}
