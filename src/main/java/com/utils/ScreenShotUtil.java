package com.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtil {
	public static void take(WebDriver driver) throws IOException {
		TakesScreenshot shot = (TakesScreenshot) driver;
		String title=driver.getTitle();
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
		String date =format.format(time);
		String path="C:\\Users\\acer\\Pictures\\Test_failure\\"+title+"_"+date;
		File file=shot.getScreenshotAs(OutputType.FILE);
		Files.copy(file.toPath(),Path.of(path), StandardCopyOption.REPLACE_EXISTING);
	
	}
}
