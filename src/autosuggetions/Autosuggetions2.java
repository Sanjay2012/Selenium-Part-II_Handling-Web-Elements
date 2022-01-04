package autosuggetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggetions2 {

	public static void main(String[] args) throws InterruptedException {
		/*Write a script to find the list of autosuggetions shown by search result and display them on consol
		 * and verify the expected result present in suggetion or not
		 * Also search the expected result in search engin */

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("oneplus");

		Thread.sleep(2000);

		String exp = "oneplus 7";

		//List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));

		List<WebElement> allOptions = driver.findElements(By.xpath("//div[contains(text(),'oneplus')]"));
		System.out.println("The number of autosuggetions for searched results are:  "+allOptions.size());


		for (WebElement ele : allOptions) {
			String act = ele.getText();

			if (act.equals(exp)) {
				ele.click();
				break;
			}

		driver.close();
		driver.quit();


	}
	}
}

