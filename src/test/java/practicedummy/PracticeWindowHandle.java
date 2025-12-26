package practicedummy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWindowHandle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.xpath("//a[@name='link1'][1]"));
		link.click();
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);

		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		for (String web : allwindow) {
			if (!web.equals(parentId)) {
				driver.switchTo().window(web);
				
				//System.out.println(driver.getTitle());// get title -method to g=fine title of tab 
				break;
			}
		}
		WebElement gtext = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		gtext.sendKeys("spring boot tutorial");
		driver.switchTo().window(parentId);
		WebElement home = driver.findElement(By.xpath("//a[@class='home-link']"));
		home.click();

	}

}
