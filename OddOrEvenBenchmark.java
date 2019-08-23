
public class OddOrEvenBenchmark {

	public static boolean isOddByPercentile(int n) {
		return n % 2 == 1;
	}

	public static boolean isOddByBitShift(int n) {
		return (n & 1) == 1;
	}

	public static void main(String[] args) {

		int[] myArray = { 10, 12, 13, 56, 72, 100, 91, 313, 789, 1124, 1567, 5, 8, 35, 30, 100007, 143234234 };

		// The time comparison was inclusive
		// But It appeared that the one which is running second taking lesser time
		// Why is that happening, We dot know, sadly

		long timeStart = System.nanoTime();
		/*
		 * for(int i : myArray) { System.out.println(isOddByBitShift(i)); }
		 */
		System.out.println(isOddByPercentile(5155555));
		long timeEnd = System.nanoTime();

		System.out.println("-----");
		long timeStart2 = System.nanoTime();
		/*
		 * for(int i : myArray) { System.out.println(isOddByPercentile(i)); }
		 */
		System.out.println(isOddByBitShift(71587878));
		long timeEnd2 = System.nanoTime();

		System.out.println("time taken by bit shift = " + (timeEnd - timeStart));
		System.out.println("time taken by percentile = " + (timeEnd2 - timeStart2));
	}
}
