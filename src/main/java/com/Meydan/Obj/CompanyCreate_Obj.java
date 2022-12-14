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
	
	//Before start company
	public @FindBy(xpath = "//button[@class='btn btn-block btn-secondary']") WebElement setup_cmp_btn;
	public @FindBy(xpath = "//button[@aria-label='Close']") WebElement close_btn;
	public @FindBy(xpath = "//h3[text()='Setup New Company ']/ancestor::div[@class='formation cursor-pointer ng-star-inserted']") WebElement setup_new_cmp_btn;
	public @FindBy(xpath = "//span[text()='Start Process']/ancestor::button") WebElement start_process_btn;
	
	//Formation package
	public @FindBy(xpath = "//h2[text()='Establishment package']") WebElement establishment_text;
	public @FindBy(xpath = "//span[text()='Standard Formation']/ancestor::label/span[1]") WebElement establishment_type;
	public @FindBy(xpath = "//strong[text()='Limited Liability Company']/ancestor::label/span") WebElement company_type;
	public @FindBy(xpath = "//button[@type='submit']") WebElement next_btn1;
	
	
	

}
