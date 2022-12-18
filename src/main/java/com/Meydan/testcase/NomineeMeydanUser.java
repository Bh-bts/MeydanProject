/**
 * 
 */
package com.Meydan.testcase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

/**
 * @author Bhavin
 *
 */
public class NomineeMeydanUser extends UBOMeydanUser {

	public void nomineeMeydan_user_selectStakeholder() {

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));

		selectStakeholder_nominee.click();

		w.until(ExpectedConditions.visibilityOf(shareholder_dwn));
		shareholder_dwn.click();
		shareholder_value_UBO.click();

	}
	
	public void nomineeMeydan_user_existStakeholder() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		exisitingStakeholder_nominee.click();
		
		
		
		
	}
	
	public void nomineeMeydan_user_addNew() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
		Faker faker = new Faker();
		
		addNominee.click();
		
		w.until(ExpectedConditions.visibilityOf(nominee_type));
		js.executeScript("arguments[0].scrollIntoView(true);", nominee_type);
		nominee_type.click();
		
		js.executeScript("arguments[0].scrollIntoView(true);", firstName_nominee);
		String fname = faker.name().firstName();
		firstName_nominee.sendKeys(fname);
		
		String lname = faker.name().lastName();
		lastName_nominee.sendKeys(lname);
		
		String domain = "@gmail.com";
		String shareEmail = fname.toLowerCase() + "." + lname.toLowerCase() + domain;
		email_nominee.sendKeys(shareEmail);
		System.out.println("Nominee Email is : " + ANSI_GREEN + email_nominee.getAttribute("value") + ANSI_RESET + '\n');
		
		js.executeScript("arguments[0].scrollIntoView(true);", birthPlace_nominee);
		String place = faker.address().city();
		birthPlace_nominee.sendKeys(place);
		
		genderSelect.click();
		
		Select nationality_nominee = new Select(nationality);
		nationality_nominee.selectByVisibleText("India");
		
		w.until(ExpectedConditions.visibilityOf(nomineephotoFile_open));
		js.executeScript("arguments[0].scrollIntoView(true);", nomineephotoFile_open);
		String projectPath = System.getProperty("user.dir");
		nomineephotoFile_open.click();
		w.until(ExpectedConditions.visibilityOf(pass_browseFile_txt));
		browser_passport_img.sendKeys(projectPath + "\\SampleData\\Sample-Image.jpg");
		passSselect_btn.click();
		
		w.until(ExpectedConditions.invisibilityOf(pageLoder));
		js.executeScript("arguments[0].scrollIntoView(true);", nominee_passportNum);
		String passportNum = faker.number().digits(8);
		nominee_passportNum.sendKeys(passportNum);
		
		System.out.println(
				"Nominee passport number is : " + ANSI_GREEN + nominee_passportNum.getAttribute("value") + ANSI_RESET + '\n');

		
		
		
	}

}
