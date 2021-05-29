package eventListeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovement {

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
		
		EventFiringMouse mouse=new EventFiringMouse(webdriver, listener);
		
		Locatable hoverItem=(Locatable)webdriver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
		
		Coordinates  cord =hoverItem.getCoordinates();
		
		try {
			
			mouse.mouseMove(cord);
			
		}
		catch(Throwable t) {
			
		}
		

	}

}
