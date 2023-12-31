package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{

	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demoCSR");
		return new LoginPage();
	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return new LoginPage();
	}

	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}

}
//method chaining
//enterusername-->password-->login
//username -->password-->login-->crmsfa-->leads-->crealead->cname->fname->lname->create->viewlead
//username->password->login->logout