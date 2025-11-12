package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage{

	public Homepage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//a[@title='My Account']")
	WebElement linkMyaccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement linkRegister;
	
	
	public void clickMyaccount() {
		linkMyaccount.click();
	}
	
	public void clickRegister() {
		linkRegister.click();
	}
}
//span[normalize-space()='My Account']