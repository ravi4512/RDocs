package com.rdocs.testscripts;

import org.openqa.selenium.WebDriver;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.ManageTabLocators;

public class KillRPD extends BrowserActions
{

	WebDriver driver;
	
	public KillRPD(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;		
	}
	
	public void execution()
	{
		clickElement(ManageTabLocators.MANAGETAB); 		//Click on Manage tab
		clickElement(ManageTabLocators.CheckBox);		//To Kill single RPD
		
		clickElement(ManageTabLocators.KillRPD);
		clickElement(ManageTabLocators.Confirm);
	}
}
