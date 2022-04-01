package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetColumnCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///D:/MindMAPS/Automation/WebTable.html");
		driver.manage().window().maximize();

		List<WebElement> columns = driver.findElements(By.xpath("//table[@id=\"1234\"]/tbody/tr[2]/td"));

		int tableCoulumnCount = columns.size();

		System.out.println("Toatl columns in table are: " + tableCoulumnCount);

	}

}
