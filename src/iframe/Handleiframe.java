package iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleiframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		List<WebElement> frameList = driver.findElements(By.tagName("iframe"));
		
		System.out.println(frameList.size());
		
		//switching to iframe
		
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//*[@src=\"Jmeter720.png\"]")).click();
		
		Thread.sleep(2000);
		
		// switch to main page
		
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
