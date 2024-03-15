package sikuliprogr;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

public class sikulifirt {
	Screen s =new Screen();
  @Test
  public void desktopapp() throws SikuliException, InterruptedException   {
	  s.click("C:\\libm\\sikuli\\Winddowschange.PNG");
	  Thread.sleep(3000);
	  s.click("C:\\libm\\sikuli\\wificon.PNG");
	  
  }
}
