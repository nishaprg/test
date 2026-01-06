package practicedummy;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import org.junit.platform.commons.util.Preconditions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MSG91Login {
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

		MSG91Login msg91 = new MSG91Login();
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

	public void Whatsapp() throws InterruptedException {
		WebElement service = driver.findElement(By.xpath(
				"//a[@class='platform-card mat-elevation-z3 whatsapp-service cursor-pointer ng-star-inserted']"));
		service.click();

		WebElement sendwhatsapp = driver.findElement(By.xpath(
				"//div[@class='left-menu-center-container']/ng-component/app-whatsapp-left-menu/div/mat-nav-list/div[1]//a[1]/span/span"));
		sendwhatsapp.click();
		WebElement entermanually = driver.findElement(By.xpath("//textarea[@id='mat-input-2']"));
		entermanually.click();
		entermanually.sendKeys("918435390731");

		WebElement number = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		// number.click();
		number.sendKeys("917024100856");
		Thread.sleep(5000);

		List<WebElement> allnumber = driver.findElements(By.xpath("//div[@id=\"cdk-overlay-1\"]"));
		for (WebElement num : allnumber) {
			String sendnumber = num.getText();
			System.out.println(sendnumber);
			Thread.sleep(3000);
			if (sendnumber.equals("917024100856")) {
				num.click();
				break;
			}
		}
		Thread.sleep(5000);

		WebElement template1 = driver.findElement(By.xpath("//input[@id='mat-input-3']"));
		template1.sendKeys("new_test");
		Thread.sleep(5000);
		template1.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(5000);
//		List<WebElement> template = driver.findElements(By.xpath("//div[@id='mat-autocomplete-1']"));
//		for (WebElement temp : template) {
//			String templatename = temp.getText();
//			System.out.println(templatename);
//			
//
//			Thread.sleep(5000);
//			if (templatename.equals("new_test")) {
//				temp.click();
//				break;
//			}
//	}
		Thread.sleep(5000);
		WebElement varvalue = driver.findElement(By.xpath("//input[@id='mat-input-4']"));
		varvalue.sendKeys("prgtest");

		WebElement reviewsend = driver.findElement(By.xpath(
				"//mat-dialog-container[@id='mat-mdc-dialog-0']/div/div/msg91-send-whatsapp-dialog/div/div[1]/mat-dialog-actions/div[2]/button[2]"));
		reviewsend.click();
		WebElement send = driver.findElement(By.xpath(
				"//*[@id=\"mat-mdc-dialog-0\"]/div/div/msg91-send-whatsapp-dialog/div/div[2]/mat-dialog-actions/button[2]"));
		send.click();

	}

}
