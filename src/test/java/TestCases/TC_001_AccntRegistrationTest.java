package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.AccountRegistrationPage;
import PageObjects.Homepage;
import TestBase.BaseClass;

public class TC_001_AccntRegistrationTest extends BaseClass{
	
	
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
		logger.info("password is entered succesfully");
		accreg.setconfirmpwd(Password);
		accreg.setprivacy(); 
		accreg.clickContinue();
		logger.info("clicked on continue");
		String conmsg = accreg.getConfirmedMsg();
		
		Assert.assertEquals(conmsg, "Your Account Has Been Created!");
		logger.info("test case TC_001_AccntRegistrationTest passed successfully ");
		
	}
	
}

















