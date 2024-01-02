package com.rdocs.testscripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class excel extends ManageTab
{
	WebDriver driver;
	public excel(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
	}	
	
	public void WriteData(String DocId,String address,String firstread,String reads,String totalminutes,String votes,String activebanned, String timestamp) throws Exception
	{
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\rpl02\\OneDrive\\Documents\\ManageTabDataCapture.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		/* Finding LastRow in Excel */
		int lastRow = sheet.getLastRowNum();	
		int PresentRow=lastRow+1;
		
		/* Creating nextRow in Excel */
		Row row = sheet.createRow(PresentRow);
		
		Cell celll = row.createCell(0);
		celll.setCellValue(DocId);
		 
		Cell cell2 = row.createCell(1);
		cell2.setCellValue(address);
		
		
		Cell cell3 = row.createCell(2);
		cell3.setCellValue(firstread);
		
		
		Cell cell4 = row.createCell(3);
		cell4.setCellValue(reads);
		
		Cell cell5 = row.createCell(4);
		cell5.setCellValue(totalminutes);
		
		Cell cell6 = row.createCell(5);
		cell6.setCellValue(votes);
		
		Cell cell7 = row.createCell(6);
		cell7.setCellValue(activebanned);
		
		Cell cell8 = row.createCell(7);
		cell8.setCellValue(timestamp);
	
		FileOutputStream FOS = new FileOutputStream("C:\\Users\\rpl02\\OneDrive\\Documents\\ManageTabDataCapture.xlsx");
		
		workbook.write(FOS);
		
		FOS.close();
	
		
	}
}
