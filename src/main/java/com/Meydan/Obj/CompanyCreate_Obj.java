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
public class CompanyCreate_Obj extends AllBrowsers{
	
	//Login page
	public @FindBy(xpath = "//input[@type='email']") WebElement email_txt;
	public @FindBy(xpath = "//input[@type='password']") WebElement pass_txt;
	public @FindBy(xpath = "//button[@type='submit']") WebElement submit_btn;
	
	//Before start company creation
	public @FindBy(xpath = "//button[@class='btn btn-block btn-secondary']") WebElement setup_cmp_btn;
	public @FindBy(xpath = "//button[@aria-label='Close']") WebElement close_btn;
	public @FindBy(xpath = "//h3[text()='Setup New Company ']/ancestor::div[@class='formation cursor-pointer ng-star-inserted']") WebElement setup_new_cmp_btn;
	public @FindBy(xpath = "//span[text()='Start Process']/ancestor::button") WebElement start_process_btn;
	
	//Formation package (Page 1)
	public @FindBy(xpath = "//h2[text()='Establishment package']") WebElement establishment_text;
	public @FindBy(xpath = "//span[text()='Standard Formation']/ancestor::label/span[1]") WebElement establishment_type;
	public @FindBy(xpath = "//strong[text()='Limited Liability Company']/ancestor::label/span") WebElement company_type;
	public @FindBy(xpath = "//button[@type='submit']") WebElement next_btn;
	
	//Business Activity (Page 2)
	public @FindBy(xpath = "//span[text()='Help me select my business activities']/ancestor::label/span[1]") WebElement business_acitivity;
	public @FindBy(css = ".material_label_checkbox") WebElement businessCate_chkbox1; 
	public @FindBy(css = ".material_label_checkbox") WebElement businessSubCare_chkbox1; 
	
	public @FindBy(xpath = "//a[text()=' 1810.00 - Printing and service activities related to printing  ']/button") WebElement suggestAct_box1;
	public @FindBy(css = ".material_label_checkbox") WebElement Print_chkbox1; 
	
	public @FindBy(xpath = "//a[text()=' 1820.00 - Reproduction of recorded media  ']/button") WebElement suggestAct_box2;
	public @FindBy(css = ".material_label_checkbox") WebElement Reproduction_chkbox1;
	
	//Company Information
	public @FindBy(xpath = "//span[@role='combobox']") WebElement licence_dropdwn;
	public @FindBy(xpath = "//li[text()='1 year']") WebElement licence_year;
	public @FindBy(xpath = "//strong[text()='No']/ancestor::label/span") WebElement reservedCmp;
	public @FindBy(xpath = "//strong[text()='English']/ancestor::label/span") WebElement primaryLang;
	
	public @FindBy(xpath = "//label[text()='Preferred company name 1']/ancestor::div/input") WebElement cmpName1;
	public @FindBy(xpath = "//label[text()='Preferred company name 2']/ancestor::div/input") WebElement cmpName2;
	public @FindBy(xpath = "//label[text()='Preferred company name 3']/ancestor::div/input") WebElement cmpName3;
	public @FindBy(xpath = "//strong[text()='Direct translation']/ancestor::label/span") WebElement cmpNameTrans;
	
	public @FindBy(xpath = "//p[text()='Do you want to assign power of attorney?']/ancestor::div/div[2]/div/app-radio/div/div/div[2]/label/span") WebElement attroneyPower;
	
	//Visa Allocation
	public @FindBy(xpath = "//a[text()='1']") WebElement visaCount;
	
	//Immigration card
	public @FindBy(xpath = "//strong[text()='No']/ancestor::label/span") WebElement visaProcess;
	
	//Shareholder information
	public @FindBy(xpath = "//label[text()='Number of shareholders ']/ancestor::div/input") WebElement shareholderNub;
	public @FindBy(xpath = "//h2[text()='Share quantity and value']") WebElement shareQuantity_txt;
	public @FindBy(xpath = "//a[text()=' Shareholder 1 ']") WebElement shareholder1_box;
	public @FindBy(xpath = "//h3[text()=' Existing Meydan user? ']/ancestor::div/app-radio/div/div/div[1]/label/strong/ancestor::label/span") WebElement existingMeydan_yes;
	public @FindBy(xpath = "//h3[text()=' Existing Meydan user? ']/ancestor::div/app-radio/div/div/div[2]/label/strong/ancestor::label/span") WebElement existingMeydan_no;
	
	//Shareholder information - Existing user
	public @FindBy(xpath = "//div[text()=' Does the Shareholder have a Nominee?']/ancestor::div/label[1]/span[1]") WebElement shareholderNominee;
	public @FindBy(xpath = "//span[text()='Shareholder']/ancestor::label/span[1]") WebElement shareholder_or_POA;
	public @FindBy(xpath = "//h3[text()=' Are you completing the task through POA? ']/ancestor::div/app-radio/div/div/div[2]/label/strong/ancestor::label/span") WebElement comp_task_throgh_POA;
	public @FindBy(xpath = "//label[text()='Email']/ancestor::div/input") WebElement existEmail;
	public @FindBy(xpath = "//label[text()='Passport number']/ancestor::div/input") WebElement existPassportNum;

	//Shareholder information - New user
	public @FindBy(xpath = "//h3[text()=' Select the type of Shareholder ']/ancestor::div/app-radio/div/div/div[1]/label/strong/ancestor::label/span") WebElement shareholder_type;
	public @FindBy(xpath = "//label[text()='Passport copy']/ancestor::app-file/div[2]/div/div/span/div[3]/div/input") WebElement passport_img;
	
	

	
	
	
	

}
