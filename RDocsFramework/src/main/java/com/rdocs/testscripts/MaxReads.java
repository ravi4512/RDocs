package com.rdocs.testscripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.rdocs.global.BrowserActions;

public class MaxReads extends BrowserActions
{
	WebDriver driver;
	public MaxReads(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
	}
	
	public void execution() throws Exception
	{
		for(int i=1;i<=18;i++)
		{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_J);
	//	Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_J);
	//	Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	//	Thread.sleep(2000);

		}
	}
}
