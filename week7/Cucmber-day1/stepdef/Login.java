package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	// feature package-->Tc001_login.feature-->Writing userstory using Given, when &
	// then
	// stepdef package-->Login java -->selenium script
	// --> Create normal methods for each feature file scenario step
	// to connect the feature file steps with the method of java class-->cucumber
	// annotations

	public ChromeDriver driver;

	@Given("Launch the browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
		}

	@And("Load the url")
	public void loadUrl() {
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("Enter the username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Welcome page is displayed")
	public void VerifyWelcomePage() {
		System.out.println(driver.getTitle());
	}

	@But("Error message is displayed")
	public void error_message_is_displayed() {
		String errorMsg = driver
				.findElement(By.xpath("//p[text()='following error occurred during login: User not found.']"))
				.getText();

		System.out.println(errorMsg);
	}

	@When("Click on CRMSFA link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("Click on Leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click on Create Lead link")
	public void click_on_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@When("Enter the companyName as {string}")
	public void enter_the_company_name_as(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}

	@When("Enter the firsName as {string}")
	public void enter_the_firs_name_as(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

	}

	@When("Enter the lastName as {string}")
	public void enter_the_last_name_as(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);

	}

	@When("Click on Create button")
	public void click_on_create_button() {
		driver.findElement(By.name("submitButton")).click();

	}

	@Then("Viewlead page is displayed")
	public void viewlead_page_is_displayed() {
		System.out.println(driver.getTitle());
	}

}
