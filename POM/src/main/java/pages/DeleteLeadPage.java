package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DeleteLeadPage extends ProjectMethods
{
	
	public DeleteLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("View Lead | opentaps CRM")) {
			reportStep("this is not Delet Leads Page", "FAIL");
		}		
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleDeleteButton;
	public DeleteLeadPage clickDeleteButton() {
		click(eleDeleteButton);
		return this;	
	}


	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadsLink;
	public DeleteLeadPage clickFindLeadsLink() {
		click(eleFindLeadsLink);
		return this;		
	}
		
	
	@FindBy(how=How.NAME,using="id")
	private WebElement eleLeadId;
	public DeleteLeadPage enterLeadId(String leadId) {
		type(eleLeadId, leadId);//leadId is captured in FindLeads class and stored in local variable leadId
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	public DeleteLeadPage clickFindLeadsButton() {
		click(eleFindLeadsButton);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement eleVerifyMsg;
	public DeleteLeadPage verifyMessage(String message) {
		verifyExactText(eleVerifyMsg, message);
		return this;		
	}
	
}
