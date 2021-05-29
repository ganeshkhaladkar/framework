package resize;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowResize {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//Dimension d= new Dimension(450,500);
		org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(450, 500);
		
		driver.manage().window().setSize(d);		

	}

}
