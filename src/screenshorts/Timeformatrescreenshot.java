package screenshorts;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

   public class Timeformatrescreenshot {
	WebDriver driver;
	public void getscreenshot() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\libm\\screenshot\\Image_"+time+".png"));

	}
		
	
  @Test
  public void google() throws InterruptedException, IOException {
	  driver.get("https://www.google.com/");
	  Thread.sleep(1000);
	  getscreenshot();
	  driver.findElement(By.name("q")).sendKeys("Hyderabad");
	  Thread.sleep(1000);
	  getscreenshot();
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(1000);
	  getscreenshot();
	  driver.findElement(By.xpath("//*[@id=\"bqHHPb\"]/div/div/div/div[1]/div[2]/a/div")).click();  
	  Thread.sleep(1000);
	  
	  getscreenshot();
	  

	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }
  

}
