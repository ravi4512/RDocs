package com.rdocs.testscripts;

import java.io.File;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.ContentProtectionLocators;
import com.rdocs.locators.CreateTabLocators;
import com.rdocs.locators.RDocsLoginLocators;
import com.rdocs.locators.RealTimeInteractivityLocators;
import com.rdocs.locators.RegionsLocators;
import com.rdocs.locators.SendRPDLocators;

public class Validations extends BrowserActions
{

	WebDriver driver;
	public Validations(WebDriver driver)
	{
		super(driver);
		this.driver = driver;	
	}
	
	public void execution() throws Exception
	{
		Properties prop = propertiesCode();
		getURL(prop.getProperty("url"));	

		//Fields are required
		clickElement(RDocsLoginLocators.Login);
		WebElement msg1 = driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		System.out.println(msg1.getText());
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\Fields required "+RandomNum+".png"));
		Thread.sleep(3000);

		
		//email and password are not valid
		enterText(RDocsLoginLocators.Username, prop.getProperty("invalid_username"));
		enterText(RDocsLoginLocators.Password, prop.getProperty("invalid_password"));
		Thread.sleep(3000);
		clickElement(RDocsLoginLocators.Login);
		WebElement msg2 = driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(msg2));		
		System.out.println(msg2.getText());
		File f2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f2, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\ valid email and password "+RandomNum+".png"));
		Thread.sleep(3000);
	

		//Valid login credentials
		driver.findElement(RDocsLoginLocators.Username).clear();
		enterText(RDocsLoginLocators.Username, prop.getProperty("username"));
		driver.findElement(RDocsLoginLocators.Password).clear();
		enterText(RDocsLoginLocators.Password, prop.getProperty("password"));
		clickElement(RDocsLoginLocators.Login);
		
		
		//File is required
		clickElement(SendRPDLocators.SendButton);
		WebElement msg3=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
        File f3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f3, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\Filerequired "+RandomNum+".png"));
		System.out.println(msg3.getText());
		Thread.sleep(3000);
		
			
		//To is required
		uploadFile();
		clickElement(SendRPDLocators.SendButton);
		WebElement msg4=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
        File f4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f4, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\To required "+RandomNum+".png"));
		System.out.println(msg4.getText());
		Thread.sleep(5000);
		
		
		//Subject is Required
		enterText(SendRPDLocators.RecipientEmail, prop.getProperty("recipient_email"));
		clickElement(SendRPDLocators.SendButton);
		WebElement msg5=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f5, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\Subject requied "+RandomNum+".png"));
		System.out.println(msg5.getText());
		Thread.sleep(3000);
		
		// Subject more than 100
		enterText(SendRPDLocators.Subject, prop.getProperty("subject"));
		clickElement(SendRPDLocators.SendButton);
		WebElement msg6=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f6, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\Subject more than 100 characters "+RandomNum+".png"));
		System.out.println(msg6.getText());
		driver.findElement(SendRPDLocators.Subject).clear();
		enterText(SendRPDLocators.Subject,"test");
		Thread.sleep(3000);
		
		//Message More than 1024 characters
		enterText(SendRPDLocators.Message, prop.getProperty("message"));
		clickElement(SendRPDLocators.SendButton);
		WebElement msg7=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f7, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\Email body "+RandomNum+".png"));
		System.out.println(msg7.getText());
		driver.findElement(SendRPDLocators.Message).clear();
		enterText(SendRPDLocators.Message, " ");
		Thread.sleep(3000);
		
