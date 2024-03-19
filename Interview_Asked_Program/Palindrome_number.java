package Interview_Asked_Program;

public class Palindrome_number 
{
public static void main(String[] args) {
	String org="madam";
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+org.charAt(i);
	}
	System.out.println(org);
	System.out.println(rev);
	if(org.equals(rev))
	{
		System.out.println("Given number is pallindrome");
	}
	else
	{
		System.out.println("Given number is not pallindrome");
	}
}
}
