package practicedummy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class typeClcik {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		

	}

}
