package com.rdocs.testscripts;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.ReadersPageLocators;

public class ReadersPage extends BrowserActions
{
	WebDriver driver;
	public ReadersPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public void execution() throws Exception
	{
		Thread.sleep(9000);
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		System.out.println(tabs);
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(ReadersPageLocators.DROPDOWN));
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", driver.findElement(ReadersPageLocators.FITPAGE));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", driver.findElement(ReadersPageLocators.DROPDOWN));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", driver.findElement(ReadersPageLocators.ZOOM150));
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", driver.findElement(ReadersPageLocators.SideNote));
		WebElement b=driver.findElement(ReadersPageLocators.SideNote);
		System.out.println(b.getText());
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", driver.findElement(ReadersPageLocators.DistributionListReaders));
		WebElement a=driver.findElement(ReadersPageLocators.DistributionListReaders);
		System.out.println(a.getText());
		js.executeScript("arguments[0].click();", driver.findElement(ReadersPageLocators.Vote));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", driver.findElement(ReadersPageLocators.Like));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", driver.findElement(ReadersPageLocators.ReplyToDocument));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", driver.findElement(ReadersPageLocators.Message));
		enterText(ReadersPageLocators.Message, "Read");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", driver.findElement(ReadersPageLocators.Subject));
		enterText(ReadersPageLocators.Subject, "Read the doc");
		js.executeScript("arguments[0].click();", driver.findElement(ReadersPageLocators.Send));
	}

}
