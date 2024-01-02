package com.rdocs.locators;

import org.openqa.selenium.By;

public class RealTimeInteractivityLocators 
{
	public static By SIDENOTE = By.xpath("//textarea[@class='w-100 bg-lightyellow']");
	public static By ALLOWRESPONSES = By.xpath("(//i[@class='cr-icon material-icons'])[1]");
	public static By EMAILVERIFICATIONCODE = By.xpath("//*[text()='Email verification code']");
	public static By PROOFOFSENDING = By.xpath("//*[text()='Proof of sending']");
	public static By DISTRIBUTIONLIST = By.xpath("//*[text()='Display distribution list']");
	public static By NOTIFICATIONOFREADING = By.xpath("(//*[text()='Notification of reading'])[3]");
	public static By VOTING = By.xpath("//*[text()='Voting']");
	public static By SHAREVOTES = By.xpath("//*[text()='Share votes']");
}