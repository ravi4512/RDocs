package com.rdocs.testscripts;

import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.ContentProtectionLocators;
import com.rdocs.locators.RealTimeInteractivityLocators;
import com.rdocs.locators.SendRPDLocators;

public class LimitReaders extends BrowserActions
{
	WebDriver driver;
	public LimitReaders(WebDriver driver) 
	{
		super(driver); 
		this.driver = driver;
	}
	 
	static Random r1=new Random();
	static int RandomNum=r1.nextInt(1000);
	static String MSG="Send L3 "+ RandomNum;
	
	public void execution() throws Exception
	{
		Properties prop = propertiesCode();
		enterText(SendRPDLocators.RecipientEmail, prop.getProperty("recipient_email"));
		enterText(SendRPDLocators.Subject, MSG);
		enterText(SendRPDLocators.Message, "Test");
		Thread.sleep(2000);
		uploadFile();
		Thread.sleep(2000);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,400);");
		Thread.sleep(3000);
		clickElement(SendRPDLocators.LimitReaders);	
		enterText(RealTimeInteractivityLocators.SIDENOTE,"Test");
		Thread.sleep(1000);
		clickElement(RealTimeInteractivityLocators.DISTRIBUTIONLIST);
		Thread.sleep(1000);
		clickElement(RealTimeInteractivityLocators.NOTIFICATIONOFREADING);
		clickElement(RealTimeInteractivityLocators.PROOFOFSENDING);
		Thread.sleep(1000);
		clickElement(RealTimeInteractivityLocators .VOTING);
		Thread.sleep(1000);
		clickElement(RealTimeInteractivityLocators.SHAREVOTES);
		Thread.sleep(2000);
		/***************  Content Protection  ***********/
		
		//enterText(ContentProtectionLocators.Launches,"26-09-2023");
		//enterText(ContentProtectionLocators.Expires,"30-09-2023");
		//enterText(ContentProtectionLocators.RestrictToDomains,"Yahoo");
		watermark("1");
		enterText(ContentProtectionLocators.MaxReadsPerReader,"10");
		enterText(ContentProtectionLocators.MaxReadsPerDocument,"50");
		getJavaScriptExecutor().executeScript("window.scrollBy(0,1000);");
		Thread.sleep(3000);
		clickElement(ContentProtectionLocators.IdentifyLeakers);
		clickElement(ContentProtectionLocators.Timestamp);
		clickElement(ContentProtectionLocators.CanPrint);
		Thread.sleep(3000);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,-1500);");
		Thread.sleep(3000);
		clickElement(SendRPDLocators.SendButton);
		Thread.sleep(3000);
	}

}
