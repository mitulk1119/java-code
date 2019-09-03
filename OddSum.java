package Switch;

public class OddSum {

	public static void main(String[] args) {
		int number = 3;
		System.out.println(isOdd(number));
		System.out.println(sumOdd(0, 10));
	}

	public static boolean isOdd(int number) {
		if (number < 0) {
			return false;
		}
		for (int i = 0; i < number; i++) {
			if (number % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static int sumOdd(int start, int end) {
		int i, sum = 0;
		if(start % 2 != 0)
		{
			start++;
		}
		for(i = start; i <= end; i++)
		{
			if(isOdd(i))
			{
				sum = sum + i;  
			}
		}
		return sum;

	}

}
