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
public class ShareholderMeydanUser extends CompanyCreate_Obj {

	public void shareholderMeydan_user_yes() {

		try {

			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(100));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			w.until(ExpectedConditions.visibilityOf(existingMeydan_yes));
			js.executeScript("arguments[0].scrollIntoView(true);", existingMeydan_yes);
			existingMeydan_yes.click();

			w.until(ExpectedConditions.visibilityOf(shareholderNominee));
			js.executeScript("arguments[0].scrollIntoView(true);", shareholderNominee);
			shareholderNominee.click();

			js.executeScript("arguments[0].scrollIntoView(true);", shareholder_or_POA);
			shareholder_or_POA.click();

			js.executeScript("arguments[0].scrollIntoView(true);", comp_task_throgh_POA);
			comp_task_throgh_POA.click();

			js.executeScript("arguments[0].scrollIntoView(true);", existEmail);

		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());

		}

	}
	
	public void shareholderMeydan_user_no() {
		
		try {
			
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(100));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			w.until(ExpectedConditions.visibilityOf(existingMeydan_no));
			js.executeScript("arguments[0].scrollIntoView(true);", existingMeydan_no);
			existingMeydan_no.click();
			
			
			
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			
		}
		
		
		
	}
}
