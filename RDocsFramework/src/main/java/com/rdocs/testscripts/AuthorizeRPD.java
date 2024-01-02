package com.rdocs.testscripts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import com.rdocs.global.BrowserActions;
import com.rdocs.locators.AuthorizeRPDLocators;
import com.rdocs.locators.OutlookMailLocators;

public class AuthorizeRPD extends BrowserActions
{
	WebDriver driver;
	public AuthorizeRPD(WebDriver driver)
	{
		super(driver); 
		this.driver = driver; 
	}
	public void execution() throws Exception
	{
		Properties prop = propertiesCode();
		Thread.sleep(5000);
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs);
		Thread.sleep(4000);
		driver.switchTo().window(tabs.get(2));
		waitforelementtobeclick(AuthorizeRPDLocators.GetPasscode, Duration.ofSeconds(20));
		Thread.sleep(2000);
		enterText(AuthorizeRPDLocators.AuthorizeEmail, prop.getProperty("outlook_username"));
		Thread.sleep(2000);
		clickElement(AuthorizeRPDLocators.Ok);
		clickElement(AuthorizeRPDLocators.Ok1);
		Thread.sleep(4000);
		driver.switchTo().window(tabs.get(1));
		clickElement(OutlookMailLocators.Inbox);
		Thread.sleep(6000);
		clickElement(OutlookMailLocators.OpenPasscodeMail);
		Thread.sleep(2000);
		String s=getText(OutlookMailLocators.Passcode);
		driver.switchTo().window(tabs.get(2));
		enterText(AuthorizeRPDLocators.AuthorizePasscode, s);
		clickElement(AuthorizeRPDLocators.AuthorizeRPD);
		Thread.sleep(2000);
	}
}
