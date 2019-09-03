package Switch;

public class LeapYear {

	public static void main(String[] args) {

		getDaysOfMonth(2, 2019);
	}

	public static void getDaysOfMonth(int month, int years) {

		if ((month < 0) || (month > 12) || (years < 1) || (years > 9999)) {
			System.out.println("please check your month and year");
		} else
			switch (month) {
			case 1:
				System.out.println("the month is January and it has 31 days ");
				break;
			case 2:
				month = 2;
				if ((years % 400 == 0) || ((years % 4 == 0) && (years % 100 != 0))) {
					System.out.println("the month is Febuary and it has  29 days and is a leap year");

				} else {
					System.out.println("the month is Febuary and it has 28 days and is not a leap year");
				}
				break;
			case 3:
				System.out.println("the month is March and it has 31 days ");
				break;
			case 4:
				System.out.println("the month is April and it has 30 days ");
				break;
			case 5:
				System.out.println("the month is May and it has 31 days ");
				break;
			case 6:
				System.out.println("the month is June and it has 30 days ");
				break;
			case 7:
				System.out.println("the month is July and it has 31 days ");
				break;
			case 8:
				System.out.println("the month is August and it has 31 days ");
				break;
			case 9:
				System.out.println("the month is September and it has 30 days ");
				break;
			case 10:
				System.out.println("the month is October and it has 31 days ");
				break;
			case 11:
				System.out.println("the month is November and it has 30 days ");
				break;
			case 12:
				System.out.println("the month is December and it has 31 days ");
				break;
			}
	}
}