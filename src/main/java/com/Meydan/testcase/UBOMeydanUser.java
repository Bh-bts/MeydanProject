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
public class UBOMeydanUser extends DirectorMeydanUser {

	public void UBOMeydan_user_selectStakeholder() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
		Faker faker = new Faker();

		existingMeydan_selectStakeholder_UBO.click();

		w.until(ExpectedConditions.visibilityOf(shareholder_dwn));
		shareholder_dwn.click();
		shareholder_value_UBO.click();

		w.until(ExpectedConditions.visibilityOf(birthPlace_UBO));
		js.executeScript("arguments[0].scrollIntoView(true);", birthPlace_UBO);
		String birthplc = faker.address().city();
		birthPlace_UBO.sendKeys(birthplc);

		Select nationality = new Select(passport_country);
		nationality.selectByVisibleText("India");

		js.executeScript("arguments[0].scrollIntoView(true);", workEntity);
		String entityName = faker.name().firstName();
		workEntity.sendKeys(entityName);

		String entityAdd = faker.address().fullAddress();
		entityAddress.sendKeys(entityAdd);

		String perce = faker.number().digits(2);
		ownPercentage.sendKeys(perce);

		js.executeScript("arguments[0].scrollIntoView(true);", sharesNo);
		sharesNo.sendKeys("1");

		sharesVal.sendKeys("1");

		String repName = faker.name().fullName();
		representive_name.sendKeys(repName);

		String repAdd = faker.address().fullAddress();
		representive_add.sendKeys(repAdd);

		js.executeScript("arguments[0].scrollIntoView(true);", representive_cap);
		String repCap = faker.random().toString();
		representive_cap.sendKeys(repCap);

