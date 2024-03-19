package Final_Finalize;

public class example1_Final
{
public static void main(String[] args) {
	 // Non final variable
    int a = 5;

    // final variable
    final int b = 6;

    // modifying the non final variable : Allowed
    a++;
    a=10;

    // modifying the final variable : 
    // Immediately gives Compile Time error.
    b++;

}
}
