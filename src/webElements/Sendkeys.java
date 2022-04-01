package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// Approach- 1
		
//		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("madeeasyctc@gmail.com");
		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("CTC@123");
		
		
		// Approach-2
		// we are identifying the web element which need to be handled & stored it into one ref variable
		// this approach is used when the element used repetatly
		
//		WebElement email = driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]"));
//		
//		email.sendKeys("Kanna123@in.in");
//		
//		Thread.sleep(3000);
//		
//		email.clear();
//		
//		Thread.sleep(3000);
//		
//		email.sendKeys("madeeasyctc@gmail.com");
//		
//		driver.quit();
		
		
		//Approach-3
		// POM clasess
		
		// first we required to capture the xpath for desired element using "By" class
		
		By email1=By.xpath("//input[@name=\"email\"]");
		By password=By.xpath("//input[@id=\"pass\"]");
		By loginButton=By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]");
		
		
		driver.findElement(email1).sendKeys("sanjay@in.in");
		
		Thread.sleep(3000);
		
		driver.findElement(password).sendKeys("Shiv@123");
		
		Thread.sleep(3000);
		
		driver.findElement(loginButton).click();
		
		
		Thread.sleep(10000);
		
		driver.close();
		
		
	}

}
