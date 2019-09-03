package Switch;

public class StringToNumber {

	public static void main(String[] args) {
		String numberAsString = "2018";
		System.out.println("the number as string " + numberAsString);
		int number = Integer.parseInt(numberAsString);
		System.out.println("the number is " + number);
		numberAsString += 1;
		number += 1;

		System.out.println("the number as string " + numberAsString);
		System.out.println("the number is " + number);

	}

}
