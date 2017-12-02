
package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "CreateLead";
		testCaseName = "TC003_CreateLead";
		testDescription = "To Test Create Lead";
		category= "Smoke";
		authors	="Beulah";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord, String companyName, 
			String firstName, String lastName, String fNameLocal, String lNameLocal, 
			String Salutation, String title, String annualRevenue, String sicCode,
			String description, String impNote, String phoneAreaCode, String phoneExt,
			String department, String noOfEmpl, String tickerSymb, String askForName,
			String webUrl, String toName, String addressLine1, String addressLine2,
			String city, String postalCode, String postalCodeExt, String PhoneNo, String primEmail) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterFirstNameLocal(fNameLocal)
		.enterLastNameLocal(lNameLocal)
		.enterSalutation(Salutation)
		.enterTitle(title)
		.enterAnnualRevenue(annualRevenue)
		.enterSicCode(sicCode)
		.enterDescription(description)
		.enterImpNote(impNote)
		.enterPhoneAreaCode(phoneAreaCode)
		.enterPhoneExtension(phoneExt)
		.enterDepartmentName(department)
		.selectSource()
		.selectMarketingCampaign()
		.enterNumOfEmpl(noOfEmpl)
		.enterTickerSymbol(tickerSymb)
		.enterPhoneAskForName(askForName)
		.enterWebUrl(webUrl)
		.enterToName(toName)
		.enterAddressLine1(addressLine1)
		.enterAddressLine2(addressLine2)
		.enterCity(city)
		.enterPostalCode(postalCode)
		.enterPostalCodeExt(postalCodeExt)
		.enterPhoneNo(PhoneNo)
		.enterPrimaryEmail(primEmail)
		.selectIndustry()
		.selectOwnership()
		.selectCurrency()
		.selectState()
		.selectCountry()
		.clickCreateLeadButton()
		.verifyCompanyName(companyName);
	
			}
	}


