package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homePageStepDefination {

	WebDriver driver;
	WebDriverWait wait;
	@Given("^user Prescent on the homePage$")
	public void users_Prescent_On_homePage()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\java programs\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}
	@When ("^Title of the HomePage is My Store$")
	public void Title_of_the_HomePage()
	{  String hmpgTitle= driver.getTitle();
	   System.out.println("HomePage Title is: "+hmpgTitle);
	    Assert.assertEquals(hmpgTitle, "My Store");
	}
	@Then("^user click on SignIn button$")
	public void user_click_on_SignIn_button()  {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.findElement(By.linkText("Sign in")).isDisplayed());
		driver.findElement(By.linkText("Sign in")).click(); 
	}

	@Then("^Login Page title is Login - My Store$")
	public void login_Page_title_is_Login_My_Store()  {
	    // Write code here that turns the phrase above into concrete actions
		String loginpage_title=driver.getTitle();
		System.out.println("login page title is : "+loginpage_title);
		Assert.assertEquals("Login - My Store", loginpage_title);
	    
	}

	@Then("^user enter New Email address \"(.*)\" for Creating New User Account and click on Create account Button$")  //regular edxpression [ ]
	public void user_enter_New_Email_address_for_Creating_New_User_Account_and_click_on_Create_account_Button(String email){
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email_create")).sendKeys(email);
		driver.findElement(By.id("SubmitCreate")).click();
		boolean res=driver.findElement(By.id("SubmitCreate")).isDisplayed();
		System.out.println("result is: "+ res);
		Assert.assertTrue(res);
		
	}

	@Then("^user landing on New user Create Account Page$")
	public void user_landing_on_New_user_Create_Account_Page()  {
	    // Write code here that turns the phrase above into concrete actions
		wait= new WebDriverWait(driver, 30);
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_gender1']")));
	   boolean res =ele.isDisplayed();
	   Assert.assertTrue(res);
	}
   
	@Then ("^close the browser$")
    public void close_the_browser() {
		driver.close();
	}
}
