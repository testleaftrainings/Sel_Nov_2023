package week3.LearnInheritance;

public class BMW extends Car{
	
	public void callParentBrake() {
		super.applybrake();
	}
	
	public void applybrake() {	
		super.applybrake();
		//System.out.println("Applied brake -Advanced brake system");

	}	
	public void sunroof() {
		
	}

}
