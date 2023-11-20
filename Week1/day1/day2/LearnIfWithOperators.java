package week1.day2;

public class LearnIfWithOperators {

	public static void main(String[] args) {
		
		int x=17;
		
		//to comment multiple statement -->ctrl / or ctrl shift  /
		
		
		
		System.out.println(10%2);
		System.out.println(10/3);
		System.out.println(10%3);
		
		

	   if(x%5==0) {// 0==0 ->logic will be executed
			System.out.println("The number is divisible by 5");
		}else {
			System.out.println("The number is not divisible by 5");
		}
		
	   
	   if(x%5!=0) {
		   System.out.println("The number is not divisible by 5");
	   }else {
		   System.out.println("The number is divisible by 5");
	   }
	   
	   
	   
	   
	   int age=15;
	   
	   if(age>=18) {
		   System.out.println("Right to vote");
	   }
	   System.out.println("*****************************");
	   if(x>1 || x<0) {
		   System.out.println("The numbe is divisble");
	   }else {
		   System.out.println("The number is not eligible");
	   }   
	   
	   int y=0;
	   
	  if(y!=0 && y%5==0) { //&& -and operator both the conditions to be satisfied 
	   System.out.println("The number is divisible");
	   	  
	}
	}
}
