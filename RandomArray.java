import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		Random r = new Random();
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			int randomint = r.nextInt(100);
			System.out.print(randomint + " ,");
			sum = sum + randomint;
		}
		System.out.println("\nSum = " + sum);

	}

}
