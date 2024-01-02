package com.rdocs.locators;

import org.openqa.selenium.By;

public class OutlookMailLocators
{
	public static By Outlook_Username=By.xpath("//input[@name='loginfmt']");
	public static By Next=By.xpath("//input[@id='idSIButton9']");
	public static By Outlook_Password=By.xpath("//input[@name='passwd']");
	public static By Signin=By.xpath("//input[@id='idSIButton9']");
	public static By Yes=By.xpath("//input[@id='idSIButton9']");
	public static By SearchBox=By.xpath("//input[@id='topSearchInput']");
	public static By Enter=By.xpath("(//i[@class='Q0K3G ___198tor0 f14t3ns0 fne0op0 fg4l7m0 fmd4ok8 f1sxfq9t'])[3]");
	public static By OpenMail=By.xpath("(//div[@class='oJTdD'])[1]");
	public static By DownloadRPD=By.xpath("//div[@class='yUXK7 AVFDW F4Hsb ZreOl']");
	public static By receivedMail=By.xpath("//span[text()='raviteja.gade@rpostlabs.com via RDocs']");
	public static By Inbox=By.xpath("(//span[text()='Inbox'])[1]");
	public static By OpenPasscodeMail=By.xpath("(//span[@class='FqgPc gy2aJ Ejrkd'])[1]");
	public static By Passcode=By.xpath("//*[@id=\"UniqueMessageBody\"]/div/div/div/div[2]/div[1]/table/tbody/tr[3]/td[2]/span");
	public static By Passcode1=By.xpath("//*[@id=\"UniqueMessageBody\"]/div/div/div/div[2]/div[1]/table/tbody/tr[2]/td[2]/span");
}