package com.rdocs.executionpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.rdocs.global.BaseClass;
import com.rdocs.testscripts.AddAuthorizedReaders;
import com.rdocs.testscripts.AlterL1ToL3;
import com.rdocs.testscripts.AlterL2ToL3;
import com.rdocs.testscripts.AuthorizeRPD;
import com.rdocs.testscripts.BulkUpload;
import com.rdocs.testscripts.CopyPasscode;
import com.rdocs.testscripts.CreateL1RPD;
import com.rdocs.testscripts.CreateL2RPD;
import com.rdocs.testscripts.CreateL3RPD;
import com.rdocs.testscripts.DefaultValues;
import com.rdocs.testscripts.GetPasscodeFromCreate;
import com.rdocs.testscripts.KillMultipleRPD;
import com.rdocs.testscripts.KillRPD;
import com.rdocs.testscripts.LimitReaders;
import com.rdocs.testscripts.ManageTab;
import com.rdocs.testscripts.MaxReaders;
import com.rdocs.testscripts.MaxReads;
import com.rdocs.testscripts.ModifyFileName;
import com.rdocs.testscripts.OpenL1RPD;
import com.rdocs.testscripts.OpenL2RPD;
import com.rdocs.testscripts.OpenL3RPD;
import com.rdocs.testscripts.RDocsLogin;
import com.rdocs.testscripts.ReaderValidation;
import com.rdocs.testscripts.ReadersPage;
import com.rdocs.testscripts.Regions;
import com.rdocs.testscripts.TrackReaders;
import com.rdocs.testscripts.TrackViews;
import com.rdocs.testscripts.Validations;
import com.rdocs.testscripts.VersionHistory;
import com.rdocs.testscripts.YahooMail;

public class Setup  extends BaseClass
{
	WebDriver driver;
	BaseClass baseclass;
	RDocsLogin rdocslogin;
	TrackViews trackviews;
	OpenL1RPD openl1rpd;
	TrackReaders trackreaders;
	OpenL2RPD openl2rpd;
	LimitReaders limitreaders;
	OpenL3RPD openl3rpd;
	MaxReaders maxreaders;
	ManageTab managetab;
	AddAuthorizedReaders addauthorizedreaders;
	YahooMail yahoo;
	AuthorizeRPD authorizerpd;
	ReaderValidation validation;
	Validations validations;
	Regions regions;
	KillRPD killrpd;
	KillMultipleRPD killmultiplerpd;
	ModifyFileName modifyfilename;
	ReadersPage readerspage;
	CreateL1RPD createl1rpd;
	CreateL2RPD createl2rpd;
	CreateL3RPD createl3rpd;
	GetPasscodeFromCreate getpasscodefromcreate;
	CopyPasscode copypasscode;
	DefaultValues defaultvalues;
	VersionHistory versionhistory;
	AlterL1ToL3 alterl1tol3;
	AlterL2ToL3 alterl2tol3;
	BulkUpload bulkupload;
	MaxReads maxreads;
	
	@Parameters({"browser"})
	@BeforeSuite
	public void startBrowser(String browser){
		
		baseclass = new BaseClass();
		this.driver = launchBrowser(browser);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    rdocslogin=new RDocsLogin(driver);
	    trackviews=new TrackViews(driver);
	    openl1rpd=new OpenL1RPD(driver);
	    trackreaders=new TrackReaders(driver);
	    openl2rpd=new OpenL2RPD(driver);
	    limitreaders=new LimitReaders(driver);
	    openl3rpd=new OpenL3RPD(driver);
	    maxreaders=new MaxReaders(driver);
	    managetab=new ManageTab(driver);
	    addauthorizedreaders=new AddAuthorizedReaders(driver);
	    yahoo=new YahooMail(driver);
	    authorizerpd=new AuthorizeRPD(driver);
	    validation=new ReaderValidation(driver);
	    validations=new Validations(driver);
	    regions=new Regions(driver);
	    killrpd=new KillRPD(driver);
	    killmultiplerpd=new KillMultipleRPD(driver);
	    modifyfilename=new ModifyFileName(driver);
	    readerspage=new ReadersPage(driver);
	    createl1rpd=new CreateL1RPD(driver);
	    createl2rpd=new CreateL2RPD(driver);
	    createl3rpd=new CreateL3RPD(driver);
	    getpasscodefromcreate=new GetPasscodeFromCreate(driver);
	    copypasscode=new CopyPasscode(driver);
	    defaultvalues=new DefaultValues(driver);
	    versionhistory=new VersionHistory(driver);
	    alterl1tol3=new AlterL1ToL3(driver);
	    alterl2tol3=new AlterL2ToL3(driver);
	    bulkupload=new BulkUpload(driver);
	    maxreads=new MaxReads(driver);
	}
	@Test
public void systemTesting() throws Exception
{
	rdocslogin.execution();
//	trackviews.execution(); 
//	openl1rpd.execution();
//	trackreaders.execution();
//	openl2rpd.execution();
//	limitreaders.execution();
//	openl3rpd.execution();
//	authorizerpd.execution();
//	managetab.execution();
//	createl1rpd.execution();
//	createl2rpd.execution();
//	createl3rpd.execution();
//	getpasscodefromcreate.execution();
//	copypasscode.execution();
//	maxreaders.execution();	
//	addauthorizedreaders.execution();
//	yahoo.execution();
//	validation.execution();
	
//	validations.execution();
//	regions.execution();
//	killrpd.execution();
//	killmultiplerpd.execution();
//	modifyfilename.execution();
//	readerspage.execution();
//	defaultvalues.execution();
//	versionhistory.execution();
//	alterl1tol3.execution();
//	alterl2tol3.execution();
//	bulkupload.execution();
//	maxreads.execution();
	
}
}