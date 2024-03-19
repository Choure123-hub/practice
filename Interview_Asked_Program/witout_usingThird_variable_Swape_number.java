package Interview_Asked_Program;

public class witout_usingThird_variable_Swape_number {
public static void main(String[] args) {
	int x=10;
	int y=5;
	x=x+y;
	y=x-y;
	x=x-y;
	//System.out.println("After swaping:"+  "x="+ x  +",y="+y);
	//System.out.println("X="+x+ "   Y"+y);
	System.out.println("X:"+x+"  Y:"+y);
}
}
