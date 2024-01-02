package com.rdocs.testscripts;

import org.openqa.selenium.WebDriver;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.ManageTabLocators;

public class VersionHistory extends BrowserActions
{
	WebDriver driver;
	public VersionHistory(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
	}
	
	public void execution() throws Exception 
	{	
		clickElement(ManageTabLocators.MANAGETAB);
		clickElement(ManageTabLocators.ExpandRPD);
		clickElement(ManageTabLocators.HistoryIcon);
		clickElement(ManageTabLocators.V2);
		String a=getText(ManageTabLocators.AccessControl);
		System.out.println("Access Control: " +a);
		String b=getText(ManageTabLocators.Status);
		System.out.println("Status: " +b);
		Thread.sleep(2000);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		clickElement(ManageTabLocators.V1);
	}
}
