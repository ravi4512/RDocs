package com.rdocs.global;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rdocs.locators.ContentProtectionLocators;
import com.rdocs.locators.ManageTabLocators;

public class BrowserActions 
{
	WebDriver driver;
	
	public BrowserActions(WebDriver driver) 
	{
		this.driver = driver;
	}
	protected static int sc;
	public Properties propertiesCode() throws Exception
	{

	final String location = "C:\\Users\\rpl02\\eclipse-workspace\\RDocsFramework\\userdetails.properties";
	FileInputStream fs =new FileInputStream(location);
	Properties prop = new Properties();
	prop.load(fs);
	return prop; 
	} 
	
	//This method will be used to navigate to the URL
		public void getURL(String url)
		{
			driver.get(url);
		}
	
	//This method will be used to enter text into the Application
	public void enterText(By element, String data)
	{
		driver.findElement(element).sendKeys(data);
	}
	
	//This method will be used to click on the Element
		public void clickElement(By element)
		{
			driver.findElement(element).click();
		}
		
		public void uploadFile()
		{
			WebElement f1=driver.findElement(By.id("imgFile"));
			f1.sendKeys("C:\\Users\\rpl02\\OneDrive\\Documents\\Test\\Bio.docx");
		}
		
		public void multipleFiles()
		{
			WebElement n1=driver.findElement(By.id("imgFile"));
			n1.sendKeys("C:\\Users\\rpl02\\OneDrive\\Documents\\Test\\landscape.pdf\n C:\\Users\\rpl02\\OneDrive\\Documents\\Test\\Bio.docx");
		}
		public void moreThan20MbFile()
		{
			WebElement w1=driver.findElement(By.id("imgFile"));
			w1.sendKeys("C:\\Users\\rpl02\\OneDrive\\Documents\\Test\\25.1MB file size.pdf");
		}
		
		public void unsupportedFile()
		{
			WebElement w2=driver.findElement(By.id("imgFile"));
			w2.sendKeys("C:\\Users\\rpl02\\OneDrive\\Documents\\Test\\template-word.dotx");
		}
		
		public void moreThan100Pages()
		{
			WebElement w3=driver.findElement(By.id("imgFile"));
			w3.sendKeys("C:\\Users\\rpl02\\OneDrive\\Documents\\Test\\168 pg.docx");
		}
		
		public void moreThan25MbFile()
		{
			WebElement w4=driver.findElement(By.id("imgFile"));
			w4.sendKeys("C:\\Users\\rpl02\\OneDrive\\Documents\\Test\\25.1MB file size.pdf");
		}
		
		public JavascriptExecutor getJavaScriptExecutor()
		{
			return (JavascriptExecutor)driver;
		}
		
		public void watermark(String value)
		{
			Select st=new Select(driver.findElement(ContentProtectionLocators.Watermark));
			st.selectByValue(value);
			
		}
		
		public String getText(By element)
		{
			return driver.findElement(element).getText();
		}
		
		public  void moreThan99Readers() throws Exception
		{
		FileInputStream fis = new FileInputStream("C:\\Users\\rpl02\\OneDrive\\Documents\\RecipientEmails.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		
		for (Row row : sheet)
		{
			Cell cell = row.getCell(0); 
		    String cellValue = cell.getStringCellValue();
		    driver.findElement(By.xpath("//input[@id='multipleEmails']")).sendKeys(cellValue,Keys.ENTER);
		    workbook.close();
		    fis.close();
		}
		}
		
		//Explicit Wait Method
		public void waitforelementtobeclick(By element, Duration time)
		{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		clickElement(element);
		}
		
		static Random r1=new Random();
		protected int RandomNum=r1.nextInt(1000);
		
		public void alterSecurity(String value)
		{
			Select st=new Select(driver.findElement(ManageTabLocators.AlterSecurity));
			st.selectByValue(value);
		}
	
	}