package Logical_Program;

import java.util.HashMap;
import java.util.Set;

public class Example_1_Count_Reapitating_Char_In_String_Using_hashMap 
{
	public static void main(String[] args) {
		
	
          String org ="abcab";

          HashMap<Character,Integer> mp=new HashMap<Character, Integer>();
          
          for(int i=0;i<=org.length()-1;i++)
          {
        	  char s1=org.charAt(i);
        	  if(mp.containsKey(s1))
        	  {
        		  mp.put(s1, mp.get(s1)+1);
        	  }
        	  else
        	  {
        		  mp.put(s1, 1);
        	  }
          }
                  Set<Character>allkeys=mp.keySet();
                  for(Character key:allkeys)
                  {
                	  System.out.println(key+":"+mp.get(key));
                  }
                  
}
}