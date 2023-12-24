package week6.day2;

import org.testng.annotations.Test;

public class LearnPriority {
	
	
	@Test(priority=2,invocationCount=3)
	public void createLead() {
		System.out.println("Leads created sucessfully");
	}
		
	@Test(priority=2)
	public void deleteLead() {
		System.out.println("Leads deleted sucessfully");
	}
	
	@Test(priority=3)
	public void editLead() {
		System.out.println("Leads updated sucessfully");
		throw new RuntimeException("Edit lead is not successful");
	}
	
	@Test(priority=0,dependsOnMethods={"createLead","editLead"})
	public void duplicateLead() {
		System.out.println("Leads duplicated sucessfully");
	}

}
