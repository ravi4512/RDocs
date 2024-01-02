package com.rdocs.locators;

import org.openqa.selenium.By;

public class CreateTabLocators 
{
	public static By createTab=By.xpath("//a[@class='nav-link fw-medium ps-4 res-px0 pl-0p']");
	public static By Description=By.xpath("//textarea[@class='w-100 red-shadow border-r4']");
	public static By createButton=By.xpath("//button[@class='res-w1 mt-3 px-4']");
	public static By AuthorizedReaders=By.xpath("//input[@id='multipleAuthorizedEmails']");
	public static By Close=By.xpath("//button[text()='Close']");
}
