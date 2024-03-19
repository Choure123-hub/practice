package Logical_Program;

public class FindingVowels {
public static void main(String[] args) {
	  String org = "sandhya";
	  
      for(int i=0; i<org.length(); i++) 
         {
         if
         (org.charAt(i) == 'a'|| 
        org.charAt(i) == 'e'|| 
        org.charAt(i) == 'i' ||
        org.charAt(i) == 'o' || 
        org.charAt(i) == 'u')
        	 
         {
           System.out.println(org.charAt(i));
        	 //System.out.println("Given string contains "+org.charAt(i)+" at the index "+i);
         }
        
  
         }
    
      }
      
      
      
}



