package com.mapsynq.automation.register.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;
import com.mapsynq.automation.helper.TestBase;
import com.mapsynq.automation.pages.HomePage;
import com.mapsynq.automation.pages.UserRegistrationPage;

public class DemoTest extends TestBase {

	public HomePage homePage;
	public UserRegistrationPage userRegistrationPage;

	@Parameters({"browserName", "url"})
	@BeforeTest()
	public void TestBasesetUp(String browserName, String url) {
		 driver = createDriver(browserName, url);
	}
	
	@BeforeClass
	public void setUp() {
		homePage = new HomePage(driver);
	}
	
	@Test(priority=1)
	public void verifyUserRegistrationPageLoad() {
		userRegistrationPage = homePage.clickRegisterLink();
		assertTrue("Problem in Sign Up", userRegistrationPage.verifyPageLoad());
	}
	
	@Test(priority=2)
	public void verifyHomePageLoad() {
		homePage = userRegistrationPage.clickMapSynq();
		assertTrue("Problem in Sign Up", homePage.verifyPageLoad());
	}

}
