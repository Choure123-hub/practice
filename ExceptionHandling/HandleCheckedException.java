package ExceptionHandling;

public class HandleCheckedException
{
public static void main(String[] args) {
	System.out.println("programe is started");
	System.out.println("programe is inprogress");
	try {
		
		Thread.sleep(3000);
		
	}
	catch (Exception e) 
	{
		e.printStackTrace();
	}
	System.out.println("programe is completed");
	System.out.println("programe is excuted");
}
}
