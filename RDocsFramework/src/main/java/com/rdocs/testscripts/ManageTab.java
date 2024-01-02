package com.rdocs.testscripts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.rdocs.global.BrowserActions;
import com.rdocs.locators.ManageTabLocators;

public class ManageTab extends BrowserActions
{
	 public static By ADDRESS;
	 public static By FIRSTREAD;
	 public static By READS;
	 public static By TOTALMINUTES;
	 public static By VOTE;
	 public static  By ACTIVEBANNED;
	
	WebDriver driver;
	public ManageTab(WebDriver driver)
	{ 
		super(driver);
		this.driver = driver;
	}	

	 LocalDateTime now = LocalDateTime.now();
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	 String timestamp = now.format(formatter);
		
	
	public void execution() throws Exception
	{
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(0));
	  //clickElement(ManageTabLocators.MANAGETAB); //Click on Manage tab
		Thread.sleep(3000);
		clickElement(ManageTabLocators.RefreshManageTab);		//Refresh Manage Tab
		Thread.sleep(3000);
		String s= driver.findElement(By.xpath("//input[@title='Limit Readers']")).getAccessibleName();
	//	String s=driver.findElement(By.xpath("//input[@title='Track Readers']")).getAccessibleName();
		Thread.sleep(2000);
		if(s!="Track Views")
		{
		clickElement(ManageTabLocators.LIMITREADERS);		//To expand level-3 RPD properties
	//	clickElement(ManageTabLocators.TRACKREADERS);		//To expand level-2 RPD properties
		Thread.sleep(2000);
	//	clickElement(ManageTabLocators.RefreshIndividualRPD);		//Refresh Individual RPD
		Thread.sleep(3000);
		String DocId=getText(ManageTabLocators.DocId);
		System.out.println(DocId);
		getJavaScriptExecutor().executeScript("window.scrollBy(0,600);"); 
		Thread.sleep(2000);
		try 
		{
			for(int i=1;i<10;i++) 
			{
				ADDRESS = By.xpath("(//*[@class='inertable box-shadow-light bg-white'])[1]/tbody/tr["+i+"]/td ");
				FIRSTREAD = By.xpath("(//*[@class='inertable box-shadow-light bg-white'])[1]/tbody/tr["+i+"]/td[2]");
				READS  = By.xpath("(//*[@class='inertable box-shadow-light bg-white'])[1]/tbody/tr["+i+"]/td[3]");
				TOTALMINUTES = By.xpath("(//*[@class='inertable box-shadow-light bg-white'])[1]/tbody/tr["+i+"]/td[4]");
				VOTE = By.xpath("(//*[@class='inertable box-shadow-light bg-white'])[1]/tbody/tr["+i+"]/td[5]");
				ACTIVEBANNED = By.xpath("(//*[@class='inertable box-shadow-light bg-white'])[1]/tbody/tr["+i+"]/td[6]");
				
			String address=getText(ADDRESS);
			String firstread=getText(FIRSTREAD);
			String reads=getText(READS);
			String totalminutes=getText(TOTALMINUTES);
			String votes=getText(VOTE);
			String activebanned=getText(ACTIVEBANNED);
			
			excel str=new excel(driver);
			str.WriteData(DocId,address,firstread,reads,totalminutes,votes,activebanned,timestamp);
			} 
		} 
		catch (Exception e)
		{
			e.getStackTrace();
		}
		
		}
	
	}
}

