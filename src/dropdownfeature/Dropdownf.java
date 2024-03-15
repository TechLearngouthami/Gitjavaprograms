package dropdownfeature;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.hotkey.Keys;
import org.testng.annotations.BeforeTest;

public class Dropdownf {
	WebDriver driver;
	
  @Test
  public void selectdropfeature() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//input[@id='text-13263966988']")).sendKeys("hrutesh"+Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"text-241482569216\"]")).sendKeys("chegu");
	  driver.findElement(By.xpath("//input[@id='text-23732060291']")).sendKeys("chegugouthami@gmail.com");
	 driver.findElement(By.xpath("//input[@id='field-DVYLZM9QELAAq8K']")).sendKeys("7386853709");
	 driver.findElement(By.id("field-krP8MPeuzRrukdo")).sendKeys("vinayakagunj");
	 driver.findElement(By.xpath("//input[@id='field-IQsTTT9SxEPs3LH']")).sendKeys("SDNR");
	 driver.findElement(By.xpath("//input[@id='field-2Ngu0gfcgyZYrFE']")).sendKeys("RANGAREDDY");
	 driver.findElement(By.id("field-5vlVJGcSKva7av0")).sendKeys("509216");
	 Thread.sleep(2000);
	 Select co= new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]")));
	 co.selectByValue("PL");
	// new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("Pakistan");
	// new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("PL");
	// new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByIndex(4);
	 driver.findElement(By.xpath("//*[@id=\"textarea-5589244956\"]")).sendKeys("hi balabharathi");
	 Select co1=new Select(driver.findElement(By.xpath("//*[@id=\"field-rUN19TKpQsSOX3X\"]")));
	 co1.selectByIndex(2);
	 driver.findElement(By.xpath("//*[@id=\"field-SUtF8PwfCXGXx46\"]")).sendKeys("gunj");
	 driver.findElement(By.xpath("//*[@id=\"field-8lqEle2zeOhMu0a\"]")).sendKeys("anc");
	 
	 
	 
	  
	  
	
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("http://baalabharathi.com/upload-story/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }

}
