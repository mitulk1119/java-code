import java.util.*;

public class ReverseNum {

	public static void main(String args[]) {
		int num = 0;
		int reversenum = 0;
		System.out.println("Input your number and press enter: ");
		Scanner rev = new Scanner(System.in);
		num = rev.nextInt();
		while (num != 0) // Logic to find out the reverse number
		{
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of input number is: " + reversenum);
		
		//String t = Integer.parseInt(number).toString();
		//reverse t using string builder
		//get the reverse string
		//parse the string as integer
	}
}
