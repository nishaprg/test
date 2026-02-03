package practicedummy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWindowHandle {
	public static void main(String[] args) {
		// Step 1: Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		// Step 2: Open the target URL
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		// Step 3: Maximize the browser window
		driver.manage().window().maximize();
		// Step 4: Find the link element and click to open a new window/tab
		WebElement link = driver.findElement(By.xpath("//a[@name='link1'][1]"));
		link.click();
		// Step 5: Store the parent window handle
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);

		// Step 6: Get all window handles
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		// Step 7: Switch to the new window/tab
		for (String web : allwindow) {
			if (!web.equals(parentId)) {
				driver.switchTo().window(web);
				// Step 8: (Optional) Print the title of the new tab
				// System.out.println(driver.getTitle());
				break;
			}
		}
		// Step 9: Find the Google search box and enter text
		WebElement gtext = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		gtext.sendKeys("spring boot tutorial");
		// Step 10: Switch back to the parent window
		driver.switchTo().window(parentId);
		// Step 11: Find the home link and click it
		WebElement home = driver.findElement(By.xpath("//a[@class='home-link']"));
		home.click();
		// ...existing code...
	}

}