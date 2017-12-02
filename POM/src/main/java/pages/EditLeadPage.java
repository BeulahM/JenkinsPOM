package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods
{
	
	public EditLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("View Lead | opentaps CRM")) {
			reportStep("this is not View Lead Page", "FAIL");
		}		
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditButton;
	public EditLeadPage clickEditButton() {
		click(eleEditButton);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="(//input[@name='companyName'])[2]")
	private WebElement eleCompanyName;
	
	public EditLeadPage enterCompanyName(String cName) {
		type(eleCompanyName, cName);
		return this;		
	}
	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleUpdateButton;
	public EditLeadPage clickUpdateButton() {
		click(eleUpdateButton);
		return this;
	}
	
		
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompanyNameVerify;
	public EditLeadPage verifyCompanyName(String cNameverify) {
		verifyPartialText(eleCompanyNameVerify, cNameverify);
		return this;		
	}
	
	}

