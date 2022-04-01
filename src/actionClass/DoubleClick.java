package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement dobleClickButton = driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
		
		// actions class
		
		Actions act=new Actions(driver);
		act.moveToElement(dobleClickButton).perform();
		
		// once double click on button the alert popup should open
		
		act.doubleClick().perform();
		
	}

}
