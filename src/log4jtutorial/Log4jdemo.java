package log4jtutorial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jdemo {
	WebDriver driver;
  @Test
  public void googlesearch() throws InterruptedException {
	  
	   Logger log = Logger.getLogger("Search");
		PropertyConfigurator.configure("Log4j.properties");
		driver =new ChromeDriver();
		log.info("Chrome Browser Launch");
		log.info("Browser window maximized");
		driver.get("https://www.google.com/");
		log.info("Navigate to the Google Application");
		
		
		driver.findElement(By.name("q")).sendKeys("Tirupati");
		Thread.sleep(2000);
		log.info("In Google search field Enter the Tirupati Text");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		log.info("Enter button pressed");
		
	  driver.manage().window().maximize();
	  
  }
}
