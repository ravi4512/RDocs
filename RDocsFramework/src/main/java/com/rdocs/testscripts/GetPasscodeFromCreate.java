package com.rdocs.testscripts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.AuthorizeRPDLocators;

public class GetPasscodeFromCreate extends BrowserActions
{
	WebDriver driver;
	public GetPasscodeFromCreate(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void execution() throws Exception
	{
		Thread.sleep(7000);
		Properties prop = propertiesCode();
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs);
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(1));
		waitforelementtobeclick(AuthorizeRPDLocators.GetPasscode, Duration.ofSeconds(15));
		enterText(AuthorizeRPDLocators.AuthorizeEmail, prop.getProperty("outlook_username"));
		clickElement(AuthorizeRPDLocators.Ok);
		clickElement(AuthorizeRPDLocators.Ok1);
	}
}
