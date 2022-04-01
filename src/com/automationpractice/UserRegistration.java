package com.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class UserRegistration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		/*Open  url in chrome browser*/
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		/*Click on sign in link.*/
		driver.findElement(By.xpath("//*[@class=\"login\"]")).click();
		
		Thread.sleep(3000);
		
		/*enter valid email*/
		
		WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
		WebElement createButton = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
		
		// email field validation
		
		emailField.sendKeys("jhghghg");
		Thread.sleep(3000);
		createButton.click();
		Thread.sleep(3000);
		
		String errorText = driver.findElement(By.xpath("//*[@class=\"alert alert-danger\"]")).getText();
		String expected1 = "Invalid email address.";
		
		if (expected1.equalsIgnoreCase(errorText)) {
			System.out.println("wrong email id");
			
		}
		
		
//		String str = RandomString.make(4);
//		
//		emailField.sendKeys("madeeasyctc"+str+"@gmail.com");
//		
//		Thread.sleep(3000);
//		
//		/*Click on creater button*/
//		
//		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
//		
//		Thread.sleep(3000);
//		
//		
//		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Sachin");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Kapoor");
//		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Automation@123");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("pune, maharastra");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("xyzp");
//		Thread.sleep(3000);
//		
//		WebElement statedropdown=driver.findElement(By.name("id_state"));
//		  Select state=new Select(statedropdown);
//		  state.selectByValue("4");
//		  Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("23568");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("7894561230");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();
//		Thread.sleep(3000);
//		//
//		String actualText = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
//		String expected = "Welcome to your account. Here you can manage all of your personal information and orders.";
//		
//		if (actualText.equalsIgnoreCase(expected)) {
//			System.out.println("Test case Passed");
//			
//		}
//		else {
//			System.out.println("Test case failed");
//		}
		driver.quit();
		
		

	}

}
