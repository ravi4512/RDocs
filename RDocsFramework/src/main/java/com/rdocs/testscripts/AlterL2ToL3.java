package com.rdocs.testscripts;

import java.awt.Robot;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.ManageTabLocators;
import com.rdocs.locators.SendRPDLocators;

public class AlterL2ToL3 extends BrowserActions
{
	WebDriver driver;
	public AlterL2ToL3(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
	}
	public void execution() throws Exception
	{

		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(0));
		clickElement(ManageTabLocators.MANAGETAB);
		String s1="file_download";
		String s2=driver.findElement(By.xpath("(//span[@class='material-icons top3 '])[1]")).getText();
		String s3="Let me pick";
		if(s1.equals(s2))
		{
			waitforelementtobeclick(ManageTabLocators.ExpandRPD, Duration.ofSeconds(10));
			clickElement(ManageTabLocators.ControlStatus);
			alterSecurity("Limit Readers");
			clickElement(ManageTabLocators.Save);
			try 
			{
				String s4=driver.findElement(By.xpath("//button[@title='Let me pick']")).getText();
				if(s3.equals(s4))
				{
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
						Thread.sleep(2000);
						clickElement(ManageTabLocators.ForwardButton);
						clickElement(ManageTabLocators.Ok);	
					}		
						Thread.sleep(2000);
						clickElement(ManageTabLocators.Ok);
				}
			}
			catch (Exception e)
			{
			/*	FileInputStream fis = new FileInputStream("C:\\Users\\rpl02\\OneDrive\\Documents\\RecipientEmails in TrackInteractivity.xlsx");
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
						if(y<4) 
						{
							clickElement(ManageTabLocators.AddReader);
							y++;
						}
					    workbook.close();
					    fis.close();
					}
				}
				catch(Exception e1)
				{
					clickElement(ManageTabLocators.Save2);
					clickElement(ManageTabLocators.Ok);
				}		*/
				
				Thread.sleep(3000);
				clickElement(SendRPDLocators.BulkUpload);
				Thread.sleep(3000);
				WebElement a1=driver.findElement(By.xpath("(//input[@type='file'])	"));
				a1.sendKeys("C:\\Users\\rpl02\\OneDrive\\Documents\\BulkUpload.csv");
				Thread.sleep(2000);
				clickElement(SendRPDLocators.Upload);
			}
			}
			else
			{
			waitforelementtobeclick(ManageTabLocators.ExpandRPD, Duration.ofSeconds(10));
			clickElement(ManageTabLocators.ControlStatus);
			alterSecurity("Limit Readers");
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
				Thread.sleep(2000);
				clickElement(ManageTabLocators.ForwardButton);
				clickElement(ManageTabLocators.Ok);	
			}		
				Thread.sleep(2000);
				clickElement(ManageTabLocators.Ok);		
			}			
	}
}
