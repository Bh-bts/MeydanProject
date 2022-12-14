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
	public @FindBy(xpath = "//button[@type='submit']") WebElement next_btn1;
	
	//Business Activity (Page 2)
	public @FindBy(xpath = "//span[text()='Help me select my business activities']/ancestor::label/span[1]") WebElement business_acitivity;
	public @FindBy(css = ".material_label_checkbox") WebElement businessCate_chkbox1; 
	public @FindBy(css = ".material_label_checkbox") WebElement businessSubCare_chkbox1; 
	
	public @FindBy(xpath = "//a[text()=' 1810.00 - Printing and service activities related to printing  ']/button") WebElement suggestAct_box1;
	public @FindBy(css = ".material_label_checkbox") WebElement Print_chkbox1; 
	
	public @FindBy(xpath = "//a[text()=' 1820.00 - Reproduction of recorded media  ']/button") WebElement suggestAct_box2;
	public @FindBy(css = ".material_label_checkbox") WebElement Reproduction_chkbox1;
	public @FindBy(xpath = "//button[@type='submit']") WebElement next_btn2;
	
	
	
	

}
