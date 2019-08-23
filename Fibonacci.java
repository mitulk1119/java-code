
public class Fibonacci {

	static int computeFiboByTernary(int n) {

		// int result =
		return (n <= 1) ? n : (computeFiboByTernary(n - 1) + computeFiboByTernary(n - 2)); // ternary method

		// return result;
	}

	static int computeFiboByRecurssion(int n) {
		if (n <= 1) {
			return n;
		} else {
			return computeFiboByRecurssion(n - 1) + computeFiboByRecurssion(n - 2); // recursion
		}
	}

	
	
	
	public static void main(String args[]) {
		int n = 5;
		long timeStart2 = System.nanoTime();
		System.out.println(computeFiboByTernary(n));
		long timeEnd2 = System.nanoTime();
		System.out.println("-----");
		long timeStart = System.nanoTime();
		System.out.println(computeFiboByRecurssion(n));
		long timeEnd = System.nanoTime();

		System.out.println("time taken by recurssion = " + (timeEnd - timeStart));
		System.out.println("time taken by bit shift = " + (timeEnd2 - timeStart2));
	}
}
