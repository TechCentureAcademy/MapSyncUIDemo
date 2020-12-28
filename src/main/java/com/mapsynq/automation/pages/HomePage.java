package com.mapsynq.automation.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mapsynq.automation.helper.UtilClass;

public class HomePage extends UtilClass {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private static Logger log = Logger.getLogger(HomePage.class);
	
	/*
	 *  WebElements for the Home Page
	 */

	@FindBy(linkText = "Register")
	private WebElement lnkUserRegister;
	
	public HomePage(WebDriver driver) {
		log.info("Home Page Constructor Invoked");
		this.driver = driver;
		wait = new WebDriverWait(driver, 60);
	    PageFactory.initElements(driver, this);
		wait.until(ExpectedConditions.titleContains("Live"));
	}
	
	/*
	 *  Click Register Link From Application Home Page
	 */

	public UserRegistrationPage clickRegisterLink() {
		log.info("Clicking Register Link in Home Page");
		clickElement(driver, lnkUserRegister);
		
		return new UserRegistrationPage(driver); 
	}
	
	public boolean verifyPageLoad() {
		boolean result = lnkUserRegister.isDisplayed();
		
		log.info("Element Found..!!!");
		
		return result;
	}

}
