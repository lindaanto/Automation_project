package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class Basecls {
	public  WebDriver driver;
	@BeforeTest
	public void setUp() throws InterruptedException
	{
		Thread.sleep(5000);
		driver=new ChromeDriver();
		driver.get("https://www.benefitcosmetics.com/en-us/account/register/?returnUrl=%2Fen-us%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}

}
