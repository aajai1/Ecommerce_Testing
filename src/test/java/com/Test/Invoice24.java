package com.Test;

import java.time.Duration;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class Invoice24 {
	@Test
	public static void products8() throws InterruptedException  {

		WebDriver driver= Browser.edgeDriver();
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
		WebElement viewCart=wait.until(ExpectedConditions.elementToBeClickable(LocatorsForElement.XpathLocator(driver, "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a")));
		Assert.assertTrue(viewCart.isDisplayed(), "Element is not displayed");
		viewCart.click();
		
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"do_action\"]/div[1]/div/div/a").click();
		WebElement checkoutlogin= LocatorsForElement.XpathLocator(driver, "//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a");
		checkoutlogin.click();
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
			
				js.executeScript("window.scrollTo(0,743);");
				LocatorsForElement.IdLocator(driver, "password").sendKeys("myname@1258");
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
				//LocatorsForElement.IdLocator(driver, "address2").sendKeys("This address \n soo aon");
				WebElement country = LocatorsForElement.IdLocator(driver, "country");
				country.click();
				LocatorsForElement.XpathLocator(driver, "//*[@id=\"country\"]/option[2]").click();
				//address
				LocatorsForElement.IdLocator(driver, "state").sendKeys("California");
				LocatorsForElement.IdLocator(driver, "city").sendKeys("That city");
				LocatorsForElement.IdLocator(driver, "zipcode").sendKeys("792722");
			
				LocatorsForElement.IdLocator(driver, "mobile_number").sendKeys("1257896342");
				LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/div[1]/form/button").click();
				WebElement accountCreated = LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/h2/b");
				if(accountCreated.isDisplayed()) {
					System.out.println("Account Created! is Displayed.. You can proceed");
				}else System.out.println("Account Created! is not Displayed.. STOP STOP");
				
			//cart
				LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a").click();
				//checkout
				LocatorsForElement.XpathLocator(driver, "//*[@id=\"do_action\"]/div[1]/div/div/a").click();
				
				
				//billingAddress
				WebElement bill = LocatorsForElement.XpathLocator(driver, "//*[@id=\"cart_items\"]/div/div[3]/div/div[1]");
				String billadd =bill.getText();
				WebElement del = LocatorsForElement.IdLocator(driver, "address_delivery");
				if(billadd.contains("792722")) {
					System.out.println("address is correct");
				}else System.out.println("Wrong Address ");
				//checkout
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
				//invoice
				LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/a").click();
				Thread.sleep(5000);
				//countinue
				LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/div/a").click();
				//del
				LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a").click();
				WebElement deleteAcc = LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/h2");
				if(deleteAcc.isDisplayed()) {
					System.out.println(" Account Deleted! is Displayed You can proceed");
				}else System.out.println(" Account Deleted!  is not Displayed.. STOP STOP");
				LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a").click();
				driver.quit();
	}
}