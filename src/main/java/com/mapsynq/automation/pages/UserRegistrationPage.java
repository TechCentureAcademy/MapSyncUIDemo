package com.mapsynq.automation.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mapsynq.automation.helper.UtilClass;

public class UserRegistrationPage extends UtilClass{
	
	private static Logger log = Logger.getLogger(UserRegistrationPage.class);
	private WebDriver driver;
	private WebDriverWait wait;
	
	//WebElement For UserRegistrationPage

	@FindBy(partialLinkText = "MAPSYNQ")
	private WebElement lnkMapSynq;
	
	@FindBy(id = "profile_first_name")
	private WebElement txtFirstName;
	
	@FindBy(id = "profile_last_name")
	private WebElement txtLastName;
	
	@FindBy(id = "profile_gender_M")
	private WebElement btnGender;
	
	@FindBy(id = "profile_dob")
	private WebElement txtDOB;
	
	@FindBy(id = "profile_email")
	private WebElement txtEmail;
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(id = "identity[password_confirmation]")
	private WebElement txtConfirmPassword;
	
	@FindBy(id = "chk_agree")
	private WebElement chkAgree;
	
	@FindBy(name = "commit")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//div[@class='error_signup']")
	private WebElement msg;
	
	public UserRegistrationPage(WebDriver driver) {
		log.info("User Registration Page Constructor Invoked");
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	    PageFactory.initElements(driver, this);
		wait.until(ExpectedConditions.titleContains("user profile"));
	}
	
	public HomePage clickMapSynq() {
		log.info("Setting Text in First Name Field");
		clickElement(driver, lnkMapSynq);
		
		return new HomePage(driver);
	}
	
	// Methods for This Page
	public UserRegistrationPage setFirstName(String firstName) {
		log.info("Setting Text in First Name Field" + firstName);
		setText(driver, txtFirstName, firstName);
		
		return this;
	}
	
	public UserRegistrationPage setLastName(String lastName) {
		log.info("Setting Text in Last Name Field" + lastName);
		setText(driver, txtLastName, lastName);
		
		return this;
	}
	
	public UserRegistrationPage clickGenderOption() {
		log.info("Clicking Male Gender");
		clickElement(driver, btnGender);
		
		return this;
	}
	
	public UserRegistrationPage setDOB(String dob) {
		log.info("Setting Text in DOB Field" + dob);
		setText(driver, txtDOB, dob);
		
		return this;
	}
	
	public UserRegistrationPage setEmail(String email) {
		log.info("Setting Text in EMAIL - Field" + email);
		setText(driver, txtEmail, email);
		
		return this;
	}
	
	public UserRegistrationPage setPassword(String password) {
		log.info("Setting Text for Password - Field" + password);
		setText(driver, txtPassword, password);
		
		return this;
	}
	
	public UserRegistrationPage setConfirmPassword(String password) {
		log.info("Setting Text for Confirm Password - Field" + password);
		setText(driver, txtConfirmPassword, password);
		
		return this;
	}
	
	public UserRegistrationPage clickAgreeCheckBox() {
		log.info("Clicking Agree Checkbox");
		clickElement(driver, chkAgree);

		return this;
	}
	
	public UserRegistrationPage clickSubmit() {
		log.info("Clicking Submit Button");
		clickElement(driver, btnSubmit);
		
		return this;
	}
	
	public String getMessage() {
		String returnMsg = getElementText(driver, msg);
		
		log.info("Message is " + returnMsg);
		
		return returnMsg;
	}
	
	public boolean verifyPageLoad() {
		boolean result = txtFirstName.isDisplayed();
		
		log.info("Element Found..!!!");
		
		return result;
	}
	
	
	


}
