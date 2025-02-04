package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class SearchTest9 {
	@Test
	public static void products8() throws InterruptedException  {

	WebDriver driver= Browser.chromeDriver();
		SourcesLink.link(driver);
	WebElement logo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
	if(logo.isDisplayed()) {
		System.out.println("Logo is Displayed.. You can proceed");
	}else System.out.println("Logo is not Displayed.. STOP STOP");
	LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]").click();
	//System.out.println(location.getLocation());
	
	LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div/h2").click();
	WebElement allProducts= LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div/h2");
	if(allProducts.isDisplayed()) {
		System.out.println("All Products tab is Displayed");
	}else System.out.println("All Products tab is not Displayed");
	LocatorsForElement.IdLocator(driver, "search_product").sendKeys("tshirt");
	LocatorsForElement.IdLocator(driver, "submit_search").click();
	WebElement AllProducts=LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div/h2");
	if(AllProducts.isDisplayed()) {
		System.out.println("All Product Tab is Visible");
	}else System.out.println("All Product Tab is Not Visible");
	driver.close();
	}
}