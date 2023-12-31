package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class Logoutfunctoionality extends ProjectSpecificMethod{

		
	@Test
	public void runLogin() {
		
		LoginPage lp=new LoginPage();
		
		
		lp.enterUsername().enterPassword().clickLogin().clickLogout();
		
		/*
		 * lp.enterUsername(); lp.enterPassword(); lp.clickLogin();
		 * 
		 * 
		 * WelcomePage wp=new WelcomePage(); wp.clickCRMSFA();
		 */
		
		
		
	}
	
	
	
}
