package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods
{
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("View Lead | opentaps CRM")) {
			reportStep("this is not Create Lead Page", "FAIL");
		}		
	}
	
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	WebElement eleCompanyName;
	public void verifyCompanyName(String cName)
	{
	verifyPartialText(eleCompanyName,cName);
	}
	
}
