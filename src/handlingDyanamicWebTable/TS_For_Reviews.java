package handlingDyanamicWebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TS_For_Reviews {

	public static void main(String[] args) {

		// Method-1

		/*Steps:
		 *
		 * 1. depe: Reviews
		 * 	  indep: Mobile name
		 * 2. xpath for depe element
		 * 3. extend xpath to identify common parent
		 * 4. xpath for dpenedent element*/

		// method-2
		/*
		 * Using relative xpath using axes
		 * Ex. xpath for reviews wrt mobile
		 * 1. xpath for mobile name
		 * 2. go to ancenter -- /ancestor::u/
		 * 3. xpath of reviews*/

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

		wd.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung m32");
		wd.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();



		WebDriverWait wait = new WebDriverWait(wd, 10);
		WebElement str = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Samsung Galaxy M32 5G (Slate Black, 6GB RAM, 128GB Storage)']/ancestor::div//span[@xpath='1']")));


		//WebElement str = wd.findElement(By.xpath("//span[text()='Samsung Galaxy M32 5G (Slate Black, 6GB RAM, 128GB Storage)']/ancestor::div//span[@xpath='1']"));
		String custReviews = str.getText();
		System.out.println("The customer reviews for searched mobile are:  "+ custReviews);


		wd.close();
		wd.quit();

	}

}
