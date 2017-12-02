package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods
{

	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Create Lead | opentaps CRM")) {
			reportStep("this is not Create Lead Page", "FAIL");
		}		
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public CreateLeadPage enterCompanyName(String cName) {
		type(eleCompanyName, cName);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLeadPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;		
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	public CreateLeadPage enterLastName(String lName) {
		type(eleLastName, lName);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstNameLocal")
	private WebElement eleFirstNameLocal;
	public CreateLeadPage enterFirstNameLocal(String fNameLocal) 
	{
		type(eleFirstNameLocal, fNameLocal);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastNameLocal")
	private WebElement eleLastNameLocal;
	public CreateLeadPage enterLastNameLocal(String lNameLocal) 
	{
		type(eleLastNameLocal, lNameLocal);
		return this;		
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	private WebElement eleMarketingCampaignDropdown;
	public CreateLeadPage selectMarketingCampaign() {
		selectDropDownUsingText(eleMarketingCampaignDropdown,"Automobile");
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_personalTitle")
	private WebElement eleSalutation;
	public CreateLeadPage enterSalutation(String salutation) 
	{
		type(eleSalutation, salutation);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalProfTitle")
	private WebElement eleTitle;
	public CreateLeadPage enterTitle(String title) 
	{
		type(eleTitle, title);
		return this;		
	}	

	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	private WebElement eleSource;
	public CreateLeadPage selectSource() {
		selectDropDownUsingText(eleSource,"Conference");
		return this;
	}
	

	@FindBy(how=How.ID,using="createLeadForm_annualRevenue")
	private WebElement eleAnnualRevenue;
	public CreateLeadPage enterAnnualRevenue(String annualRevenue) 
	{
		type(eleAnnualRevenue, annualRevenue);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_industryEnumId")
	private WebElement eleIndustry;
	public CreateLeadPage selectIndustry() {
		selectDropDownUsingText(eleIndustry,"Computer Software");
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_ownershipEnumId")
	private WebElement eleOwnership;
	public CreateLeadPage selectOwnership() {
		selectDropDownUsingText(eleOwnership,"Partnership");
		return this;
	}
	

	@FindBy(how=How.ID,using="createLeadForm_sicCode")
	private WebElement eleSicCode;
	public CreateLeadPage enterSicCode(String sicCode) 
	{
		type(eleSicCode, sicCode);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_description")
	private WebElement eleDescription;
	public CreateLeadPage enterDescription(String description) 
	{
		type(eleDescription, description);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_importantNote")
	private WebElement eleImpNote;
	public CreateLeadPage enterImpNote(String impNote) 
	{
		type(eleImpNote, impNote);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneAreaCode")
	private WebElement elePhoneAreaCode;
	public CreateLeadPage enterPhoneAreaCode(String phoneAreaCode) 
	{
		type(elePhoneAreaCode, phoneAreaCode);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneExtension")
	private WebElement elePhoneExtension;
	public CreateLeadPage enterPhoneExtension(String phoneExt) 
	{
		type(elePhoneExtension, phoneExt);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_departmentName")
	private WebElement eleDepartmentName;
	public CreateLeadPage enterDepartmentName(String department) 
	{
		type(eleDepartmentName, department);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_currencyUomId")
	private WebElement eleCurrency;
	public CreateLeadPage selectCurrency() {
		selectDropDownUsingText(eleCurrency,"INR - Indian Rupee");
		return this;
	}	
	
	
	@FindBy(how=How.ID,using="createLeadForm_numberEmployees")
	private WebElement eleNumberOfEmpl;
	public CreateLeadPage enterNumOfEmpl(String noOfEmpl) {
		type(eleNumberOfEmpl,noOfEmpl);
		return this;
	}	
	
	
	@FindBy(how=How.ID,using="createLeadForm_tickerSymbol")
	private WebElement eleTickerSymbol;
	public CreateLeadPage enterTickerSymbol(String tickerSymb) {
		type(eleTickerSymbol,tickerSymb);
		return this;
	}	
	
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement elePrimaryEmail;
	
	public CreateLeadPage enterPrimaryEmail(String primEmail) {
		type(elePrimaryEmail, primEmail);
		return this;		
	}	
	
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhoneNumber;
	
	public CreateLeadPage enterPhoneNo(String PhoneNo) {
		type(elePhoneNumber, PhoneNo);
		return this;		
	}

	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneAskForName")
	private WebElement elePrimaryPhoneAsk;
	public CreateLeadPage enterPhoneAskForName(String askForName) {
		type(elePrimaryPhoneAsk, askForName);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryWebUrl")
	private WebElement elePrimaryWebUrl;
	public CreateLeadPage enterWebUrl(String webUrl) {
		type(elePrimaryWebUrl,webUrl);
		return this;		
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_generalToName")
	private WebElement eleToName;
	public CreateLeadPage enterToName(String toName) {
			type(eleToName,toName);
			return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalAddress1")
	private WebElement eleAddressLine1;
	public CreateLeadPage enterAddressLine1(String addressLine1) {
			type(eleAddressLine1,addressLine1);
			return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalAddress2")
	private WebElement eleAddressLine2;
	public CreateLeadPage enterAddressLine2(String addressLine2) {
			type(eleAddressLine2,addressLine2);
			return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalCity")
	private WebElement eleCity;
	public CreateLeadPage enterCity(String city) {
			type(eleCity,city);
			return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalPostalCode")
	private WebElement elePostalCode;
	public CreateLeadPage enterPostalCode(String postalCode) {
			type(elePostalCode,postalCode);
			return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalPostalCodeExt")
	private WebElement elePostalCodeExt;
	public CreateLeadPage enterPostalCodeExt(String postalCodeExt) {
			type(elePostalCodeExt,postalCodeExt);
			return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalStateProvinceGeoId")
	private WebElement eleChooseState;
	public CreateLeadPage selectState() {
		selectDropDownUsingText(eleChooseState,"Alabama");
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalCountryGeoId")
	private WebElement eleChooseCountry;
	public CreateLeadPage selectCountry() {
		selectDropDownUsingText(eleChooseCountry,"United States");
		return this;
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadButton;
	public ViewLeadPage clickCreateLeadButton() {
		click(eleCreateLeadButton);
		return new ViewLeadPage(driver, test);
	}	
	
}
