
public class Factorial {
	static int computeFactorial(int n) {
		if (n == 0) {
			return 1;
		}else {
			return (n * computeFactorial(n - 1));
		}
		}

	public static void main(String args[]) {
		int fac = 1;
		int number = 5;
		fac = computeFactorial(number);
		System.out.println("Factorial of " + number + " is: " + fac);
	}
}
