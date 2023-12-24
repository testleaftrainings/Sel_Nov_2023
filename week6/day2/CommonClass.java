package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class CommonClass {

	/*
	 * public ChromeDriver driver; public EdgeDriver driver1;
	 */

	public RemoteWebDriver driver;

	public String filename;

	@Parameters({ "username", "password", "url", "browser" })
	@BeforeMethod
	public void browserSetUp(String uname, String pwd, String url, String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--incognito");
			driver = new ChromeDriver(opt);
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		/*
		 * EdgeDriver driver1 =new EdgeDriver();
		 * 
		 * driver1.manage().window().maximize(); driver1.get(url);
		 * driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 */
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@DataProvider // (name="supplyData")
	public String[][] sendData() throws IOException {
		//ReadExcel exceldata = new ReadExcel();
		String[][] data = ReadExcel.readData(filename);
		return data;
	}

}
