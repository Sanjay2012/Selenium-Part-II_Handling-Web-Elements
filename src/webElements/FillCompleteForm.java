package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillCompleteForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/form");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		// finding loactors using Xpath by Attribute
		
		By firstName = By.xpath("//input[@id=\"first-name\"]");
		By lastName = By.xpath("//input[@id=\"last-name\"]");
		By jobTitle = By.xpath("//input[@id=\"job-title\"]");
		By eduLevel = By.xpath("//input[@id=\"radio-button-2\"]");
		By sex = By.xpath("//input[@id=\"checkbox-2\"]");
		By date = By.xpath("//input[@id=\"datepicker\"]");
		By submitButton = By.xpath("//a[@class=\"btn btn-lg btn-primary\"]");
		By successMsg = By.xpath("//div[@class=\"alert alert-success\"]");
		
		driver.findElement(firstName).sendKeys("Mahendra");
		Thread.sleep(3000);
		
		driver.findElement(lastName).sendKeys("Mane");
		Thread.sleep(3000);
		
		driver.findElement(jobTitle).sendKeys("Automation Engg");
		Thread.sleep(3000);
		
		driver.findElement(eduLevel).click();
		Thread.sleep(3000);
		
		driver.findElement(sex).click();
		Thread.sleep(3000);
		
		driver.findElement(date).sendKeys("02/18/2022");
		Thread.sleep(3000);
		
         //getAttribute -- Methods
		String text = driver.findElement(firstName).getAttribute("value");
		System.out.println("Entered first Name is  "+ text);
		
		Thread.sleep(3000);
		
		driver.findElement(submitButton).click();
		Thread.sleep(2000);
		
		// getText() -- method
		String successMessage = driver.findElement(successMsg).getText();
		System.out.println(successMessage);
		
		driver.quit();

	}

}
