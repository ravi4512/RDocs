package com.rdocs.locators;

import org.openqa.selenium.By;

public class YahooMailLocators 
{
	public static By Username=By.xpath("//input[@class='phone-no ']");
	public static By Next=By.xpath("//input[@name='signin']");
	public static By Next1=By.xpath("//button[@id='login-signin']");
	public static By Password=By.id("login-passwd");
	public static By Submit=By.xpath("//input[@type='submit']");
	public static By OpenMail=By.xpath("(//span[@title='documents@rdocs.io'])[1]");
	public static By DownloadRPD=By.xpath("//*[@id=\"mail-app-component\"]/div[1]/div/div[2]/div[2]/ul/li/div/div[2]/div[1]/div[3]/div/ul/li/div/div[2]/div/a/span/div[1]/span[1]/span");
	public static By SignIn=By.xpath("//a['text()=Sign in']");
}