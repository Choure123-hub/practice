package ExceptionHandling;

public class TryCatchfinally {
public static void main(String[] args) {
	int arr[]=new int[5];
	
	try
	{
		arr[2]=100;
	}
	catch (ArithmeticException e) {
		
		System.out.println(e.getMessage());
		
	}
	finally {
		System.out.println("this is finally block");
	}
}
}
