package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav li.nav-item.dropdown:nth-child(3)"));
		//MouseHover
		WebElement menuItem = driver.findElement(By.xpath("//a[contains(text(), 'Monitors (2)')]"));
		actions.moveToElement(menu).click(menuItem).perform();
		WebElement search = driver.findElement(By.name("search"));
		
//		search.sendKeys("phone");
//		search.sendKeys(Keys.chord(Keys.SHIFT+"P"));
//		search.sendKeys(Keys.chord("hone"));
		search.sendKeys(Keys.chord(Keys.SHIFT+"p"));
		search.sendKeys("hone");
		search.sendKeys(Keys.PAGE_DOWN);
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Screenshot\\FullPage.png"));
		
		search.sendKeys(Keys.PAGE_DOWN);
		
		WebElement items = driver.findElement(By.cssSelector("div#product-list"));
		
		File itemSrc = items.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(itemSrc, new File("F:\\Screenshot\\Items.png"));
		
		
//		//Right Click
//		WebElement search = driver.findElement(By.name("search"));
//		actions.contextClick(search).perform();
		
		//Double Click
//		driver.get("https://stqatools.com/demo/DoubleClick.php");
//		WebElement btnDbl = driver.findElement(By.xpath("//button[contains(text(), 'Double Click Me!')]"));
//		actions.doubleClick(btnDbl).perform();
	
		
	}

}
