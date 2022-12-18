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
public class DirectorMeydanUser extends ManagerMeydanUser {

	public void directorMeydan_user_selectStakeholder() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));

		existingMeydan_selectStakeholder_director.click();

		w.until(ExpectedConditions.visibilityOf(directorNominee));
		js.executeScript("arguments[0].scrollIntoView(true);", directorNominee);
		directorNominee.click();

		managerTask_POA.click();

		js.executeScript("arguments[0].scrollIntoView(true);", shareholder_dwn);
		shareholder_dwn.click();
		shareholder_value.click();

	}

	public void directrMeydan_user_existStakeholder() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));

		exisitingStakeholder_director.click();

		w.until(ExpectedConditions.visibilityOf(directorNominee));
		js.executeScript("arguments[0].scrollIntoView(true);", directorNominee);
		directorNominee.click();

		managerTask_POA.click();

	}

	public void directorMeydan_user_addNew() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
		Faker faker = new Faker();

		addDirector.click();

		w.until(ExpectedConditions.visibilityOf(passportFile_open));
		js.executeScript("arguments[0].scrollIntoView(true);", passportFile_open);
		String projectPath = System.getProperty("user.dir");
		passportFile_open.click();
		w.until(ExpectedConditions.visibilityOf(pass_browseFile_txt));
		browser_passport_img.sendKeys(projectPath + "\\SampleData\\Sample-Image.jpg");
		passSselect_btn.click();

		w.until(ExpectedConditions.invisibilityOf(pageLoder));
		js.executeScript("arguments[0].scrollIntoView(true);", manager_passportPageFile_open);
		manager_passportPageFile_open.click();
		w.until(ExpectedConditions.visibilityOf(manager_passPage_browseFile_txt));
		manager_browser_passportPage_img.sendKeys(projectPath + "\\SampleData\\Sample-Image.jpg");
		manager_passPageSelect_btn.click();

		w.until(ExpectedConditions.invisibilityOf(pageLoder));
		String directorfname = faker.name().firstName();
		directorFName.sendKeys(directorfname);

		String directorlname = faker.name().lastName();
		directorLname.sendKeys(directorlname);

		js.executeScript("arguments[0].scrollIntoView(true);", genderSelect);
		genderSelect.click();

		String domain = "@gmail.com";
		String shareEmail = directorfname.toLowerCase() + "." + directorlname.toLowerCase() + domain;
		directorEmail.sendKeys(shareEmail);
		System.out
				.println("Director Email is : " + ANSI_GREEN + directorEmail.getAttribute("value") + ANSI_RESET + '\n');

		String directorTelnumber = faker.number().digits(8);
		telphone.sendKeys(directorTelnumber);

		Select nationality = new Select(nationality_dwn);
		nationality.selectByVisibleText("India");

		String directorAddress1 = faker.address().fullAddress();
		address1.sendKeys(directorAddress1);

		String directorAddress2 = faker.address().fullAddress();
		address2.sendKeys(directorAddress2);

		String directorCity = faker.address().city();
		city.sendKeys(directorCity);

		js.executeScript("arguments[0].scrollIntoView(true);", country);
		Select directorCountry = new Select(country);
		directorCountry.selectByVisibleText("India");

		String passport = faker.number().digits(8);
		passportNumber.sendKeys(passport);
		System.out.println("Director passport number is : " + ANSI_GREEN + passportNumber.getAttribute("value")
				+ ANSI_RESET + '\n');

		String pass_location = faker.address().city();
		passLocation.sendKeys(pass_location);

		String visaNum = faker.number().digits(5);
		visanum.sendKeys(visaNum);

		String emir_ID = faker.number().digits(7);
		emirID.sendKeys(emir_ID);

		js.executeScript("arguments[0].scrollIntoView(true);", entry_status);
		entry_status.click();

		js.executeScript("arguments[0].scrollIntoView(true);", director_nominee);
		director_nominee.click();
		pep_Declaration.click();

		js.executeScript("arguments[0].scrollIntoView(true);", address_Confi_proof);
		address_Confi_proof.click();
		source_welth_required.click();
		managerTask_POA.click();

	}

}
