
public class Array {

	public static void main(String[] arg) {
		System.out.println(" the sum of the array = " + sum());
	}

	static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	static int sum() {
		int sum = 0;
		int i;
		for (i = 0; i < arr.length; i++)
			sum = sum + arr[i];
		return sum;
	}
}
