package PageObject_Component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject_ForgotPassword {

	
	public WebDriver driver;
	
	public PageObject_ForgotPassword(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@id='lnkUserLoginToFrgtPwd']")
	public WebElement forgotPassword_button;
	
	@FindBy(xpath = "span[@class='column notification is-white is-size-5 is-radius-0 has-text-centered has-padding-y-3 has-text-grey']")
	public WebElement forgotPassword_text;
	
	
	
	
	
	
	public void forgot_button() {
		try {
		forgotPassword_button.click();
		}catch (Exception e) {
			e.printStackTrace();
		}return;
	}
	
	public Boolean forgotpassword_text_isvisible() {
		try {
		return forgotPassword_text.isDisplayed();
	}catch (Exception e) {
		e.printStackTrace();
	}return false;
	}
	
	
	
	
	
	
}
