package com.bat;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		WebElement parent = driver.findElement(By.cssSelector("button#newWindowBtn")); // Element to be click to open
																						// another tab or window
		parent.click();

		String parentId = driver.getWindowHandle(); // Find the is of current or parent window
		System.out.println(parentId);
		Set<String> allwindow = driver.getWindowHandles(); // find the id of all window including parent window
		System.out.println(allwindow);

		for (String win : allwindow) {// Store id of all window in parameter
			if (!win.equals(parentId)) { // compare parent id with is not equal to the child window id
				driver.switchTo().window(win);// switchto the desire window
				break;
			}

		}
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));// perform action on swithced
																						// window
		firstName.sendKeys("testprg");
		driver.switchTo().window(parentId);// Again switchto to parent window
		driver.quit();
	}

}
