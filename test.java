import java.util.Scanner;

public class test {
	
	
	public static void computeOddEven(int number, int evenSum, int oddSum) {
		int i;
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
			else
			{
				oddSum = oddSum + i;
			}
		}	
	}
	public static void main(String[] args)
	{
		int number, i, evenSum = 0, oddSum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		
		System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
		System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
	}
}
