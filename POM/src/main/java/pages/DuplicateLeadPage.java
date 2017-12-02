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

public class DuplicateLeadPage extends ProjectMethods
{

	public DuplicateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("View Lead | opentaps CRM")) {
			reportStep("this is not Duplicate Leads Page", "FAIL");
		}		
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateLeadButton;
	public DuplicateLeadPage clickDuplicateLeadButton() {
		click(eleDuplicateLeadButton);
		return this;		
	}

	public DuplicateLeadPage verifyDuplicatePageTitle()
	{
		if(!verifyTitle("Duplicate Lead | opentaps CRM")) {
			reportStep("this is not Duplicate Leads Page", "FAIL");
		}	
		return this;
		
	}
	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadButton;
	public DuplicateLeadPage clickCreateLeadButton() {
		click(eleCreateLeadButton);
		return this;		
	}
	
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompanyNameVerify;
	public DuplicateLeadPage verifyCompanyName(String cNameverify) {
		verifyPartialText(eleCompanyNameVerify, cNameverify);
		return this;		
	}
	
	

}
