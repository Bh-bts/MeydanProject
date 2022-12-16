/**
 * 
 */
package com.Meydan.testcase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Meydan.Obj.CompanyCreate_Obj;
import com.github.javafaker.Faker;

/**
 * @author Bhavin.Thumar
 *
 */
public class ShareholderMeydanUser extends CompanyCreate_Obj {

	public void shareholderMeydan_user_yes() {

		try {

			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
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
			
			Faker faker = new Faker();
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].scrollIntoView(true);", existingMeydan_no);
			w.until(ExpectedConditions.visibilityOf(existingMeydan_no));
			existingMeydan_no.click();
			
			w.until(ExpectedConditions.visibilityOf(shareholder_type));
			shareholder_type.click();
			
			w.until(ExpectedConditions.visibilityOf(passportFile_open));
			js.executeScript("arguments[0].scrollIntoView(true);", passportFile_open);
			String projectPath = System.getProperty("user.dir");
			passportFile_open.click();
			w.until(ExpectedConditions.visibilityOf(pass_browseFile_txt));
			browser_passport_img.sendKeys(projectPath + "\\SampleData\\Sample-Image.jpg");
			passSselect_btn.click();
			
			w.until(ExpectedConditions.invisibilityOf(pageLoder));
			js.executeScript("arguments[0].scrollIntoView(true);", passportPageFile_open);
			passportPageFile_open.click();
			w.until(ExpectedConditions.visibilityOf(passPage_browseFile_txt));
			browser_passportPage_img.sendKeys(projectPath + "\\SampleData\\Sample-Image.jpg");
			passPageSelect_btn.click();
			
			w.until(ExpectedConditions.invisibilityOf(pageLoder));
			js.executeScript("arguments[0].scrollIntoView(true);", passportPhotoFile_open);
			passportPhotoFile_open.click();
			w.until(ExpectedConditions.visibilityOf(passPhoto_browseFile_txt));
			browser_PassportPhoto_img.sendKeys(projectPath + "\\SampleData\\Sample-Image.jpg");
			passPhotoSelect_btn.click();
			
			w.until(ExpectedConditions.invisibilityOf(pageLoder));
			String shareholderfname = faker.name().firstName();
			shareholderFName.sendKeys(shareholderfname);
			
			String shareholderlname = faker.name().lastName();
			shareholderLname.sendKeys(shareholderlname);
			
			js.executeScript("arguments[0].scrollIntoView(true);", genderSelect);
			genderSelect.click();
			
			String domain = "@gmail.com";
			String shareEmail = shareholderfname.toLowerCase() + "." + shareholderlname.toLowerCase() + domain;
			shareholderEmail.sendKeys(shareEmail);
			System.out.println("Shareholder Email is : " + shareholderEmail.getAttribute("value") + '\n');
			
			String shareholderTelnumber = faker.number().digits(8);
			shareholderTelphone.sendKeys(shareholderTelnumber);
			
			js.executeScript("arguments[0].scrollIntoView(true);", shareholderBirthPlace);
			String shareBirthplace = faker.address().city();
			shareholderBirthPlace.sendKeys(shareBirthplace);
			
			Select nationality = new Select(shareholderNationality);
			nationality.selectByVisibleText("India");
			
			String shareAddress1 = faker.address().fullAddress();
			shareholderAddress1.sendKeys(shareAddress1);
			
			String shareAddress2 = faker.address().fullAddress();
			shareholderAddress2.sendKeys(shareAddress2);
			
			String shareCity = faker.address().city();
			shareholderCity.sendKeys(shareCity);
			
			js.executeScript("arguments[0].scrollIntoView(true);", shareholderCountry);
			Select country = new Select(shareholderCountry);
			country.selectByVisibleText("India");
			
			String passport = faker.number().digits(8);
			shareholderPassportNumber.sendKeys(passport);
			System.out.println("Shareholder passport number is : " + shareholderPassportNumber.getAttribute("value") + '\n');
			
			String pass_location = faker.address().city();
			shareholderPass_location.sendKeys(pass_location);
			
			String visaNum = faker.number().digits(5);
			shareholderVisanum.sendKeys(visaNum);
			
			String emirID = faker.number().digits(7);
			shareholderEmirID.sendKeys(emirID);
			
			
			
			
			
			
			
			
			
			
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			
		}
		
		
		
	}
}
