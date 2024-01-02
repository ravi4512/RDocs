package com.rdocs.locators;

import org.openqa.selenium.By;

public class SendRPDLocators 
{
	public static By RecipientEmail=By.xpath("//input[@id='multipleEmails']");
	public static By Subject=By.name("subject");
	public static By Message=By.name("message");
	public static By SendButton=By.xpath("//button[text()='Send']");
	public static By TrackReaders=By.xpath("(//span[text()='Track Readers'])[1]");
	public static By LimitReaders=By.xpath("(//span[text()='Limit Readers'])[1]");
	public static By DeleteAll=By.xpath("(//label[@class='d-flex align-items-center clearall'])[1]");
	public static By Clear=By.xpath("(//span[@class='material-icons text-danger top-2 ms-2'])[1]");
	public static By ViewerLanguage=By.xpath("(//label[@class='radio-label'])[3]");
	public static By LanguageDropdown=By.xpath("//select[@class='form-select form-control select-border rounded h-32p language-borderr']");
	public static By ViewerBrowserLanguage=By.xpath("//input[@id='chkYesViewerBrowserLanguage']");
	public static By TrackReadersText=By.xpath("//span[text()='All Track Views features+']");
	public static By LimitReadersText=By.xpath("//span[text()='All Track Readers features+']");
	public static By Rename=By.xpath("(//span[@class='material-icons mx-1 font-20 top1'])[1]");
	public static By TextBox=By.xpath("(//input[@class='border-r4 edit-box'])[1]");
	public static By Save=By.xpath("(//span[@class='material-icons mx-1 font-20 top2 text-success1'])[1]");
	public static By Cancel=By.xpath("(//span[@class='material-icons text-danger top-5 deleteHover font-20'])[1]");
	public static By SendMulRDocsNo=By.xpath("(//label[@class='radio-label'])[2]");
	public static By PreferredDocName=By.xpath("//input[@class='w-100 red-shadow border-r4 res-ml36']");
	public static By Delete=By.xpath("(//span[@class='material-icons text-danger top-5 deleteHover font-20'])[1]");
	public static By ByIp=By.xpath("(//div[@class='checkbox control usercheck'])[2]");
	public static By IpAddress=By.xpath("//input[@class='form-control byip-input']");
	public static By Logout=By.xpath("class=\"fw-bold btn-outline-secondary btn  px-3 shadow d-flex align-items-center res-btn");
	public static By BulkUpload=By.xpath("//span[text()='file_upload']");
	public static By Upload=By.xpath("//button[@class='btn btn-primary UploadReaders']");
}
 