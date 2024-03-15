package sikuliprogr;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;

public class Sikuliwebauomation {
	WebDriver driver;
	Screen s=new Screen();
	
  @Test
  public void sikuliweb() throws InterruptedException, FindFailed {
	  driver.get("https://www.seleniumlearn.com/");
	  Thread.sleep(3000);
	  s.click("C:\\dectes\\sikuli\\Quiz.PNG");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
