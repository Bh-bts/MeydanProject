/**
 * 
 */
package com.Meydan.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Browsers.Utill.AllBrowsers;

/**
 * @author Bhavin.Thumar
 *
 */
public class CompanyCreate_Obj extends AllBrowsers {

	// Login page
	public @FindBy(xpath = "//input[@type='email']") WebElement email_txt;
	public @FindBy(xpath = "//input[@type='password']") WebElement pass_txt;
	public @FindBy(xpath = "//button[@type='submit']") WebElement submit_btn;

	// Before start company creation
	public @FindBy(xpath = "//button[@class='btn btn-block btn-secondary']") WebElement setup_cmp_btn;
	public @FindBy(xpath = "//button[@aria-label='Close']") WebElement close_btn;
	public @FindBy(xpath = "//h3[text()='Setup New Company ']/ancestor::div[@class='formation cursor-pointer ng-star-inserted']") WebElement setup_new_cmp_btn;
	public @FindBy(xpath = "//span[text()='Start Process']/ancestor::button") WebElement start_process_btn;

	// Formation package (Page 1)
	public @FindBy(xpath = "//h2[text()='Establishment package']") WebElement establishment_text;
	public @FindBy(xpath = "//span[text()='Standard Formation']/ancestor::label/span[1]") WebElement establishment_type;
	public @FindBy(xpath = "//strong[text()='Limited Liability Company']/ancestor::label/span") WebElement company_type;
	public @FindBy(xpath = "//button[@type='submit']") WebElement next_btn;
	public @FindBy(xpath = "//span[text()=' Next ']") WebElement next_btn_txt;

	// Business Activity (Page 2)
	public @FindBy(xpath = "//span[text()='Help me select my business activities']/ancestor::label/span[1]") WebElement business_acitivity;
	public @FindBy(css = ".material_label_checkbox") WebElement businessCate_chkbox1;
	public @FindBy(css = ".material_label_checkbox") WebElement businessSubCare_chkbox1;

	public @FindBy(xpath = "//a[text()=' 1810.00 - Printing and service activities related to printing  ']/button") WebElement suggestAct_box1;
	public @FindBy(css = ".material_label_checkbox") WebElement Print_chkbox1;

	public @FindBy(xpath = "//a[text()=' 1820.00 - Reproduction of recorded media  ']/button") WebElement suggestAct_box2;
	public @FindBy(css = ".material_label_checkbox") WebElement Reproduction_chkbox1;

	// Company Information
	public @FindBy(xpath = "//span[@role='combobox']") WebElement licence_dropdwn;
	public @FindBy(xpath = "//li[text()='1 year']") WebElement licence_year;
	public @FindBy(xpath = "//strong[text()='No']/ancestor::label/span") WebElement reservedCmp;
	public @FindBy(xpath = "//strong[text()='English']/ancestor::label/span") WebElement primaryLang;

	public @FindBy(xpath = "//label[text()='Preferred company name 1']/ancestor::div/input") WebElement cmpName1;
	public @FindBy(xpath = "//label[text()='Preferred company name 2']/ancestor::div/input") WebElement cmpName2;
	public @FindBy(xpath = "//label[text()='Preferred company name 3']/ancestor::div/input") WebElement cmpName3;
	public @FindBy(xpath = "//strong[text()='Direct translation']/ancestor::label/span") WebElement cmpNameTrans;

	public @FindBy(xpath = "//p[text()='Do you want to assign power of attorney?']/ancestor::div/div[2]/div/app-radio/div/div/div[2]/label/span") WebElement attroneyPower;

	// Visa Allocation
	public @FindBy(xpath = "//a[text()='1']") WebElement visaCount;

	// Immigration card
	public @FindBy(xpath = "//strong[text()='No']/ancestor::label/span") WebElement visaProcess;

	// Office Facility
	public @FindBy(xpath = "//h2[text()='Type of facility']") WebElement facilityType_txt;

