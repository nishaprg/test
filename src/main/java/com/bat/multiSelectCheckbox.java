package com.bat;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiSelectCheckbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='bcCheckBox']"));
		int size=checkbox.size();
		System.out.println(size);
//		for(int i=0;i<size;i+=2) //to select alternate
//		{
//			checkbox.get(i).click();
//			//break;
//		}
		
//		for(int i=0;i<size;i++) //to select first two checkbox 
//			{
//			if(i==0||i==1) {
//				checkbox.get(i).click();
//			}
//		}
		for(int i=0;i<=size;i++) //to select las two checkbox
			{
			if(i==size-1||i==size-2) {
				checkbox.get(i).click();
			}
		}
	}

}
