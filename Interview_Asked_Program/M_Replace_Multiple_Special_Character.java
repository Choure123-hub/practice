package Interview_Asked_Program;

public class M_Replace_Multiple_Special_Character {
public static void main(String[] args) {
	String name = "V@ai@bh#a*v";
	String CorrectName = name.replaceAll("[@#*]", "");
	System.out.println(CorrectName);
}
}
