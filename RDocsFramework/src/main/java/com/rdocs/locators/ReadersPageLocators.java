package com.rdocs.locators;

import org.openqa.selenium.By;

public class ReadersPageLocators 
{
	public static By DROPDOWN = By.xpath("//*[text()=' expand_more ']");
	public static By ACTUALSIZE = By.xpath("(//button[text()='Actual Size'])[2]");
	public static By FITPAGE = By.xpath("(//button[text()='Fit Page'])[2]");
	public static By FULLWIDTH = By.xpath("(//button[text()='Full Width'])[2]");
	public static By ZOOM50 = By.xpath("(//button[text()='50%'])[2]");
	public static By ZOOM75 = By.xpath("(//button[text()='75%'])[2]");
	public static By ZOOM100 = By.xpath("(//button[text()='100%'])[2]");
	public static By ZOOM125 = By.xpath("(//button[text()='125%'])[2]");
	public static By ZOOM150 = By.xpath("(//button[text()='150%'])[2]");
	public static By Vote=By.xpath("(//span[text()='thumb_up_alt'])[2]");
	public static By DistributionList=By.xpath("(//span[text()=' people '])[2]");
	public static By SideNote=By.xpath("(//span[text()=' chat '])[2]");
	public static By ReplyToDocument=By.xpath("(//span[text()=' drafts '])[2]");
	public static By Like=By.xpath("//button[@class='btn btn-success d-flex align-items-center px-4']");
	public static By DisLike=By.xpath("//button[@class='btn btn-danger ms-4 d-flex align-items-center px-3']");
	public static By CloseVotingPopup=By.xpath("(//span[@class='material-icons font-20'])[1]");
	public static By DistributionListReaders=By.xpath("//p[@class='rpdFont dropdown-item border border-bottom-1 d-flex align-items-start wordwrap']");
	public static By SideNoteText=By.xpath("(//p[@class='rpdFont dropdown-p d-flex flex-wrap text-justify mt-0 pt-0'])[1]");
	public static By Subject=By.xpath("//input[@id='txtSubject']");
	public static By Message=By.xpath("//textarea[@class='rpdFont form-control font-w600 rplycontrol']");
	public static By Send=By.xpath("//button[@class='btn btn-secondary cpx-5 cpy-1 w-50 rp-btn']");
}