	// Shareholder information
	public @FindBy(xpath = "//label[text()='Number of shareholders ']/ancestor::div/input") WebElement shareholderNub;
	public @FindBy(xpath = "//h2[text()='Share quantity and value']") WebElement shareQuantity_txt;
	public @FindBy(xpath = "//label[text()='Number of shares']/preceding-sibling::input") WebElement shareCount;
	public @FindBy(xpath = "//a[text()=' Shareholder 1 ']") WebElement shareholder1_box;
	public @FindBy(xpath = "//h3[text()=' Existing Meydan user? ']/ancestor::div/app-radio/div/div/div[1]/label/strong/ancestor::label/span") WebElement existingMeydan_yes;
	public @FindBy(xpath = "//h3[text()=' Existing Meydan user? ']/ancestor::div/app-radio/div/div/div[2]/label/div") WebElement existingMeydan_no;

	// Shareholder information - Existing user
	public @FindBy(xpath = "//div[text()=' Does the Shareholder have a Nominee?']/ancestor::div/label[1]/span[1]") WebElement shareholderNominee;
	public @FindBy(xpath = "//span[text()='Shareholder']/ancestor::label/span[1]") WebElement shareholder_or_POA;
	public @FindBy(xpath = "//h3[text()=' Are you completing the task through POA? ']/ancestor::div/app-radio/div/div/div[2]/label/strong/ancestor::label/span") WebElement comp_task_throgh_POA;
	public @FindBy(xpath = "//label[text()='Email']/ancestor::div/input") WebElement existEmail;
	public @FindBy(xpath = "//label[text()='Passport number']/ancestor::div/input") WebElement existPassportNum;

	// Shareholder information - New user
	public @FindBy(xpath = "//h3[text()=' Select the type of Shareholder ']/ancestor::div/app-radio/div/div/div[1]/label/strong/ancestor::label/span") WebElement shareholder_type;
	public @FindBy(xpath = "//label[text()='Passport copy']/ancestor::div[@class='form-group help-info']/div/div/label") WebElement passportFile_open;
	public @FindBy(xpath = "//label[text()='Passport copy']/ancestor::app-file/div[2]/div/div/span/div[3]/div/input") WebElement browser_passport_img;
	public @FindBy(xpath = "//label[text()='Passport copy']/ancestor::app-file/div[2]/div/div/span/div[3]/div/span") WebElement pass_browseFile_txt;
	public @FindBy(xpath = "//label[text()='Passport copy']/ancestor::app-file/div[2]/div/div/span/div[3]/a") WebElement passSselect_btn;

	public @FindBy(xpath = "//div[@class='page-level-loader ng-star-inserted']") WebElement pageLoder;
	public @FindBy(xpath = "//label[text()='Upload special page of passport']/ancestor::div[@class='form-group help-info']/div/div/label") WebElement passportPageFile_open;
	public @FindBy(xpath = "//label[text()='Upload special page of passport']/ancestor::app-file/div[2]/div/div/span/div[3]/div/input") WebElement browser_passportPage_img;
	public @FindBy(xpath = "//label[text()='Upload special page of passport']/ancestor::app-file/div[2]/div/div/span/div[3]/div/span") WebElement passPage_browseFile_txt;
	public @FindBy(xpath = "//label[text()='Upload special page of passport']/ancestor::app-file/div[2]/div/div/span/div[3]/a") WebElement passPageSelect_btn;

	public @FindBy(xpath = "//label[text()='Passport style photo (as per guidelines)']/ancestor::div[@class='form-group help-info']/div/div/label") WebElement passportPhotoFile_open;
	public @FindBy(xpath = "//label[text()='Passport style photo (as per guidelines)']/ancestor::app-file/div[2]/div/div/span/div[3]/div/input") WebElement browser_PassportPhoto_img;
	public @FindBy(xpath = "//label[text()='Passport style photo (as per guidelines)']/ancestor::app-file/div[2]/div/div/span/div[3]/div/span") WebElement passPhoto_browseFile_txt;
	public @FindBy(xpath = "//label[text()='Passport style photo (as per guidelines)']/ancestor::app-file/div[2]/div/div/span/div[3]/a") WebElement passPhotoSelect_btn;

