package eventListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class WebListener extends AbstractWebDriverEventListener {

	public void afterClickOn(WebElement element,WebDriver driver) {
		
		System.out.println("After Click!!!!!");
	}
	
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("Moving Forword!!!");
	}

}
