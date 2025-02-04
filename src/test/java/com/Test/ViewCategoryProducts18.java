package com.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class ViewCategoryProducts18 {
	@Test
	public void viewCategoryProducts18() {
		WebDriver driver = Browser.chromeDriver();
		SourcesLink.link(driver);
		//feature
		Assert.assertTrue(LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div[1]/div/div[2]/div[1]/h2").isDisplayed(), "Product tab is not displayed");
		//plus
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,614);");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"accordian\"]/div[1]/div[1]/h4/a/span").click();
		//dress
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"Women\"]/div/ul/li[1]").click();
		String dress = "Women - Dress Products";
		WebElement dressElement = LocatorsForElement.XpathLocator(driver, "/html/body/section/div/div[2]/div[2]/div/h2");
		dressElement.getText();
		Assert.assertTrue(dressElement.equals(dress),"Category Page is not Displayed");
		//men
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"accordian\"]/div[2]/div[1]/h4/a/span").click();
		//jeans
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"Men\"]/div/ul/li[2]").click();
		String jeans="Men - Jeans Products";
		WebElement jeansElement = LocatorsForElement.XpathLocator(driver, "/html/body/section/div/div[2]/div[2]/div/h2");
		Assert.assertTrue(jeansElement.equals(jeans), "Jeans category is not Dispplayed");
		driver.quit();
		
	
	}

}
