package com.rdocs.locators;

import org.openqa.selenium.By;

public class ManageTabLocators 
{
	/*------------ MANAGE Tab Locators -------------*/

	public static By MANAGETAB = By.xpath("//a[text()='Manage']");
	public static By TRACKVIEWS = By.xpath("//input[@title='Track Views']");
	public static By TRACKREADERS = By.xpath("//input[@title='Track Readers']");
	public static By LIMITREADERS = By.xpath("//input[@title='Limit Readers']");
	public static By AddAuthorizedReaders=By.xpath("(//span[@title='Add authorized readers'])[1]");
	public static By AddReader=By.xpath("//button[@title='Add reader'][1]");
	public static By Save=By.xpath("//button[text()='Save']");
	public static By Ok=By.xpath("//button[text()='OK']");
	public static By DocId=By.xpath("(//div[@class='d-flex flex-wrap textwrap'])[2]");
	public static By Address=By.xpath("(//*[@class='inertable box-shadow-light bg-white'])[1]/tbody/tr[1]/td ");
	public static By Email=By.xpath("//input[@name='email']");
	public static By RefreshManageTab=By.xpath("//span[@class='material-icons me-1 pb-1 light mt-3 Refresh-icon']");
	public static By ExpandRPD=By.xpath("(//tr[@class='view'])[1]");
	public static By CheckBox=By.xpath("/html/body/div/section/div/div/div[2]/div[1]/table/tbody/tr[1]/td/table/tr[1]/td[1]/div/label/span");
	public static By KillRPD=By.xpath("//button[@class='kill-selected fw-bold mt-2 btn-outline-danger btn shadow d-flex align-items-center res-btn w-auto c-py']");
	public static By Confirm=By.xpath("//button[@class='btn btn-primary px-4 ms-3']");
	public static By RefreshIndividualRPD=By.xpath("(//span[@class='material-icons me-1 pb-1 light'])[1]");
	public static By Search=By.xpath("//input[@class='form-control']");
	public static By ReadersList=By.xpath("(//img[@title='Download Readers List'])[1]"); 
	public static By ActivityLog=By.xpath("(//img[@class='h-30p'])[2]");
	public static By ActivityLogExpand=By.xpath("//a[@class='material-icons material-icons-custom']");
	public static By ControlStatus=By.xpath("(//span[text()='edit'])[1]");
	public static By AlterSecurity=By.xpath("//select[@title='Access Control']");
	public static By LetMePick=By.xpath("//button[@title='Let me pick']");
	public static By Yes=By.xpath("//button[text()='Yes']");
	public static By No=By.xpath("//button[text()='No']");
	public static By ForwardButton=By.xpath("//span[text()='arrow_forward']");
	public static By BackwardButton=By.xpath("//span[text()='arrow_back']");
	public static By ReadersListL3=By.xpath("//div[@class='inActiveUserUnSelected']");
	public static By HistoryIcon=By.xpath("(//span[@title='History of the document'])[1]");
	public static By V1=By.xpath("//div[text()='V1']");
	public static By V2=By.xpath("//div[text()='V2']");
	public static By IdentifyLeakers=By.xpath("(//label[@class='ps-1 pl-0p'])[1]");
	public static By Voting=By.xpath("(//label[@class='ps-1 pl-0p'])[2]");
	public static By DisplayDistributionList=By.xpath("(//label[@class='ps-1 pl-0p'])[3]");
	public static By CanPrint=By.xpath("(//label[@class='ps-0'])[1]");
	public static By ShareVotes=By.xpath("(//label[@class='ps-0'])[2]");
	public static By Save2=By.xpath("(//button[text()='Save'])[2]");
	public static By AccessControl=By.xpath("(//table[@class='table table-borderless tableHistorydetails'])[1]/tbody/tr/td[2]");
	public static By Status=By.xpath("(//table[@class='table table-borderless tableHistorydetails'])[1]/tbody/tr[2]/td[2]");

}
