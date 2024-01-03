package Hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logoprj {
	ChromeDriver driver;
	
	@BeforeTest
	public void logo()
	{
		driver=new ChromeDriver();
		driver.get("https://in.hotels.com/");
	}
	
	@Test
	public void test1()
	{
		WebElement logoElement= driver.findElement(By.xpath("//*[@id=\"app-layer-base\"]/div[1]/div[1]/div[4]/header/div/a/img"));
		if(logoElement.isDisplayed())
		{
			
		System.out.println("pass");
		}
		else
		{
		System.out.println("fail");
		}
		}

}
