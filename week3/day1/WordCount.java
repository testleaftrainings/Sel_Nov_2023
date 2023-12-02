package week3.day1;

public class WordCount {

	public static void main(String[] args) {
		
		String sentence= "Learning String concepts";
		//break into words
		//Learning
		//String
		//concepts
		
		String[] split = sentence.split(" ");//delimiter
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			
		}
		
		System.out.println(split.length);
		

	}

}
