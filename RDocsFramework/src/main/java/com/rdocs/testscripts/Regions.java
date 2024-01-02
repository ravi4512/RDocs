package com.rdocs.testscripts;

import org.openqa.selenium.WebDriver;
import com.rdocs.global.BrowserActions;
import com.rdocs.locators.CreateTabLocators;
import com.rdocs.locators.RegionsLocators;

public class Regions extends BrowserActions
{

	WebDriver driver;
	public Regions(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void execution() throws Exception
	{
		Thread.sleep(3000);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,1500);"); 
		Thread.sleep(3000);
		clickElement(RegionsLocators.NorthAmerica);
		clickElement(RegionsLocators.SouthAmerica);
		clickElement(RegionsLocators.Europe);
		clickElement(RegionsLocators.Africa);
		clickElement(RegionsLocators.Asia);
		clickElement(RegionsLocators.Oceania);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,-2000);"); 
		Thread.sleep(3000);
		clickElement(CreateTabLocators.createButton);
	}
	
}
