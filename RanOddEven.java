import java.util.Random;

public class RanOddEven {

	
	public static void main(String[] args) {
		Random r = new Random();
		int even = 0, odd = 0;
		for (int i = 0; i < 100; i++) {
			int randomint = r.nextInt(100);
			System.out.print(randomint + " ,");
			if (randomint % 2 == 0)
				even += randomint;
			else
				odd += randomint;
		}
		System.out.println("\nEven index positions sum: " + even);
		System.out.println("Odd index positions sum: " + odd);

	}

}
