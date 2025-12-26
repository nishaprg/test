package com.bat;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWndowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement button = driver.findElement(By.xpath("//button[@id='newTabsBtn']"));
		button.click();
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		for (String window : allwindow) {
			driver.switchTo().window(window);
			String name = driver.getTitle();
			System.out.println(name);
			if (name.contains("Basic Controls")) {
				break;
			}
		}
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("testprg");
		
		for (String window : allwindow) {
			driver.switchTo().window(window);
			String name = driver.getTitle();
			if (name.contains("AlertsDemo")) {
				break;
			}
		}
		WebElement clickme=driver.findElement(By.xpath("//button[@id='alertBox']"));
		clickme.click();
		Alert a=driver.switchTo().alert();
		a.accept();
		driver.switchTo().window(parentId);
		WebElement input=driver.findElement(By.xpath("//input[@id='name']"));
		input.sendKeys("back to parent window");
	}
}
