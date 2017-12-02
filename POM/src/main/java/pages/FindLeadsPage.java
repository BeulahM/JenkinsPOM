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

public class FindLeadsPage extends ProjectMethods
{

	public String value="";
	
	public FindLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Find Leads | opentaps CRM")) {
			reportStep("this is not Find Leads Page", "FAIL");
		}		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	public FindLeadsPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;		
	}
	
		
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elePhoneTab;
	public FindLeadsPage clickPhoneTab() {
		click(elePhoneTab);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmailTab;
	public FindLeadsPage clickEmailTab() {
		click(eleEmailTab);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elePhoneNo;
	public FindLeadsPage enterPhoneNumber(String phoneNo) {
		type(elePhoneNo, phoneNo);
		return this;		
	}
	
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleEmailAddr;
	public FindLeadsPage enterEmailAddress(String emailAddress) {
		type(eleEmailAddr, emailAddress);
		return this;		
	}

	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	public FindLeadsPage clickFindLeadsButton() {
		click(eleFindLeadsButton);
		return this;		
	}

	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleResultingLeadEdit;
	public EditLeadPage clickResultingLeadEdit()
	{
	WebDriverWait wait =  new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
	clickWithNoSnap(eleResultingLeadEdit);
	return new EditLeadPage(driver,test);
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleResultingLeadDelete;
	public DeleteLeadPage clickResultingLeadDelete()
	{
	WebDriverWait wait =  new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
	clickWithNoSnap(eleResultingLeadDelete);
	return new DeleteLeadPage(driver,test);
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleResultingLeadDuplicate;
	public DuplicateLeadPage clickResultingLeadDuplicate()
	{
	WebDriverWait wait =  new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
	clickWithNoSnap(eleResultingLeadDuplicate);
	return new DuplicateLeadPage(driver,test);
	}
	

	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleGetLeadId;
	public String getLeadId()
	{
	value = getText(eleGetLeadId);
	return value;
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-companyName']/a")
	private WebElement eleGetName;
	public String getName()
	{
	value = getText(eleGetName);
	return value;
	}

	
	}
