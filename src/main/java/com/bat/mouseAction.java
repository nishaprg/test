package com.bat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/checkbox-in-selenium");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement hover=driver.findElement(By.xpath("//button[@id='products-dd-toggle']"));
		Actions a =new Actions(driver);
		a.moveToElement(hover).perform();
		
		WebElement search=driver.findElement(By.xpath("//button[@aria-label='Search'][2]"));
		search.click();
		
		WebElement searchtype=driver.findElement(By.xpath("//input[@id='doc-search-box-input']"));
		searchtype.sendKeys("test automation");
		
		a.sendKeys(Keys.ENTER).perform();

	}

}
