package Switch;

public class EvenNumber {

	public static void main(String[] args) {
//		int i = 2;
//		int finishNumber = 20;
//		while (i <= finishNumber) {
//			i++;
//			if (!isEvenNumber(i)) {
//				continue;
//			}
//			System.out.println("the even number is : " + i);
//		}

		int i = 2;
		int finshNumber = 20;
		int evenNumbersFound = 0;

		while (i <= finshNumber) {
			i++;
			if (!isEvenNumber(i)) {

				continue;
			}
			System.out.println("the even number is : " + i);
			evenNumbersFound++;
			if (evenNumbersFound >= 5) {
				break;
			}

		}
		System.out.println("total even number found-: " + evenNumbersFound);
	}

	public static boolean isEvenNumber(int i) {
		if (i % 2 == 0) {
			return true;
		}
		return false;
	}
}
