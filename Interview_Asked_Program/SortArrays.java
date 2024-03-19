package Interview_Asked_Program;

import java.util.Arrays;

public class SortArrays {
public static void main(String[] args) {
	
	 int []a = {1, 2, 0, 4, 3, 0, 5, 0};
	 
	Arrays.sort(a);
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}	   
}
}

