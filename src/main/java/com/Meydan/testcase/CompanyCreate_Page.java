/**
 * 
 */
package com.Meydan.testcase;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Meydan.Obj.CompanyCreate_Obj;
import com.github.javafaker.Faker;

/**
 * @author Bhavin.Thumar
 *
 */
public class CompanyCreate_Page extends CompanyCreate_Obj {

	public void newCompany(String id, String password) {

		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(80));
			Faker faker = new Faker();

			//Login page
			email_txt.sendKeys(id);
			pass_txt.sendKeys(password);
			js.executeScript("arguments[0].scrollIntoView(true);", submit_btn);
			submit_btn.click();

			w.until(ExpectedConditions.visibilityOf(setup_cmp_btn));

			//Before start company creation
			setup_cmp_btn.click();
			close_btn.click();
			setup_new_cmp_btn.click();
			start_process_btn.click();
			
			//Formation package (Page 1)
			w.until(ExpectedConditions.visibilityOf(establishment_type));

			establishment_type.click();
			w.until(ExpectedConditions.visibilityOf(company_type));
			js.executeScript("arguments[0].scrollIntoView(true);", company_type);
			company_type.click();
			
			next_btn.click();
			
			//Business Activity (Page 2)
			w.until(ExpectedConditions.visibilityOf(business_acitivity));
			js.executeScript("arguments[0].scrollIntoView(true);", business_acitivity);
			business_acitivity.click();
			w.until(ExpectedConditions.visibilityOf(businessCate_chkbox1));
			js.executeScript("arguments[0].scrollIntoView(true);", businessCate_chkbox1);
			String businessCate_chkbox = ".material_label_checkbox";
			((JavascriptExecutor) driver).executeScript("document.querySelector(\"label[for='category_1']\",':before').click();",businessCate_chkbox);
			
			w.until(ExpectedConditions.visibilityOf(businessSubCare_chkbox1));
			js.executeScript("arguments[0].scrollIntoView(true);", businessSubCare_chkbox1);
			String businessSubCare_chkbox = ".material_label_checkbox";
			((JavascriptExecutor) driver).executeScript("document.querySelector(\"label[for='subCategory_2']\",':before').click();",businessSubCare_chkbox);
			
			w.until(ExpectedConditions.visibilityOf(suggestAct_box1));
			suggestAct_box1.click();
			js.executeScript("arguments[0].scrollIntoView(true);", Print_chkbox1);
			String Print_chkbox = ".material_label_checkbox";
			((JavascriptExecutor) driver).executeScript("document.querySelector(\"label[for='group_checkbox_1']\",':before').click();",Print_chkbox);
			
			w.until(ExpectedConditions.visibilityOf(suggestAct_box2));
			js.executeScript("arguments[0].scrollIntoView(true);", suggestAct_box2);
			suggestAct_box2.click();
			js.executeScript("arguments[0].scrollIntoView(true);", Reproduction_chkbox1);
			String Reproduction_chkbox = ".material_label_checkbox";
			((JavascriptExecutor) driver).executeScript("document.querySelector(\"label[for='group_checkbox_2']\",':before').click();",Reproduction_chkbox);
			
			js.executeScript("arguments[0].scrollIntoView(true);", next_btn);
			next_btn.click();
			
			//Company Information
			w.until(ExpectedConditions.visibilityOf(licence_dropdwn));
			licence_dropdwn.click();
			licence_year.click();
			js.executeScript("arguments[0].scrollIntoView(true);", reservedCmp);
			reservedCmp.click();
			
			w.until(ExpectedConditions.visibilityOf(primaryLang));
			js.executeScript("arguments[0].scrollIntoView(true);", primaryLang);
			primaryLang.click();
			
			w.until(ExpectedConditions.visibilityOf(cmpName1));
			js.executeScript("arguments[0].scrollIntoView(true);", cmpName1);
			String preferredCmp1 = faker.company().name();
			cmpName1.sendKeys(preferredCmp1);
			
			String preferredCmp2 = faker.company().name();
			cmpName2.sendKeys(preferredCmp2);
			
			String preferredCmp3 = faker.company().name();
			cmpName3.sendKeys(preferredCmp3);
			
			System.out.println("Company Name : " + cmpName1.getAttribute("value") + '\n');
			w.until(ExpectedConditions.visibilityOf(cmpNameTrans));
			js.executeScript("arguments[0].scrollIntoView(true);", cmpNameTrans);
			cmpNameTrans.click();
			
//			w.until(ExpectedConditions.visibilityOf(attroneyPower));
//			js.executeScript("arguments[0].scrollIntoView(true);", attroneyPower);
//			attroneyPower.click();
			
			js.executeScript("arguments[0].scrollIntoView(true);", next_btn);
			next_btn.click();
			
			//Visa Allocation
			w.until(ExpectedConditions.visibilityOf(visaCount));
			visaCount.click();
			js.executeScript("arguments[0].scrollIntoView(true);", next_btn);
			next_btn.click();
			
			//Immigration card
			w.until(ExpectedConditions.visibilityOf(visaProcess));
			visaProcess.click();
			js.executeScript("arguments[0].scrollIntoView(true);", next_btn);
			next_btn.click();
			
			//Office facility
			w.until(ExpectedConditions.visibilityOf(facilityType_txt));
			js.executeScript("arguments[0].scrollIntoView(true);", next_btn);
			next_btn.click();
			
			//Shareholder information
			w.until(ExpectedConditions.visibilityOf(shareQuantity_txt));
			js.executeScript("arguments[0].scrollIntoView(true);", shareholder1_box);
			shareholder1_box.click();
			
			ShareholderMeydanUser exisitUser_yes = PageFactory.initElements(driver, ShareholderMeydanUser.class);
			exisitUser_yes.shareholderMeydan_user_no();
			
			
			
			

		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());

		}

	}

}
