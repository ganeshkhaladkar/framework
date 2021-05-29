package iframe;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIFrames {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement child=driver.findElement(By.xpath("//*[@id='frame2']"));
		driver.switchTo().frame(child);
		
		WebElement text=driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
		
		System.out.println(text.getText());
		
		//FInd out no.of Frames in page
	/*	List<WebElement>frame= driver.findElements(By.tagName("iframe"));
		
		System.out.println(frame.size());
		
		for(WebElement iframe:frame) {
			System.out.println(iframe.getAttribute("id"));*/
		}
	

}
