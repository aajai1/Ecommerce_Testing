package com.Test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class LoginbeforeCheckout16 {
	@Test
	public static void loginUser() {
		WebDriver driver = Browser.chromeDriver();
		SourcesLink.link(driver);
		WebElement logo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
		if(logo.isDisplayed()) {
			System.out.println("Logo is Displayed.. You can proceed");
		}else System.out.println("Logo is not Displayed.. STOP STOP");
		WebElement login =  LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
		login.click();
		//email &password
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[2]").sendKeys("jospeh.bernhard@rohan.notest");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[3]").sendKeys("myname@1258");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button").click();
		//loginsuccess
		WebElement loggedAs = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
		if(loggedAs.isDisplayed()) {
			System.out.println(" Logged in as is Displayed You can proceed");
		}else System.out.println(" Logged in as  is not Displayed.. STOP STOP");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,743);");
		LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a").click();
		//LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div[1]/div[3]/div/div[1]/div[1]/a").click();
//		WebElement cart=LocatorsForElement.XpathLocator(driver, "//*[@id=\"cartModal\"]/div/div/div[3]/button");
//		Assert.assertTrue(cart.isDisplayed(), "Cart is not displayed");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement countinueShopping = wait.until(ExpectedConditions.elementToBeClickable(LocatorsForElement.XpathLocator(driver, "//*[@id=\"cartModal\"]/div/div/div[3]/button")));
		countinueShopping.click();

		WebElement addToCart2=wait.until(ExpectedConditions.elementToBeClickable(LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a")));
		addToCart2.click();
		WebElement viewCart=wait.until(ExpectedConditions.elementToBeClickable(LocatorsForElement.XpathLocator(driver, "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a")));
		Assert.assertTrue(viewCart.isDisplayed(), "Element is not displayed");
		viewCart.click();
		//checkout
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"do_action\"]/div[1]/div/div/a").click();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"ordermsg\"]/textarea").sendKeys("THank YOu");
		//place
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"cart_items\"]/div/div[7]/a").click();
		//card
		LocatorsForElement.NameLocator(driver, "name_on_card").sendKeys("Your NAme");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"payment-form\"]/div[2]/div/input").sendKeys("1524365826594587");
		LocatorsForElement.NameLocator(driver, "cvc").sendKeys("225");
		LocatorsForElement.NameLocator(driver, "expiry_month").sendKeys("25");
		LocatorsForElement.NameLocator(driver, "expiry_year").sendKeys("2568");
		LocatorsForElement.IdLocator(driver, "submit").click();
//		//placed
//		WebElement placed = LocatorsForElement.XpathLocator(driver, "//*[@id=\"success_message\"]/div");
//		Assert.assertTrue(placed.isDisplayed(), "placed is not displayed");
		//continue
		LocatorsForElement.XpathLocator(driver, "//a[normalize-space()='Continue']").click();
		//delete
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]").click();
		WebElement del = LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/h2");
		Assert.assertTrue(del.isDisplayed(),"Delecetd msg not displayed");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/div").click();
		driver.close();
	}
}