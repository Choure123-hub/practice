package Interview_Asked_Program;

 import java.util.HashMap;
import java.util.Set;

public class example14_Count_Reapeating_Char_In_String_Using_HashMap
{

public static void main(String[] args) {
	
	String org="abcaba";
	HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
	
	for(int i=0;i<=org.length()-1;i++)
	{
		 char s1 = org.charAt(i);
		 
		if(mp.containsKey(s1))
		{
			mp.put(s1, mp.get(s1)+1);
		}
		else 
		{
			mp.put(s1, 1);
		}
	}

	Set<Character>allKeys=mp.keySet(); //[a,b,c]
	
	//print occurence of each character

  for(Character key:allKeys)
	{
	  
		System.out.println(key+" : "+mp.get(key));
	}
}
}  

//	//Print onely duplicate charatacter
	
	/*for(Character key:allKeys)
	{
		if(mp.get(key)>1)
		{
		System.out.println(key+" : "+mp.get(key));
	}
		}
}
}*/
