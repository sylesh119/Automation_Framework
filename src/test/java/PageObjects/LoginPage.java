package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath ="//input[@id='input-email']")
	WebElement TxtEmailAddress;
	
	@FindBy(xpath ="//input[@id='input-password']")
	WebElement TxtPassword;
	
	@FindBy(xpath ="//input[@value='Login']")
	WebElement LoginBtn;
	
	
	public void Setemail(String email) {
		TxtEmailAddress.sendKeys(email);
	}
	
	public void SetPassword(String pwd) {
		TxtPassword.sendKeys(pwd);
	}
	
	public void ClickLogin() {
		LoginBtn.click();
	}

}
