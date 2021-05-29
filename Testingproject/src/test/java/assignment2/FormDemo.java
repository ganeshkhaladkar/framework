package assignment2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://www.way2automation.com/way2auto_jquery/index.php");
		
		driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("Ganesh");
		driver.findElement(By.cssSelector("#load_form > div:nth-child(12) > div.span_1_of_4 > input")).click();
		
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#load_form > div:nth-child(12) > div.span_1_of_4 > input"))).click();

		
		//driver.findElement(By.xpath("//*[@id=\"load_form\"]/div[1]/div[2]/input")).click();
		//driver.findElement(By.className("button")).click();
		/*WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\\\"load_form\\\"]/div[1]/div[2]/input")));
		driver.findElement(By.xpath("//*[@id=\\\"load_form\\\"]/div[1]/div[2]/input")).click();*/
		List<WebElement> elemt=driver.findElements(By.tagName("input"));
		System.out.println(elemt.size());
		for(int i=0;i<elemt.size();i++) {
			System.out.println(elemt.get(i).getAttribute("class"));
		}
		
				
				
				/*WebElement btn=driver.findElement(By.("button"));
		System.out.println("hellllllllllo"+btn.getText());
		btn.click();*/

	}

}
