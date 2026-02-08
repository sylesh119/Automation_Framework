package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import TestBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {

	@Test(groups={"Sanity", "Master"})
	public void verifyLogin() {
		logger.info("statring test case");
		try {
			Homepage hp = new Homepage(driver);
			hp.clickMyaccount();
			hp.clickLogin();

			LoginPage lp = new LoginPage(driver);
			lp.Setemail(prop.getProperty("email"));
			lp.SetPassword(prop.getProperty("password"));
			lp.ClickLogin();

			MyAccountPage map = new MyAccountPage(driver);
			boolean targetpage = map.isMyAccountExists();
			Assert.assertTrue(targetpage);
		} catch (

		Exception e) {
			Assert.fail();
		}
		logger.info(" test case finished");
	}
}
