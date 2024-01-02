package com.rdocs.testscripts;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.SendRPDLocators;

public class MaxReaders extends BrowserActions

{
	WebDriver driver;
	public MaxReaders(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;	
	}
	
	public void execution() throws Exception
	{
			uploadFile();
			moreThan99Readers();
			enterText(SendRPDLocators.Subject, "99 readers");
			Thread.sleep(3000);
			getJavaScriptExecutor().executeScript("window.scrollBy(0,700);");
			Thread.sleep(3000);
			clickElement(SendRPDLocators.TrackReaders);
			getJavaScriptExecutor().executeScript("window.scrollBy(0,-2000);");
			Thread.sleep(3000);
			clickElement(SendRPDLocators.SendButton);
			
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alertDanger")));
		
	        File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\morethan99readers "+RandomNum+".png"));
		
	}
}