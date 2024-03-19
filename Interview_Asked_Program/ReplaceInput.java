package Interview_Asked_Program;

import java.util.Scanner;

public class ReplaceInput {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	//Get the first input
	
	System.out.println("Enter First Input");
	String firstInput =scanner.nextLine();
	
	
	//Get the second input
	
	System.out.println("Enter second Input");
	String secondInput =scanner.nextLine();
	
	
	//Replace the content of first input with the second input
	
	String replaceInput = firstInput.replace(firstInput, secondInput);
	scanner.close();
	
	// Display the result
	System.out.println("Result:"+replaceInput);
	
	scanner.close();
}
}
