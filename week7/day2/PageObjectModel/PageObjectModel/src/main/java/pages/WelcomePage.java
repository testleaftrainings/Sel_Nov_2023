package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{

	
	public MyhomePage clickCRMSFA() {	
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyhomePage();
	}
	
	public LoginPage clickLogout() {
	  System.out.println("Loggedout");
	  return new LoginPage();

	}
	
	
}
