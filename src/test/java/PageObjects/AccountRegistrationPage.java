package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstname;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastname;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtPhoneNumber;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtconpassword;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement ckdpolicy;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confirmMsg;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;

	public void setFirstname(String fname) {
		txtFirstname.sendKeys(fname);
	}

	public void setLastname(String lname) {
		txtLastname.sendKeys(lname);
	}

	public void setemail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPhoneNumber(String phonenum) {
		txtPhoneNumber.sendKeys(phonenum);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void setconfirmpwd(String conpwd) {
		txtconpassword.sendKeys(conpwd);
	}

	public void setprivacy() {
		ckdpolicy.click();
	}

	public void clickContinue() {
		btnContinue.click();
	}

//	public String ConfirmedMsg(String msg) {
//		try {
//			String actualvalue = confirmMsg.getText();
//			if (msg.equals(actualvalue)) {
//				System.out.println("actual value matched with expected value");
//			}
//			return actualvalue;
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			return "Exception Thrown";
//		}
//	}
	public String getConfirmedMsg() {
		try {
			String actual = confirmMsg.getText();
			return actual;
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
