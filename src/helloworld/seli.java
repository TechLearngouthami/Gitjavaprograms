package helloworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seli {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.close();
		
		

	}

}
