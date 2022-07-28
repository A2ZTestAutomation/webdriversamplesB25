package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class JSExecTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String strTitle = (String)js.executeScript("return document.title");
		System.out.println("Page Title : " + strTitle);
		WebElement searchbox = (WebElement) js.executeScript("return document.getElementsByName('search')[0]");
		searchbox.sendKeys("phone");
		WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav li.nav-item.dropdown:nth-child(3)"));
		//MouseHover
		WebElement menuItem = driver.findElement(By.xpath("//a[contains(text(), 'Monitors (2)')]"));
		actions.moveToElement(menu).click(menuItem).perform();
		
		
//		js.executeScript("window.scrollBy(10,700)");
		
		js.executeScript("window.scrollBy(10, document.body.scrollHeight)");
//		js.executeScript("history.go(-1);");
//		js.executeScript("history.go(1);");
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
//		driver.findElement(By.id("datepicker1")).sendKeys("07/25/2022");
		js.executeScript("document.querySelector('#datepicker1').value='07/22/2022'");

	}

}
