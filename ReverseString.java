
public class ReverseString {

	public static void main(String[] args) {
		String input = "GeeksforGeeks";
		byte[] strAsByteArray = input.getBytes();
		byte[] result = new byte[strAsByteArray.length];
		for (int i = 0; i < strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];
		String temp = "";
		int length = input.length();
		for (int i = length - 1; i >= 0; i--) {
			temp = temp + input.charAt(i);
		}
		System.out.println("Orignal String: " + input);
		System.out.println("String after reversing with stringbuilder: " + new String(result));
		System.out.println("String after reversing without stringbuilder: " + temp);
	}
}
s