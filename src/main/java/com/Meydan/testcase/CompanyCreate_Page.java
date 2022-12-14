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
public class CompanyCreate_Page extends CompanyCreate_Obj{
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public void newCompany(String id, String password) {
		
		try {
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
		
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
		
		
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			
		}
		
		
	}

}
