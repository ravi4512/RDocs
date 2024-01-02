package com.rdocs.testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.rdocs.global.BrowserActions;
import com.rdocs.locators.YahooMailLocators;

public class YahooMail extends BrowserActions 
{
	WebDriver driver;
	public YahooMail(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}

	public void execution()
	{
		
		getURL("https://login.yahoo.com/?.src=ym&pspid=1197806870&activity=header-signin&.lang=en-SG&.intl=sg&.done=https%3A%2F%2Fsg.mail.yahoo.com%2Fd");
		driver.manage().window().maximize();
		//clickElement(YahooMailLocators.SignIn);
		enterText(YahooMailLocators.Username, "raviteja.re@yahoo.com");
		clickElement(YahooMailLocators.Next);
		enterText(YahooMailLocators.Password, "R@vi9876");
		clickElement(YahooMailLocators.Next1);
		waitforelementtobeclick(YahooMailLocators.OpenMail, Duration.ofSeconds(20));
		clickElement(YahooMailLocators.OpenMail);
		clickElement(YahooMailLocators.DownloadRPD);
	}
}
 