	public @FindBy(xpath = "//label[text()='First name']/preceding-sibling::input") WebElement shareholderFName;
	public @FindBy(xpath = "//label[text()='Last name']/preceding-sibling::input") WebElement shareholderLname;
	public @FindBy(xpath = "//span[text()='Male']/ancestor::label/span[1]") WebElement genderSelect;
	public @FindBy(xpath = "//label[text()='E-mail ID']/preceding-sibling::input") WebElement shareholderEmail;
	public @FindBy(xpath = "//input[@type='tel']") WebElement telphone;

	public @FindBy(xpath = "//label[text()='Place Of Birth']/preceding-sibling::input") WebElement shareholderBirthPlace;
	public @FindBy(xpath = "//label[text()='Nationality']/ancestor::div/select") WebElement nationality_dwn;
	public @FindBy(xpath = "//label[text()='Address line 1']/preceding-sibling::textarea") WebElement address1;
	public @FindBy(xpath = "//label[text()='Address line 2']/preceding-sibling::textarea") WebElement address2;
	public @FindBy(xpath = "//label[text()='City']/preceding-sibling::input") WebElement city;
	public @FindBy(xpath = "//label[text()='Country']/ancestor::div/select") WebElement country;

	public @FindBy(xpath = "//label[text()='Passport number']/preceding-sibling::input") WebElement passportNumber;
	public @FindBy(xpath = "//label[text()='Passport issuing location']/preceding-sibling::input") WebElement passLocation;
	public @FindBy(xpath = "//label[text()='Visa number']/preceding-sibling::input") WebElement visanum;
	public @FindBy(xpath = "//label[text()='Emirates ID number']/preceding-sibling::input") WebElement emirID;

	public @FindBy(xpath = "//span[text()='Outside']/ancestor::label/span[1]") WebElement entry_status;
	public @FindBy(xpath = "//span[text()='None']/ancestor::label/span[1]") WebElement shareholderEntry_statusUAE;
	public @FindBy(xpath = "//span[text()='POA']/ancestor::label/span[1]") WebElement POA;
	public @FindBy(xpath = "//div[text()=' Does the Shareholder have a Nominee?']/ancestor::app-radio/div/label[1]/span[1]") WebElement nominee;
	public @FindBy(xpath = "//div[text()=' PEP Declaration required?']/ancestor::app-radio/div/label[2]/span[1]") WebElement pep_Declaration;
	public @FindBy(xpath = "//div[text()=' Proof of address confirmation ?']/ancestor::app-radio/div/label[2]/span[1]") WebElement address_Confi_proof;
	public @FindBy(xpath = "//div[text()=' Source of wealth required ?']/ancestor::app-radio/div/label[2]/span[1]") WebElement source_welth_required;
	public @FindBy(xpath = "//h3[text()=' Are you completing the task through POA? ']/ancestor::div/app-radio/div/div[1]/div[2]/label") WebElement task_POA;

	public @FindBy(xpath = "//span[text()=' Save ']/ancestor::button") WebElement save_btn;
	public @FindBy(xpath = "//h2[text()='Share distribution']") WebElement shareDistrubation;
	public @FindBy(xpath = "//td[@headers='Share allocation']/div/input") WebElement share_enter;

	// Manager information
	public @FindBy(xpath = "//h2[text()='Number of Manager']") WebElement manager_num_txt;
	public @FindBy(xpath = "//a[text()=' Manager 1 ']") WebElement manager1_box;
	public @FindBy(xpath = "//h3[text()=' Existing Meydan user? ']/ancestor::div/app-radio/div/div/div[1]/label/strong/ancestor::label/span") WebElement existingMeydan_selectStakeholder;
	public @FindBy(xpath = "//h3[text()=' Existing Meydan user? ']/ancestor::div/app-radio/div/div/div[2]/label/strong/ancestor::label/span") WebElement exisitingStakeholder;
	public @FindBy(xpath = "//h3[text()=' Existing Meydan user? ']/ancestor::div/app-radio/div/div/div[3]/label/strong/ancestor::label/span") WebElement addManager;

