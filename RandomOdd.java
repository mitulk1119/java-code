import java.util.Random;

public class RandomOdd {
	public static void main(String[] args) {
		Random r = new Random();
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			int randomint = r.nextInt(100);
			System.out.print(randomint + " ,");
			if (randomint % 2 != 0) {
				sum = randomint + sum;
			}
		}
		System.out.println("\nThe Sum Of 10 Odd Numbers are:" + sum);
	}
}
