package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("url");
		driver.manage().window().maximize();
		
		//action on ele 1 
		
		driver.findElement(By.xpath("path")).click();
		
		//iframe 1
		
		
}
}
