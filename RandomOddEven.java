import java.util.*;

public class RandomOddEven {

	static public int[] generateRandomIntArray(int size, int bound) {
		int[] temporary = new int[size];
		Random r = new Random();
		for (int i = 0; i < size; i++) {
			temporary[i] = r.nextInt(bound) + 1;
		}
		return temporary;
	}

	public static void findOddAndEvenIndexSums(int[] arr, int i) {
		int evenSum = 0, oddSum = 0;

		for (i = 0; i < arr.length; i++) {
			if (isEven(i)) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
			}
		}

		System.out.println(evenSum);
		System.out.println(oddSum);

		/*
		 * for(int k = 0; k<arr.length; k+=2) { evenSum += arr[i]; }
		 * 
		 * for(int k = 1; k<arr.length; k+=2) { oddSum += arr[i]; }
		 */

	}

	public static boolean isEven(int number) {
		return (number | 1) == 0 ? false : true;
	}

	public static void main(String[] args) {
		int[] arr = generateRandomIntArray(20, 50);
		int i = arr.length;
	//	findOddAndEvenIndexSums(20, 0);

	}
}