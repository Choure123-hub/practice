package ExceptionHandling;

public class example1 
{
	public static void main(String[] args)
	{
	int [] ar= {10,20,50,40};
	
	try {
		System.out.println(ar[8]);
		
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException exception handeled");
	}
	
	
	System.out.println("hello" +":");
	}
}
