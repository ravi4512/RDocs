package com.rdocs.testscripts;

import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.ManageTabLocators;

public class AddAuthorizedReaders extends BrowserActions
{
	WebDriver driver;
	public AddAuthorizedReaders(WebDriver driver)
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
		clickElement(ManageTabLocators.AddAuthorizedReaders);   // To click on Track interactivity button
		FileInputStream fis = new FileInputStream("C:\\Users\\rpl02\\OneDrive\\Documents\\RecipientEmails in TrackInteractivity.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int x=1,y=0;
		try
		{	
			for (Row row : sheet)
			{
				Cell cell = row.getCell(0); 
			    String cellValue = cell.getStringCellValue();
				driver.findElement(By.xpath("(//input[@name='email'])["+x+"]")).sendKeys(cellValue);
				x++;
				if(y<210) 
				{
					clickElement(ManageTabLocators.AddReader);
					y++;
				}
			    workbook.close();
			    fis.close();
			}
			
			clickElement(ManageTabLocators.Save);
			WebElement msg1 = driver.findElement(By.xpath("//p[@class='mb-0 dangertext']"));
			System.out.println(msg1.getText());
		
		    File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(f1, new File("C:\\Users\\rpl02\\OneDrive\\Pictures\\more than 99 authorized readers "+RandomNum+".png"));	
			clickElement(ManageTabLocators.Ok);	
		}
			
		
		catch (Exception e)
		{
			e.getStackTrace();
		}
			
	}
	}
}
