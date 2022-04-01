package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/MindMAPS/Automation/Signin.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.tagName("input")).sendKeys("madeeasyctc@gmail.com");

	}

}
