package com.rdocs.locators;

import org.openqa.selenium.By;

public class RDocsLoginLocators 
{

	public static By Username=By.name("email");
	public static By Password=By.xpath("//input[@placeholder='Password']");
	public static By Login=By.xpath("//button[text()='Sign in']");
}