		//SideNote
		getJavaScriptExecutor().executeScript("window.scrollBy(0,300);");
		Thread.sleep(2000);
		enterText(RealTimeInteractivityLocators.SIDENOTE, prop.getProperty("sidenote"));
		Thread.sleep(2000);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,-1000);");
		Thread.sleep(2000);
		clickElement(SendRPDLocators.SendButton);
		WebElement msg8=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f8 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f8, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\SideNote "+RandomNum+".png"));
		System.out.println(msg8.getText());
		driver.findElement(RealTimeInteractivityLocators.SIDENOTE).clear();
		enterText(RealTimeInteractivityLocators.SIDENOTE, " ");
		Thread.sleep(3000);
			
		//Restrict domains
		clickElement(SendRPDLocators.TrackReaders);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		enterText(ContentProtectionLocators.RestrictToDomains, prop.getProperty("domains"));
		getJavaScriptExecutor().executeScript("window.scrollBy(0,-2000);");
		Thread.sleep(2000);
		clickElement(SendRPDLocators.SendButton);
		WebElement msg9=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f9 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f9, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\SideNote "+RandomNum+".png"));
		System.out.println(msg9.getText());
		getJavaScriptExecutor().executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		driver.findElement(ContentProtectionLocators.RestrictToDomains).clear();
		enterText(ContentProtectionLocators.RestrictToDomains, " ");
		getJavaScriptExecutor().executeScript("window.scrollBy(0,-2000);");
		Thread.sleep(3000);
		
		//More than 20MB file size
		clickElement(SendRPDLocators.DeleteAll);
		Thread.sleep(2000);
		moreThan20MbFile();
		clickElement(SendRPDLocators.SendButton);
		WebElement msg10=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f10, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\More than 20MB file "+RandomNum+".png"));
		System.out.println(msg10.getText());
		Thread.sleep(3000);
				
		//unsupported file 
		clickElement(SendRPDLocators.DeleteAll);
		Thread.sleep(2000);
		unsupportedFile();
		WebElement msg11=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f11, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\Unsupported file "+RandomNum+".png"));
		System.out.println(msg11.getText());
		Thread.sleep(5000);
			
		//More than 100 pages
		moreThan100Pages();
		clickElement(SendRPDLocators.SendButton);
		WebElement msg12=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f12, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\More than 100 pages "+RandomNum+".png"));
		System.out.println(msg12.getText());
		Thread.sleep(3000);

		
		//Duplicate Emails
		clickElement(SendRPDLocators.DeleteAll);
		Thread.sleep(2000);
		//importFile();
		WebElement a1=driver.findElement(By.id("imgFile"));
		a1.sendKeys("C:\\Users\\rpl02\\OneDrive\\Documents\\Test\\dummy.pdf");
		enterText(SendRPDLocators.RecipientEmail, prop.getProperty("duplicate_email"));
		clickElement(SendRPDLocators.Subject);
		WebElement msg13=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f13 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f13, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\Duplicate Emails "+RandomNum+".png"));
		System.out.println(msg13.getText());
		Thread.sleep(5000);

		
		//Duplicate Files
		uploadFile();
		WebElement msg14=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f14 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f14, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\Duplicate Files "+RandomNum+".png"));
		System.out.println(msg14.getText());
		Thread.sleep(3000);
			
		
		//email address more than 255 characters
		enterText(SendRPDLocators.RecipientEmail, prop.getProperty("email"));
		enterText(SendRPDLocators.Subject, "Test");
		Thread.sleep(2000);
		clickElement(SendRPDLocators.SendButton);
		WebElement msg15=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f15 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f15, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\email address more 255 characters "+RandomNum+".png"));
		System.out.println(msg15.getText());
		clickElement(SendRPDLocators.Clear);
		Thread.sleep(5000);  
		
		
		//Description more than  100 characters
		clickElement(CreateTabLocators.createTab);
		//importFile();
		WebElement a2=driver.findElement(By.id("imgFile"));
		a2.sendKeys("C:\\Users\\rpl02\\OneDrive\\Documents\\Test\\sample-clouds-400x300.jpg");
		enterText(CreateTabLocators.Description, prop.getProperty("description"));
		Thread.sleep(3000);
		clickElement(CreateTabLocators.createButton);
		WebElement msg16=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f16 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f16, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\Description more than 100 char "+RandomNum+".png"));
		System.out.println(msg16.getText());
		Thread.sleep(3000);
	
		
		//More than 25MB file
		clickElement(SendRPDLocators.DeleteAll);
		driver.findElement(CreateTabLocators.Description).clear();
		enterText(CreateTabLocators.Description, " ");
		moreThan25MbFile();
		clickElement(CreateTabLocators.createButton);
		WebElement msg17=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f17 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f17, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\More than 25MB file "+RandomNum+".png"));
		System.out.println(msg17.getText());
		Thread.sleep(3000);
		
		
		//Authorized readers required
		clickElement(SendRPDLocators.DeleteAll);
		uploadFile();
		clickElement(SendRPDLocators.LimitReaders);
		clickElement(CreateTabLocators.createButton);
		WebElement msg18=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f18 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f18, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\Authorized readers required "+RandomNum+".png"));
		System.out.println(msg18.getText());
		Thread.sleep(3000);

		//Regions
		enterText(CreateTabLocators.AuthorizedReaders, prop.getProperty("recipient_email"));
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
		WebElement msg19=driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
		File f19 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f19, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\Regions "+RandomNum+".png"));
		System.out.println(msg19.getText());
		
		}
	

}
