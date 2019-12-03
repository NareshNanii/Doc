package Scenario_Component;



import java.io.IOException;


import Generic_Component.*;
import PageObject_Component.*;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.JavascriptExecutor;
import java.util.Map;


public class Scenario_Login extends Base_Class{
	
	public static Logger log= Logger.getLogger(Scenario_Login.class);
	SoftAssert sAssert= new SoftAssert();
	
	
	//To test whether all the UI elements are present on the User Login screen or not
	@Test(dataProvider= Login_dp_LoginUI , dataProviderClass=DataProvider_Component.DataProvider_Login.class, groups={Smoke_Test}, priority=0)
	public void testUser_Login_UI(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{
		
		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		
	
		open_DocOnline_User_WebApp();
		
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		
		PageObject_Login PL = new PageObject_Login(driver);
		
		//Test case to check whether Login button is present on the UI
		Explicit_wait(PL.Login_LoginButton, 2000);
		Boolean Login_Button = PL.LoginButton_Isvisible();
		
		if(Login_Button)
		{
			log.info(Login_button_display_log_info_pass);
			extenttest.log(LogStatus.PASS, Login_button_display_extend_log_pass);
		}
		
		else
		{
			log.info(Login_button_display_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Login_button_display_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		//Test case to check whether Email field is present on the UI
		
		Boolean Login_Email = PL.Email_Isvisible();
		
		if(Login_Email)
		{
			log.info(Login_Email_field_display_log_info_pass);
			extenttest.log(LogStatus.PASS, Login_Email_field_display_extend_log_pass);
		}
		
		else
		{
			log.info(Login_Email_field_display_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Login_Email_field_display_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		//Test case to check Password field is present on the UI
		
		Boolean Login_Password = PL.Password_Isvisible();
		
		if(Login_Password)
		{
			log.info(Login_password_field_display_log_info_pass);
			extenttest.log(LogStatus.PASS, Login_password_field_display_extend_log_pass);
		}
		
		else
		{
			log.info(Login_password_field_display_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Login_password_field_display_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		//Test case to check whether Skip link is present is on the UI
		
		Boolean Skip_Link = PL.Skip_Link_Isvisible();
		
		if(Skip_Link)
		{
			log.info(Login_Skip_Link_display_log_info_pass);
			extenttest.log(LogStatus.PASS, Login_Skip_Link_display_extend_log_pass);
		}
		
		else
		{
			log.info(Login_Skip_Link_display_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Login_Skip_Link_display_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		//Test case to check whether DocOnline Logo is present on the UI
		
		Boolean Doconline_Logo = PL.Doconline_Logo_Isvisible();
		
		if(Doconline_Logo)
		{
			log.info(Login_Doconline_Logo_display_log_info_pass);
			extenttest.log(LogStatus.PASS, Login_Doconline_Logo_display_extend_log_pass);
		}
		
		else
		{
			log.info(Login_Doconline_Logo_display_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Login_Doconline_Logo_display_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		//Test case to verify whether Sign Up is present on the UI
		
		Boolean SignUp = PL.SignUp_Isvisible();
		
		if(SignUp)
		{
			log.info(Login_SignUp_display_log_info_pass);
			extenttest.log(LogStatus.PASS, Login_SignUp_display_extend_log_pass);
		}
		
		else
		{
			log.info(Login_SignUp_display_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Login_SignUp_display_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		//Test case to verify whether Facebook login button is present on the UI
				
				Boolean Facebook_Login = PL.Facebook_Isvisible();
				
				if(Facebook_Login)
				{
					log.info(Login_facebook_display_log_info_pass);
					extenttest.log(LogStatus.PASS, Login_facebook_display_extend_log_pass);
				}
				
				else
				{
					log.info(Login_facebook_display_log_info_fail);
					Capture_Screenshot1(TC_ID, Order_Set);
					extenttest.log(LogStatus.FAIL, Login_facebook_display_extend_log_fail,
							extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
				}
				
				
				
				//Test case to verify whether Google login button is present on the UI
				
				Boolean Google_Login = PL.Google_Isvisible();
				
				if(Google_Login)
				{
					log.info(Login_google_display_log_info_pass);
					extenttest.log(LogStatus.PASS, Login_google_display_extend_log_pass);
				}
				
				else
				{
					log.info(Login_google_display_log_info_fail);
					Capture_Screenshot1(TC_ID, Order_Set);
					extenttest.log(LogStatus.FAIL, Login_google_display_extend_log_fail,
							extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
				}	
				
				
				
				//Test case to verify whether Remember me is present on the UI
				
				Boolean Remember_Me = PL.RemeberMe_Isvisible();
				
				if(Remember_Me)
				{
					log.info(Login_RememberMe_display_log_info_pass);
					extenttest.log(LogStatus.PASS, Login_RememberMe_display_extend_log_pass);
				}
				
				else
				{
					log.info(Login_RememberMe_display_log_info_fail);
					Capture_Screenshot1(TC_ID, Order_Set);
					extenttest.log(LogStatus.FAIL, Login_RememberMe_display_extend_log_fail,
							extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
				}	
				
				
				//Test case to verify whether Don't Have an Account is present on the UI
				
				Boolean Dont_Have_Account = PL.Dont_Have_Account_Isvisible();
				
				if(Dont_Have_Account)
				{
					log.info(Login_Dont_Have_acc_display_log_info_pass);
					extenttest.log(LogStatus.PASS, Login_Dont_Have_acc_display_extend_log_pass);
				}
				
				else
				{
					log.info(Login_Dont_Have_acc_display_log_info_fail);
					Capture_Screenshot1(TC_ID, Order_Set);
					extenttest.log(LogStatus.FAIL, Login_Dont_Have_acc_display_extend_log_fail,
							extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
				}	
		
		
		
				//Test case to verify whether Forgot Password field is present on the UI
				
				Boolean Forgot_Password = PL.Forgot_Password_Isvisible();
				
				if(Forgot_Password)
				{
					log.info(Login_forgot_pwd_display_log_info_pass);
					extenttest.log(LogStatus.PASS, Login_forgot_pwd_display_extend_log_pass);
				}
				
				else
				{
					log.info(Login_forgot_pwd_display_log_info_fail);
					Capture_Screenshot1(TC_ID, Order_Set);
					extenttest.log(LogStatus.FAIL, Login_forgot_pwd_display_extend_log_fail,
							extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
				}	
		
				
				
				//Test case to verify whether Forgot Password field is present on the UI
			
				Boolean Or_Field = PL.Or_Field_Isvisible();
				
				if(Or_Field)
				{
					log.info(Login_OR_field_display_log_info_pass);
					extenttest.log(LogStatus.PASS, Login_OR_field_display_extend_log_pass);
				}
				
				else
				{
					log.info(Login_OR_field_display_log_info_fail);
					Capture_Screenshot1(TC_ID, Order_Set);
					extenttest.log(LogStatus.FAIL, Login_OR_field_display_extend_log_fail,
							extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
				}	
				
		
		sAssert.assertAll();
		
		System.gc();
		
		driver.close();
		
		
	}
	
	
	//To test Login functionality using valid Email and Password
	@Test(dataProvider=LOGIN_dp_ValidLogin , dataProviderClass=DataProvider_Component.DataProvider_Login.class, groups={Smoke_Test},priority=1)
	public void testUser_Login1_Valid(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
	    String Dashboard_Title = DashBoard_Title;
	    
		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_Settings PS = new PageObject_Settings(driver);
		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 2000);
		String UserDashboard = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + UserDashboard);
		if(UserDashboard.equalsIgnoreCase(Dashboard_Title))
		{
			log.info(DashBoard_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + DashBoard_Title_match_extend_log_pass);
		}
		else {
			log.info(DashBoard_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL,  Username + DashBoard_Title_match_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			}
		
		PD.LeftNav_Toggle_Button_click();
		
		Explicit_wait(PD.LeftNavigation_settings_inside,1000);
		
		
		PD.LeftNav_Settings_inside_click();
		
		
		Explicit_wait(PS.Your_Email_Value, 2000);
		String YourEmail = PS.Your_Email_get_Value();
		System.out.println(YourEmail);
		if(YourEmail.equalsIgnoreCase(Username))
		{
			log.info(Settings_mailID_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Settings_mailID_match_extend_log_pass);
		}
		else {	
			log.info(Settings_mailID_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL,  Settings_mailID_match_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		
		
		
		PS.Logout_click();
		
		PS.Leave_click();
		
		System.gc();
		
		driver.close();
	}
	
	
	//To test Login functionality using valid MRN and Password
	@Test(dataProvider=LOGIN_dp_ValidLogin1 , dataProviderClass=DataProvider_Component.DataProvider_Login.class, groups={Smoke_Test}, priority=2)
	public void testUser_Login2_Valid(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{
		
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
	    String Dashboard_Title = DashBoard_Title;
		
		open_DocOnline_User_WebApp();
		
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_Settings PS = new PageObject_Settings(driver);
		
		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		
		
		
		Explicit_wait(PD.LeftNav_Settings, 2000);
		
		String UserDashboard = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + UserDashboard);
		
		if(UserDashboard.equalsIgnoreCase(Dashboard_Title))
		{
			log.info(DashBoard_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + DashBoard_Title_match_extend_log_pass);
		}
		
		else {
			
			log.info(DashBoard_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL,  Username + DashBoard_Title_match_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		
		PD.LeftNav_Toggle_Button_click();
		
Explicit_wait(PD.LeftNavigation_settings_inside,1000);
		
		PD.LeftNav_Settings_inside_click();
		
		
		
		Explicit_wait(PS.MRN_Value, 2000);
		String MRNValue = PS.MRN_get_Value();
		
		System.out.println(MRNValue);
		
		if(MRNValue.equalsIgnoreCase(Username))
		{
			log.info(Settings_MRN_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Settings_MRN_match_extend_log_pass);
			
	
		}
		
		else {
			
			log.info(Settings_MRN_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL,  Settings_MRN_match_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		
		
		PS.Logout_click();
		
		PS.Leave_click();
		
		System.gc();
		
		quit_execution();
		
		
	}
	
	
	//To test Login functionality using valid Mobile Number and Password
	@Test(dataProvider= LOGIN_dp_ValidLogin2 , dataProviderClass=DataProvider_Component.DataProvider_Login.class, groups={Smoke_Test}, priority=3)
	public void testUser_Login3_Valid(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{
		
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
	    String Dashboard_Title = DashBoard_Title;
	    
	    
	    System.out.println(Username);
	    
	    
		
		open_DocOnline_User_WebApp();
		
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_Settings PS = new PageObject_Settings(driver);
		
		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		
		
		
		Explicit_wait(PD.LeftNav_Settings,1000);
		
		String UserDashboard = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + UserDashboard);
		
		if(UserDashboard.equalsIgnoreCase(Dashboard_Title))
		{
			log.info(DashBoard_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + DashBoard_Title_match_extend_log_pass);
		}
		
		else {
			
			log.info(DashBoard_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL,  Username + DashBoard_Title_match_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		
		PD.LeftNav_Toggle_Button_click();
		
Explicit_wait(PD.LeftNavigation_settings_inside,1000);
		
		PD.LeftNav_Settings_inside_click();
		
		
		
		Explicit_wait(PS.MobileNo_Value, 0);
		String MobileValue = PS.MobileNo_get_Value();
		
		System.out.println(MobileValue);
		
		if(MobileValue.equalsIgnoreCase(Username))
		{
			log.info(Settings_MobileNum_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Settings_MobileNum_match_extend_log_pass);
			
	
		}
		
		else {
			
			log.info(Settings_MobileNum_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Settings_MobileNum_match_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		
		
		PS.Logout_click();
		
		PS.Leave_click();
		System.gc();
		
		driver.close();
		
		
		
		
	}
	
	
	//To test Login functionality using invalid Email and Password
	@Test(dataProvider = LOGIN_dp_InValidlogin , dataProviderClass=DataProvider_Component.DataProvider_Login.class, groups={Smoke_Test}, priority=4)
	public void testUser_Login_InValid(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{
		
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String Error_message = search.get(Login_Error_Message_excel).toString();
	   
	    
		
		open_DocOnline_User_WebApp();
		
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		
		PageObject_Login PL = new PageObject_Login(driver);
	
		
		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		
		
		
		Explicit_wait(PL.Credentials_error_message, 1000);
		Boolean Credentials_error_message_isPresent = PL.Credentials_Error_Message_Isvisible();
		
		if(Credentials_error_message_isPresent)
		{
			log.info(Login_Error_message_log_info_pass);
			extenttest.log(LogStatus.PASS, Login_Error_message_extend_log_pass);
		}
		
		else {
			
			log.info(Login_Error_message_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL,Login_Error_message_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		String Credentials_Error_Message = PL.Credentials_Error_Message_getValue();
		
		if(Credentials_Error_Message.equalsIgnoreCase(Error_message))
		{
			log.info(Login_Error_message_matching_log_info_pass);
			extenttest.log(LogStatus.PASS, Login_Error_message_matching_extend_log_pass);
			
	
		}
		
		else {
			
			log.info(Login_Error_message_matching_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL,  Login_Error_message_matching_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		System.gc();
		driver.close();	
	}
	
//PageTitle_User
	
	@Test(dataProvider = LOGIN_dp_PageTitle , dataProviderClass=DataProvider_Component.DataProvider_Login.class, groups={Smoke_Test}, priority=5)
	public void testUser_page_title(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{
		
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
	    String url = search.get(Base_URL).toString();
	    
		
		open_DocOnline_User_WebApp();
		
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		
		PageObject_Login PL = new PageObject_Login(driver);
		
		
		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		
		String title = driver.getCurrentUrl();
		System.out.println(Console_Actual_URL_displayed_is + title);
	
		if(title.equalsIgnoreCase(url))
		{
			log.info(DashBoard_URL_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + DashBoard_URL_Title_match_extend_log_pass);
		}
		else {
			log.info(DashBoard_URL_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + DashBoard_URL_Title_match_extend_log_fail);
		}

		System.gc();
		driver.close();
	
	}
	
	
//Login using Empty Username and Valid Password	
	
	@Test(dataProvider = LOGIN_dp_InValidLogin_EmptyEmail, dataProviderClass=DataProvider_Component.DataProvider_Login.class, groups={Smoke_Test}, priority=6)
	public void InvalidLogin_Emptymail(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{
		
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String Error_message  = search.get(Login_Error_Message1_excel).toString();
	    
		
		open_DocOnline_User_WebApp();
		
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		
		PageObject_Login PL = new PageObject_Login(driver);
		
		
		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		
		Explicit_wait(PL.Credentials_error_message2, 1000);
		
		String message  = PL.Credentials_Error_Message2_getValue();
		
		if(message.equalsIgnoreCase(Error_message))
		{
			log.info(Login_Error_message_matching_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Login_Error_message_matching_extend_log_pass);
		}
		else {
			log.info(Login_Error_message_matching_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Login_Error_message_matching_extend_log_fail);
		}
	
		System.gc();
	driver.close();
	
	}
		
	
	
//Login using Valid Username and Empty Password
	
	@Test(dataProvider = LOGIN_dp_InValidLogin_EmptyPassword  , dataProviderClass=DataProvider_Component.DataProvider_Login.class, groups={Smoke_Test}, priority=7)
	public void InvalidUN_Emptypassword(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{
		
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String Error_message  = search.get(Login_Error_Message2_excel).toString();
	    
	    
		
		open_DocOnline_User_WebApp();
		
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		
		PageObject_Login PL = new PageObject_Login(driver);
		
		
		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		
		Explicit_wait(PL.Credentials_error_message1, 1000);
		
		String message  = PL.Credentials_Error_Message1_getValue();
		
		if(message.equalsIgnoreCase(Error_message))
		{
			log.info(Login_Error_message_matching_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Login_Error_message_matching_extend_log_pass);
		}
		else {
			log.info(Login_Error_message_matching_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Login_Error_message_matching_extend_log_fail);
		}
		System.gc();

	driver.close();
	
	}
	
	
	
	
	//Login using Empty Username and Empty Password
	
	@Test(dataProvider = LOGIN_dp_InValidLogin_EmptyAll  , dataProviderClass=DataProvider_Component.DataProvider_Login.class, groups={Smoke_Test}, priority=8)
	public void InvalidLogin_EmptyAll(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{
		
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String Error_message1  = search.get(Login_Error_Message2_excel).toString();
		String Error_message2  = search.get(Login_Error_Message1_excel).toString();
	    
	    
		
		open_DocOnline_User_WebApp();
		
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		
		PageObject_Login PL = new PageObject_Login(driver);
		
		
		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		
		
		
 Explicit_wait(PL.Credentials_error_message2, 1000);
		
		String message1  = PL.Credentials_Error_Message2_getValue();
		
		if(message1.equalsIgnoreCase(Error_message2))
		{
			log.info(Login_Error_message_matching_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Login_Error_message_matching_extend_log_pass);
		}
		else {
			log.info(Login_Error_message_matching_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Login_Error_message_matching_extend_log_fail);
		}
		
Explicit_wait(PL.Credentials_error_message1, 1000);
		
		String message  = PL.Credentials_Error_Message1_getValue();
		
		if(message.equalsIgnoreCase(Error_message1))
		{
			log.info(Login_Error_message_matching_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Login_Error_message_matching_extend_log_pass);
		}
		else {
			log.info(Login_Error_message_matching_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Login_Error_message_matching_extend_log_fail);
		}
	
		System.gc();
	driver.close();
	
	}
	
	
	
	
	
	}
	
	
	
	
	


