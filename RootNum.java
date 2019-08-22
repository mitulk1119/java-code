
public class RootNum {

	static int squareroot(int x) {
		if (x == 0 || x == 1)
			return x;

		int i = 1, result = 1;

		while (result <= x) {
			i++;
			result = i * i;
		}
		return i - 1;
	}

	public static void main(String[] args) {
		int x = 101;
		System.out.print(squareroot(x));

	}

}
