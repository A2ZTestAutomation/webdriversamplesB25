package testScripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Wait<WebDriver> waitFlu = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(30))
				.ignoring(NoSuchElementException.class);
					
		Alert alert = driver.switchTo().alert();
		String strTxt = alert.getText();
		System.out.println("Alert Text : "+ strTxt);
		alert.accept();
		
		
		//Confirmation Alert
		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]")).click();
		Alert confirm  = driver.switchTo().alert();
		confirm.dismiss();
		
		//Prompt Alert
		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Hello Welcome");
		prompt.accept();
	}

}
