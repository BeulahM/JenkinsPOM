package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods
{
	@BeforeClass
	public void setData() {
		dataSheetName = "DeleteLead";
		testCaseName = "TC005_DeleteLead";
		testDescription = "To Test DeleteLead test case";
		category= "Smoke";
		authors	="Beulah";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord, String phoneNo, String message)
	{
		 
		 FindLeadsPage flp = new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickLink()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.clickPhoneTab()
		.enterPhoneNumber(phoneNo)
		.clickFindLeadsButton();
			
		String leadId = flp.getLeadId();
		flp.clickResultingLeadDelete()
		.clickDeleteButton()
		.clickFindLeadsLink()
		.enterLeadId(leadId)
		.clickFindLeadsButton()
		.verifyMessage(message);
}
}
