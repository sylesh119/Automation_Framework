package TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.Homepage;

public class TC_001_AccntRegistrationTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void Teardown()
	{
		driver.quit();
	}
	
	@Test
	public void verify_account_registartion()
	{
		Homepage hp=new Homepage(driver);
		hp.clickMyaccount();
		hp.clickRegister();
	}

}
