/**
 * 
 */
package com.Meydan.testcase;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Meydan.Obj.CompanyCreate_Obj;

/**
 * @author Bhavin.Thumar
 *
 */
public class CompanyCreate_Page extends CompanyCreate_Obj {

	public void newCompany(String id, String password) {

		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(100));

			email_txt.sendKeys(id);
			pass_txt.sendKeys(password);
			js.executeScript("arguments[0].scrollIntoView(true);", submit_btn);
			submit_btn.click();

			w.until(ExpectedConditions.visibilityOf(setup_cmp_btn));

			setup_cmp_btn.click();
			close_btn.click();
			setup_new_cmp_btn.click();
			start_process_btn.click();

			w.until(ExpectedConditions.visibilityOf(establishment_text));

			establishment_type.click();
			w.until(ExpectedConditions.visibilityOf(company_type));
			js.executeScript("arguments[0].scrollIntoView(true);", company_type);
			company_type.click();
			
			next_btn1.click();

			w.until(ExpectedConditions.visibilityOf(business_acitivity));
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
			
			js.executeScript("arguments[0].scrollIntoView(true);", suggestAct_box2);
			suggestAct_box2.click();
			js.executeScript("arguments[0].scrollIntoView(true);", Reproduction_chkbox1);
			String Reproduction_chkbox = ".material_label_checkbox";
			((JavascriptExecutor) driver).executeScript("document.querySelector(\"label[for='group_checkbox_2']\",':before').click();",Reproduction_chkbox);
			
			next_btn2.click();

		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());

		}

	}

}
