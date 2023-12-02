package week3.day1;

public class StringManipulation {

	public static void main(String[] args) {

		String pdtPrice="the price of the product is Rs.2345#";
		
		String replace = pdtPrice.replace("p", "#");
		
		System.out.println(replace);
		
		//to retrieve number from the string
		String replaceAll = pdtPrice.replaceAll("[^0-9]", "");		
		System.out.println(replaceAll+10);		
		System.out.println(10+10);
		
		//to convert the given string into an integer		
		//replaceAll-->string 2345.00
		int price = Integer.parseInt("2345");
		System.out.println(price+10);
		String p = Integer.toString(price);

		 String substring = pdtPrice.substring(3, 7);
		System.out.println(substring);
		
	}

}
