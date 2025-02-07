package com.Test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
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

public class RegisterBeforCheckout15 {
	@Test
	public void resgisterBeforeCheckout15() {
		WebDriver driver = Browser.chromeDriver();
		SourcesLink.link(driver);
		WebElement logo =LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[1]/div");
		Assert.assertTrue(logo.isDisplayed(), "Logi is nOt displayed");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]").click();
		//name and mail
		
		LocatorsForElement.NameLocator(driver, "name").sendKeys("My Name");

		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]").sendKeys("jospeh.bernhard@rohan.notest");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[3]/div/form/button").click();
		WebElement enterAccInfo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/div[1]/h2/b");
		if(enterAccInfo.isDisplayed()) {
			System.out.println("Enter Account Information is Displayed.. You can proceed");
		}else System.out.println("Enter Account Information is not Displayed.. STOP STOP");
		WebElement MrButton = LocatorsForElement.XpathLocator(driver, "//*[@id=\"id_gender1\"]");
		MrButton.click();
		//enter details
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,670);");
		LocatorsForElement.IdLocator(driver, "password").sendKeys("myname@1258");
		//days
		WebElement days = LocatorsForElement.IdLocator(driver, "days");
		System.out.println(days.getLocation());
		LocatorsForElement.IdLocator(driver, "days").click();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"days\"]/option[28]").click();
		LocatorsForElement.IdLocator(driver, "months").click();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"months\"]/option[8]").click();
		LocatorsForElement.IdLocator(driver, "years").click();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"years\"]/option[14]").click();
		LocatorsForElement.IdLocator(driver, "newsletter").click();
		LocatorsForElement.IdLocator(driver, "optin").click();
		//Address Information
		LocatorsForElement.IdLocator(driver, "first_name").sendKeys("This");
		LocatorsForElement.IdLocator(driver, "last_name").sendKeys("Name");
		LocatorsForElement.IdLocator(driver, "address1").sendKeys("This address \n soo aon");
		LocatorsForElement.IdLocator(driver, "address2").sendKeys("This address \n soo aon");
		WebElement country = LocatorsForElement.IdLocator(driver, "country");
		country.click();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"country\"]/option[2]").click();
		LocatorsForElement.IdLocator(driver, "state").sendKeys("California");
		LocatorsForElement.IdLocator(driver, "city").sendKeys("That city");
		LocatorsForElement.IdLocator(driver, "zipcode").sendKeys("792722");
		LocatorsForElement.IdLocator(driver, "mobile_number").sendKeys("1257896342");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/div[1]/form/button").click();
		WebElement accountCreated = LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/div");
		accountCreated.click();
		WebElement loggedInVerify =	LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
		Assert.assertTrue(loggedInVerify.isDisplayed(), "Logged in verfy is not displayed");
		//LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]").click();
		//product add
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
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
		WebElement submit =LocatorsForElement.IdLocator(driver, "submit");
		js.executeScript("window.scrollTo(0,548);");
		submit.click();
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
