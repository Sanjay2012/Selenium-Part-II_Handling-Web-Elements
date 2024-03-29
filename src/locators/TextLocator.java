package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
	}

}
