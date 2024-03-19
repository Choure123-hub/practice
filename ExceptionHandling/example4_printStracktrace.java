package ExceptionHandling;

public class example4_printStracktrace 
{
public static void main(String[] args) throws InterruptedException {
	try 
	{
		int a=100, b=0, c;
		c=a/b;
		System.out.println(c);
	} 
	catch (ArithmeticException ae)
	{
		ae.printStackTrace();
	}
	System.out.println("hello");
	Thread.sleep(0);
}
}
