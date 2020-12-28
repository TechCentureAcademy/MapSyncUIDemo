package com.mapsynq.automation.register.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;
import com.mapsynq.automation.helper.TestBase;
import com.mapsynq.automation.pages.HomePage;
import com.mapsynq.automation.pages.UserRegistrationPage;

public class SignUpTest extends TestBase {
	
	public String firstName, lastName, dob, email, password;
	public HomePage homePage;
	public UserRegistrationPage userRegistrationPage;
	
	@Parameters({"firstName", "lastName" , "dob", "email", "password"})
	@BeforeClass
	public void setUp(String firstName, String lastName, String dob, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.email = email;
		this.password = password;
		homePage = new HomePage(driver);
	}
	
	@Test
	public void accountSignUp() {
		
		userRegistrationPage = homePage.clickRegisterLink();
		
		userRegistrationPage.setFirstName(firstName).setLastName(lastName).clickGenderOption()
							.setDOB(dob).setEmail(email).setPassword(password).setConfirmPassword(password)
							.clickAgreeCheckBox().clickSubmit();
		
		assertTrue("Problem in Sign Up", userRegistrationPage.getMessage().contains("Incorrect"));
	}

}
