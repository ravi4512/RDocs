package com.rdocs.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.SendRPDLocators;

public class BulkUpload extends BrowserActions
{
	WebDriver driver;
	public BulkUpload(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
	}

	public void execution() throws Exception
	{
		Thread.sleep(3000);
		clickElement(SendRPDLocators.BulkUpload);
		Thread.sleep(3000);
		WebElement a1=driver.findElement(By.xpath("(//input[@type='file'])[2]"));
		a1.sendKeys("C:\\Users\\rpl02\\OneDrive\\Documents\\BulkUpload.csv");
		Thread.sleep(2000);
		clickElement(SendRPDLocators.Upload);
	}
}
