package com.rdocs.testscripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.AuthorizeRPDLocators;
import com.rdocs.locators.ManageTabLocators;
import com.rdocs.locators.OutlookMailLocators;

public class AlterL1ToL3 extends BrowserActions
{
	WebDriver driver;
	public AlterL1ToL3(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
	}
	
	public void execution() throws Exception
	{
	//	clickElement(ManageTabLocators.MANAGETAB);
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(3000);
		Properties prop = propertiesCode();
		Robot r = new Robot();
		driver.switchTo().window(tabs.get(0));	
		String s1="mail";
		String s2=driver.findElement(By.xpath("(//span[@class='material-icons top3 '])[1]")).getText();
		if(s1.equals(s2))
		{
			waitforelementtobeclick(ManageTabLocators.ExpandRPD, Duration.ofSeconds(10));
			clickElement(ManageTabLocators.ControlStatus);
			alterSecurity("Limit Readers");
			clickElement(ManageTabLocators.IdentifyLeakers);
			clickElement(ManageTabLocators.Voting);
			clickElement(ManageTabLocators.DisplayDistributionList);
			clickElement(ManageTabLocators.ShareVotes);
			clickElement(ManageTabLocators.Save);
			clickElement(ManageTabLocators.LetMePick);
			try 
			{
				for(int i=1;i<=10;i++) 
				{
					driver.findElement(By.xpath("//div[@class='SelctDiv']/div/div["+i+"]")).click();
				}	
			}
			catch (Exception e)
			{
				e.getStackTrace(); 
			}	
				Thread.sleep(2000);
				clickElement(ManageTabLocators.ForwardButton);
				clickElement(ManageTabLocators.Ok);	
				Thread.sleep(2000);
				clickElement(ManageTabLocators.Ok);		
		}
		
		else
		{
			waitforelementtobeclick(ManageTabLocators.ExpandRPD, Duration.ofSeconds(10));
			clickElement(ManageTabLocators.ControlStatus);
			alterSecurity("Limit Readers");
			clickElement(ManageTabLocators.IdentifyLeakers);
			clickElement(ManageTabLocators.Voting);
			clickElement(ManageTabLocators.DisplayDistributionList);
			clickElement(ManageTabLocators.ShareVotes);
			clickElement(ManageTabLocators.Save);
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
					if(y<5) 
					{
						clickElement(ManageTabLocators.AddReader);
						y++;
					}
				    workbook.close();
				    fis.close();
				}
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
			clickElement(ManageTabLocators.Save2);
			clickElement(ManageTabLocators.Ok);
		}
		driver.switchTo().window(tabs.get(2));
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.switchTo().window(tabs.get(3));
		waitforelementtobeclick(AuthorizeRPDLocators.GetPasscode, Duration.ofSeconds(20));
		Thread.sleep(2000);
		enterText(AuthorizeRPDLocators.AuthorizeEmail, prop.getProperty("outlook_username"));
		Thread.sleep(2000);
		clickElement(AuthorizeRPDLocators.Ok);
		clickElement(AuthorizeRPDLocators.Ok1);
		Thread.sleep(4000);
		driver.switchTo().window(tabs.get(1));
		clickElement(OutlookMailLocators.Inbox);
		Thread.sleep(6000);
		clickElement(OutlookMailLocators.OpenPasscodeMail);
		Thread.sleep(2000);
		String s=getText(OutlookMailLocators.Passcode);
		driver.switchTo().window(tabs.get(3));
		enterText(AuthorizeRPDLocators.AuthorizePasscode, s);
		clickElement(AuthorizeRPDLocators.AuthorizeRPD);
	}
}
