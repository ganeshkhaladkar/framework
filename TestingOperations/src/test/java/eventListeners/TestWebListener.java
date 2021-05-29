package eventListeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebListener {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		EventFiringWebDriver webdriver =new EventFiringWebDriver(driver);
		
		WebListener listener=new WebListener();
		
		webdriver.register(listener);
		
		webdriver.get("https://www.google.com/");
		
		webdriver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[3]")).click();
		webdriver.findElement(By.xpath("/html/body/div/div[2]/nav/ul/li[2]/a")).click();
		
		webdriver.navigate().back();
		webdriver.navigate().forward();
		
		
	}

}
