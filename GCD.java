
public class GCD {
	int computeGcd(int num1, int num2 ) {
		System.out.println("value of num1=" + num1 + "value of num2=" + num2);
		while (num1 != num2) {
			if(num1==0) {
				return num2;
			}
			if(num2==0) {
				return num1;
			}
			if (num1 > num2) {
				num1 = num1 % num2;
			} else {
				num2 = num2 % num1;
			}
			System.out.println("value of num1=" + num1 + "value of num2=" + num2);
		}
		
		return num2;
		
	}
	public static void main(String[] args) {
		GCD obj = new GCD();
		int num1 = 500, num2 = 510, cnt = 0;
		int GCD = obj.computeGcd(num1, num2 );
		System.out.printf("GCD of given numbers is: %d", GCD);
	}
}
