package Interview_Asked_Program;

public class Example_Split_Function {

	public static void main(String[] args) {
		String s1="Bhagvanta choure";
		String s2=s1.replace("choure", "");
		
		System.out.println(s2);
		String []ar=s1.split(" ");
		System.out.println(ar.length);
		
		
		System.out.println(ar[0]);
		
		System.out.println("---------------------");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]);
		}
	}
}
