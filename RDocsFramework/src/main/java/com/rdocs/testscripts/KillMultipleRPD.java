package com.rdocs.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.ManageTabLocators;

public class KillMultipleRPD extends BrowserActions
{

WebDriver driver;
	
	public KillMultipleRPD(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;		
	}
	
	public void execution() throws Exception
	{
		clickElement(ManageTabLocators.MANAGETAB); 		//Click on Manage tab
		
		//To Kill multiple RPDs
		for(int i=1;i<=3;i++)
		{
		driver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div[1]/table/tbody/tr["+i+"]/td/table/tr[1]/td[1]/div/label/span")).click();
		}
		clickElement(ManageTabLocators.KillRPD);
		Thread.sleep(2000);
		clickElement(ManageTabLocators.Confirm);
	}
}
