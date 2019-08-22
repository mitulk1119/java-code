import java.util.*;

public class OddEven {
	public static void main(String[] args) {
		Scanner oe = new Scanner(System.in);
		System.out.println("PLEase enter the number");
		int i = oe.nextInt();
		if (i % 2 == 0) {				//TO CONSIDER: compare performance using bit shifting method to determine if even or odd
			System.out.println("It is Even Number");
		} else {
			System.out.println("IT is Odd Number");
		}
	}
}
