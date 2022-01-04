package handlingDyanamicWebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchCellValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get("http://demo.guru99.com/test/web-table-element.php");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement table = wd.findElement(By.tagName("table"));

		// To find 12th row of table
		WebElement tableRow = table.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[12]"));
		String rowtext = tableRow.getText();
		System.out.println("Twelth row of table : " + rowtext);

		// to get 12th row's 1st column data
		WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[12]/td[1]"));
		String valueIneed = cellIneed.getText();
		System.out.println("Cell value is : " + valueIneed);


		wd.close();

	}

}
