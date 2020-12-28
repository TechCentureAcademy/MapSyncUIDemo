package stepDefinitions;

import static org.testng.AssertJUnit.assertTrue;
import com.mapsynq.automation.helper.TestBase;
import com.mapsynq.automation.pages.HomePage;
import com.mapsynq.automation.pages.UserRegistrationPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Steps extends TestBase{

	public HomePage homePage;
	public UserRegistrationPage userRegistrationPage;
	
	    @Given("^I Select Type of Browser For Navigation Test$")
	    public void i_select_type_of_browser_for_navigation_test() throws Throwable {
	    	 String browserName = "chrome";
	    	 String url = "http://www.mapsynq.com/";
	    	 driver = createDriver(browserName, url);
	    }

	    @When("^I Click On User Registration Link$")
	    public void i_click_on_user_registration_link() throws Throwable {
	    
	    	homePage = new HomePage(driver);
	    	userRegistrationPage = homePage.clickRegisterLink();
	    }

	    @Then("^I Verify User Registration Page Load$")
	    public void i_verify_user_registration_page_load() throws Throwable {
	   
	    	assertTrue("Problem in Sign Up", userRegistrationPage.verifyPageLoad());
	    }
	    
	    @When("^I Click On Home Page Link$")
	    public void i_click_on_home_page_link() throws Throwable {
	    	
	    	homePage = userRegistrationPage.clickMapSynq();
	    }

	    @Then("^I Verify Home Page Load$")
	    public void i_verify_home_page_load() throws Throwable {
	    	
	    	assertTrue("Problem in Sign Up", homePage.verifyPageLoad());
	    }

}

