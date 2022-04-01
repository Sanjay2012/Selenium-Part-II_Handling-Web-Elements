package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRowCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///D:/MindMAPS/Automation/WebTable.html");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"1234\"]"));

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"1234\"]/tbody/tr"));
		int tableRowCount = rows.size();
		System.out.println("Total No of rows in table= " + tableRowCount);
		
		
		
		

	}

}
