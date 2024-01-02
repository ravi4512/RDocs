package com.rdocs.locators;

import org.openqa.selenium.By;

public class ContentProtectionLocators 
{
	public static By Launches=By.xpath("(//input[@type='date'])[1]");
	public static By Expires=By.xpath("(//input[@type='date'])[2]");
	public static By RestrictToDomains=By.xpath("//input[@placeholder='example.org,example2.com']");
	public static By Watermark=By.xpath("//select[@class='form-select form-control select-border h-47p']");
	public static By MaxReadsPerReader=By.xpath("(//input[@placeholder='Unlimited'])[1]");
	public static By MaxReadsPerDocument=By.xpath("(//input[@placeholder='Unlimited'])[2]");
	public static By IdentifyLeakers= By.xpath("//div[@id='chkIdentifyLeakersDiv']");
	public static By Timestamp= By.xpath("//div[@class='checkbox mt-2 mx-5 res-mt0 res-mx0']");
	public static By CanPrint = By.xpath("//div[@class='checkbox mt-2 res-mt0']");
}