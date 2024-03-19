package Interview_Asked_Program;

public class I_Find_White_Spaces_Count {
public static void main(String[] args) {
	String name="bhagvanta choure raja";
	int count=0;
	
	for(int i=0;i<name.length();i++)
	{
		char str = name.charAt(i);
		if(str==' ')
		{
			count++;
		}
	}
	System.out.println("total white spaces present is : "+count);
}
}
