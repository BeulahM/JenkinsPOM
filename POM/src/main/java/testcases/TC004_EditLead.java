package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods
{
	
	@BeforeClass
	public void setData() {
		dataSheetName = "EditLead";
		testCaseName = "TC004_EditLead";
		testDescription = "To Test EditLead test case";
		category= "Smoke";
		authors	="Beulah";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord, String fName, String cName, String cNameverify)
	{

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickLink()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.enterFirstName(fName)
		.clickFindLeadsButton()
		.clickResultingLeadEdit()
		.clickEditButton()
		.enterCompanyName(cNameverify)
		.clickUpdateButton()
		.verifyCompanyName(cNameverify);
	}
}
