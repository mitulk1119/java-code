import java.util.Random;

public class SelectionSort {
	public static void selecetsort(int[] anArray) {
		int n = anArray.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j <= n - 1; j++) {
				if (anArray[j] < anArray[minIndex])
					minIndex = j;
			}
			int temp = anArray[i];
			anArray[i] = anArray[minIndex];
			anArray[minIndex] = temp;
		}
	}

	public static void main(String[] args) {
		int[] myArray = new int[25];
		Random myRandom = new Random();

		for (int i = 0; i < myArray.length; i++)
			myArray[i] = myRandom.nextInt(100);
		System.out.println("Orignal Array");

		for (int i = 0; i < myArray.length; i++)
			System.out.print(myArray[i] + " ");

		selecetsort(myArray);
		System.out.println("\nSoring Algorithm: Array after sorting");
		for (int i = 0; i < myArray.length; i++)
			System.out.print(myArray[i] + " ");

	}
}