	// Manager information - Select a Stakeholder
	public @FindBy(xpath = "//div[text()=' Does the Manager have a Nominee?']/ancestor::div/label[1]/span[1]") WebElement managerNominee;
	public @FindBy(xpath = "//div[text()=' Are you completing the task through POA?']/ancestor::div/label[1]/span[1]") WebElement managerTask_POA;
	public @FindBy(xpath = "//label[text()='Select Shareholder']/ancestor::div/select/following-sibling::span/span[1]/span") WebElement shareholder_dwn;
	public @FindBy(xpath = "//li[@class='select2-results__option']") WebElement shareholder_value;

	// Manager information - Add manager
	public @FindBy(xpath = "//label[text()='Upload special comments page of passport']/ancestor::div[@class='form-group help-info']/div/div/label") WebElement manager_passportPageFile_open;
	public @FindBy(xpath = "//label[text()='Upload special comments page of passport']/ancestor::app-file/div[2]/div/div/span/div[3]/div/input") WebElement manager_browser_passportPage_img;
	public @FindBy(xpath = "//label[text()='Upload special comments page of passport']/ancestor::app-file/div[2]/div/div/span/div[3]/div/span") WebElement manager_passPage_browseFile_txt;
	public @FindBy(xpath = "//label[text()='Upload special comments page of passport']/ancestor::app-file/div[2]/div/div/span/div[3]/a") WebElement manager_passPageSelect_btn;

	public @FindBy(xpath = "//label[text()='First name']/preceding-sibling::input") WebElement managerFName;
	public @FindBy(xpath = "//label[text()='Last name']/preceding-sibling::input") WebElement managerLname;
	public @FindBy(xpath = "//label[text()='E-mail ID']/preceding-sibling::input") WebElement managerEmail;
	public @FindBy(xpath = "//div[text()=' Does the Manager have a Nominee?']/ancestor::app-radio/div/label[1]/span[1]") WebElement manager_nominee;
	public @FindBy(xpath = "//div[text()=' Activity Questionnaire?']/ancestor::app-radio/div/label[2]/span[1]") WebElement activityQuestion;

	// Director information
	public @FindBy(xpath = "//h2[text()='Number of directors']") WebElement director_num_txt;
	public @FindBy(xpath = "//a[text()=' Director 1 ']") WebElement director1_box;
	public @FindBy(xpath = "//h3[text()=' Existing Meydan user? ']/ancestor::div/div/app-radio/div/div/div[1]/label/strong/ancestor::label/span") WebElement existingMeydan_selectStakeholder_director;
	public @FindBy(xpath = "//h3[text()=' Existing Meydan user? ']/ancestor::div/div/app-radio/div/div/div[2]/label/strong/ancestor::label/span") WebElement exisitingStakeholder_director;
	public @FindBy(xpath = "//h3[text()=' Existing Meydan user? ']/ancestor::div/div/app-radio/div/div/div[3]/label/strong/ancestor::label/span") WebElement addDirector;

	// Manager information - Select a Stakeholder
	public @FindBy(xpath = "//div[text()=' Does the Director have a Nominee?']/ancestor::div/label[1]/span[1]") WebElement directorNominee;

	// Director information - Add director
	public @FindBy(xpath = "//label[text()='First name']/preceding-sibling::input") WebElement directorFName;
	public @FindBy(xpath = "//label[text()='Last name']/preceding-sibling::input") WebElement directorLname;
	public @FindBy(xpath = "//label[text()='E-mail ID']/preceding-sibling::input") WebElement directorEmail;
	public @FindBy(xpath = "//div[text()=' Does the Director have a Nominee?']/ancestor::app-radio/div/label[1]/span[1]") WebElement director_nominee;

