package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDDF {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// enter UN
		driver.findElement(By.id("userid")).sendKeys("KW0610");
		
		// enter pwd
		
		driver.findElement(By.id("password")).sendKeys("Shiv@123");
		
		// click on login button
		
		driver.findElement(By.xpath("//*[text()='Login ']")).click();
		
		// enter pin
		
		driver.findElement(By.id("pin")).sendKeys("152022");
		
		// click on continue 
		
		driver.findElement(By.xpath("//*[text()='Continue ']")).click();
		
		String actual = driver.findElement(By.xpath("//*[text()='KW0610']")).getText();
		
		String expected="KW0610";
		
		if (actual.equals(expected)) {
			
			System.out.println("PASS");
			
		}
		
		else {
			System.out.println("FAIL");
		}
		
		driver.quit();

	}

}
