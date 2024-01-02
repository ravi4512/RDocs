package com.rdocs.testscripts;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import com.rdocs.global.BrowserActions;
import com.rdocs.locators.ManageTabLocators;

public class AlterL1toL2 extends BrowserActions
{
	WebDriver driver;
	public AlterL1toL2(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
	}
	public void execution()
	{
			clickElement(ManageTabLocators.MANAGETAB);
			waitforelementtobeclick(ManageTabLocators.ExpandRPD, Duration.ofSeconds(10));
			clickElement(ManageTabLocators.ControlStatus);
			alterSecurity("Track Readers");
			clickElement(ManageTabLocators.IdentifyLeakers);
			clickElement(ManageTabLocators.Voting);
			clickElement(ManageTabLocators.DisplayDistributionList);
			clickElement(ManageTabLocators.ShareVotes);
			clickElement(ManageTabLocators.Save);
			clickElement(ManageTabLocators.Ok);		
		}
		
	}

