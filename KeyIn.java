//Assignment 4 Example 1


public class KeyIn{
	public static void main(String[] args) 
	throws java.io.IOException{
		char ch;
		System.out.println("Enter A Character");
		ch = (char) System.in.read();
		System.out.println("Character is :" + ch);
	}
}