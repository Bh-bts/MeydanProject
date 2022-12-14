/**
 * 
 */
package com.Meydan.MainPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Browsers.Utill.AllBrowsers;
import com.Meydan.testcase.CompanyCreate_Page;

/**
 * @author Bhavin.Thumar
 *
 */
public class CompanyCreate_MainPage extends CompanyCreate_Page{
	
	public CompanyCreate_MainPage() {
		
		driver = AllBrowsers.startBrowser("chrome", Weburl);
	}
	
	
	@Test
	public void firstCompany() {
		
		CompanyCreate_Page company = PageFactory.initElements(driver, CompanyCreate_Page.class);
		company.newCompany("bhavin.thumar@drcsystems.com", "Admin@1234");
		
	}
	
}
