package com.Test;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class Products8 {
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
	
	WebElement ele=LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li");
	 System.out.println(ele.getLocation());
//	Actions action = new Actions(driver);
//	action.moveToLocation(0, 1000).perform();
//	Thread.sleep(1000);
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollTo(0,743);");
	WebElement item=LocatorsForElement.CssSelectorLocator(driver, "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.choose > ul");
	if(item.isDisplayed()) {
		System.out.println("Item is displayed");
		item.click();
	}else System.out.println("Item is not displayed");
		
	//product name
	WebElement productname = LocatorsForElement.XpathLocator(driver, "/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2");
	if(productname.isDisplayed()) {
		System.out.println("Product Name is Displayed");
	}else System.out.println("Product Name is Displayed");
	//product category
	WebElement category = LocatorsForElement.XpathLocator(driver, "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]");
	if(category.isDisplayed()) {
		System.out.println("Product category is Displayed");
	}else System.out.println("Product category is Displayed");
	//price
	WebElement price = LocatorsForElement.XpathLocator(driver, "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span");
	if(price.isDisplayed()) {
		System.out.println("price is Displayed");
	}else System.out.println("price is Displayed");
	//availability
	WebElement availability = LocatorsForElement.XpathLocator(driver, "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]");
	if(availability.isDisplayed()) {
		System.out.println("availability is Displayed");
	}else System.out.println("availability is Displayed");
	//condition
	WebElement condition = LocatorsForElement.XpathLocator(driver, "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]");
	if(condition.isDisplayed()) {
		System.out.println("condition is Displayed");
	}else System.out.println("condition is Displayed");
	//brand
	WebElement brandName = LocatorsForElement.XpathLocator(driver, "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]");
	if(brandName.isDisplayed()) {
		System.out.println("Brand Name is Displayed");
	}else System.out.println("Brand Name is Displayed");
	driver.close();
	}
}