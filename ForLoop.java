package Switch;

public class ForLoop {

	public static void main(String[] args) {
		for( int i=2;i<10;i++) {
			System.out.println("10,000 at " +i + " intrest = "+ calculateIntrest(10000.0, i));
		}
		for( int i=8;i>=2;i--) {
			System.out.println("10,000 at " +i + " intrest = "+ calculateIntrest(10000.0, i));
		}
	}
	public static double calculateIntrest(double amount, double intrestRate) {
		return (amount*(intrestRate/100));
	}

}
