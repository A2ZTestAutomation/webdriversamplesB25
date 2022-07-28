package testScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinPopupTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String parentWin = driver.getWindowHandle();
		
		//Open a new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.selenium.dev/");
		Set<String> wins = driver.getWindowHandles();
		System.out.println("No. of opened windows : " + wins.size());
		Iterator<String> it = wins.iterator();
		String gWindow = it.next(); //google
		String selWindow = it.next(); //selenium
		
		System.out.println(driver.getTitle());
//		
		driver.close();
		
		//switch to google window
//		driver.switchTo().window(parentWin);
		driver.switchTo().window(gWindow);
		System.out.println(driver.getTitle());
		
		
		//Open a new tabbed window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://playwright.dev/");
		System.out.println(driver.getTitle());
		
//		driver.close();
		driver.quit();
//		driver.findElement(By.name("Search")).sendKeys("Java");
		
	}

}
