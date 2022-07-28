package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioChkBoxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Anandhi\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Radio Buttons
//		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
//		driver.findElement(By.xpath("//input[@type='radio' and @value='Female' and @name='gender']")).click();
//		
		//CheckBox
//		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
//		WebElement chkbox = driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]"));
//		
//		System.out.println("Is Chkbox selected : " + chkbox.isSelected());
//		
//		chkbox.click();
//		
//		if(chkbox.isSelected())
//			System.out.println("Chkbox is selected");
		
		//Dropdown
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select singleSel = new Select(driver.findElement(By.id("select-demo")));
		singleSel.selectByValue("Wednesday");
		
		
		Select mulSel = new Select(driver.findElement(By.id("multi-select")));
		if(mulSel.isMultiple()) {
			mulSel.selectByIndex(0);
			mulSel.selectByValue("New Jersey");
			mulSel.selectByVisibleText("Texas");
			System.out.println("Selected options : " + mulSel.getAllSelectedOptions().size());
		}
	
		mulSel.deselectByIndex(0);
		
		
	}

}
