package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class CommonClass {

	public ChromeDriver driver;

	@BeforeSuite
	public void cloudConnection() {
		System.out.println("Connet to cloud");
	}

	@BeforeTest
	public void resourceSetUp() {
		System.out.println("Test files");
	}

	@BeforeClass
	public void setUpClassDetails() {
		System.out.println("Class details");
		/*
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://leaftaps.com/opentaps/");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 */
	}

	@BeforeMethod
	public void browserSetUp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
