package week6.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sample.Exceldata;

public class CreateLead extends CommonClass {

	@Test(dataProvider = "sendData")
	public void runCreate(String cname, String fname, String lname, String phno) {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();

	}

	// data supplier
	@DataProvider // (name="supplyData")
	public String[][] sendData() throws IOException {
		ReadExcel exceldata=new ReadExcel();
		String[][] data = exceldata.readData();
		return data;
	}

}


/*
 * //data in the form of rows and columns String[][] data=new String[3][4];
 * 
 * data[0][0]="TL"; data[0][1]="Vidya"; data[0][2]="R"; data[0][3]="99";
 * 
 * 
 * data[1][0]="Wipro"; data[1][1]="Ebrahim"; data[1][2]="M"; data[1][3]="99";
 * 
 * 
 * data[2][0]="TCS"; data[2][1]="Unnamalai"; data[2][2]="P"; data[2][3]="99";
 * 
 */