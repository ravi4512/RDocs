package com.rdocs.testscripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.AuthorizeRPDLocators;
import com.rdocs.locators.OutlookMailLocators;

public class CopyPasscode extends BrowserActions
{
	WebDriver driver;
	public CopyPasscode(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public void execution() throws Exception
	{
		Properties prop = propertiesCode();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(3000);
	    driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		getURL(prop.getProperty("outlook_url"));
		enterText(OutlookMailLocators.Outlook_Username, prop.getProperty("outlook_username"));
		clickElement(OutlookMailLocators.Next);
		Thread.sleep(2000);
		enterText(OutlookMailLocators.Outlook_Password, prop.getProperty("outlook_password"));
		Thread.sleep(3000);
		clickElement(OutlookMailLocators.Signin);
		Thread.sleep(2000);
		clickElement(OutlookMailLocators.Yes);
		Thread.sleep(3000);
		clickElement(OutlookMailLocators.OpenPasscodeMail);
		String s=getText(OutlookMailLocators.Passcode1);
		driver.switchTo().window(tabs.get(1));
		enterText(AuthorizeRPDLocators.AuthorizePasscode, s);
		clickElement(AuthorizeRPDLocators.AuthorizeRPD);
	}
}
