package autocomplete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteField {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://formy-project.herokuapp.com/autocomplete");
		WebElement textbox = driver.findElement(By.id("autocomplete"));
		textbox.sendKeys("1555 Park Blvd, Palo Alto, CA, USA ");
		Thread.sleep(1000);
		WebElement autoResult = driver.findElement(By.className("pac-item"));
		autoResult.click();

		driver.close();
		driver.quit();
	}

}
