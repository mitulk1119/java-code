import java.util.*;

public class OddEven {
	public static void main(String[] args) {
		Scanner oe = new Scanner(System.in);
		System.out.println("PLEase enter the number");
		int i = oe.nextInt();
		if (i % 2 == 0) {
			System.out.println("It is Even Number");
		} else {
			System.out.println("IT is Odd Number");
		}
	}
}
