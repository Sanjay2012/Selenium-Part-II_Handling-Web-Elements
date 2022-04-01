package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//*[text()='right click me']"));
		
		// actions class
		
		Actions act=new Actions(driver);
		act.moveToElement(button).perform();
		
		// right click
		
		act.contextClick().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()='Edit']")).click();
		
		Thread.sleep(2000);
		

		
		
	}

}
