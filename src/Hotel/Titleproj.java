package Hotel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Titleproj {
	ChromeDriver driver;
	@BeforeTest
public void load ()
{
		driver=new ChromeDriver();
		driver.get("https://in.hotels.com/");
		
		
}
	@Test
	public void newtest()
	{
		String actualtitle=driver.getTitle();
	    String title="	Whereto";
	    
	    
	    if (actualtitle.equals (title) )
	    {
	    	System.out.println("pass");
	    }
	    else
	    	System.out.println("Fail");
	}

}
