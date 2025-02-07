package com.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class ContactUs6 {
	@Test
	public static void contactUs() throws InterruptedException {
	WebDriver driver = Browser.chromeDriver();
	SourcesLink.link(driver);
	WebElement logo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
	if(logo.isDisplayed()) {
		System.out.println("Logo is Displayed.. You can proceed");
	}else System.out.println("Logo is not Displayed.. STOP STOP");
	LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a").click();
	//get in visible
	WebElement getInTouch=LocatorsForElement.XpathLocator(driver, "//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2");
	if(getInTouch.isDisplayed()) {
		System.out.println("Get in touch is visible");	
	}else System.out.println("Get in touch is not visible");
	LocatorsForElement.XpathLocator(driver, "//*[@id=\"contact-us-form\"]/div[1]/input").sendKeys("This name");
	LocatorsForElement.XpathLocator(driver, "//*[@id=\"contact-us-form\"]/div[2]/input").sendKeys("email@123");
	LocatorsForElement.XpathLocator(driver, "//*[@id=\"contact-us-form\"]/div[3]/input").sendKeys("Testing");
	LocatorsForElement.XpathLocator(driver, "//*[@id=\"message\"]").sendKeys("Hi ima here\n to test");
	
	LocatorsForElement.XpathLocator(driver, "//*[@id=\"contact-us-form\"]/div[5]/input").sendKeys("C:\\Users\\acer\\Pictures\\15126-2700x1800-desktop-hd-game-of-thrones-background-photo.jpg");
	WebElement submit =LocatorsForElement.XpathLocator(driver, "//*[@id=\"contact-us-form\"]/div[6]/input");
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,630);");
	
	submit.click();
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	WebElement success=LocatorsForElement.XpathLocator(driver, "//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]");
	if(success.isDisplayed()) {
		System.out.println("Success is  displayed");
	}else System.out.println("Success is not displayed");
	LocatorsForElement.XpathLocator(driver, "//*[@id=\"form-section\"]/a/span").click();
	String currenturl="https://www.automationexercise.com/";
	if(driver.getCurrentUrl().equals(currenturl)) {
		System.out.println("Reached Home");
	}else System.out.println("Not Reached Home");
		driver.quit();
	}
}
