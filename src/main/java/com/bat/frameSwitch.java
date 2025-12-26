package com.bat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class frameSwitch {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("frm1");
		WebElement drop=driver.findElement(By.xpath("//select[@id='selectnav1']"));
		Select s=new Select(drop);
		s.selectByIndex(1);
		driver.switchTo().defaultContent();
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("test automation");
		driver.switchTo().frame("frm2");
		WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("frame2");
		driver.switchTo().defaultContent();
		WebElement name1=driver.findElement(By.xpath("//input[@id='name']"));
		name1.sendKeys("test automation on frame 2");
		

	}

}
