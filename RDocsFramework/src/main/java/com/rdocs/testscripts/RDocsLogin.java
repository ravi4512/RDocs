package com.rdocs.testscripts;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.RDocsLoginLocators;


public class RDocsLogin extends BrowserActions
{
	WebDriver driver;
	public RDocsLogin(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
	}	
	
	@Test
	public void execution() throws Exception
	{
		Properties prop = propertiesCode();
		getURL(prop.getProperty("url"));
		enterText(RDocsLoginLocators.Username, prop.getProperty("username"));
		Thread.sleep(1000);
		enterText(RDocsLoginLocators.Password, prop.getProperty("password"));
		Thread.sleep(1000);
		clickElement(RDocsLoginLocators.Login);
}
	
	
}
 