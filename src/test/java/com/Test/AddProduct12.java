package com.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class AddProduct12 {
	@Test
	public static void products8() throws InterruptedException  {
		
	WebDriver driver= Browser.chromeDriver();
		SourcesLink.link(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement logo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
	if(logo.isDisplayed()) {
		System.out.println("Logo is Displayed.. You can proceed");
	}else System.out.println("Logo is not Displayed.. STOP STOP");
	LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]").click();
	
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollTo(0,743);");
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	 WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a")));
	 Assert.assertTrue(addToCart.isDisplayed(), "Element is not displayed");
	 addToCart.click();
	WebElement countinueShopping = wait.until(ExpectedConditions.elementToBeClickable(LocatorsForElement.XpathLocator(driver, "//*[@id=\"cartModal\"]/div/div/div[3]/button")));
	countinueShopping.click();
	WebElement addToCart2=wait.until(ExpectedConditions.elementToBeClickable(LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a")));
	 addToCart2.click();
	 WebElement viewCart=wait.until(ExpectedConditions.elementToBeClickable(LocatorsForElement.XpathLocator(driver, "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a")));
	 Assert.assertTrue(viewCart.isDisplayed(), "Element is not displayed");
	 viewCart.click();
	//Assert.assertTrue(addToCart.isDisplayed(), "Element is not displayed");
	//System.out.println("Elemnent is displayed");
	WebElement product2=wait.until(ExpectedConditions.elementToBeClickable(By.id("cart_items")));
	//LocatorsForElement.IdLocator(driver, "cart_info_table");
	
		Assert.assertTrue(product2.isDisplayed(), "Produc is not added");
		product2.click();
	driver.close();
	}
}