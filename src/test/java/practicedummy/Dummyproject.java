package practicedummy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummyproject {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		driver = new ChromeDriver(option);
		driver.get("https://test.msg91.com/qtqcgvhueivscerlypni");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		Dummyproject msg91 = new Dummyproject();
		msg91.Websitelogin();
		Thread.sleep(2000);
		msg91.Whatsapp();

	}

	public void Websitelogin() throws InterruptedException {

		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("walkoverweb");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("EZJSgSbJ6ZWqPE4YhQJm");

		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(3000);
		WebElement sclick = driver.findElement(By.xpath("//i[@id='searchClient']"));
		sclick.click();

		WebElement searchclient = driver.findElement(By.xpath("//input[@id='clientSearch']"));
		searchclient.sendKeys("qa");
		Thread.sleep(5000);
		WebElement client = driver.findElement(By.xpath("//div[@class='boxsize']/ul/li"));
		client.click();
		Thread.sleep(5000);
		WebElement user = driver.findElement(By.xpath("//a[@id='trackVal']"));
		user.click();
		Thread.sleep(3000);
		WebElement details = driver.findElement(By.xpath("//li[@title='Other User Detail']"));
		details.click();
		Thread.sleep(3000);
		WebElement userselect = driver.findElement(By.xpath("//span[@id='select2-companyTeamInfo-container']"));
		userselect.click();
		Thread.sleep(3000);
		WebElement searchuser = driver.findElement(By.xpath("//input[@type='search']"));
		searchuser.sendKeys("Pragya Panchal");
		Thread.sleep(3000);
		List<WebElement> userlist = driver.findElements(By.xpath("//ul[@id='select2-companyTeamInfo-results']"));
		for (WebElement ele : userlist) {
			String list = ele.getText();
			System.out.println(list);
			if (list.contains("Pragya")) {
				ele.click();
				break;
			}
		}

		WebElement loginuser = driver.findElement(By.xpath("//button[@id='teamMemberLogin']"));
		loginuser.click();
	}
	public void Whatsapp() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Open WhatsApp service
	    wait.until(ExpectedConditions.elementToBeClickable(
	            By.cssSelector("a.whatsapp-service")))
	        .click();

	    // Send WhatsApp
	    wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//span[contains(text(),'Send WhatsApp')]")))
	        .click();

	    // Enter manually textarea
	    WebElement manualEntry = wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//textarea[@placeholder='Enter numbers manually']")));
	    manualEntry.sendKeys("918435390731");

	    // Phone number input (autocomplete)
	    WebElement phoneInput = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//input[@placeholder='Enter phone number']")));
	    phoneInput.sendKeys("917024100856");

	    // Select number from dropdown
	    wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//mat-option//span[contains(text(),'917024100856')]")))
	        .click();

	    // Template name input
	    WebElement templateInput = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//input[@placeholder='Select template']")));
	    templateInput.sendKeys("new_test");

	    // Select template
	    wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//mat-option//span[contains(text(),'new_test')]")))
	        .click();

	    // Variable value input (THIS replaces mat-input-4)
	    WebElement variableValue = wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//input[contains(@placeholder,'value')]")));
	    variableValue.sendKeys("prgtest");

	    // Review & Send
	    wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//button/span[contains(text(),'Review')]")))
	        .click();

	    wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//button/span[contains(text(),'Send')]")))
	        .click();
	}

}