	// UBO information
	public @FindBy(xpath = "//h2[text()='UBO Details']") WebElement UBO_details_txt;
	public @FindBy(xpath = "//a[text()=' Details for Shareholder 1 - UBO 1 ']") WebElement UBO1_box;
	public @FindBy(xpath = "//h3[text()=' Existing Meydan user? ']/ancestor::div/div/app-radio/div/div/div[1]/label/strong/ancestor::label/span") WebElement existingMeydan_selectStakeholder_UBO;
	public @FindBy(xpath = "//h3[text()=' Existing Meydan user? ']/ancestor::div/div/app-radio/div/div/div[2]/label/strong/ancestor::label/span") WebElement exisitingStakeholder_UBO;
	public @FindBy(xpath = "//h3[text()=' Existing Meydan user? ']/ancestor::div/div/app-radio/div/div/div[3]/label/strong/ancestor::label/span") WebElement addUBO;

	// UBO information - Select a stakeholder
	public @FindBy(xpath = "//li[@class='select2-results__option'][1]") WebElement shareholder_value_UBO;
	public @FindBy(xpath = "//label[text()='Place Of Birth']/preceding-sibling::input") WebElement birthPlace_UBO;
	public @FindBy(xpath = "//label[text()='Passport issuing country']/ancestor::div/select") WebElement passport_country;
	public @FindBy(xpath = "//label[text()='Nationality']/ancestor::div/select") WebElement nationality;
	public @FindBy(xpath = "//label[text()='Work entity name']/preceding-sibling::input") WebElement workEntity;
	public @FindBy(xpath = "//label[text()='Work entity address']/preceding-sibling::textarea") WebElement entityAddress;
	public @FindBy(xpath = "//label[text()='Share Ownership Percentage']/preceding-sibling::input") WebElement ownPercentage;
	public @FindBy(xpath = "//label[text()='No Of Shares']/preceding-sibling::input") WebElement sharesNo;
	public @FindBy(xpath = "//label[text()='Value Of Shares']/preceding-sibling::input") WebElement sharesVal;
	public @FindBy(xpath = "//label[text()='Representative name']/preceding-sibling::input") WebElement representive_name;
	public @FindBy(xpath = "//label[text()='Representative address']/preceding-sibling::textarea") WebElement representive_add;
	public @FindBy(xpath = "//label[text()='Representative capacity']/preceding-sibling::input") WebElement representive_cap;
	public @FindBy(xpath = "//div[text()=' Do you have any other entities?']/ancestor::app-radio/div/label[2]/span[1]") WebElement entitis;

	public @FindBy(xpath = "//span[text()=' SAVE ']/ancestor::button") WebElement SAVE_btn;

	// UBO information - Existing stakeholder
	public @FindBy(xpath = "//label[text()='Email']/preceding-sibling::input") WebElement existUser_email;
	public @FindBy(xpath = "//label[text()='Passport number']/preceding-sibling::input") WebElement existUser_passNum;
	public @FindBy(xpath = "//h3[text()=' 1UBO - individual or company? ']/ancestor::div/app-radio/div/div/div[1]/label/strong/ancestor::label/span") WebElement UBO_type;
	public @FindBy(xpath = "//label[text()='xFirst Name']/preceding-sibling::input") WebElement firstName_UBO;
	public @FindBy(xpath = "//label[text()='Last Name']/preceding-sibling::input") WebElement lastName_UBO;
	public @FindBy(xpath = "//label[text()='Full name (in Arabic)']/preceding-sibling::input") WebElement fullName_UBO;
	public @FindBy(xpath = "//label[text()='Email']/preceding-sibling::input") WebElement email_UBO;
	public @FindBy(xpath = "//label[text()='Country']/ancestor::div/select") WebElement country_UBO;
	public @FindBy(xpath = "//label[text()='City']/preceding-sibling::input") WebElement city_UBO;
	public @FindBy(xpath = "//div[text()=' Are you a Resident in the UAE?']/ancestor::app-radio/div/label[1]/span[1]") WebElement resident_UAE;

