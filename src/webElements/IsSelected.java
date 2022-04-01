package webElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		Thread.sleep(5000);
		
//		WebElement radioButton = driver.findElement(By.xpath("//input[@class=\"_8esa\"]"));
//		
//		
//		boolean Status = radioButton.isSelected();
//		if (Status==true) {
//			System.out.println("checkbox selected");
//			
//		}
//		else {
//			System.out.println("checkbox not selected");
//		}
//		
//		Thread.sleep(3000);
//		
//		radioButton.click();
//		
//		boolean Status1 = radioButton.isSelected();
//		if (Status1==true) {
//			System.out.println("checkbox selected");
//			
//		}
//		else {
//			System.out.println("checkbox not elected");
//		}
		
		
		
		driver.quit();
		

	}
}
