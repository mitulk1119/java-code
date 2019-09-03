import java.util.*;

public class ReverseNumber {

	public static int reverse(int n) {
		int result = 0;
		int rem;
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			result = result * 10 + rem;
		}
		return result;
	}

	public static int reverseNumStringBuilder(int n) {
		String inputString = String.valueOf(n);
		StringBuffer stringBuffer = new StringBuffer(inputString);
		stringBuffer.reverse();
		String reversedString = stringBuffer.toString();
		int reversedInt = Integer.parseInt(reversedString);
		
		return Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
		//return reversedInt;
		
		
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number to be reversed : ");
		int input = s.nextInt();
		int result = reverse(input);

		System.out.println("The reversed number is " + result);

		System.out.println("--------");

		int value = reverseNumStringBuilder(input);
		System.out.println("The reversed number using stringbuilder is " + value);

	}

}
