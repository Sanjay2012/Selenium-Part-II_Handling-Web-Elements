package windowPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnOk {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
		
		// switch the focous from main page to Alert popup
		
//		Alert alt = driver.switchTo().alert();
//		
//		// click on ok button
//		
//		//alt.accept();
//		alt.dismiss();
//		

	}

}
