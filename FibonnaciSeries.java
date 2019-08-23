
public class FibonnaciSeries {

	static int computeFiboByTernary(int i) {

		// int result =
		return (i <= 1) ? i : (computeFiboByTernary(i - 1) + computeFiboByTernary(i - 2)); // ternary method

		// return result;
	}

	static int computeFiboByRecurssion(int i) {
		if (i <= 1) {
			return i;
		} else {
			return computeFiboByRecurssion(i - 1) + computeFiboByRecurssion(i - 2); // recursion
		}
	}

	static int computeFibonacciByDynamicArray(int n) {
		int iNth = 1;
		int iNPlusOne = 1;
		int result = 0;

		for (int i = 1; i <= n; i++) {
			int currentVal = iNth + iNPlusOne;
			result = result + currentVal;
			iNth = iNPlusOne;
			iNPlusOne = currentVal;
		}

		return result;
	}

	public static void main(String args[]) {
		int[] myArray = { 10, 12, 13, 56,5, 8, 35, 30, 7, 34 };
		int n = 10;
		long timeStart3 = System.nanoTime();
		for (int i : myArray) {
			System.out.println(computeFibonacciByDynamicArray(i));
		}
		// System.out.println(computeFiboByTernary(n));
		long timeEnd3 = System.nanoTime();
		System.out.println("time taken by dynnamically = " + (timeEnd3 - timeStart3));
		System.out.println("-----");

		long timeStart2 = System.nanoTime();

		for (int i : myArray) {
			System.out.println(computeFiboByTernary(i));
		}
		// System.out.println(computeFiboByTernary(n));
		long timeEnd2 = System.nanoTime();
		System.out.println("time taken by bit shift = " + (timeEnd2 - timeStart2));
		System.out.println("-----");

		long timeStart = System.nanoTime();
		for (int i : myArray) {
			System.out.println(computeFiboByRecurssion(i));
		}
		long timeEnd = System.nanoTime();

		System.out.println("time taken by recurssion = " + (timeEnd - timeStart));
		
		
	}

}
