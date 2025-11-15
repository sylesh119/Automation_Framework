package TestBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.AccountRegistrationPage;
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
		
		AccountRegistrationPage accreg=new AccountRegistrationPage(driver);
		accreg.setFirstname(Randomstring().toUpperCase());
		accreg.setLastname(Randomstring().toUpperCase());
		accreg.setemail(Randomstring()+"@gmail.com");
		accreg.setPhoneNumber(RandomNumber());
		String Password=RandomAlphaNumeric();
		accreg.setPassword(Password);
		accreg.setconfirmpwd(Password);
		accreg.setprivacy(); 
		accreg.clickContinue();
		String conmsg = accreg.getConfirmedMsg();
		
		Assert.assertEquals(conmsg, "Your Account Has Been Created!");
		
	}
	public String Randomstring() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String RandomNumber() {
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}
	
	public String RandomAlphaNumeric() {
		String generatedString = RandomStringUtils.randomAlphabetic(4);
		String generatedNumber = RandomStringUtils.randomNumeric(3);
		return (generatedString+generatedNumber);
	}
}

















