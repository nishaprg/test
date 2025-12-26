package com.bat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		driver.manage().window().maximize();
		WebElement list = driver.findElement(By.xpath("//button[@id='menu1']"));
		list.click();
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		for (WebElement ele : elements) {
			String name = ele.getText();
			System.out.println(name);
			if (name.equals("About Us")) {
				ele.click();
				break;
			}

		}

	}

}
