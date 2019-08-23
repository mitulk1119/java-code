import java.util.Random;

public class RandomOdd {
	
	int computeRandomOdd(int i) {
		Random r = new Random();
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			int randomint = r.nextInt(100);
			System.out.print(randomint + " ,");
			if (randomint % 2 != 0) {
				sum = randomint + sum;
			}
		}return sum;
	}
	public static void main(String[] args) {
		
		int i = 0;
		RandomOdd obj = new RandomOdd();
		int RandomArray= obj.computeRandomOdd(i);
		System.out.println("\nThe Sum Of 100 Odd Numbers are:" + RandomArray);
	}
}
