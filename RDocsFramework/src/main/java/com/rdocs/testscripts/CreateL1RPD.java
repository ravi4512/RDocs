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

public class CreateL1RPD extends BrowserActions
{
	WebDriver driver;
	public CreateL1RPD(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
	}

	public void execution() throws Exception
	{
		Robot r=new Robot();
		clickElement(CreateTabLocators.createTab);
		uploadFile();
		getJavaScriptExecutor().executeScript("window.scrollBy(0,400);");
		Thread.sleep(3000);
		enterText(RealTimeInteractivityLocators.SIDENOTE,"Test");
		getJavaScriptExecutor().executeScript("window.scrollBy(0,900);");
		Thread.sleep(3000);
		watermark("1");	
		enterText(ContentProtectionLocators.MaxReadsPerDocument,"50");
		clickElement(ContentProtectionLocators.Timestamp);
		clickElement(ContentProtectionLocators.CanPrint);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,-1500);");
		Thread.sleep(3000);
		clickElement(CreateTabLocators.createButton);
		Thread.sleep(6000);
//		WebDriverWait a=new WebDriverWait(driver,Duration.ofSeconds(20));
//		a.until(ExpectedConditions.elementToBeClickable(CreateTabLocators.Close));
//		waitforelementtobeclick(CreateTabLocators.Close,Duration.ofSeconds(15));
		clickElement(CreateTabLocators.Close);
		Thread.sleep(7000);		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_J);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}