package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		String strTxt = driver.findElement(By.cssSelector("label > span")).getText();
		System.out.println("Label Text : " + strTxt);
		
		//From Main page to Frame1
//		driver.switchTo().frame("frame1");
		driver.switchTo().frame("iamframe");
//		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys("Hello Welcome");
//		
		//Frame1 to Frame3
		WebElement frameThree = driver.findElement(By.id("frame3")); 
		driver.switchTo().frame(frameThree);
//		driver.switchTo().frame(0);
		WebElement chkbox = driver.findElement(By.id("a"));
		if(!chkbox.isSelected())
			chkbox.click();
		
		//Frame 3 to frame 1
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).clear();
		driver.findElement(By.tagName("input")).sendKeys("Welcome Back");
		
		//From Frame1 to Main page
		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();
		strTxt = driver.findElement(By.cssSelector("label > span")).getText();
		System.out.println("Label  after coming back : " + strTxt);
		}
		
		
		
	

}
