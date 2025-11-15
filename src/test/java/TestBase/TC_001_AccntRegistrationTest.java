package TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.AccountRegistrationPage;
import PageObjects.Homepage;

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
		accreg.setconfirmpwd(Password);
		accreg.setprivacy(); 
		accreg.clickContinue();
		String conmsg = accreg.getConfirmedMsg();
		
		Assert.assertEquals(conmsg, "Your Account Has Been Created!");
		
	}
	
}

















