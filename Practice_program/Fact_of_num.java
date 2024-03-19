package Practice_program;

public class Fact_of_num 
{
	public static void main(String[] args) 
	{
		int num=5;
		int fact=1;
		for(int i=num;i>=8; i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
