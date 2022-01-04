package handlingDyanamicWebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCompanyInTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver() ;

        driver.manage().window().maximize();

       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/test/web-table-element.php");

       // WebElement table = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));
        WebElement table = driver.findElement(By.tagName("table"));

      //No.of Columns
        List<WebElement> col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size());

        //No.of rows
        List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("No of rows are : " + rows.size());


        //search desired company in webtable

        String expected="Vakrangee";
       for (int i = 1; i <=rows.size(); i++) {
    	   String actual=table.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(actual);

			if (actual.equals(expected)) {
				break;
			}

		}

        driver.quit();



	}

}
