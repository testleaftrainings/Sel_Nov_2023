package week3.LearnInheritance;

public class ExecutionClass {

	public static void main(String[] args) {
		/*
		 * Vehicle v=new Vehicle(); v.applybrake(); v.soundHorn();
		 */
		
		/*
		 * Car c=new Car(); c.applybrake(); c.soundHorn(); c.nofdoors();
		 */
		 
		
		  Auto a=new Auto();
		   a.noofwheels(); 
		   a.applybrake();
		   a.soundHorn();
		 
		
		BMW b=new BMW();
		//super-->to call the parent method which is overridden by the child class
		b.applybrake();
		
		
		
		
		//BMW extends Car -single inheritance
		//Car extends Vehicle -Single inheritance
		
		//BMW -car- vehicle -->Multi level inheritace
	}

}
