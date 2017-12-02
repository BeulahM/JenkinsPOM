package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	public MyHomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Opentaps Open Source ERP + CRM")) {
			reportStep("this is not My Home Page", "FAIL");
		}		
	}
	
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'CRM/SFA')]")
	private WebElement eleCrmsfaLink;
	public LeadsPage clickLink() {
		click(eleCrmsfaLink);
		return new LeadsPage(driver, test);
	}

}
