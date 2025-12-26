package com.bat;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.browserstack.com/guide/checkbox-in-selenium");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		//File desti=new File("use.dir"+"/proof/test"+".png");
		
		FileHandler.copy(src, new File(System.getProperty("user.dir") + "/proof/test.png"));

		
		
		

	}

}
