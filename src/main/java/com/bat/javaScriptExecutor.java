package com.bat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class javaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=(String) js.executeScript("return document.title");
		System.out.println(title);
	
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		//js.executeScript("arguments[0].setAttribute('value','testautomation')",username);
		js.executeScript("arguments[0].value='standard_user'", username);
		
		Thread.sleep(5000);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
//		//js.executeScript("arguments[0].setAttribute('value','password')", password);
		js.executeScript("arguments[0].value='secret_sauce'",password);
		Thread.sleep(5000);
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		js.executeScript("arguments[0].click()", loginbutton);
		
		
	}

}
