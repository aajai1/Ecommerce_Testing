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

public class CheckOutRegister14 {
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
		WebElement viewCart=wait.until(ExpectedConditions.elementToBeClickable(LocatorsForElement.XpathLocator(driver, "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a")));
		Assert.assertTrue(viewCart.isDisplayed(), "Element is not displayed");
		viewCart.click();
		
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"do_action\"]/div[1]/div/div/a").click();
		WebElement checkoutlogin= LocatorsForElement.XpathLocator(driver, "//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a");
		checkoutlogin.click();
		//Assert.assertTrue(checkoutlogin.isDisplayed(), "checkoutlogin is not displayed");
		
		//WebElement signupElement=LocatorsForElement.XpathLocator(driver, "//*[@id=\\\"form\\\"]/div/div/div[3]/div/h2");
		//Assert.assertTrue(signupElement.isDisplayed(), "signupElement is not displayed");
		
		//name
		WebElement name= wait.until(ExpectedConditions.elementToBeClickable(LocatorsForElement.XpathLocator(driver, "//input[@placeholder='Name']")));
			name.sendKeys("Your Name");
	
		//Assert.assertTrue(name.isDisplayed(), "Nmaeis n");
		
		//System.out.println(name.getDomAttribute("value"));
		//wait.until(ExpectedConditions.elementToBeClickable(name));
		
			WebElement nameSignup =wait.until(ExpectedConditions.elementToBeClickable(LocatorsForElement.XpathLocator(driver, "//input[@data-qa='signup-email']")));
			nameSignup.sendKeys("yourname@gmail.com");
		
		//LocatorsForElement.XpathLocator(driver, "//input[@data-qa='signup-email']")
			Thread.sleep(3000);
		 LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[3]/div/form/button").click();
		
		driver.quit();



	}
}