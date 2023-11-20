package week1.day2;

public class LearnJump {

	public static void main(String[] args) {
		
		//break, continue
		
		for(int i=1;i<20;i++) {
			if(i==5) {//5==5
				System.out.println("Working with break condition" +i);
				break;
			}
			System.out.println(10/i);			
		}
		
		System.out.println("**************");
		
		for(int i=1;i<20;i++) {
			if(i==5) {//5==5
				System.out.println("Working with Continue condition" );
				continue; //always skip the current iteration
			}
			System.out.println(10/i);
			
		}
		
		

	}

}
