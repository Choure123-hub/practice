package ExceptionHandling;

public class exampl1_throw {
public static void main(String[] args) {
	 try { 
          double x=3/0; 
         throw new ArithmeticException(); 
     } 
     catch (ArithmeticException e) { 
         e.printStackTrace(); 
     } 
	 System.out.println("hii");
	 System.out.println("-------------------------");
	/* try {
			System.out.println("2");
			int a=100, b=0,c;
			System.out.println("3");
			c=a/b;
			System.out.println("4");
			System.out.println(c);
			throw new ArithmeticException();
			//System.out.println("5");
			
		} catch (ArithmeticException e) {
			System.out.println("6");
			System.out.println(e);
			System.out.println("7");
		}*/
		System.out.println("hello");
}
}
