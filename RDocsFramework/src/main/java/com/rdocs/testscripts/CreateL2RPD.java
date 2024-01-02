package com.rdocs.testscripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.ContentProtectionLocators;
import com.rdocs.locators.CreateTabLocators;
import com.rdocs.locators.RealTimeInteractivityLocators;
import com.rdocs.locators.SendRPDLocators;

public class CreateL2RPD extends BrowserActions
{
	
	WebDriver driver;
	public CreateL2RPD(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public void execution() throws Exception
	{
		Robot r=new Robot();
		clickElement(CreateTabLocators.createTab);
		uploadFile();
		clickElement(SendRPDLocators.TrackReaders);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		enterText(RealTimeInteractivityLocators.SIDENOTE, "test");
		clickElement(RealTimeInteractivityLocators.DISTRIBUTIONLIST);
		clickElement(RealTimeInteractivityLocators.NOTIFICATIONOFREADING);
		clickElement(RealTimeInteractivityLocators .VOTING);
		clickElement(RealTimeInteractivityLocators.SHAREVOTES);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
	  //enterText(ContentProtectionLocators.RestrictToDomains,"Yahoo");
		watermark("1");	
		enterText(ContentProtectionLocators.MaxReadsPerReader,"10");
		enterText(ContentProtectionLocators.MaxReadsPerDocument,"30");
		clickElement(ContentProtectionLocators.Timestamp);
		clickElement(ContentProtectionLocators.CanPrint);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,-1500);");
		Thread.sleep(3000);
		clickElement(CreateTabLocators.createButton);
	//	waitforelementtobeclick(CreateTabLocators.Close,Duration.ofSeconds(15));
		clickElement(CreateTabLocators.Close);
		Thread.sleep(7000);		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_J);
		Thread.sleep(2000);
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
