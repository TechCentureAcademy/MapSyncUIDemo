package com.mapsynq.automation.helper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class BrowserManager extends TestBase {
	
	private WebDriver basedriver;
    public WebDriver webdriver;
    private static Logger log = Logger.getLogger(BrowserManager.class);
    String chromeDriverPath = "webdriver.chrome.driver";

	public WebDriver getWebDriver(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome")) {
				  ChromeOptions options=new ChromeOptions();
				  options.addArguments("--no-sandbox");
				  options.addArguments("disable-infobars");
				  options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				  options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
				  options.addArguments("disable-infobars");
				  
				  /*
				   *  OS ( Mac / Windows / Linux Flavours )
				   */
				  
				  System.setProperty(chromeDriverPath, "src/main/resources/driver/windows/chromedriver.exe");
				  basedriver = new ChromeDriver(options);
	    }

		webdriver=basedriver;
		
		webdriver.manage().window().maximize();
		webdriver.manage().deleteAllCookies();
		  
		log.info("Browser Selection, Maximizing browser & Cookies Deletion are done successfully");

		return webdriver;
	}
}