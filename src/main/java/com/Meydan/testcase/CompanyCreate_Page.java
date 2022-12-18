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
			
			System.out.println("Company Name : " + ANSI_BLUE + cmpName1.getAttribute("value") + ANSI_RESET + '\n');
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
			String count = shareCount.getAttribute("value");
			js.executeScript("arguments[0].scrollIntoView(true);", shareholder1_box);
			shareholder1_box.click();
			
			ShareholderMeydanUser exisitUser = PageFactory.initElements(driver, ShareholderMeydanUser.class);
			exisitUser.shareholderMeydan_user_no();
			
			js.executeScript("arguments[0].scrollIntoView(true);", save_btn);
			save_btn.click();
			w.until(ExpectedConditions.visibilityOf(shareDistrubation));
			js.executeScript("arguments[0].scrollIntoView(true);", shareDistrubation);
			share_enter.sendKeys(count); 
			w.until(ExpectedConditions.visibilityOf(next_btn));
			next_btn.click();
			
			//Manager information
			w.until(ExpectedConditions.visibilityOf(manager_num_txt));
			js.executeScript("arguments[0].scrollIntoView(true);", manager1_box);
			manager1_box.click();
			
			w.until(ExpectedConditions.visibilityOf(existingMeydan_selectStakeholder));
			js.executeScript("arguments[0].scrollIntoView(true);", existingMeydan_selectStakeholder);
			
			ManagerMeydanUser stakeholder = PageFactory.initElements(driver, ManagerMeydanUser.class);
			stakeholder.managerMeydan_user_addNew();
			
			save_btn.click();
			w.until(ExpectedConditions.visibilityOf(next_btn_txt));
			next_btn.click();
			
			//Director information
			w.until(ExpectedConditions.visibilityOf(director_num_txt));
			js.executeScript("arguments[0].scrollIntoView(true);", director1_box);
			director1_box.click();
			
			w.until(ExpectedConditions.visibilityOf(existingMeydan_selectStakeholder_director));
			js.executeScript("arguments[0].scrollIntoView(true);", existingMeydan_selectStakeholder_director);
			
			DirectorMeydanUser stakeholder_manager = PageFactory.initElements(driver, DirectorMeydanUser.class);
			stakeholder_manager.directorMeydan_user_addNew();
			
			save_btn.click();
			w.until(ExpectedConditions.visibilityOf(next_btn_txt));
			next_btn.click();
			
			//UBO information
			w.until(ExpectedConditions.visibilityOf(UBO_details_txt));
			js.executeScript("arguments[0].scrollIntoView(true);", UBO1_box);
			UBO1_box.click();
			
			w.until(ExpectedConditions.visibilityOf(existingMeydan_selectStakeholder_UBO));
			js.executeScript("arguments[0].scrollIntoView(true);", existingMeydan_selectStakeholder_UBO);
			
			UBOMeydanUser stakeholder_UBO = PageFactory.initElements(driver, UBOMeydanUser.class);
			stakeholder_UBO.UBOMeydan_user_addNew();
			
			SAVE_btn.click();
			w.until(ExpectedConditions.invisibilityOf(entitis));
			next_btn.click();
			
			//Nominee information
			w.until(ExpectedConditions.visibilityOf(nominee1_box));
			js.executeScript("arguments[0].scrollIntoView(true);", nominee1_box);
			nominee1_box.click();
			
			w.until(ExpectedConditions.visibilityOf(selectStakeholder_nominee));
			js.executeScript("arguments[0].scrollIntoView(true);", selectStakeholder_nominee);
			
			NomineeMeydanUser stakeholder_nominee = PageFactory.initElements(driver, NomineeMeydanUser.class);
			stakeholder_nominee.nomineeMeydan_user_addNew_shareholder1();
			
			NomineeMeydanUser manager_nominee = PageFactory.initElements(driver, NomineeMeydanUser.class);
			manager_nominee.nomineeMeydan_user_addNew_manager1();
			
			js.executeScript("arguments[0].scrollIntoView(true);", SAVE_btn);
			SAVE_btn.click();
			w.until(ExpectedConditions.invisibilityOf(shareholder_value_UBO));
			next_btn.click();
			
			w.until(ExpectedConditions.visibilityOf(activityDeclaration));
			activity_type.click();
			
			w.until(ExpectedConditions.visibilityOf(next_btn));
			js.executeScript("arguments[0].scrollIntoView(true);", next_btn);
			next_btn.click();
			
			w.until(ExpectedConditions.visibilityOf(shareholderInformation_txt));
			js.executeScript("arguments[0].scrollIntoView(true);", next_btn);
			next_btn.click();
			
			w.until(ExpectedConditions.visibilityOf(payment_method));
			js.executeScript("arguments[0].scrollIntoView(true);", payment_method);
			payment_method.click();
			js.executeScript("arguments[0].scrollIntoView(true);", company_submit_btn);
			company_submit_btn.click();
			
			w.until(ExpectedConditions.visibilityOf(dashboard_btn));
			dashboard_btn.click();
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());

		}

	}

}
