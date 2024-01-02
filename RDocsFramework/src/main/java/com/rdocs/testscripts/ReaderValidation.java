package com.rdocs.testscripts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.ManageTabLocators;

public class ReaderValidation extends BrowserActions
{
	WebDriver driver;
	public ReaderValidation(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void execution() throws Exception
	{
		clickElement(ManageTabLocators.MANAGETAB);
		Thread.sleep(3000);
		String s= driver.findElement(By.xpath("//input[@title='Limit Readers']")).getAccessibleName();
		System.out.println(s);
		Thread.sleep(2000);
		if(s!="Track Views")
		{
		clickElement(ManageTabLocators.LIMITREADERS);
		
		getJavaScriptExecutor().executeScript("window.scrollBy(0,700);");
		Thread.sleep(3000);
		String address=getText(ManageTabLocators.Address);
		System.out.println(address);
		clickElement(ManageTabLocators.AddAuthorizedReaders); 
		//clickElement(ManageTabLocators.AddReader);
		String recipient_mail="raviteja.ga@outlook.com";
		enterText(ManageTabLocators.Email, recipient_mail);
		
		if(address.equals(recipient_mail))
		{
			clickElement(ManageTabLocators.Save);
			WebElement w=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
			System.out.println(w.getText());
		    File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\screenshot "+RandomNum+".png"));
		}	
		else
		{
		clickElement(ManageTabLocators.Save);
		clickElement(ManageTabLocators.Ok);
		}
		
		}
	
}
}