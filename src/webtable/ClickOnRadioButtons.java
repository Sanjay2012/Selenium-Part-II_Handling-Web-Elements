package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///D:/MindMAPS/Automation/radioButtons.html");
		driver.manage().window().maximize();
		
		List<WebElement> allRadioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (WebElement ele : allRadioButtons) {
			ele.click();
			
			Thread.sleep(2000);
			
		}

	}

}
