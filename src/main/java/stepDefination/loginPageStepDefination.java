package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//***********DataTable with List**********//

public class loginPageStepDefination {

	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^users Prescent on the Login Page$")
	public void user_Prescent_on_the_Login_Page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\java programs\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys("ravi123@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		wait= new WebDriverWait(driver, 30);
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_gender1']")));
	    boolean res =ele.isDisplayed();
	    Assert.assertTrue(res);
	}

	@When("^Title of the Loginpage is Login - My Store$")
	public void title_of_the_Loginpage_is_Login_My_Store() {
	    // Write code here that turns the phrase above into concrete actions
		String loginpage_title=driver.getTitle();
		System.out.println("login page title is : "+loginpage_title);
		Assert.assertEquals("Login - My Store", loginpage_title);
	}

	@Then("^user select Gender$")
	public void user_select_Gender(DataTable obj){
		List<List<String>>data= obj.raw();
		if(data.get(0).get(0)=="Mr") {
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_gender1']")));
		ele.click();
		}
		else {
			WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_gender2']")));
			ele.click();
		}
	}

	@Then("^user enter Firstname$")
	public void user_enter_Firstname(DataTable obj) {
		List<List<String>>data= obj.raw();
	   driver.findElement(By.id("customer_firstname")).sendKeys(data.get(0).get(0));
	}

	@Then("^user enter lastname$")
	public void user_enter_lastname(DataTable obj){
		List<List<String>>data= obj.raw();
		driver.findElement(By.id("customer_lastname")).sendKeys(data.get(0).get(0));
	}

	@Then("^user enter password$")
	public void user_enter_password(DataTable obj){
		List<List<String>>data= obj.raw();
		driver.findElement(By.id("passwd")).sendKeys(data.get(0).get(0));
	}

	/*@Then("^user click on register button$")
	public void user_click_on_register_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User Should See Created Account  successfully$")
	public void user_Should_See_Created_Account_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/


}
