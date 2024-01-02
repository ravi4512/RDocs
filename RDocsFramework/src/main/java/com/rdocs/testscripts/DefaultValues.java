package com.rdocs.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.rdocs.global.BrowserActions;
import com.rdocs.locators.CreateTabLocators;
import com.rdocs.locators.SendRPDLocators;

public class DefaultValues extends BrowserActions
{
	WebDriver driver;
	public DefaultValues(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}

	public void execution() throws Exception
	{
		Thread.sleep(3000);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,500);");
		Thread.sleep(3000); 
	    WebElement check=driver.findElement(By.xpath("//*[@id='emailVerify']"));
	   
	    System.out.println("For Level-1");
		System.out.println("------------");
		
	    String value=check.getAttribute("value");
	    if(value.equalsIgnoreCase("true")) 
	    {
		 System.out.println("ProofOfSending is Enabled");
		 System.out.println("EmailVerification Code is Enabled");
		 System.out.println("Distribution list is Enabled");
		 System.out.println("Notification Of Reading is Enabled");
		 System.out.println("Voting is Enabled");
	    }
	    else
	    {
		 System.out.println("ProofOfSending is Enabled");
		 System.out.println("EmailVerification Code is Disabled");
		 System.out.println("checkDisplay distribution list is Disabled");
		 System.out.println("Notification Of Reading is Disabled");
		 System.out.println("Voting is Disabled");
		 System.out.println("Share Votes is Disbaled");
	}
	     Thread.sleep(2000);
	     clickElement(SendRPDLocators.TrackReaders);
	     
	     WebElement checkL2=driver.findElement(By.xpath("//*[@id='emailVerify']"));
	     
		String valueL2=checkL2.getAttribute("value");
		
		System.out.println("For Level-2");
		System.out.println("------------");
		
	   if(valueL2.equalsIgnoreCase("true"))
	   {
		 System.out.println("ProofOfSending is Enabled");
		 System.out.println("EmailVerification Code is Enabled");
		 System.out.println("checkDisplay distribution list is Enabled");
		 System.out.println("Notification Of Reading is Enabled");
		 System.out.println("Voting is Enabled");
	  
	}
	   else 
	    {
		 System.out.println("ProofOfSending is Enabled");
		 System.out.println("EmailVerification Code is Disabled");
		 System.out.println("checkDisplay distribution list is Disabled");
		 System.out.println("Notification Of Reading is Disabled");
		 System.out.println("Voting is Disabled");
		 System.out.println("Share Votes is Disbaled");
	    }
		
	    Thread.sleep(2000);
	    clickElement(CreateTabLocators.createTab);
	    Thread.sleep(2000);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
	    System.out.println("In Create Tab For Level-1");
	    System.out.println("--------------------------");
	    WebElement checkCreate=driver.findElement(By.xpath("//*[@id='emailVerify']"));
	  
		String valueCreate=checkCreate.getAttribute("value");
		
	    if(valueCreate.equalsIgnoreCase("true"))
	    {
		 System.out.println("ProofOfSending is Disabled");
		 System.out.println("EmailVerification Code is Disabled");
		 System.out.println("checkDisplay distribution list is Enabled");
		 System.out.println("Notification Of Reading is Enabled");
		 System.out.println("Voting is Enabled"); 
	    }
	     else 
	     {
		 System.out.println("ProofOfSending is Disabled");
		 System.out.println("EmailVerification Code is Disabled");
		 System.out.println("checkDisplay distribution list is Disabled");
		 System.out.println("Notification Of Reading is Disabled");
		 System.out.println("Voting is Disabled");
		 System.out.println("Share Votes is Disbaled");
	     }	
	}
}
