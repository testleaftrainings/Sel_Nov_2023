package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead extends CommonClass{

	@Test
	public void main() {
		System.out.println(Thread.currentThread().getId());		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
	
	}
	
	/*
	 * @Test public void runDelete() {
	 * driver.findElement(By.linkText("Leads")).click();
	 * driver.findElement(By.linkText("Find Leads")).click();
	 * driver.findElement(By.xpath("//span[text()='Phone']")).click();
	 * driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	 * driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); }
	 */
	
	
}
