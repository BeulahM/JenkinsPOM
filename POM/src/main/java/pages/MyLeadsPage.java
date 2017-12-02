package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage(RemoteWebDriver driver,ExtentTest test) 
	{
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("My Leads | opentaps CRM")) {
			reportStep("this is not My My Leads Page", "FAIL");
		}		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLeadLink;
	public CreateLeadPage clickCreateLeadLink() {
		click(eleCreateLeadLink);
		return new CreateLeadPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadsLink;
	public FindLeadsPage clickFindLeadsLink() {
		click(eleFindLeadsLink);
		return new FindLeadsPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeadsLink;
	public MergeLeadPage clickMergeLeadLink() {
		click(eleMergeLeadsLink);
		return new MergeLeadPage(driver, test);
	}
	

}
