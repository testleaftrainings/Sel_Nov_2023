package week1.day2;

public class LearnIfstatement {

	public static void main(String[] args) {
		
		int num=3;
		//number should be greater than 0
		
		if(num>0) {
			System.out.println("The given number is positive");
		}else {
			System.out.println("The given number is negative");
		}
		
		
		int n=0; //assigning value to the variable
		
		if(n>0) {
			System.out.println("The number is positive");
		}else if(n<0) {
			System.out.println("The number is negative");
		}else if(n==0) {//comparing the value is equal 
			System.out.println("The number is neutral");
		}else {
			System.out.println("Check your inputs");
		}
		
		
		
				
	}

}
