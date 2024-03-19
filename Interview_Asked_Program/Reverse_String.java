package Interview_Asked_Program;

public class Reverse_String
{
public static void main(String[] args) {
	
	String org="choure";
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+org.charAt(i);
	}
	System.out.println(org);
	System.out.println(rev);
	
	if(org.equals(rev))
	{
		System.out.println("given String is pallindrome");
	}
	else
	{
		System.out.println("given String is not pallindrome");
	}
}
}
