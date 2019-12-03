package PageObject_Component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject_Settings {
	
	public WebDriver driver;
	

	//This section is to initialise driver
		public PageObject_Settings(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		// This section is required to identify the UI elements on the User Dashboard
		
			@FindBy(id="userEmail")
			public WebElement Your_Email_Value;
			
			@FindBy(id="userMrnNo")
			public WebElement MRN_Value;
			
			@FindBy(id="userMobile")
			public WebElement MobileNo_Value;
			
			@FindBy(id="btnUserStngSignOut")
			public WebElement Logout;
			
			@FindBy(xpath = "//button[@class='button is-danger']")
			public WebElement Leave;
			
			
			// This section is to perform actions or validations 
			
			
			public void Logout_click()
			{

				Logout.click();
			}
			
			public void Leave_click()
			{

				Leave.click();
			}
			
			
			
			
			
				public String MobileNo_get_Value()
				{

					return MobileNo_Value.getText();
				}

			
				public String Your_Email_get_Value()
				{

					return Your_Email_Value.getText();
				}
				
				
				public String MRN_get_Value()
				{

					return MRN_Value.getText();
				}

}
