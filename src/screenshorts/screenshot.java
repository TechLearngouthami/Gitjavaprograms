package screenshorts;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class screenshot {
	WebDriver driver;
	
  @Test
  public void google() throws InterruptedException, IOException {
	  driver.get("https://www.google.com/");
	  File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\libm\\screenshot\\demo.png"));
	  Thread.sleep(1000);
	  driver.findElement(By.name("q")).sendKeys("Hyderabad");
	  File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("C:\\libm\\screenshot\\demo1.png"));
	  Thread.sleep(1000);
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  File f3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f3, new File("C:\\libm\\screenshot\\demo3.png"));
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"bqHHPb\"]/div/div/div/div[1]/div[2]/a/div")).click();
	  File f4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f4, new File("C:\\libm\\screenshot\\demo4.png"));
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }
  

}


