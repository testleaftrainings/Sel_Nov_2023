package week3.day1;

public class StringReverse {

	public static void main(String[] args) {

		String s = "Testleaf";
		// String is a sequence of character
		// reverse -->faeltseT
		// using array

		// to find length of the String-->count of characters
		// int length = s.length();
		// to reverse- Method 1
		for (int i = s.length() - 1; i >= 0; i--) {
			// 8,7,6,5,4,3,2,1
			// 7 to 0
			System.out.println(s.charAt(i));
		}
		System.out.println(s.charAt(2));
		System.out.println();
		// Method 2
		// convert the string into char array
		char[] charArray = s.toCharArray();
		// ['T','e'..]
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}

	}

}
