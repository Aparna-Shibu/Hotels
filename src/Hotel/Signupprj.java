package Hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signupprj {
	ChromeDriver driver;
	
	@BeforeTest
	public void signin()
	{
		driver=new ChromeDriver();
		driver.get("https://in.hotels.com/");
	}
	
	@Test
	public void test1()
	{

	    driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/div/div[1]/div/div/a[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"loginFormEmailInput\"]")).sendKeys("abc@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"loginFormSubmitButton\"]")).click();
		driver.navigate().back();

	}

}
