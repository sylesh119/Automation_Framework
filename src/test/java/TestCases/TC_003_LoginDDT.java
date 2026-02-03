package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import TestBase.BaseClass;
import Utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass {
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void LoginTestDDT(String email, String pwd, String exp) {
		try {
			Homepage hp = new Homepage(driver);
			hp.clickMyaccount();
			hp.clickLogin();
			//new change
			LoginPage lp = new LoginPage(driver);
			lp.Setemail(email);
			lp.SetPassword(pwd);
			lp.ClickLogin();

			MyAccountPage map = new MyAccountPage(driver);
			boolean targetpage = map.isMyAccountExists();

			if (exp.equalsIgnoreCase("Valid")) {
				if (targetpage == true) {
					map.clickLogout();
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

			if (exp.equalsIgnoreCase("Invalid")) {
				if (targetpage == true) {
					map.clickLogout();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}
		} catch (Exception e) {
			Assert.fail();
		}
		logger.info("**** Finished test case ");
	}
}
