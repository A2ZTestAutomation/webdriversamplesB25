package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipTest {

	public static void main(String[] args) {
		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
//			
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
//		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
		WebElement age =driver.findElement(By.id("age"));
		age.sendKeys(Keys.PAGE_DOWN);
		actions.moveToElement(age).perform();
		String strToolTxt = driver.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println("Tool Tip Text is : "+ strToolTxt);

	}
}
