package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		
		//Declare a string; -literal way		
		String comName="Testleaf";
		String str="Testleaf";
		//using object	
		String comName1=new String("Testleaf");		
		
		//immutable class
		//differed with memory allocation
		
		String s=new String("Testleaf");
		
		if(comName==str) {//comparing literal declaration
			System.out.println("the values are same");
		}else {
			System.out.println("Both are different values");
		}
		
		if(comName1==s) {//comparing new keyword declaration
			System.out.println("the values are same");
		}else {
			System.out.println("Both are different values");
		}
		
		System.out.println("using equals to compare the values ");
		
		if(comName.equals(s))//compare the content of the string variables
		
		{
			System.out.println("The values are same");
		}else {
			System.out.println("Both are different values");
		}
		}
	}


