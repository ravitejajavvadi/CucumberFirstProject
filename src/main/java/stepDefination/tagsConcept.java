package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class tagsConcept {

	WebDriver driver;
	
	@Before(order=0)//Global Hooks
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\java programs\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}
	@Before(order=1)
	public void seup1() {
		System.out.println("setup1 method executed");
	}
	@After(order=0)
	public void tearDown() {
		driver.close();
	}
	@After(order=1)
	public void teardown1() {
		System.out.println("teardown1 method executed");
	}
	
	@Before("@First")// Local Hooks
	public void LoginSetUp() {
		System.out.println("Before First Method");
	}
	@After("@First")
	public void afterLogin() {
		System.out.println("After First Method");
	}
	@Before("@Second")
	public void beforeSecondmethod() {
		System.out.println("Before Second Method");
	}
	@After("@Second")
	public void aftersecondmethod() {
		System.out.println("After Second Method");
	}
	@Given("^user login to the application$")
	public void user_login_to_the_application()  {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user login to the application");
	}

	@Given("^user click on user new document$")
	public void user_click_on_user_new_document() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user click on user new document");
	}

	@Given("^user enter created useer id the respective details gettin$")
	public void user_enter_created_useer_id_the_respective_details_gettin(){
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enter created useer id the respective details gettin");
	}

	@Given("^created user details able to edit the data$")
	public void created_user_details_able_to_edit_the_data()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("created user details able to edit the data");
	}

	@Given("^user clcik on view icon$")
	public void user_clcik_on_view_icon() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user clcik on view icon"); 
	}

	@Given("^user click on cancel icon record will be deleted$")
	public void user_click_on_cancel_icon_record_will_be_deleted()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user click on cancel icon record will be deleted");
	}

	@Given("^user create the OP Prescription$")
	public void user_create_the_OP_Prescription()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user create the OP Prescription");
	}

	@Given("^User create the drug fill$")
	public void user_create_the_drug_fill() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User create the drug fill"); 
	}

	@Given("^user able to create the receipt$")
	public void user_able_to_create_the_receipt(){
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user able to create the receipt");
	}

	@Given("^user able to dispatch the bill$")
	public void user_able_to_dispatch_the_bill()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user able to dispatch the bill");
	}

	@Given("^user able to create the due receipt bill$")
	public void user_able_to_create_the_due_receipt_bill() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user able to create the due receipt bill");
	}

	@Given("^user create the patient returns record$")
	public void user_create_the_patient_returns_record() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user create the patient returns record"); 
	}

}
