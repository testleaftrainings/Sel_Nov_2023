package week3.LearnInheritance;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browserimpl {

	public RemoteWebDriver driver;
	public void launchBrowser(String url) {
		 driver=new ChromeDriver();
		 driver.get(url);
	}
	
	
	public void launchBrowser(String url, String browser) {
		if(browser.equals("chrome")) {
			 driver=new ChromeDriver();
		}else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}

		driver.get(url);
	}
	
	
	public static void main(String[] args) {
		Browserimpl mo=new Browserimpl();
		mo.launchBrowser("http://www.google.com","edge");
		mo.launchBrowser("http://www.google.com");

	}

}
