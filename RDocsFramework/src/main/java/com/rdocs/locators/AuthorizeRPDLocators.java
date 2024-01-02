package com.rdocs.locators;

import org.openqa.selenium.By;

public class AuthorizeRPDLocators
{
	public static By AuthorizeEmail=By.xpath("//input[@class='rpdFont form-control input_user']");
	public static By AuthorizePasscode=By.xpath("//input[@class='rpdFont form-control input_pass']");
	public static By GetPasscode=By.xpath("//p[text()='Click to Get Passcode']");
	public static By Ok=By.xpath("//button[@class='rpdFont w-50 btn btn-secondary cpx-5 cpy-1 rp-btn']");
	public static By Ok1=By.xpath("//button[@class='rpdFont btn login_btn w-sm-100 w-md-50 rp-btn']");
	public static By AuthorizeRPD=By.xpath("//button[@class='rpdFont btn login_btn w-md-75 rp-btn']");
}