		entitis.click();

	}

	public void UBOMeydan_user_existStakeholder() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
		Faker faker = new Faker();

		exisitingStakeholder_UBO.click();

		w.until(ExpectedConditions.visibilityOf(existUser_email));

		w.until(ExpectedConditions.visibilityOf(birthPlace_UBO));
		js.executeScript("arguments[0].scrollIntoView(true);", birthPlace_UBO);
		String birthplc = faker.address().city();
		birthPlace_UBO.sendKeys(birthplc);

		Select nationality = new Select(passport_country);
		nationality.selectByVisibleText("India");

		js.executeScript("arguments[0].scrollIntoView(true);", workEntity);
		String entityName = faker.name().firstName();
		workEntity.sendKeys(entityName);

		String entityAdd = faker.address().fullAddress();
		entityAddress.sendKeys(entityAdd);

		String perce = faker.number().digits(2);
		ownPercentage.sendKeys(perce);

		js.executeScript("arguments[0].scrollIntoView(true);", sharesNo);
		sharesNo.sendKeys("1");

		sharesVal.sendKeys("1");

		String repName = faker.name().fullName();
		representive_name.sendKeys(repName);

		String repAdd = faker.address().fullAddress();
		representive_add.sendKeys(repAdd);

		js.executeScript("arguments[0].scrollIntoView(true);", representive_cap);
		String repCap = faker.random().toString();
		representive_cap.sendKeys(repCap);

		entitis.click();

	}

	public void UBOMeydan_user_addNew() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
		Faker faker = new Faker();

		addUBO.click();

		w.until(ExpectedConditions.visibilityOf(UBO_type));
		js.executeScript("arguments[0].scrollIntoView(true);", UBO_type);
		UBO_type.click();

		w.until(ExpectedConditions.visibilityOf(genderSelect));
		genderSelect.click();

		js.executeScript("arguments[0].scrollIntoView(true);", firstName_UBO);
		String fnameUBO = faker.name().firstName();
		firstName_UBO.sendKeys(fnameUBO);

		String lnameUBO = faker.name().lastName();
		lastName_UBO.sendKeys(lnameUBO);

		String fullnameUBO = fnameUBO + lnameUBO;
		fullName_UBO.sendKeys(fullnameUBO);

		String domain = "@gmail.com";
		String shareEmail = fnameUBO.toLowerCase() + "." + lnameUBO.toLowerCase() + domain;
		email_UBO.sendKeys(shareEmail);
		System.out.println("UBO Email is : " + ANSI_GREEN + email_UBO.getAttribute("value") + ANSI_RESET + '\n');

		js.executeScript("arguments[0].scrollIntoView(true);", birthPlace_UBO);
		String birthplc = faker.address().city();
		birthPlace_UBO.sendKeys(birthplc);

		Select nationality_ubo = new Select(nationality);
		nationality_ubo.selectByVisibleText("India");

		Select countryUBO = new Select(country_UBO);
		countryUBO.selectByVisibleText("India");

		String city = faker.address().city();
		city_UBO.sendKeys(city);

		js.executeScript("arguments[0].scrollIntoView(true);", resident_UAE);
		resident_UAE.click();

		w.until(ExpectedConditions.visibilityOf(emirID));
		js.executeScript("arguments[0].scrollIntoView(true);", emirID);
		String emir_ID = faker.number().digits(7);
		emirID.sendKeys(emir_ID);

		w.until(ExpectedConditions.visibilityOf(emiratesIDFile_open));
		js.executeScript("arguments[0].scrollIntoView(true);", emiratesIDFile_open);
		String projectPath = System.getProperty("user.dir");
		emiratesIDFile_open.click();
		w.until(ExpectedConditions.visibilityOf(emiratesID_browseFile_txt));
		browser_emiID_img.sendKeys(projectPath + "\\SampleData\\Sample-Image.jpg");
		emiIDSselect_btn.click();

		w.until(ExpectedConditions.invisibilityOf(pageLoder));
		w.until(ExpectedConditions.visibilityOf(UAEvisaFile_open));
		js.executeScript("arguments[0].scrollIntoView(true);", UAEvisaFile_open);
		UAEvisaFile_open.click();
		w.until(ExpectedConditions.visibilityOf(UAEvisa_browseFile_txt));
		browser_UAEvisa_img.sendKeys(projectPath + "\\SampleData\\Sample-Image.jpg");
		UAEvisaSselect_btn.click();

		w.until(ExpectedConditions.invisibilityOf(pageLoder));
		w.until(ExpectedConditions.visibilityOf(UAEpassportFile_open));
		js.executeScript("arguments[0].scrollIntoView(true);", UAEpassportFile_open);
		UAEpassportFile_open.click();
		w.until(ExpectedConditions.visibilityOf(pass_browseFile_txt));
		browser_passport_img.sendKeys(projectPath + "\\SampleData\\Sample-Image.jpg");
		passSselect_btn.click();

		w.until(ExpectedConditions.invisibilityOf(pageLoder));
		js.executeScript("arguments[0].scrollIntoView(true);", existPassportNum);
		String passport = faker.number().digits(8);
		existPassportNum.sendKeys(passport);
		System.out.println(
				"UBO passport number is : " + ANSI_GREEN + passportNumber.getAttribute("value") + ANSI_RESET + '\n');

		Select passCountry = new Select(passport_country);
		passCountry.selectByVisibleText("India");
		js.executeScript("arguments[0].scrollIntoView(true);", residential_add);
		String resiAdd = faker.address().fullAddress();
		residential_add.sendKeys(resiAdd);

		js.executeScript("arguments[0].scrollIntoView(true);", workEntity);
		String entityName = faker.name().firstName();
		workEntity.sendKeys(entityName);

		String entityAdd = faker.address().fullAddress();
		entityAddress.sendKeys(entityAdd);

		String perce = faker.number().digits(2);
		ownPercentage.sendKeys(perce);

		js.executeScript("arguments[0].scrollIntoView(true);", sharesNo);
		sharesNo.sendKeys("1");

		sharesVal.sendKeys("1");

		String repName = faker.name().fullName();
		representive_name.sendKeys(repName);

		String repAdd = faker.address().fullAddress();
		representive_add.sendKeys(repAdd);

		js.executeScript("arguments[0].scrollIntoView(true);", representive_cap);
		String repCap = faker.random().toString();
		representive_cap.sendKeys(repCap);

		entitis.click();

	}

}
