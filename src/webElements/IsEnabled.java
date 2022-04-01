package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		// is Enabled

		WebElement loginButton = driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
		
//		boolean result = loginButton.isEnabled();
		
//		if (result==true) {
//			System.out.println("Element Enabled");
//			
//		}
//		else {
//			System.out.println("Element is disabled");
//		}
		
		
		// Is Displayed method
		
		boolean result = loginButton.isDisplayed();
		
		if (result==true) {
			System.out.println("Element is present on webpage");
			
		}
		else {
			System.out.println("Element is not present in webpage");
		}
		
		
		
		driver.quit();
		

	}

}
