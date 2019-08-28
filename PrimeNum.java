
public class PrimeNum {

	public static void main(String[] args) {
//		int count = 0;
//		for (int i = 1; i < 50; i++) {
//			if (isPrime(i)) {
//				count++;
//				System.out.println("number " + i + " is prime");
//
//			}
//		}
//		System.out.println("------------------------------");
//		for (int i = 1; i < 50; i++) {
//			if (newPrime(i)) {
//				count++;
//				System.out.println("number " + i + " is prime");
//
//			}
//		}

		int i = 1103; 
		System.out.println(isPrime(i));
		System.out.println("-------------Is Prime----------");
		System.out.println(nextPrime(i));
		System.out.println("-------------Next Prime-----------");
		System.out.println(newPrime(i));
		System.out.println("-------------New Prime---------");
		System.out.println(newNextPrime(i));
		System.out.println("------------New Next Prime------------");
	}

	public static boolean isPrime(int n) {
		int count = 0;
		if (n == 1) {
	//		System.out.println("looping" + count);
			return false;
		}
		for (int i = 3; i <= n / 2; i++) {
		//	System.out.println("looping" + count);
			count++;
			if (n % 2 == 0) {
		//		System.out.println("looping" + count);
				return false;
			}
		}
		System.out.println("looping" + count);
		return true;
	}

	public static boolean nextPrime(int n) {
		int count = 0;
		if (n % 2 == 0) {
		//	System.out.println("looping" + count);
			return false;
		}
		for (int i = 3; i <= (n / 2); i += 2) {
			//System.out.println("looping" + count);
			count++;
			if (n % i == 0) {
				//System.out.println("looping" + count);
				return false;
			}
		}
		System.out.println("looping" + count);
		return true;
	}

	public static boolean newPrime(int n) {
		int count = 0;
		if (n == 1) {
		//	System.out.println("looping" + count);
			return false;
		}
		for (int i = 3; i <= (long) Math.sqrt(n); i++) {
			//System.out.println("looping" + count);
			count++;
			if (n % 2 == 0) {
				//System.out.println("looping" + count);
				return false;
			}
		}
		System.out.println("looping" + count);
		return true;
	}

	public static boolean newNextPrime(int n) {
		int count = 0;
		if (n % 2 == 0) {
			//System.out.println("looping" + count);
			return false;
		}
		for (int i = 3; i <= (long) Math.sqrt(n); i += 2) {
			//System.out.println("looping" + count);
			count++;
			if (n % i == 0) {
				//System.out.println("looping" + count);
				return false;
			}
		}
		System.out.println("looping" + count);
		return true;
	}

}
/*
 * int i, m = 0, flag = 0; int n = 23;// it is the number to be checked m = n /
 * 2; if (n == 0 || n == 1) { // 0 and 1 are not prime numbers.
 * System.out.println(n + " is not prime number"); } else { for (i = 2; i <= m;
 * i++) { // The 2 is the only even prime number because all the other even
 * numbers can be // divided by 2. if (n % i == 0) { System.out.println(n +
 * " is not prime number"); flag = 1; break; } } if (flag == 0) {
 * System.out.println(n + " is prime number"); } } end
 * 
 */