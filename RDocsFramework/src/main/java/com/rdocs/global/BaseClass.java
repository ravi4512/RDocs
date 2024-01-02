 package com.rdocs.global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	private WebDriver driver;

	public WebDriver launchBrowser(String browser)
	{

		switch (browser) 
		{
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			this.driver = new ChromeDriver();
			break;

		case "mozilla":
			
			WebDriverManager.firefoxdriver().setup();
			this.driver = new FirefoxDriver();
			break;

		case "edge":
			
			WebDriverManager.edgedriver().setup();
			this.driver = new EdgeDriver();
			break;
			
					
		default:
			
			System.out.println("Enter Valid Browser name");
		}

		return driver;
	}	
	}


