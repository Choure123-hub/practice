package MethoWith_ReturnType;import org.apache.commons.math3.analysis.function.Add;

public class Sample1 {

	public static void main(String[] args)
	{
		int num1=5;
		int num2=add(10, 20);
		System.out.println(num1*num2);
		
		System.out.println(add(10,20));
		System.out.println("----------------------------------------");
		Sample1 s1=new Sample1();;
		String str = s1.convertnameToUppercase("prathmesh");
		System.out.println(str);
		System.out.println(s1.convertnameToUppercase("rahul"));
	}
	public static int add(int a,int b) 
	{
		int c=a+b;
		return c;
	}
	public String convertnameToUppercase(String inp) 
	{
		return inp.toUpperCase();
	}
}
