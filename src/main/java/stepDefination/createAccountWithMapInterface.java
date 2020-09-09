package stepDefination;

import java.util.List;
import java.util.Map;

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


//DataTablle with paramererrization with Headers of the Data
public class createAccountWithMapInterface {
	WebDriver driver;
	WebDriverWait wait;
	//WebDriverWait wait= new WebDriverWait(driver, 30);
	
	@Given("^user Prescent on the CreateAccount Page$")
	public void user_Prescent_on_the_CreateAccount_Page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\java programs\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys("ravi123@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		wait= new WebDriverWait(driver, 30);
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_gender1']")));
	    boolean res =ele.isDisplayed();
	    Assert.assertTrue(res);
	}
	
	@When("^Loginpage title is Login - My Store$")
	public void Loginpage_title_is_Login_My_Store() {
	    // Write code here that turns the phrase above into concrete actions
		String loginpage_title=driver.getTitle();
		System.out.println("login page title is : "+loginpage_title);
		Assert.assertEquals("Login - My Store", loginpage_title);
	}
	
	@Then("^user select Gender and enter Firstname,lastname and password$")
	public void user_enter_Firstname_LastName_Password(DataTable obj) {
		for(Map<String, String>data :obj.asMaps(String.class,String.class)) {
			System.out.println(data.get("Title"));
			 String inp=data.get("Title");
		if(inp.contains("Mr")) {
			WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_gender1']")));
		ele.click();
			}
			else if(inp.contains("Mrs")) {
				WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_gender2']")));
				ele.click();
			}
			
		  WebElement fisName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname")));
	   //driver.findElement(By.id("customer_firstname"));
			System.out.println(data.get("FirstName"));
			fisName.clear();
	      fisName.sendKeys(data.get("FirstName"));
	     WebElement lastName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_lastname")));
	   //driver.findElement(By.id("customer_lastname"))
	     System.out.println(data.get("LastName"));
	     lastName.clear();
	      lastName.sendKeys(data.get("LastName"));
			
	     WebElement password  =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));
	   // driver.findElement(By.id("passwd"))
	     System.out.println(data.get("Pwd"));
	     password.clear();
	      password.sendKeys(data.get("Pwd"));
		 driver.get(driver.getCurrentUrl());
	     }
	}

}
