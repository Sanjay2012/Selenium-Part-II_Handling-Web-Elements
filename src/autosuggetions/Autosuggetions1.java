package autosuggetions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggetions1 {

	public static void main(String[] args) {
		/*Write a script to find the list of autosuggetions shown by search result and display yhem on consol*/

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get("https://www.amazon.in/");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// click on sign in link

		wd.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
		wd.findElement(By.xpath("//input[@name='email']")).sendKeys("9096387258");
		wd.findElement(By.xpath("//input[@id='continue']")).click();
		wd.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Shiv@123");
		wd.findElement(By.xpath("//input[@id='signInSubmit']")).click();

		// search box

		wd.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung");

		//count the autosuggestions

		List<WebElement> lst = wd.findElements(By.xpath("//div[contains(text(),'samsung')]"));
		System.out.println("The number of autosuggetions for searched results are:  "+lst.size());

		for (WebElement ele : lst) {
			String str = ele.getText();
			if (str.length()>0) {

				System.out.println(str);

			}
		}

		wd.close();
		wd.quit();


	}

}