	public @FindBy(xpath = "//label[text()='Emirates ID Copy']/ancestor::div[@class='form-group']/div/div/label") WebElement emiratesIDFile_open;
	public @FindBy(xpath = "//label[text()='Emirates ID Copy']/ancestor::app-file/div[2]/div/div/span/div[3]/div/span") WebElement emiratesID_browseFile_txt;
	public @FindBy(xpath = "//label[text()='Emirates ID Copy']/ancestor::app-file/div[2]/div/div/span/div[3]/div/input") WebElement browser_emiID_img;
	public @FindBy(xpath = "//label[text()='Emirates ID Copy']/ancestor::app-file/div[2]/div/div/span/div[3]/a") WebElement emiIDSselect_btn;

	public @FindBy(xpath = "//label[text()='UAE residence visa']/ancestor::div[@class='form-group help-info']/div/div/label") WebElement UAEvisaFile_open;
	public @FindBy(xpath = "//label[text()='UAE residence visa']/ancestor::app-file/div[2]/div/div/span/div[3]/div/span") WebElement UAEvisa_browseFile_txt;
	public @FindBy(xpath = "//label[text()='UAE residence visa']/ancestor::app-file/div[2]/div/div/span/div[3]/div/input") WebElement browser_UAEvisa_img;
	public @FindBy(xpath = "//label[text()='UAE residence visa']/ancestor::app-file/div[2]/div/div/span/div[3]/a") WebElement UAEvisaSselect_btn;

	public @FindBy(xpath = "//label[text()='Passport copy']/ancestor::div[@class='form-group']/div/div/label") WebElement UAEpassportFile_open;
	public @FindBy(xpath = "//label[text()='Residential Address']/ancestor::div/textarea") WebElement residential_add;

	// Nominee information
	public @FindBy(xpath = "//a[text()=' Details for Shareholder 1 - Nominee ']") WebElement nominee1_box;
	public @FindBy(xpath = "//app-radio/div/div/div[1]/label/strong/ancestor::label/span") WebElement selectStakeholder_nominee;
	public @FindBy(xpath = "//app-radio/div/div/div[2]/label/strong/ancestor::label/span") WebElement exisitingStakeholder_nominee;
	public @FindBy(xpath = "//app-radio/div/div/div[3]/label/strong/ancestor::label/span") WebElement addNominee;

	// Nominee information - Add nominee
	public @FindBy(xpath = "//span[text()='Entity']/ancestor::label/span[1]") WebElement nominee_type;
	public @FindBy(xpath = "//label[text()='yFirst Name']/preceding-sibling::input") WebElement firstName_nominee;
	public @FindBy(xpath = "//label[text()='Last Name']/preceding-sibling::input") WebElement lastName_nominee;
	public @FindBy(xpath = "//label[text()='Email']/preceding-sibling::input") WebElement email_nominee;
	public @FindBy(xpath = "//label[text()='Place Of Birth']/preceding-sibling::input") WebElement birthPlace_nominee;

	public @FindBy(xpath = "//label[text()='Passport copy']/ancestor::div[@class='form-group']/div/div/label") WebElement nomineephotoFile_open;
	public @FindBy(xpath = "//label[text()='Passport Number']/ancestor::div/input") WebElement nominee_passportNum;

	// General declaration
	public @FindBy(xpath = "//h2[text()='Activity declaration']") WebElement activityDeclaration;
	public @FindBy(xpath = "//label[text()=' None of the above ']") WebElement activity_type;
	
	// Review application
	public @FindBy(xpath = "//h2[text()='Shareholder information']") WebElement shareholderInformation_txt;
	
	//Payment
	public @FindBy(xpath = "//h2[text()='Summary & breakdown of fees']") WebElement summary_fees;
	public @FindBy(xpath = "//span[text()='Cash']/ancestor::span/div/label") WebElement payment_method;
	public @FindBy(xpath = "//span[text()=' Submit ']/ancestor::button") WebElement company_submit_btn;
	
	
	public @FindBy(xpath = "//a[text()='Go To Dashboard ']") WebElement dashboard_btn;
	
}
