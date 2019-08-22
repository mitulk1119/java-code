import java.util.*;

public class HelloName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your name");
		String text = in.nextLine();
		System.out.println("Hello " + text);
	}
}
