package com.Test;

import java.io.File;

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
		ChromeOptions op = new ChromeOptions();
		String path="C:\\Users\\acer\\Downloads\\CRX Files";
		File file = new File(path);
		//op.addArguments("--disable-extensions-except="+file);
		op.addArguments("--load-extension=C:\\Users\\acer\\Downloads\\CRX Files");
		//op.addExtensions(file);
	//WebDriver driver = Browser.chromeDriver();
	WebDriver driver= new ChromeDriver(op);
		SourcesLink.link(driver);
	WebElement logo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
	if(logo.isDisplayed()) {
		System.out.println("Logo is Displayed.. You can proceed");
	}else System.out.println("Logo is not Displayed.. STOP STOP");
	LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a").click();
	//System.out.println(location.getLocation());
	
	LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a").click();
	WebElement allProducts= LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div/h2");
	if(allProducts.isDisplayed()) {
		System.out.println("All Products tab is Displayed");
	}else System.out.println("All Products tab is not Displayed");
	
	WebElement ele=LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div[1]/div[4]/div/div[1]/div[1]");
	 
	Actions action = new Actions(driver);
	action.moveToElement(ele).perform();
	Thread.sleep(1000);
	LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li").click();
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
	}
}