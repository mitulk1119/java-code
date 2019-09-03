package Switch;

public class Main {

	public static void main(String[] args) {
		char charvalue = 'G';

		switch (charvalue) {
		case 'A':
			System.out.println("the letter is A");
			break;
		case 'B':
			System.out.println("the letter is B");
			break;
		case 'C':
			System.out.println("the letter is C");
			break;
		case 'D': case 'E':
			System.out.println("the letter is: " + charvalue);
			break;
		default:
			System.out.println("it is not A,B,C,D,E");
			break;

		}
		
		String month="Aug";
		switch(month) {
		case "Jan":
			System.out.println("the month is JAN");
			break;
		case "Feb":
			System.out.println("the month is FEB");
			break;
		case "Mar":
			System.out.println("the month is MAR");
			break;
		case "Apr":
			System.out.println("the month is APR");
			break;
		case "May":
			System.out.println("the month is MAY");
			break;
		case "Jun":case "Jul":case "Aug":
			System.out.println("the month is "+ month);
			break;
		case "Sept":case "Oct":case "Nov":
			System.out.println("the month is "+ month);
			break;
		case "Dec":
			System.out.println("the month is DEC");
			break;
			default:
				System.out.println("month is not present");
				break;
		}

	}
}
