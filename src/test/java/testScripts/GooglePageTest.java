package testScripts;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
//		driver.navigate().refresh();
//		WebElement searchBox = driver.findElement(By.name("q"));
//		WebElement searchBox = driver.findElement(By.className("gLFyf"));
		WebElement searchBox = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
				
		searchBox.sendKeys("Java Tutorial");
		System.out.println("Search Box Attr : " + searchBox.getAttribute("role"));
		//Thread.sleep(2000);
		List<WebElement> items = driver.findElements(
				By.xpath("//ul[@class='G43f7e']//li//descendant::div[@class='wM6W7d']"));
		System.out.println("Number of Items : " + items.size());
		for(int i=0; i< items.size();i++) {
			System.out.println(items.get(i).getText());
			System.out.println(items.get(i).getTagName());
			if(items.get(i).getText().equalsIgnoreCase("java tutorial pdf")) {
				items.get(i).click();
				break;
			}
		}
//		searchBox.submit();
//		searchBox.sendKeys(Keys.ENTER);
//		
//		String pagetTitle = driver.getTitle();
//		System.out.println("Page Title : " + pagetTitle);
//		
//		System.out.println("Current URL : " + driver.getCurrentUrl());
//		driver.navigate().back();
//		pagetTitle = driver.getTitle();
//		System.out.println("Home Page Title : " + pagetTitle);
//		driver.navigate().forward();
//		
		
	}


	
	
	
}
