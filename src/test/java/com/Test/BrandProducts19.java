package com.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class BrandProducts19 {
@Test
public void brandProducts19() {
	WebDriver driver = Browser.chromeDriver();
	SourcesLink.link(driver);
	LocatorsForElement.XpathLocator(driver, "//a[@href='/products']").click();
	WebElement brand = LocatorsForElement.XpathLocator(driver, "//a[@href='/brand_products/Polo']");
	System.out.println(brand.getLocation());
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,828);");
	//brand1
	LocatorsForElement.XpathLocator(driver, "//a[@href='/brand_products/Polo']").click();
	String polo ="BRAND - POLO PRODUCTS";
	WebElement poloE =LocatorsForElement.XpathLocator(driver, "/html/body/section/div/div[2]/div[2]/div/h2");

	System.out.println(poloE.getText());
	Assert.assertTrue(poloE.getText().equals(polo), "Polo brand name not equals");
	js.executeScript("window.scrollTo(0,828);");
	//HM
	LocatorsForElement.XpathLocator(driver, "//a[@href='/brand_products/H&M']").click();
	String hm="BRAND - H&M PRODUCTS";
	WebElement hmE = LocatorsForElement.XpathLocator(driver, "/html/body/section/div/div[2]/div[2]/div/h2");
	System.out.println(hmE.getText());
	Assert.assertTrue(hmE.getText().equals(hm),"HM Text not Shown");
	driver.quit();
}
}
