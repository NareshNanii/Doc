package Scenario_Component;

import java.io.IOException;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import Generic_Component.Base_Class;
import PageObject_Component.PageObject_ForgotPassword;
import PageObject_Component.PageObject_Login;

public class Scenario_ForgotPassword extends Base_Class{
	
	public static Logger log= Logger.getLogger(Scenario_ForgotPassword.class);
	SoftAssert sAssert= new SoftAssert();
	
	
	//To test whether all the UI elements are present on the User Login screen or not
	@Test(dataProvider="dp_ForgotPassword" , dataProviderClass=DataProvider_Component.DataProvider_ForgotPassword.class, groups={"smoke"}, priority=0)
	public void testUser_ForgotPassword(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{
		
		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
	
	
		open_DocOnline_User_WebApp();
		
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		
        PageObject_ForgotPassword PFP = new PageObject_ForgotPassword(driver);
		PageObject_Login PL = new PageObject_Login(driver);
		
		//Test case to check whether Login button is present on the UI
		Explicit_wait(PL.Forgot_Password,2000);
		Boolean Forgot_Password = PL.Forgot_Password_Isvisible();
		
		if(Forgot_Password)
		{
			log.info("Passed as Forgot Password field is displayed in the User Login screen");
			extenttest.log(LogStatus.PASS, "Forgot Password is displayed on the User Login screen ");
		}
		
		else
		{
			log.info("Failed as Forgot Password field is not displayed on the User Login screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Forgot Password is not displayed on the User Login screen ",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}	
		
		PFP.forgot_button();
		log.info("Click Forgot Button");
		extenttest.log(LogStatus.PASS, "Forgot Button has been clicked successfully");
	
		Explicit_wait(PFP.forgotPassword_text,2000);
	
	Boolean Forgot_Password_text = PFP.forgotpassword_text_isvisible();
		
		if(Forgot_Password_text)
		{
			log.info("Passed as Forgot Password Text is displayed in the Forgot Password screen");
			extenttest.log(LogStatus.PASS, "Forgot Password Text is displayed on the Forgot Password screen ");
		}
		
		else
		{
			log.info("Failed as Forgot Password Text is not displayed on the Forgot Password screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Forgot Password Text is not displayed on the Forgot Password screen ",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}	
	
	
		System.gc();
		driver.close();
	
	
	}
}
