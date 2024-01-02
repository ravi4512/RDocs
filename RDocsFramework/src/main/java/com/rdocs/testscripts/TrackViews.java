package com.rdocs.testscripts;

import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.ContentProtectionLocators;
import com.rdocs.locators.RealTimeInteractivityLocators;
import com.rdocs.locators.SendRPDLocators;

public class TrackViews extends BrowserActions
{
	WebDriver driver;
	public TrackViews(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
	}	
	
	static Random r1=new Random();
	static int RandomNum=r1.nextInt(1000);
	static String MSG="Send L1 "+ RandomNum;
	@Test 
	public void execution() throws Exception
	{
		Properties prop = propertiesCode();
		enterText(SendRPDLocators.RecipientEmail, prop.getProperty("recipient_email"));
		enterText(SendRPDLocators.Subject, MSG);
		enterText(SendRPDLocators.Message, "Test");
		Thread.sleep(2000);
		uploadFile();
		getJavaScriptExecutor().executeScript("window.scrollBy(0,400);");
		Thread.sleep(3000);
		enterText(RealTimeInteractivityLocators.SIDENOTE,"Test");
		clickElement(RealTimeInteractivityLocators.PROOFOFSENDING);
		Thread.sleep(2000);
		
		/***************  Content Protection  ***********/
		
		//enterText(ContentProtectionLocators.Launches,"26-09-2023");
		//enterText(ContentProtectionLocators.Expires,"30-09-2023");
		watermark("1");
		enterText(ContentProtectionLocators.MaxReadsPerDocument,"21");
		getJavaScriptExecutor().executeScript("window.scrollBy(0,1000);");
		Thread.sleep(3000);
		clickElement(ContentProtectionLocators.Timestamp);
		clickElement(ContentProtectionLocators.CanPrint);
		Thread.sleep(3000);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,-1500);");
		Thread.sleep(3000);
		clickElement(SendRPDLocators.SendButton);
	}
}