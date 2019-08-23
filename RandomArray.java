import java.util.Random;

public class RandomArray {

		int computeRandomArray(int i) {
		Random r = new Random();
		int sum = 0;
		for ( i = 0; i < 100; i++) {
			int randomint = r.nextInt(100);
			System.out.print(randomint + " ,");
			 sum = sum + randomint;
		}
		return sum;
		}
		public static void main(String[] args) {
			int i = 0;
			RandomArray obj = new RandomArray();
			int RandomArray= obj.computeRandomArray(i);
		System.out.println("\nSum = " + RandomArray);

	}

}
