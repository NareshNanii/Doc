package PageObject_Component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject_Login {

	public WebDriver driver;
	
	
	//This section is to initialise driver
		public PageObject_Login(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}

		
		
	
	// This section is required to identify the UI elements for executing all the Login scenario test cases

		@FindBy(id="inpUserLgnEmail")
		public WebElement Login_Email;
	
		@FindBy(xpath="//*[@id='inpUserLgnPwd']")
		public WebElement Login_Password;

		@FindBy(xpath="//*[@id='btnUserLgnSubmit']")
		public WebElement Login_LoginButton;
		
		@FindBy(xpath="//*[@id='unregisterd']")
		public WebElement Skip_link;
		
		@FindBy(xpath="//*[@class='is-margin-auto']")
		public WebElement Doconline_Logo;
	
		@FindBy(xpath="//*[@id='lnkUserLgnTabToReg']")
		public WebElement SignUp;
		
		@FindBy(xpath="//*[@class='fb-login-button control-shadow fb_iframe_widget']")
		public WebElement Facebook_Login;
		
		@FindBy(xpath="//*[@id='lnkUserLoginGoogle']")
		public WebElement Google_Login;
	
		@FindBy(xpath="//*[@id='lblRememberMe']")
		public WebElement RememberMe_Login;
		
		@FindBy(xpath="//*[@class='help has-text-muted ']")
		public WebElement Dont_Have_Account;
		
		@FindBy(xpath="//*[@id='lnkUserLoginToFrgtPwd']")
		public WebElement Forgot_Password;
		
		@FindBy(xpath="//*[@class='has-text-centered']")
		public WebElement Or_Field;
		
		@FindBy(xpath="//span[contains(text(),'These credentials do not match our records.')]")
		public WebElement Credentials_error_message;
		
		@FindBy(xpath="//span[contains(text(),'Password field is required.')]")
		public WebElement Credentials_error_message1;
		
		@FindBy(xpath="//span[contains(text(),'Email / Mobile No / MRN field is required.')]")
		public WebElement Credentials_error_message2;
		
	// This section is to perform actions or validations 
	
	
		public String Credentials_Error_Message1_getValue()
		{

			return Credentials_error_message1.getText();
		}
		
		public String Credentials_Error_Message2_getValue()
		{

			return Credentials_error_message2.getText();
		}
		
		public String Credentials_Error_Message_getValue()
		{

			return Credentials_error_message.getText();
		}
		
		public Boolean Credentials_Error_Message_Isvisible()
		{
          try {
			return Credentials_error_message.isDisplayed();
          }
          catch (Exception e) {
			// TODO: handle exception
        	  e.printStackTrace();
		} return false;
		}
		
		
		public void Login_click()
		{

			Login_LoginButton.click();
		}
		
		public void Enter_Email(String Value)
		{

			Login_Email.sendKeys(Value);
		}
		
		
		public void Enter_Password(String Value)
		{

			Login_Password.sendKeys(Value);
		}
		
		
		public Boolean Or_Field_Isvisible()
		{
          try {
			return Or_Field.isDisplayed();
          }
          catch (Exception e) {
			// TODO: handle exception
        	  e.printStackTrace();
		} return false;
		}
		
		

		public Boolean Forgot_Password_Isvisible()
		{
          try {
			return Forgot_Password.isDisplayed();
          }
          catch (Exception e) {
			// TODO: handle exception
        	  e.printStackTrace();
		} return false;
		}
		
		
		public Boolean Dont_Have_Account_Isvisible()
		{
          try {
			return Dont_Have_Account.isDisplayed();
          }
          catch (Exception e) {
			// TODO: handle exception
        	  e.printStackTrace();
		} return false;
		}
		
		
		public Boolean RemeberMe_Isvisible()
		{
          try {
			return RememberMe_Login.isDisplayed();
          }
          catch (Exception e) {
			// TODO: handle exception
        	  e.printStackTrace();
		} return false;
		}
		
		
		
		
		public Boolean Google_Isvisible()
		{
          try {
			return Google_Login.isDisplayed();
          }
          catch (Exception e) {
			// TODO: handle exception
        	  e.printStackTrace();
		} return false;
		}
		
		
		public Boolean Facebook_Isvisible()
		{
          try {
			return Facebook_Login.isDisplayed();
          }
          catch (Exception e) {
			// TODO: handle exception
        	  e.printStackTrace();
		} return false;
		}
		
		public Boolean SignUp_Isvisible()
		{
          try {
			return SignUp.isDisplayed();
          }
          catch (Exception e) {
			// TODO: handle exception
        	  e.printStackTrace();
		} return false;
		}
		
		public Boolean Doconline_Logo_Isvisible()
		{
          try {
			return Doconline_Logo.isDisplayed();
          }
          catch (Exception e) {
			// TODO: handle exception
        	  e.printStackTrace();
		} return false;
		}
		
		
		public Boolean Skip_Link_Isvisible()
		{
          try {
			return Skip_link.isDisplayed();
          }
          catch (Exception e) {
		
        	  e.printStackTrace();
		} return false;
		}
		
		
		public Boolean LoginButton_Isvisible()
		{
          try {
			return Login_LoginButton.isDisplayed();
          }
          catch (Exception e) {
			// TODO: handle exception
        	  e.printStackTrace();
		} return false;
		}
	
		public Boolean Email_Isvisible()
		{
          try {
			return Login_Email.isDisplayed();
          }
          catch (Exception e) {
        	  e.printStackTrace();
		} return false;
		}
		
		
	
		
	
	
		public Boolean Password_Isvisible()
		{
          try {
			return Login_Password.isDisplayed();
          }
          catch (Exception e) {			
        	  e.printStackTrace();
		} return false;
		}
		
}
