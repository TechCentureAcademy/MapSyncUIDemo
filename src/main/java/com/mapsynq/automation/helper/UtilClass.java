package com.mapsynq.automation.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;

public class UtilClass {

	private WebDriverWait wait;

	public void clickElement(WebDriver driver, WebElement element)
	{
		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(element)); 
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public String getElementText(WebDriver driver, WebElement element)
	{
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}

	public void setText(WebDriver driver, WebElement element, String text)
	{
		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.clear();
		element.sendKeys(text);
	}

}