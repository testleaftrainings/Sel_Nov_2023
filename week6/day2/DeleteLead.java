package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteLead extends CommonClass{
	
	

	//set the filename with respect to the testcase	
	@BeforeClass
	public void setValues() {
		filename="DeleteLeadData";
		
	}
	//dependsOnMethods="packagename.classname.method"
	@Test(dataProvider="sendData",dependsOnMethods="week6.day2.CreateLead.runCreate")//,enabled=false)
	public  void runDelete(String phno) throws InterruptedException {
		System.out.println(Thread.currentThread().getId());
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Thread.sleep(2000);//to have staleness 
		
		WebElement lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));		
		wait.until(ExpectedConditions.stalenessOf(lead));
		
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
	}	
	
	//data supplier
	/*
	 * @DataProvider//(name="supplyData") public String[][] sendData() throws
	 * IOException { ReadExcel exceldata=new ReadExcel(); String[][] data =
	 * exceldata.readData(); return data; }
	 */
	
}
