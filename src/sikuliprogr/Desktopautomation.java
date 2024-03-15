package sikuliprogr;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Desktopautomation {
	Screen s=new Screen();
	
  @Test
  public void desktop() throws FindFailed, InterruptedException {
	 s.click("C:\\dectes\\sikuli\\windows.PNG");
	 Thread.sleep(4000);
	 s.click("C:\\dectes\\sikuli\\Wi.PNG");
	 Thread.sleep(5000);
	 s.dragDrop("C:\\dectes\\sikuli\\DAY1.PNG","C:\\dectes\\sikuli\\Lenvo.PNG" );
	 
	 
	  
  }
}
