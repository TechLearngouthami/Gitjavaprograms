package actionclassprgrammes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Rightdoubledragmousekey {
	WebDriver driver;
	
  @Test
  public void rightclick() throws InterruptedException {
	  driver.get("https://www.seleniumlearn.com/");
	  Thread.sleep(2000);
	  Actions act=new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-386-1\"]/a"))).build().perform();
	  
	  }
  @Test
  public void doubleclick() throws InterruptedException {
	 driver.get("https://www.seleniumlearn.com/double-click");
	 Thread.sleep(2000);
	 Actions act=new Actions(driver);
	 act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().build().perform();
	 Thread.sleep(2000);
	 driver.switchTo().alert().accept();
	 
	  
  }
  @Test
  public void draganddrop() throws InterruptedException {
	 driver.get("https://www.seleniumlearn.com/drag-and-drop-html");
	 Thread.sleep(4000);
	 Actions a=new Actions(driver);
	 WebElement source1=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
	 WebElement target1=driver.findElement(By.xpath("//div[@id='droppable']"));
	 a.dragAndDrop(source1, target1).build().perform();
	  }
  public void mousehover() throws InterruptedException {
		 driver.get("https://www.seleniumlearn.com/");
		 Thread.sleep(4000);
		 Actions act=new Actions(driver);
		 act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-336-1\"]/a"))).build().perform();
		 Thread.sleep(3000);
		 act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-367-1\"]/a"))).click().build().perform();
		  }
  public void keyboard() throws InterruptedException
  {
	  driver.get("https://www.redmine.org/");	 
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/span[4]/ul/li[1]/a")).click();
	  Thread.sleep(3000);
	  Actions act=new Actions(driver);
	  act.sendKeys(Keys.TAB).build().perform();
	  
	 // act.sendKeys(Keys.ENTER).build().perform();
	  
	  
	  
	  
	  
	  
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
