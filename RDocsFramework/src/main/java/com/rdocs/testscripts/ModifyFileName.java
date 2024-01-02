package com.rdocs.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.SendRPDLocators;

public class ModifyFileName extends BrowserActions
{    

	WebDriver driver;
	public ModifyFileName(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public void execution() throws Exception
	{
		//Drag files
		multipleFiles();
		Thread.sleep(3000);
		WebElement File1 = driver.findElement(By.xpath("(//span[@class='ms-1 font-14 font-w400 filename-text'])[1]"));
		WebElement File2 = driver.findElement(By.xpath("(//span[@class='ms-1 font-14 font-w400 filename-text'])[2]"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(File1, File2).build().perform();
		
		//Rename File
		clickElement(SendRPDLocators.Rename);
		enterText(SendRPDLocators.TextBox, "2");
		Thread.sleep(2000);
		clickElement(SendRPDLocators.Save);

		//Select Mul RDocs as NO
		clickElement(SendRPDLocators.SendMulRDocsNo);
		enterText(SendRPDLocators.PreferredDocName, "Mul files");
	
		clickElement(SendRPDLocators.Delete);
		
		clickElement(SendRPDLocators.ViewerLanguage);
		Thread.sleep(3000);
//		clickElement(SendRPDLocators.ViewerBrowserLanguage);
		
		
		Select st=new Select(driver.findElement(SendRPDLocators.LanguageDropdown));
		st.selectByVisibleText("Spanish");
		

		getJavaScriptExecutor().executeScript("window.scrollBy(0,400);"); 
		Thread.sleep(3000);
		String a= driver.findElement(SendRPDLocators.TrackReadersText).getText();
		if(a.equals("All Track Views features+"))
			System.out.println(" Track Readers Text matched");
		else
			System.err.println("Text Not matched");
		
		String b=driver.findElement(SendRPDLocators.LimitReadersText).getText();
		if(b.equals("All Track Readers features+"))
			System.out.println("Limit Readers Text matched");
		else
			System.err.println("Text Not matched");
		
		
		getJavaScriptExecutor().executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);
		clickElement(SendRPDLocators.ByIp);
		enterText(SendRPDLocators.IpAddress, "79.23.4");
		}
}
