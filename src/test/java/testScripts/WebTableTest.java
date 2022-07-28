package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		driver.findElement(
				By.xpath("//td[contains(text(), 'B. Wagner')]//following-sibling::td[5]")).isDisplayed();
		String strSalary = driver.findElement(
				By.xpath("//td[contains(text(), 'B. Wagner')]//following-sibling::td[5]")).getText();
		System.out.println("Salary : " + strSalary);
	

	}

}
