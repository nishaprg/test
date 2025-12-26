package practicedummy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseBootstrap {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.cssSelector("[type='button']"));
		dropdown.click();
		
		List<WebElement> elements=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));// find the locator of list
		for(WebElement ele: elements) {// fine the loctor of each element
			
			String name =ele.getText();// Store the element in a paramete 
			System.out.println(name);
			if(name.equals("JavaScript")) {// campare the list parameter with  desire value 
				ele.click(); //then click on that desire locator value 
				break;
			}
		}
		driver.quit();
		

	}

}
