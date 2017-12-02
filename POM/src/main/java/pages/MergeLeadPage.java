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

public class MergeLeadPage extends ProjectMethods
{
	
	public MergeLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Merge Leads | opentaps CRM")) {
			reportStep("this is not Merge Leads Page", "FAIL");
		}		
	}
	
	@FindBy(how=How.XPATH,using="//img[@src='/images/fieldlookup.gif']")
	private WebElement eleFirstImageIcon;
	public MergeLeadPage clickFirstImageIcon() {
		click(eleFirstImageIcon);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//img[contains(@src,'/images/fieldlookup.gif')])[2]")
	private WebElement eleSecondImageIcon;
	public MergeLeadPage clickSecondImageIcon() {
		click(eleSecondImageIcon);
		return this;		
	}
	
	public MergeLeadPage switchWindow(int index)
	{
	switchToWindow(index);
	return this;
	}
	
	public String getCurrentUrl()
	{
		String str = driver.getCurrentUrl();
		return str;
	}
	
	@FindBy(how=How.NAME,using="id")
	private WebElement eleLeadId1;
	public MergeLeadPage enterFirstLeadId(String leadId1) {
		type(eleLeadId1,leadId1);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadButton;
	public MergeLeadPage clickFindLeadButton() {
		click(eleFindLeadButton);
		return this;		
	}
	
	

	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleResultingLeadMerge;
	public MergeLeadPage clickResultingLeadMerge()
	{
	WebDriverWait wait =  new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
	clickWithNoSnap(eleResultingLeadMerge);
	return this;
	}	

		
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMergeButton;
	public MergeLeadPage clickMergeButton() {
		clickWithNoSnap(eleMergeButton);
		return this;		
	}
	
	public MergeLeadPage acceptAlertPopUp()
	{
		acceptAlert();
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadsLink;
	public MergeLeadPage clickFindLeadsLink() {
		click(eleFindLeadsLink);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement eleVerifyMsg;
	public MergeLeadPage verifyMessage(String message) {
		verifyExactText(eleVerifyMsg, message);
		return this;		
	}
	
	}
