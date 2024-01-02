package com.rdocs.testscripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.OutlookMailLocators;

public class OpenL1RPD extends BrowserActions
{
	WebDriver driver;
	public OpenL1RPD(WebDriver driver) 
	{
		super(driver); 
		this.driver = driver;
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
	getURL(prop.getProperty("outlook_url"));
	enterText(OutlookMailLocators.Outlook_Username, prop.getProperty("outlook_username"));
	clickElement(OutlookMailLocators.Next);
	Thread.sleep(2000);
	enterText(OutlookMailLocators.Outlook_Password, prop.getProperty("outlook_password"));
	Thread.sleep(3000);
	clickElement(OutlookMailLocators.Signin);
	waitforelementtobeclick(OutlookMailLocators.Yes, Duration.ofSeconds(10));
	Thread.sleep(3000);
    enterText(OutlookMailLocators.SearchBox, TrackViews.MSG);
	Thread.sleep(2000);
	clickElement(OutlookMailLocators.Enter);
	waitforelementtobeclick(OutlookMailLocators.receivedMail, Duration.ofSeconds(20));
	clickElement(OutlookMailLocators.DownloadRPD);
	Thread.sleep(5000);		
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_J);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_J);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
