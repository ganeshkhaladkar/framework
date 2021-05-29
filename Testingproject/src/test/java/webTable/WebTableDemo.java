package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		List<WebElement> numRows = driver.findElements(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/tbody/tr/th"));
		
		List<WebElement> numCols = driver.findElements(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/thead/tr[1]/th"));
		
		System.out.println("Cols =="+numCols.size());
		System.out.println("Rows===="+numRows.size());
		
		for(int cols=1;cols<=numCols.size();cols++) {
		
			for(int rows=1;rows<=numRows.size();rows++) {
			
				System.out.print(driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table/tbody/tr["+rows+"]/th["+cols+"]")).getText());
				                                              //*[@id="post-body-5867683659713562481"]/div/div[1]/table/tbody/tr[1]/td[1]
			}
			System.out.println();
		}

	}

}
