package Generic_Component;

public interface IAutoConstant {
	
	
	//Base Class and Excel class

	String CHROME_KEY = "webdriver.chrome.driver";
	String CHROME_VALUE = "/Users/doconline_testing/Desktop/DocOnline Web Automation/chromedriver";
	String URL = "https://user1:danger@staging.doconline.com/user/login";
	String ATUTest_Recorder_PATH = "/Users/doconline_testing/Desktop/DocOnline Web Automation/Script Execution Videos//";
	String ExtendReports_PATH = "/Users/doconline_testing/Desktop/DocOnline Web Automation/Test Reports/";
	String ScreenShot_PATH = "/Users/doconline_testing/Desktop/DocOnline Web Automation/Screenshots/";
	String Excel_data_PATH = "/Users/doconline_testing/Desktop/DocOnline Web Automation/Test Data/TestData.xls";
	String Date_Formate = "yy-MM-dd HH-mm-ss";
	String TEXT_VIDEO_TEXT_FILE_NAME = "TestVideo-";
	String CONSOLE_TEXT_VIDEO = "Video Recording started";
	String EXTEND_REPORT_FILE_NAME = "DocOnlineWebAutomation";
	String EXTEND_REPORT_FILE_NAME_EXT = ".html";
	String EXTEND_REPORT_FILE_NAME_SYMBOL = "-";
	String SCREENSHOT_PNG = ".png";
	String SCREENSHOT_SYMBOL = "-";	
	String EXCEL_EXECUTE_FLAG_TEXT = "Execute_Flag";
	String EXCEL_SCRIPT_NAME_TEXT = "Script_name";
	String EXECUTE_FLAG_Y = "Y";
	
	
	//DataProvider_Login
	
	String Login_dp_LoginUI = "dp_LoginUI";
	String LOGIN_dp_ValidLogin = "dp_ValidLogin";
	String LOGIN_dp_ValidLogin1 = "dp_ValidLogin1";
	String LOGIN_dp_ValidLogin2 = "dp_ValidLogin2";
	String LOGIN_dp_InValidlogin = "dp_InValidlogin";
	String LOGIN_dp_PageTitle = "dp_PageTitle";
	String LOGIN_dp_InValidLogin_EmptyEmail = "dp_InValidLogin_EmptyEmail";
	String LOGIN_dp_InValidLogin_EmptyPassword = "dp_InValidLogin_EmptyPassword";
	String LOGIN_dp_InValidLogin_EmptyAll = "dp_InValidLogin_EmptyAll";
	String LOGIN_dp_Script_name_LoginUI = "LoginUI";
	String LOGIN_dp_Script_name_ValidLogin = "ValidLogin";
	String LOGIN_dp_Script_name_ValidLogin1 = "ValidLogin1";
	String LOGIN_dp_Script_name_ValidLogin2 = "ValidLogin2";
	String LOGIN_dp_Script_name_InValidLogin = "InValidLogin";
	String LOGIN_dp_Script_name_PageTitle_User = "PageTitle_User";
	String LOGIN_dp_Script_name_InValidLogin_EmptyEmail = "InValidLogin–EmptyEmail";
	String LOGIN_dp_Script_name_InValidLogin_EmptyPassword = "InValidLogin_EmptyPassword";
	String LOGIN_dp_Script_name_InValidLogin_EmptyAll = "InValidLogin–EmptyAll";
	String EXCEL_SHEET_NAME_LOGIN = "Scenario_Login";
	
	
	//Common
	
	
	
	String Smoke_Test = "smoke";
	
	String OPEN_BROWSER_TEXT_CONSOLE = "DocOnline User Application has been opened in Chrome browser";
	String User_Name = "Username";
	String Password_Login =  "Password";	
	String Order_Set_ = "Order_Set";
	String  TC_ID_ = "TC_ID";
	String Path = "Path";
	String  Note = "Notes";
	String Base_URL = "Base_Url";
	String DashBoard_Title = "DocOnline";
	String Scroll = "window.scrollBy(0,10000)";
	String Login_Error_Message_excel = "Error_Message";
	String Login_Error_Message1_excel = "Error_Message 1";
	String Login_Error_Message2_excel = "Error_Message 2";
	
	//Scenario_Login
	
	String Login_button_display_log_info_pass = "Passed as Login button is displayed in the User Login screen";
	String Login_button_display_extend_log_pass = "Passed as Login button is displayed on the User Login screen";
	String Login_button_display_log_info_fail = "Failed as Login button is not displayed on the User Login screen";
	String Login_button_display_extend_log_fail = "Login button is not displayed on the User Login screen";
	String Login_Email_field_display_log_info_pass = "Passed as Email field is displayed in the User Login screen";
	String Login_Email_field_display_extend_log_pass = "Email field is displayed on the User Login screen";
	String Login_Email_field_display_log_info_fail = "Email field is not displayed on the User Login screen";
	String Login_Email_field_display_extend_log_fail = "Email field is not displayed on the User Login screen";
	String Login_password_field_display_log_info_pass = "Passed as Password field is displayed in the User Login screen";
	String Login_password_field_display_extend_log_pass = "Password field is displayed on the User Login screen";
	String Login_password_field_display_log_info_fail = "Failed as Password field is not displayed on the User Login screen";
	String Login_password_field_display_extend_log_fail = "Passord field is not displayed on the User Login screen";
	String Login_Skip_Link_display_log_info_pass = "Passed as Skip link is displayed in the User Login screen";
	String Login_Skip_Link_display_extend_log_pass = "Skip Link is displayed on the User Login screen";
	String Login_Skip_Link_display_log_info_fail = "Failed as  Skip Link is not displayed on the User Login screen";
	String Login_Skip_Link_display_extend_log_fail = "Skip Link is not displayed on the User Login screen";
	String Login_Doconline_Logo_display_log_info_pass = "Passed as DocOnline Logo is displayed in the User Login screen";
	String Login_Doconline_Logo_display_extend_log_pass = "DocOnline Logo is displayed on the User Login screen";
	String Login_Doconline_Logo_display_log_info_fail = "Failed as Doconline Logo is not displayed on the User Login screen";
	String Login_Doconline_Logo_display_extend_log_fail = "DocOnline Logo is not displayed on the User Login screen";
	String Login_SignUp_display_log_info_pass = "Passed as SignUp button field is displayed in the User Login screen";
	String Login_SignUp_display_extend_log_pass = "Passed as SignUp button is displayed on the User Login screen";
	String Login_SignUp_display_log_info_fail = "Failed as SignUp button field is not displayed on the User Login screen";
	String Login_SignUp_display_extend_log_fail = "SignUp button is not displayed on the User Login screen";
	String Login_facebook_display_log_info_pass = "Passed as Facebook login button is displayed in the User Login screen";
	String Login_facebook_display_extend_log_pass = "Facebook Login button is displayed on the User Login screen";
	String Login_facebook_display_log_info_fail = "Failed as Facebook login is not displayed on the User Login screen";
	String Login_facebook_display_extend_log_fail = "Facebook Login button is not displayed on the User Login screen";
	String Login_google_display_log_info_pass = "Passed as Google login button is displayed in the User Login screen";
	String Login_google_display_extend_log_pass = "Google Login button is displayed on the User Login screen";
	String Login_google_display_log_info_fail = "Failed as Google login is not displayed on the User Login screen";
	String Login_google_display_extend_log_fail = "Google Login button is not displayed on the User Login screen ";
	String Login_RememberMe_display_log_info_pass = "Passed as Remember Me field is displayed in the User Login screen";
	String Login_RememberMe_display_extend_log_pass = "Remember me is displayed on the User Login screen ";
	String Login_RememberMe_display_log_info_fail = "Failed as Remember Me field is not displayed on the User Login screen";
	String Login_RememberMe_display_extend_log_fail = "Remember me is not displayed on the User Login screen ";
	String Login_Dont_Have_acc_display_log_info_pass = "Passed as Don't Have an Account? field is displayed in the User Login screen";
	String Login_Dont_Have_acc_display_extend_log_pass = "Don't Have an Account? is displayed on the User Login screen ";
	String Login_Dont_Have_acc_display_log_info_fail = "Failed as Don't Have an Account? field is not displayed on the User Login screen";
	String Login_Dont_Have_acc_display_extend_log_fail = "Don't Have an Account? is not displayed on the User Login screen ";
	String Login_forgot_pwd_display_log_info_pass = "Passed as Forgot Password field is displayed in the User Login screen";
	String Login_forgot_pwd_display_extend_log_pass = "Forgot Password is displayed on the User Login screen ";
	String Login_forgot_pwd_display_log_info_fail = "Failed as Forgot Password field is not displayed on the User Login screen";
	String Login_forgot_pwd_display_extend_log_fail = "Forgot Password is not displayed on the User Login screen ";
	String Login_OR_field_display_log_info_pass = "Passed as Or text is displayed in the User Login screen";
	String Login_OR_field_display_extend_log_pass = "Or text is displayed on the User Login screen ";
	String Login_OR_field_display_log_info_fail = "Failed as Or text is not displayed on the User Login screen";
	String Login_OR_field_display_extend_log_fail = "Or text is not displayed on the User Login screen ";
	
	
	//Error Messages in Login
	
	String Login_Error_message_log_info_pass = "Passed as the error message is displayed";
	String Login_Error_message_extend_log_pass = " Error message is successfully displayed";
	String Login_Error_message_log_info_fail = "Failed as error message is not displayed";
	String Login_Error_message_extend_log_fail = " Error message is not displayed";
	
	//Matching Error message Login with the Excel Message
	
	String Login_Error_message_matching_log_info_pass = "Passed as actual and given error messages are matching";
	String Login_Error_message_matching_extend_log_pass = "actual and given error messages are matching";
	String Login_Error_message_matching_log_info_fail = "Error Messages are not matching are not matching";
	String Login_Error_message_matching_extend_log_fail = "Error Messages are not matching";
	
	
	
	
	//Login -> Verify Dashboard title ->Left navigation -> settings -> verify Email, Number, MRN
	
	String Console_Actual_Title_displayed_is = "The Actual Title displayed is: ";
	String Console_Actual_URL_displayed_is = "The Actual URL displayed is: ";
	String Console_The_given_title_is = "The given title is: ";
	
	
	
	
	String DashBoard_Title_match_log_info_pass = "Passed as the Screen titles match";
	String DashBoard_Title_match_extend_log_pass = " : User is successfully logged in into the system";
	String DashBoard_Title_match_log_info_fail = "Failed as Screen titles does not match";
	String DashBoard_Title_match_extend_log_fail = " : User is not logged in as the screen titles are different";
	
	String DashBoard_URL_match_log_info_pass = "Passed as the URL match";
	String DashBoard_URL_Title_match_extend_log_pass = " : Title matches";
	String DashBoard_URL_Title_match_log_info_fail = "Failed as Screen titles does not match";
	String DashBoard_URL_Title_match_extend_log_fail = " : Title mis-match";
	
	
	String Settings_mailID_match_log_info_pass = "Passed as the Emails match";
	String Settings_mailID_match_extend_log_pass = "Email IDs are successfully matching";
	String Settings_mailID_match_log_info_fail = "Failed as Email IDs does not match";
	String Settings_mailID_match_extend_log_fail = "Email IDs are not matching";
	 
	String Settings_MRN_match_log_info_pass = "Passed as MRNs are matching";
	String Settings_MRN_match_extend_log_pass = "MRNs are successfully matching";
	String Settings_MRN_match_log_info_fail = "MRNs are not matching";
	String Settings_MRN_match_extend_log_fail = "MRNs are not matching";
	
	String Settings_MobileNum_match_log_info_pass = "Passed as Mobile Numbers are matching";
	String Settings_MobileNum_match_extend_log_pass = "Mobile Numbers are successfully matching";
	String Settings_MobileNum_match_log_info_fail = "Mobile Numbers are not matching";
	String Settings_MobileNum_match_extend_log_fail =  "Mobile Numbers are not matching";
	
	
	//DataProvider_BookConsultation
	
	String BookConsultation_dp_BookConsultationUI = "dp_BookConsultationUI";
	String BookConsultation_dp_Script_name_BookConsultationUI = "BookConsultationUI";
	String EXCEL_SHEET_NAME_Scenario_BookConsultation = "Scenario_BookConsultation";
	
	
	//Scenario_BookConsultation
	
	
	String BookConsultation_Screen_Title_ = "BookConsultation_Screen_Title";
	String Screen_Title_match_log_info_pass = "Passed as the Screen Title match";
	String Screen_Title_match_extend_log_pass = " : User is successfully able to go to Book Consultation Screen";
	String Screen_Title_match_log_info_fail = "Failed as Screen titles does not match";
	String Screen_Title_match_extend_log_fail = " : User is not able to go to Book Consultation Screen as titles are different";
	String Book_For_Text_log_info_pass = "Passed as Book For text is displayed in the Book Consultation screen";
	String Book_For_Text_extend_log_pass = "Book For text is displayed on the Book Consultation screen";
	String Book_For_Text_log_info_fail = "Failed as Book For text is not displayed on the Book Consultation screen";
	String Book_For_Text_extend_log_fail = "Book For text is not displayed on the Book Consultation screen";
	String ModeOfConsultation_Text_log_info_pass = "Passed as Mode of Consultation text is displayed in the Book Consultation screen";
	String ModeOfConsultation_Text_extend_log_pass = "Mode of Consultation text is displayed on the Book Consultation screen";
	String ModeOfConsultation_Text_log_info_fail = "Failed as the Mode of Consultation text is not displayed on the Book Consultation screen";
	String ModeOfConsultation_Text_extend_log_fail = "Mode of Consultation text is not displayed on the Book Consultation screen";
	String Schedule_Time_Text_log_info_pass = "Passed as Schedule Time text is displayed in the Book Consultation screen";
	String Schedule_Time_Text_extend_log_pass = "Schedule Time text is displayed on the Book Consultation screen";
	String Schedule_Time_Text_log_info_fail = "Failed as the Schedule Time text is not displayed on the Book Consultation screen";
	String Schedule_Time_Text_extend_log_fail = "Schedule Time text is not displayed on the Book Consultation screen";
	String Myself_Button_log_info_pass = "Passed as My Self Button is displayed in the Book Consultation screen";
	String Myself_Button_extend_log_pass = "My Self Button is displayed on the Book Consultation screen";
	String Myself_Button_log_info_fail = "Failed as the My Self Button is not displayed on the Book Consultation screen";
	String Myself_Button_extend_log_fail = "My Self Button is not displayed on the Book Consultation screen";
	String FamilyMember_Button_log_info_pass = "Passed as Family Member Button is displayed in the Book Consultation screen";
	String FamilyMember_Button_extend_log_pass = "Family Member Button is displayed on the Book Consultation screen";
	String FamilyMember_Button_log_info_fail = "Failed as the Family Member Button is not displayed on the Book Consultation screen";
	String FamilyMember_Button_extend_log_fail = "Family Member Button is not displayed on the Book Consultation screen";
	String Video_Button_log_info_pass = "Passed as Video Button is displayed in the Book Consultation screen";
	String Video_Button_extend_log_pass = "Video Button is displayed on the Book Consultation screen";
	String Video_Button_log_info_fail = "Failed as the Video Button is not displayed on the Book Consultation screen";
	String Video_Button_extend_log_fail = "Video Button is not displayed on the Book Consultation screen";
	String Audio_Button_log_info_pass = "Passed as Audio Button is displayed in the Book Consultation screen";
	String Audio_Button_extend_log_pass = "Audio Button is displayed on the Book Consultation screen";
	String Audio_Button_log_info_fail = "Failed as the Audio Button is not displayed on the Book Consultation screen";
	String Audio_Button_extend_log_fail = "Audio Button is not displayed on the Book Consultation screen";
	String WaitingRoom_Button_log_info_pass = "Passed as Waiting Room Button is displayed in the Book Consultation screen";
	String WaitingRoom_Button_extend_log_pass = "Waiting Room Button is displayed on the Book Consultation screen";
	String WaitingRoom_Button_log_info_fail = "Failed as the Waiting Room Button is not displayed on the Book Consultation screen";
	String WaitingRoom_Button_extend_log_fail = "Waiting Room Button is not displayed on the Book Consultation screen";
	String Schedule_Button_log_info_pass = "Passed as Schedule Button is displayed in the Book Consultation screen";
	String Schedule_Button_extend_log_pass = "Schedule Button is displayed on the Book Consultation screen";
	String Schedule_Button_log_info_fail = "Failed as the Schedule Button is not displayed on the Book Consultation screen";
	String Schedule_Button_extend_log_fail = "Schedule Button is not displayed on the Book Consultation screen";
	String Book_Consultation_Button_log_info_pass = "Passed as the Book Consultation Button is displayed in the Book Consultation screen";
	String Book_Consultation_Button_extend_log_pass = "Book Consultation Button is displayed on the Book Consultation screen";
	String Book_Consultation_Button_log_info_fail = "Failed as the Book Consultation Button is not displayed on the Book Consultation screen";
	String Book_Consultation_Button_extend_log_fail = "Book Consultation Button is not displayed on the Book Consultation screen";
	String Preferred_Language_Toggle_log_info_pass = "Passed as the Preferred Language Toggle Button is displayed in the Book Consultation screen";
	String Preferred_Language_Toggle_extend_log_pass = "Preferred Language Toggle Button is displayed on the Book Consultation screen";
	String Preferred_Language_Toggle_log_info_fail = "Failed as the Preferred Language Toggle Button is not displayed on the Book Consultation screen";
	String Preferred_Language_Toggle_extend_log_fail = "Preferred Language Toggle Button is not displayed on the Book Consultation screen";
	String Preferred_Language_Text_log_info_pass = "Passed as the My Preferred Language Text is displayed in the Book Consultation screen";
	String Preferred_Language_Text_extend_log_pass = "My Preferred Language Text is displayed on the Book Consultation screen";
	String Preferred_Language_Text_log_info_fail = "Failed as the My Preferred Language Text is not displayed on the Book Consultation screen";
	String Preferred_Language_Text_extend_log_fail = "My Preferred Language Text is not displayed on the Book Consultation screen";
	String Allow_Doctor_Toggle_log_info_pass = "Passed as the Allow Doctor Toggle Button is displayed in the Book Consultation screen";
	String Allow_Doctor_Toggle_extend_log_pass = "Allow Doctor Toggle Button is displayed on the Book Consultation screen";
	String Allow_Doctor_Toggle_log_info_fail =  "Failed as the Allow Doctor Toggle Button is not displayed on the Book Consultation screen";
	String Allow_Doctor_Toggle_extend_log_fail = "Allow Doctor Toggle Button is not displayed on the Book Consultation screen";
	String Your_Preferred_Language_Text_log_info_pass = "Passed as the Your Preferred Language Text is displayed in the Book Consultation screen";
	String Your_Preferred_Language_Text_extend_log_pass = "Your Preferred Language Text is displayed on the Book Consultation screen";
	String Your_Preferred_Language_Text_log_info_fail = "Failed as the Your Preferred Language Text is not displayed on the Book Consultation screen";
	String Your_Preferred_Language_Text_extend_log_fail = "Your Preferred Language Text is not displayed on the Book Consultation screen";
	String Additional_Info_Text_log_info_pass = "Passed as the Additional Info Text is displayed in the Book Consultation screen";
	String Additional_Info_Text_extend_log_pass = "Additional Info Text is displayed on the Book Consultation screen";
	String Additional_Info_Text_log_info_fail = "Failed as the Additional Info Text is not displayed on the Book Consultation screen";
	String Additional_Info_Text_extend_log_fail = "Additional Info Text is not displayed on the Book Consultation screen";
	String AdditionalInfo_I_Button_log_info_pass = "Passed as the Additional Info I button is displayed in the Book Consultation screen";
	String AdditionalInfo_I_Button_extend_log_pass = "Additional Info I button is displayed on the Book Consultation screen";
	String AdditionalInfo_I_Button_log_info_fail = "Failed as the Additional Info I button is not displayed on the Book Consultation screen";
	String AdditionalInfo_I_Button_extend_log_fail = "Additional Info I button is not displayed on the Book Consultation screen";
	String Add_Notes_Field_log_info_pass = "Passed as the Add Notes Text Field is displayed in the Book Consultation screen";
	String Add_Notes_Field_extend_log_pass = "Add Notes Text Field is displayed on the Book Consultation screen";
	String Add_Notes_Field_log_info_fail =  "Failed as the Add Notes Text Field is not displayed on the Book Consultation screen";
	String Add_Notes_Field_extend_log_fail = "Add Notes Text Field is not displayed on the Book Consultation screen";
	String Upload_File_Text_log_info_pass = "Passed as the Upload Files Text is displayed in the Book Consultation screen";
	String Upload_File_Text_extend_log_pass = "Upload Files Text is displayed on the Book Consultation screen";	
	String Upload_File_Text_log_info_fail = "Failed as the Upload Files Text is not displayed on the Book Consultation screen";		
	String Upload_File_Text_extend_log_fail = "Upload Files Text is not displayed on the Book Consultation screen";		
	String Upload_File_Icon_log_info_pass =	"Passed as the Upload Files Icon is displayed in the Book Consultation screen";	
	String Upload_File_Icon_extend_log_pass = "Upload Files Icon is displayed on the Book Consultation screen";		
	String Upload_File_Icon_log_info_fail = "Failed as the Upload Files Icon is not displayed on the Book Consultation screen";		
	String Upload_File_Icon_extend_log_fail = "Upload Files Icon is not displayed on the Book Consultation screen";		
	String Allow_Doctor_Text_log_info_pass = "Passed as the Allow Doctor Text is displayed in the Book Consultation screen";		
	String Allow_Doctor_Text_extend_log_pass =	"Allow Doctor Text is displayed on the Book Consultation screen";	
	String Allow_Doctor_Text_log_info_fail = "Failed as the Allow Doctor Text is not displayed on the Book Consultation screen";		
	String Allow_Doctor_Text_extend_log_fail =	"Allow Doctor Text is not displayed on the Book Consultation screen";	
	String LanguageName_Hindi_log_info_pass = "Passed as the Language Name Hindi is displayed in the Book Consultation screen";		
	String LanguageName_Hindi_extend_log_pass =	"Language Name Hindi is displayed on the Book Consultation screen";	
	String LanguageName_Hindi_log_info_fail = "Failed as the Language Name Hindi is not displayed on the Book Consultation screen";		
	String LanguageName_Hindi_extend_log_fail =	"Language Name Hindi is not displayed on the Book Consultation screen";	
	String WaitingTime_Minutes_log_info_pass =	"Passed as the Waiting Time in Minutes is displayed in the Book Consultation screen";	
	String WaitingTime_Minutes_extend_log_pass = "Waiting Time in Minutes is displayed on the Book Consultation screen";	
	String WaitingTime_Minutes_log_info_fail = 	"Failed as the Waiting Time in Minutes is not displayed on the Book Consultation screen";	
	String WaitingTime_Minutes_extend_log_fail = "Waiting Time in Minutes is not displayed on the Book Consultation screen";		
	String Health_Profile_Text_log_info_pass =	"Passed as the Health Profile text is displayed in the Book Consultation screen";	
	String Health_Profile_Text_extend_log_pass = "Health Profile text is displayed on the Book Consultation screen";		
	String Health_Profile_Text_log_info_fail =	"Failed as the Health Profile text is not displayed on the Book Consultation screen";	
	String Health_Profile_Text_extend_log_fail = "Health Profile text is not displayed on the Book Consultation screen";		
	String HealthProfile_Edit_Button_log_info_pass = "Passed as the Health Profile Edit Button is displayed in the Book Consultation screen";		
	String HealthProfile_Edit_Button_extend_log_pass =	"Health Profile Edit Button is displayed on the Book Consultation screen";	
	String HealthProfile_Edit_Button_log_info_fail = "Failed as the Health Profile Edit Button is not displayed on the Book Consultation screen";		
	String HealthProfile_Edit_Button_extend_log_fail = "Health Profile Edit Button is not displayed on the Book Consultation screen";		
	String Click_Book_Consultation_log_info_pass = "Click Book Consultation Button";		
	String Click_Book_Consultation_extend_log_pass = "Book Consultation Button has been clicked successfully";		
	String New_Consultation_Text_log_info_pass = "Passed as the New Consultation Text is displayed after clicking Book Consultation button";
	String New_Consultation_Text_extend_log_pass = "New Consultation Text is displayed after clicking Book Consultation button";
	String New_Consultation_Text_log_info_fail = "Failed as the New Consultation Text is not displayed after clicking Book Consultation button";
	String New_Consultation_Text_extend_log_fail = "New Consultation Text is not displayed after clicking Book Consultation button";
	String Second_Opinion_Text_log_info_pass = "Passed as the Second Opinion Text is displayed after clicking Book Consultation button";
	String Second_Opinion_Text_extend_log_pass = "Second Opinion Text is displayed after clicking Book Consultation button";
	String Second_Opinion_Text_log_info_fail = "Failed as the Second Opinion Text is not displayed after clicking Book Consultation button";
	String Second_Opinion_Text_extend_log_fail = "Second Opinion Text is not displayed after clicking Book Consultation button";
	String Followup_consultation_Text_log_info_pass = "Passed as the Followup Consultation Text is displayed after clicking Book Consultation button";
	String Followup_consultation_Text_extend_log_pass = "Followup Consultation Text is displayed after clicking Book Consultation button";
	String Followup_consultation_Text_log_info_fail = "Failed as the Followup Consultation Text is not displayed after clicking Book Consultation button";
	String Followup_consultation_Text_extend_log_fail = "Followup Consultation Text is not displayed after clicking Book Consultation button";
	String NewConsultation_Radio_Button_log_info_pass = "Passed as the New Consultation Radio Button is displayed after clicking Book Consultation button";
	String NewConsultation_Radio_Button_extend_log_pass = "New Consultation Radio Button is displayed after clicking Book Consultation button";
	String NewConsultation_Radio_Button_log_info_fail = "Failed as the New Consultation Radio Button is not displayed after clicking Book Consultation button";
	String NewConsultation_Radio_Button_extend_log_fail = "New Consultation Radio Button is not displayed after clicking Book Consultation button";
	String SecondOpinion_Radio_Button_log_info_pass = "Passed as the Second Opinion Radio Button is displayed after clicking Book Consultation button";
	String SecondOpinion_Radio_Button_extend_log_pass = "Second Opinion Radio Button is displayed after clicking Book Consultation button";
	String SecondOpinion_Radio_Button_log_info_fail =  "Failed as the Second Opinion Radio Button is not displayed after clicking Book Consultation button";
	String SecondOpinion_Radio_Button_extend_log_fail = "Second Opinion Radio Button is not displayed after clicking Book Consultation button";
	String Followup_Cons_Radio_Button_log_info_pass = "Passed as the Followup Consultation Radio Button is displayed after clicking Book Consultation button";
	String Followup_Cons_Radio_Button_extend_log_pass = "Followup Consultation Radio Button is displayed after clicking Book Consultation button";
	String Followup_Cons_Radio_Button_log_info_fail =  "Failed as the Followup Consultation Radio Button is not displayed after clicking Book Consultation button";
	String Followup_Cons_Radio_Button_extend_log_fail = "Followup Consultation Radio Button is not displayed after clicking Book Consultation button";
	String OK_Button_log_info_pass = "Passed as the OK Button is displayed after clicking Book Consultation button";
	String OK_Button_extend_log_pass = "OK Button is displayed after clicking Book Consultation button";
	String OK_Button_log_info_fail = "Failed as the OK Button is not displayed after clicking Book Consultation button";
	String OK_Button_extend_log_fail = "OK Button is not displayed after clicking Book Consultation button";
	String Consultation_Title_Text_log_info_pass = "Passed as the Consultation Text Title is displayed after clicking Book Consultation button";
	String Consultation_Title_Text_extend_log_pass = "Consultation Text Title is displayed after clicking Book Consultation button";
	String Consultation_Title_Text_log_info_fail = "Failed as the Consultation Text Title is not displayed after clicking Book Consultation button";
	String Consultation_Title_Text_extend_log_fail =  "Consultation Text Title is not displayed after clicking Book Consultation button";
	
	
	//DataProvider_Dashboard
	
	String Dashboard_dp_DashboardUI = "dp_DashboardUI";
	String Dashboard_dp_Script_name_DashboardUI = "DashboardUI";
	String EXCEL_SHEET_NAME_Scenario_Dashboard = "Scenario_Dashboard";
	
	
	//Scenario_Dashboard
	
	String Dashboard_Title_ = "Dashboard_Title";
	
	String Dashboard_DocOnline_Logo_log_info_pass = "Passed as the Dashboard Screen has DocOnline Logo";
	String Dashboard_DocOnline_Logo_extend_log_pass = "DocOnline Logo is visible on the Dashboard screen";
	String Dashboard_DocOnline_Logo_log_info_fail = "Failed as Dashboard screen does not have the DocOnline Logo";
	String Dashboard_DocOnline_Logo_extend_log_fail = " DocOnline Logo is not loaded/is missing";
	
	String Dashboard_Text_log_info_pass = "Passed as the Dashboard Screen has Dashboard text in the top menu bar";
	String Dashboard_Text_extend_log_pass = "Dashboard text on top menu bar is visible on the Dashboard screen";
	String Dashboard_Text_log_info_fail = "Failed as Dashboard screen does not have Dashboard text in the top menu bar";
	String Dashboard_Text_extend_log_fail = " Dashboard text in the top menu bar is not loaded/is missing";	
	
	String Dashboard_BookConsultation_Icon_log_info_pass =  "Passed as the Dashboard Screen has book consultation icon in the top menu bar";
	String Dashboard_BookConsultation_Icon_extend_log_pass = "Book consultation icon on top menu bar is visible on the Dashboard screen";
	String Dashboard_BookConsultation_Icon_log_info_fail = "Failed as Dashboard screen does not have Book consultation icon in the top menu bar";
	String Dashboard_BookConsultation_Icon_extend_log_fail = " Book consultation icon in the top menu bar is not loaded/is missing";	
	
	String Dashboard_BookConsultation_Text_log_info_pass = "Passed as the Dashboard Screen has book a consultation text in the top menu bar";
	String Dashboard_BookConsultation_Text_extend_log_pass = "Book a consultation text on top menu bar is visible on the Dashboard screen";
	String Dashboard_BookConsultation_Text_log_info_fail = "Failed as Dashboard screen does not have Book a consultation text in the top menu bar";
	String Dashboard_BookConsultation_Text_extend_log_fail = " Book a consultation text in the top menu bar is not loaded/is missing";	
	
	String Dashboard_Chat_Icon_log_info_pass = "Passed as the Dashboard Screen has chat with doctor icon in the top menu bar";
	String Dashboard_Chat_Icon_extend_log_pass = "chat with doctor icon on top menu bar is visible on the Dashboard screen";
	String Dashboard_Chat_Icon_log_info_fail =  "Failed as Dashboard screen does not have chat with doctor icon in the top menu bar";
	String Dashboard_Chat_Icon_extend_log_fail = " chat with doctor icon in the top menu bar is not loaded/is missing";	
	
	String Dashboard_ChatWithDoc_Text_log_info_pass = "Passed as the Dashboard Screen has chat with doctor text in the top menu bar";
	String Dashboard_ChatWithDoc_Text_extend_log_pass =  "chat with doctor text on top menu bar is visible on the Dashboard screen";
	String Dashboard_ChatWithDoc_Text_log_info_fail = "Failed as Dashboard screen does not have chat with doctor text in the top menu bar";
	String Dashboard_ChatWithDoc_Text_extend_log_fail = " chat with doctor text in the top menu bar is not loaded/is missing";	
	
	String Dashboard_ChoosePlan_Button_log_info_pass = "Passed as the Dashboard Screen has choose a paln text/button in the top menu bar";
	String Dashboard_ChoosePlan_Button_extend_log_pass = "choose a paln text/button on top menu bar is visible on the Dashboard screen";
	String Dashboard_ChoosePlan_Button_log_info_fail =  "Failed as Dashboard screen does not have choose a paln text/button in the top menu bar";
	String Dashboard_ChoosePlan_Button_extend_log_fail = " choose a paln text/button in the top menu bar is not loaded/is missing";	
	
	String Dashboard_Cart_Icon_log_info_pass = "Passed as the Dashboard Screen has cart icon in the top menu bar";
	String Dashboard_Cart_Icon_extend_log_pass = "cart icon on top menu bar is visible on the Dashboard screen";
	String Dashboard_Cart_Icon_log_info_fail = "Failed as Dashboard screen does not have cart icon in the top menu bar";
	String Dashboard_Cart_Icon_extend_log_fail = " cart icon in the top menu bar is not loaded/is missing";	
	
	String Dashboard_Notification_Icon_log_info_pass = "Passed as the Dashboard Screen has notification icon in the top menu bar";
	String Dashboard_Notification_Icon_extend_log_pass =  "notification icon on top menu bar is visible on the Dashboard screen";
	String Dashboard_Notification_Icon_log_info_fail = "Failed as Dashboard screen does not have notification icon in the top menu bar";
	String Dashboard_Notification_Icon_extend_log_fail = " notification icon in the top menu bar is not loaded/is missing";	
	
	String Dashboard_User_Name_Text_log_info_pass = "Passed as the Dashboard Screen has name text in the top menu bar";
	String Dashboard_User_Name_Text_extend_log_pass = "name text on top menu bar is visible on the Dashboard screen";
	String Dashboard_User_Name_Text_log_info_fail = "Failed as Dashboard screen does not have name text in the top menu bar";
	String Dashboard_User_Name_Text_extend_log_fail = " name text in the top menu bar is not loaded/is missing";	
	
	String Dashboard_Profile_Icon_log_info_pass = "Passed as the Dashboard Screen has profile icon in the top menu bar";
	String Dashboard_Profile_Icon_extend_log_pass =	"profile icon on top menu bar is visible on the Dashboard screen";	 
	String Dashboard_Profile_Icon_log_info_fail = "Failed as Dashboard screen does not have profile icon in the top menu bar";		
	String Dashboard_Profile_Icon_extend_log_fail =	" profile icon in the top menu bar is not loaded/is missing";	
	
	String Dashboard_DropDown_Icon_log_info_pass =	"Passed as the Dashboard Screen has drop-down icon in the top menu bar";	
	String Dashboard_DropDown_Icon_extend_log_pass = "drop-down icon on top menu bar is visible on the Dashboard screen";		
	String Dashboard_DropDown_Icon_log_info_fail =	"Failed as Dashboard screen does not have drop-down icon in the top menu bar";	
	String Dashboard_DropDown_Icon_extend_log_fail = " drop-down icon in the top menu bar is not loaded/is missing";	

	String Dashboard_BookConsultation_Text_Tile_log_info_pass =	"Passed as the Dashboard Screen has book consultation text in the tile";	
	String Dashboard_BookConsultation_Text_Tile_extend_log_pass = "book consultation text on tile is visible on the Dashboard screen";	 	
	String Dashboard_BookConsultation_Text_Tile_log_info_fail =	"Failed as Dashboard screen does not have book consultation text in the tile";	
	String Dashboard_BookConsultation_Text_Tile_extend_log_fail = " book consultation text in the tile is not loaded/is missing";	
	
	String Dashboard_MyAppointment_Text_Tile_log_info_pass = "Passed as the Dashboard Screen has my appoinments text in the tile";		
	String Dashboard_MyAppointment_Text_Tile_extend_log_pass =	"my appoinments text on tile is visible on the Dashboard screen";	
	String Dashboard_MyAppointment_Text_Tile_log_info_fail = "Failed as Dashboard screen does not have my appoinments text in the tile";		
	String Dashboard_MyAppointment_Text_Tile_extend_log_fail = " my appoinments text in the tile is not loaded/is missing";	
	
	String Dashboard_ChatWithDoc_Text_Tile_log_info_pass = "Passed as the Dashboard Screen has chat with doctor text in the tile";
	String Dashboard_ChatWithDoc_Text_Tile_extend_log_pass = "chat with doctor text on tile is visible on the Dashboard screen";
	String Dashboard_ChatWithDoc_Text_Tile_log_info_fail = "Failed as Dashboard screen does not have chat with doctor text in the tile";
	String Dashboard_ChatWithDoc_Text_Tile_extend_log_fail = " chat with doctor text in the tile is not loaded/is missing";	
	
	String Dashboard_OrderMedicine_Text_Tile_log_info_pass = "Passed as the Dashboard Screen has order medicines text in the tile";
	String Dashboard_OrderMedicine_Text_Tile_extend_log_pass = "order medicines text on tile is visible on the Dashboard screen";
	String Dashboard_OrderMedicine_Text_Tile_log_info_fail = "Failed as Dashboard screen does not have order medicines text in the tile";
	String Dashboard_OrderMedicine_Text_Tile_extend_log_fail = " order medicines text in the tile is not loaded/is missing";	
	
	String Dashboard_BookDiagnostics_Text_Tile_log_info_pass = "Passed as the Dashboard Screen has book diagnostics text in the tile";
	String Dashboard_BookDiagnostics_Text_Tile_extend_log_pass = "book diagnostics text on tile is visible on the Dashboard screen";
	String Dashboard_BookDiagnostics_Text_Tile_log_info_fail = "Failed as Dashboard screen does not have book diagnostics text in the tile";
	String Dashboard_BookDiagnostics_Text_Tile_extend_log_fail = " book diagnostics text in the tile is not loaded/is missing";	
	
	String Dashboard_AddOns_Text_Tile_log_info_pass = "Passed as the Dashboard Screen has Add-Ons text in the tile";
	String Dashboard_AddOns_Text_Tile_extend_log_pass = "Add-Ons text on tile is visible on the Dashboard screen";
	String Dashboard_AddOns_Text_Tile_log_info_fail = "Failed as Dashboard screen does not have Add-Ons text in the tile";
	String Dashboard_AddOns_Text_Tile_extend_log_fail = " Add-Ons text in the tile is not loaded/is missing";	
	
	String Dashboard_MedicalRecords_Text_Tile_log_info_pass = "Passed as the Dashboard Screen has Medical Records(EHR) text in the tile";
	String Dashboard_MedicalRecords_Text_Tile_extend_log_pass = "Medical Records(EHR) text on tile is visible on the Dashboard screen";
	String Dashboard_MedicalRecords_Text_Tile_log_info_fail = "Failed as Dashboard screen does not have Medical Records(EHR) text in the tile";
	String Dashboard_MedicalRecords_Text_Tile_extend_log_fail = " Medical Records(EHR) text in the tile is not loaded/is missing";
	
	String Dashboard_BookConsultation_Icon_Tile_log_info_pass = "Passed as the Dashboard Screen has book a consultation icon in the tile";
	String Dashboard_BookConsultation_Icon_Tile_extend_log_pass = "book a consultation icon on tile is visible on the Dashboard screen";
	String Dashboard_BookConsultation_Icon_Tile_log_info_fail = "Failed as Dashboard screen does not have book a consultation icon in the tile";
	String Dashboard_BookConsultation_Icon_Tile_extend_log_fail = " book a consultation icon in the tile is not loaded/is missing";	
	
	String Dashboard_MyAppointment_Icon_Tile_log_info_pass = "Passed as the Dashboard Screen has My Appointments icon in the tile";
	String Dashboard_MyAppointment_Icon_Tile_extend_log_pass = "My Appointments icon on tile is visible on the Dashboard screen";
	String Dashboard_MyAppointment_Icon_Tile_log_info_fail = "Failed as Dashboard screen does not have My Appointments icon in the tile";
	String Dashboard_MyAppointment_Icon_Tile_extend_log_fail = " My Appointments icon in the tile is not loaded/is missing";	
	
	String Dashboard_ChatWithDoc_Icon_Tile_log_info_pass = "Passed as the Dashboard Screen has Chat with Doctor icon in the tile";
	String Dashboard_ChatWithDoc_Icon_Tile_extend_log_pass = "Chat with Doctor icon on tile is visible on the Dashboard screen";
	String Dashboard_ChatWithDoc_Icon_Tile_log_info_fail = "Failed as Dashboard screen does not have Chat with Doctor icon in the tile";
	String Dashboard_ChatWithDoc_Icon_Tile_extend_log_fail = " Chat with Doctor icon in the tile is not loaded/is missing";	
	
	String Dashboard_OrderMedicine_Icon_Tile_log_info_pass = "Passed as the Dashboard Screen has Order Medicines icon in the tile";
	String Dashboard_OrderMedicine_Icon_Tile_extend_log_pass = 	"Order Medicines icon on tile is visible on the Dashboard screen";	
	String Dashboard_OrderMedicine_Icon_Tile_log_info_fail = "Failed as Dashboard screen does not have Order Medicines icon in the tile";		
	String Dashboard_OrderMedicine_Icon_Tile_extend_log_fail =	" Order Medicines icon in the tile is not loaded/is missing";
	
	String Dashboard_BookDiagnostics_Icon_Tile_log_info_pass = "Passed as the Dashboard Screen has book Diagnostics icon in the tile";
	String Dashboard_BookDiagnostics_Icon_Tile_extend_log_pass = "Book Diagnostics icon on tile is visible on the Dashboard screen";
	String Dashboard_BookDiagnostics_Icon_Tile_log_info_fail = "Failed as Dashboard screen does not have book Diagnostics icon in the tile";
	String Dashboard_BookDiagnostics_Icon_Tile_extend_log_fail = " Book Diagnostics icon in the tile is not loaded/is missing";
	
	String Dashboard_AddOns_Icon_Tile_log_info_pass = "Passed as the Dashboard Screen has Add Ons icon in the tile";
	String Dashboard_AddOns_Icon_Tile_extend_log_pass = "Add Ons icon on tile is visible on the Dashboard screen";
	String Dashboard_AddOns_Icon_Tile_log_info_fail = "Failed as Dashboard screen does not have Add Ons icon in the tile";
	String Dashboard_AddOns_Icon_Tile_extend_log_fail = " Add Ons icon in the tile is not loaded/is missing";
	
	String Dashboard_MedicalRecords_Icon_Tile_log_info_pass = "Passed as the Dashboard Screen has Medical Records icon in the tile";
	String Dashboard_MedicalRecords_Icon_Tile_extend_log_pass = "Medical Records icon on tile is visible on the Dashboard screen";
	String Dashboard_MedicalRecords_Icon_Tile_log_info_fail = "Failed as Dashboard screen does not have Medical Records icon in the tile";
	String Dashboard_MedicalRecords_Icon_Tile_extend_log_fail = " Medical Records icon in the tile is not loaded/is missing";
			
	String Dashboard_BookConsultation_Description_Tile_log_info_pass =	"Passed as the Dashboard Screen has book consultation description in the tile";	
	String Dashboard_BookConsultation_Description_Tile_extend_log_pass = "Book consultation description on tile is visible on the Dashboard screen"	;	
	String Dashboard_BookConsultation_Description_Tile_log_info_fail =	"Failed as Dashboard screen does not have book consultation description in the tile";	
	String Dashboard_BookConsultation_Description_Tile_extend_log_fail = " Book consultation description in the tile is not loaded/is missing";		
			
	String Dashboard_MyAppointment_Description_Tile_log_info_pass =	"Passed as the Dashboard Screen has My Appointments Description in the tile";	
	String Dashboard_MyAppointment_Description_Tile_extend_log_pass = "My Appointments Description on tile is visible on the Dashboard screen";		
	String Dashboard_MyAppointment_Description_Tile_log_info_fail =	"Failed as Dashboard screen does not have My Appointments Description in the tile";	
	String Dashboard_MyAppointment_Description_Tile_extend_log_fail = " My Appointments Description in the tile is not loaded/is missing";		
			
	String Dashboard_ChatWithDoc_Description_Tile_log_info_pass = "Passed as the Dashboard Screen has Chat with Doctor Description in the tile";		
	String Dashboard_ChatWithDoc_Description_Tile_extend_log_pass =	"Chat with Doctor Description on tile is visible on the Dashboard screen";	
	String Dashboard_ChatWithDoc_Description_Tile_log_info_fail = "Failed as Dashboard screen does not have Chat with Doctor Description in the tile";		
	String Dashboard_ChatWithDoc_Description_Tile_extend_log_fail = " Chat with Doctor Description in the tile is not loaded/is missing";		
			
	String Dashboard_OrderMedicine_Description_Tile_log_info_pass = "Passed as the Dashboard Screen has Order Medicines Description in the tile";
	String Dashboard_OrderMedicine_Description_Tile_extend_log_pass = "Order Medicines Description on tile is visible on the Dashboard screen";		
	String Dashboard_OrderMedicine_Description_Tile_log_info_fail =	"Failed as Dashboard screen does not have Order Medicines Description in the tile";	
	String Dashboard_OrderMedicine_Description_Tile_extend_log_fail = " Order Medicines Description in the tile is not loaded/is missing";		
			
	String Dashboard_BookDiagnostic_Description_Tile_log_info_pass = "Passed as the Dashboard Screen has Book Diagnostics Description in the tile";		
	String Dashboard_BookDiagnostic_Description_Tile_extend_log_pass = "Book Diagnostics Description on tile is visible on the Dashboard screen";	
	String Dashboard_BookDiagnostic_Description_Tile_log_info_fail = "Failed as Dashboard screen does not have Book Diagnostics Description in the tile";			
	String Dashboard_BookDiagnostic_Description_Tile_extend_log_fail = " Book Diagnostics Description in the tile is not loaded/is missing";	
			
	String Dashboard_AddOns_Description_Tile_log_info_pass = "Passed as the Dashboard Screen has Add-Ons Description in the tile";		
	String Dashboard_AddOns_Description_Tile_extend_log_pass =	"Add-Ons Description on tile is visible on the Dashboard screen";	
	String Dashboard_AddOns_Description_Tile_log_info_fail = "Failed as Dashboard screen does not have Add-Ons Description in the tile";		
	String Dashboard_AddOns_Description_Tile_extend_log_fail = " Add-Ons Description in the tile is not loaded/is missing";		
			
	String Dashboard_MedicalRecord_Description_Tile_log_info_pass =	"Passed as the Dashboard Screen has Medical Records (EHR) Description in the tile";	
	String Dashboard_MedicalRecord_Description_Tile_extend_log_pass = "Medical Records (EHR) Description on tile is visible on the Dashboard screen";		
	String Dashboard_MedicalRecord_Description_Tile_log_info_fail =	"Failed as Dashboard screen does not have Medical Records (EHR) Description in the tile";	
	String Dashboard_MedicalRecord_Description_Tile_extend_log_fail = " Medical Records (EHR) Description in the tile is not loaded/is missing";		
			
	String Dashboard_DownloadApp_Text_Tile_log_info_pass =	"Passed as the Dashboard Screen has Download the App text in the tile";
	String Dashboard_DownloadApp_Text_Tile_extend_log_pass = "Download the App text on tile is visible on the Dashboard screen";
	String Dashboard_DownloadApp_Text_Tile_log_info_fail = "Failed as Dashboard screen does not have Download the App text in the tile";
	String Dashboard_DownloadApp_Text_Tile_extend_log_fail = " Download the App text in the tile is not loaded/is missing";
	
	String Dashboard_DownloadApp_Description_Tile_log_info_pass = "Passed as the Dashboard Screen has Description text below download the app in the tile";
	String Dashboard_DownloadApp_Description_Tile_extend_log_pass = "Description text below download the app on tile is visible on the Dashboard screen";
	String Dashboard_DownloadApp_Description_Tile_log_info_fail = "Failed as Dashboard screen does not have Description text below download the app in the tile";
	String Dashboard_DownloadApp_Description_Tile_extend_log_fail = " Description text below download the app in the tile is not loaded/is missing";
	
	String Dashboard_MobileNo_Field_Tile_log_info_pass = "Passed as the Dashboard Screen has Mobile Number field in the tile";
	String Dashboard_MobileNo_Field_Tile_extend_log_pass = "Mobile Number field on tile is visible on the Dashboard screen";
	String Dashboard_MobileNo_Field_Tile_log_info_fail = "Failed as Dashboard screen does not have Mobile Number field in the tile";
	String Dashboard_MobileNo_Field_Tile_extend_log_fail = " Mobile Number field in the tile is not loaded/is missing";
	
	String Dashboard_GetDownload_Link_Tile_log_info_pass = "Passed as the Dashboard Screen has Get Download Button in the tile";
	String Dashboard_GetDownload_Link_Tile_extend_log_pass = "Get Download Button on tile is visible on the Dashboard screen";
	String Dashboard_GetDownload_Link_Tile_log_info_fail = "Failed as Dashboard screen does not have Get Download Button in the tile";
	String Dashboard_GetDownload_Link_Tile_extend_log_fail = " Get Download Button in the tile is not loaded/is missing";
	
	String Dashboard_GooglePlay_Link_Tile_log_info_pass = "Passed as the Dashboard Screen has Google Play Link Botton in the tile";
	String Dashboard_GooglePlay_Link_Tile_extend_log_pass = "Google Play Link Botton on tile is visible on the Dashboard screen";
	String Dashboard_GooglePlay_Link_Tile_log_info_fail = "Failed as Dashboard screen does not have Google Play Link Botton in the tile";
	String Dashboard_GooglePlay_Link_Tile_extend_log_fail = " Google Play Link Botton in the tile is not loaded/is missing";
	
	String Dashboard_AppStore_Link_Tile_log_info_pass = "Passed as the Dashboard Screen has App Store Link Botton in the tile";
	String Dashboard_AppStore_Link_Tile_extend_log_pass = "App Store Link Botton on tile is visible on the Dashboard screen";
	String Dashboard_AppStore_Link_Tile_log_info_fail = "Failed as Dashboard screen does not have App Store Link Botton in the tile";
	String Dashboard_AppStore_Link_Tile_extend_log_fail = " App Store Link Botton in the tile is not loaded/is missing";
	
	String Dashboard_TopMenu_Option_Button_log_info_pass = "Passed as the Dashboard Screen has Option Button in the top menu bar";
	String Dashboard_TopMenu_Option_Button_extend_log_pass = "Option Button on top menu bar is visible on the Dashboard screen";
	String Dashboard_TopMenu_Option_Button_log_info_fail = "Failed as Dashboard screen does not have Option Button in the top menu bar";
	String Dashboard_TopMenu_Option_Button_extend_log_fail = " Option Button in the top menu bar is not loaded/is missing";
	
	String Dashboard_LeftNavigation_Dashboard_Icon_log_info_pass = "Passed as the Dashboard Screen has Dashboard Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Dashboard_Icon_extend_log_pass = "Dashboard Icon on Left Navigation Bar is visible on the Dashboard screen";
	String Dashboard_LeftNavigation_Dashboard_Icon_log_info_fail = "Failed as Dashboard screen does not have Dashboard Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Dashboard_Icon_extend_log_fail = " Dashboard Icon in the Left Navigation Bar is not loaded/is missing";
	
	String Dashboard_LeftNavigation_Appointment_Icon_log_info_pass = "Passed as the Dashboard Screen has Appointments Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Appointment_Icon_extend_log_pass = "Appointments Icon on Left Navigation Bar is visible on the Dashboard screen";
	String Dashboard_LeftNavigation_Appointment_Icon_log_info_fail = "Failed as Dashboard screen does not have Appointments Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Appointment_Icon_extend_log_fail =  " Appointments Icon in the Left Navigation Bar is not loaded/is missing";
	
	String Dashboard_LeftNavigation_Chat_Icon_log_info_pass = "Passed as the Dashboard Screen has Chats Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Chat_Icon_extend_log_pass = "Chats Icon on Left Navigation Bar is visible on the Dashboard screen";
	String Dashboard_LeftNavigation_Chat_Icon_log_info_fail = "Failed as Dashboard screen does not have Chats Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Chat_Icon_extend_log_fail = " Chats Icon in the Left Navigation Bar is not loaded/is missing";
	
	String Dashboard_LeftNavigation_MedicalRecord_Icon_log_info_pass = "Passed as the Dashboard Screen has Medical Records Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_MedicalRecord__Icon_extend_log_pass = "Medical Records Icon on Left Navigation Bar is visible on the Dashboard screen";
	String Dashboard_LeftNavigation_MedicalRecord_Icon_log_info_fail =	"Failed as Dashboard screen does not have Medical Records Icon in the Left Navigation Bar";	
	String Dashboard_LeftNavigation_MedicalRecord_Icon_extend_log_fail = " Medical Records Icon in the Left Navigation Bar is not loaded/is missing";	
	
	String Dashboard_LeftNavigation_Vitals_Icon_log_info_pass = "Passed as the Dashboard Screen has Vitals Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Vitals__Icon_extend_log_pass = "Vitals Icon on Left Navigation Bar is visible on the Dashboard screen";
	String Dashboard_LeftNavigation_Vitals_Icon_log_info_fail = "Failed as Dashboard screen does not have Vitals Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Vitals_Icon_extend_log_fail = " Vitals Icon in the Left Navigation Bar is not loaded/is missing";
	
	String Dashboard_LeftNavigation_Orders_Icon_log_info_pass = "Passed as the Dashboard Screen has Orders Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Orders__Icon_extend_log_pass = "Orders Icon on Left Navigation Bar is visible on the Dashboard screen";
	String Dashboard_LeftNavigation_Orders_Icon_log_info_fail = "Failed as Dashboard screen does not have Orders Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Orders_Icon_extend_log_fail = " Orders Icon in the Left Navigation Bar is not loaded/is missing";
	
	String Dashboard_LeftNavigation_DiagnosticHistory_Icon_log_info_pass = "Passed as the Dashboard Screen has Diagnostics History Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_DiagnosticHistory_Icon_extend_log_pass = "Diagnostics History Icon on Left Navigation Bar is visible on the Dashboard screen";
	String Dashboard_LeftNavigation_DiagnosticHistory_Icon_log_info_fail = "Failed as Dashboard screen does not have Diagnostics History Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_DiagnosticHistory_Icon_extend_log_fail = " Diagnostics History Icon in the Left Navigation Bar is not loaded/is missing";
	
	String Dashboard_LeftNavigation_SelectPlan_Icon_log_info_pass = "Passed as the Dashboard Screen has Select a Plan Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_SelectPlan_Icon_extend_log_pass = "Select a Plan Icon on Left Navigation Bar is visible on the Dashboard screen";
	String Dashboard_LeftNavigation_SelectPlan_Icon_log_info_fail = "Failed as Dashboard screen does not have Select a Plan Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_SelectPlan_Icon_extend_log_fail = " Select a Plan Icon in the Left Navigation Bar is not loaded/is missing";
	
	String Dashboard_LeftNavigation_BillingHistory_Icon_log_info_pass = "Passed as the Dashboard Screen has Billing History Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_BillingHistory_Icon_extend_log_pass = "Billing History Icon on Left Navigation Bar is visible on the Dashboard screen";
	String Dashboard_LeftNavigation_BillingHistory_Icon_log_info_fail = "Failed as Dashboard screen does not have Billing History Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_BillingHistory_Icon_extend_log_fail = " Billing History Icon in the Left Navigation Bar is not loaded/is missing";
	
	String Dashboard_LeftNavigation_Family_Icon_log_info_pass = "Passed as the Dashboard Screen has Family Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Family_Icon_extend_log_pass = "Family Icon on Left Navigation Bar is visible on the Dashboard screen";
	String Dashboard_LeftNavigation_Family_Icon_log_info_fail = "Failed as Dashboard screen does not have Family Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Family_Icon_extend_log_fail = " Family Icon in the Left Navigation Bar is not loaded/is missing";
	
	String Dashboard_LeftNavigation_Profile_Icon_log_info_pass = "Passed as the Dashboard Screen has Profile Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Profile_Icon_extend_log_pass =  "Profile Icon on Left Navigation Bar is visible on the Dashboard screen";
	String Dashboard_LeftNavigation_Profile_Icon_log_info_fail = "Failed as Dashboard screen does not have Profile Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Profile_Icon_extend_log_fail = " Profile Icon in the Left Navigation Bar is not loaded/is missing";
	
	String Dashboard_LeftNavigation_Settings_Icon_log_info_pass = "Passed as the Dashboard Screen has Settings Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Settings_Icon_extend_log_pass = "Settings Icon on Left Navigation Bar is visible on the Dashboard screen";
	String Dashboard_LeftNavigation_Settings_Icon_log_info_fail = "Failed as Dashboard screen does not have Settings Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_Settings_Icon_extend_log_fail = " Settings Icon in the Left Navigation Bar is not loaded/is missing";
	
	String Dashboard_LeftNavigation_CustomerCare_Icon_log_info_pass = "Passed as the Dashboard Screen has Customer Care Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_CustomerCare_Icon_extend_log_pass = "Customer Care Icon on Left Navigation Bar is visible on the Dashboard screen";
	String Dashboard_LeftNavigation_CustomerCare_Icon_log_info_fail =  "Failed as Dashboard screen does not have Customer Care Icon in the Left Navigation Bar";
	String Dashboard_LeftNavigation_CustomerCare_Icon_extend_log_fail = " Customer Care Icon in the Left Navigation Bar is not loaded/is missing";
	
	
// DATAPROVIDER_BOOK_CONSULTATION_FUNCTIONALITY	
	
	String Functionality_dp_BookConsultationFunctionality = "dp_BookConsultationFunctionality";
	String Functionality_dp_BookConsultationwaitingtime = "dp_BookConsultationwaitingtime";
	String Functionality_dp_BookConsultationwaitingtime_notes = "dp_BookConsultationwaitingtime_notes";
	String Functionality_dp_BookConsultation_schedule = "dp_BookConsultation_schedule";
	String Functionality_dp_BookConsultation_uploadfile = "dp_BookConsultation_uploadfile";	
	String Functionality_dp_BookConsultationwaitingtime_upload = "dp_BookConsultationwaitingtime_upload";	
	String Functionality_dp_BookConsultation_schedule_note_upload = "dp_BookConsultation_schedule_note_upload";
	String Functionality_dp_BookConsultationwaitingtime_note_upload = "dp_BookConsultationwaitingtime_note_upload";	
	String Functionality_dp_BookConsultation_schedule_audio = "dp_BookConsultation_schedule_audio";	
	String Functionality_dp_BookConsultation_waiting_audio = "dp_BookConsultation_waiting_audio";	
	String Functionality_dp_BookConsultation_schedule_note_audio =	"dp_BookConsultation_schedule_note_audio";		
	String Functionality_dp_BookConsultation_waiting_note_audio = "dp_BookConsultation_waiting_note_audio";	 	
	String Functionality_dp_BookConsultation_schedule_file_audio =	"dp_BookConsultation_schedule_file_audio";		
	String Functionality_dp_BookConsultation_waiting_file_audio = "dp_BookConsultation_waiting_file_audio";		
	String Functionality_dp_BookConsultation_schedule_file_note_audio =	"dp_BookConsultation_schedule_file_note_audio";		
	String Functionality_dp_BookConsultation_waiting_file_note_audio =	"dp_BookConsultation_waiting_file_note_audio";		
	String Functionality_dp_BookConsultation_schedule_Telephone_audio =	"dp_BookConsultation_schedule_Telephone_audio";		
	String Functionality_dp_BookConsultation_waiting_Telephone_audio = "dp_BookConsultation_waiting_Telephone_audio";	
	String Functionality_dp_BookConsultation_schedule_Telephone_audio_notes = "dp_BookConsultation_schedule_Telephone_audio_notes";	
	String Functionality_dp_BookConsultation_waiting_Telephone_audio_Notes = "dp_BookConsultation_waiting_Telephone_audio_Notes";	
	String Functionality_dp_BookConsultation_schedule_Telephone_audio_upload = 	"dp_BookConsultation_schedule_Telephone_audio_upload";		
	String Functionality_dp_BookConsultation_waiting_Telephone_audio_File =	"dp_BookConsultation_waiting_Telephone_audio_File";		
	String Functionality_dp_BookConsultation_schedule_Telephone_audio_upload_notes = "dp_BookConsultation_schedule_Telephone_audio_upload_notes";		
	String Functionality_dp_BookConsultation_waiting_Telephone_audio_File_Note = "dp_BookConsultation_waiting_Telephone_audio_File_Note";		
	String Functionality_dp_BookConsultation_schedule_video_lang = "dp_BookConsultation_schedule_video_lang";	
	String Functionality_dp_BookConsultation_waiting_video_lang =	"dp_BookConsultation_waiting_video_lang";		
	String Functionality_dp_BookConsultation_schedule_video_lang_note =	"dp_BookConsultation_schedule_video_lang_note";		
	String Functionality_dp_BookConsultation_waiting_video_lang_note = "dp_BookConsultation_waiting_video_lang_note";		
	String Functionality_dp_BookConsultation_schedule_video_lang_file =	"dp_BookConsultation_schedule_video_lang_file";		
	String Functionality_dp_BookConsultation_waiting_video_lang_file = "dp_BookConsultation_waiting_video_lang_file";
	
	String Functionality_dp_BookConsultation_schedule_video_lang_file_note = "dp_BookConsultation_schedule_video_lang_file_note";
	String Functionality_dp_BookConsultation_waiting_video_lang_file_note = "dp_BookConsultation_waiting_video_lang_file_note";
	String Functionality_dp_BookConsultation_schedule_audio_lang = "dp_BookConsultation_schedule_audio_lang";		
	String Functionality_dp_BookConsultation_waiting_audio_lang = "dp_BookConsultation_waiting_audio_lang";
	String Functionality_dp_BookConsultation_schedule_audio_lang_note = "dp_BookConsultation_schedule_audio_lang_note";		
	String Functionality_dp_BookConsultation_waiting_audio_lang_note = "dp_BookConsultation_waiting_audio_lang_note";
	String Functionality_dp_BookConsultation_schedule_audio_lang_file = "BookConsultation_Audio_Schedule_Language_File";
	String Functionality_dp_BookConsultation_waiting_audio_lang_file = "dp_BookConsultation_waiting_audio_lang_file";		
	String Functionality_dp_BookConsultation_schedule_audio_lang_file_note = "dp_BookConsultation_schedule_audio_lang_file_note";
	String Functionality_dp_BookConsultation_waiting_audio_lang_file_note =	"dp_BookConsultation_waiting_audio_lang_file_note";	
	String Functionality_dp_BookConsultation_schedule_audio_telephone_lang = "dp_BookConsultation_schedule_audio_telephone_lang";	
	String Functionality_dp_BookConsultation_waiting_audio_telephone_lang =	"dp_BookConsultation_waiting_audio_telephone_lang";	
	String Functionality_dp_BookConsultation_schedule_audio_telephone_lang_note = "dp_BookConsultation_schedule_audio_telephone_lang_note";
	String Functionality_dp_BookConsultation_waiting_audio_telephone_lang_note = "dp_BookConsultation_waiting_audio_telephone_lang_note";
	String Functionality_dp_BookConsultation_schedule_audio_telephone_lang_file = "dp_BookConsultation_schedule_audio_telephone_lang_file";		
	String Functionality_dp_BookConsultation_waiting_audio_telephone_lang_file = "dp_BookConsultation_waiting_audio_telephone_lang_file";	
	String Functionality_dp_BookConsultation_schedule_audio_telephone_lang_file_note = "dp_BookConsultation_schedule_audio_telephone_lang_file_note";
	String Functionality_dp_BookConsultation_waiting_audio_telephone_lang_file_note = "dp_BookConsultation_waiting_audio_telephone_lang_file_note";
	String Functionality_dp_BookConsultation_schedule_video_allowdoctor = "dp_BookConsultation_schedule_video_allowdoctor";
	String Functionality_dp_BookConsultation_waiting_video_allow_doctor = "dp_BookConsultation_waiting_video_allow_doctor";
	String Functionality_dp_BookConsultation_schedule_video_allow_doctor_note = "dp_BookConsultation_schedule_video_allow_doctor_note";		
	String Functionality_dp_BookConsultation_waiting_video_allow_doctor_note =	"dp_BookConsultation_waiting_video_allow_doctor_note";	
	String Functionality_dp_BookConsultation_schedule_video_allow_doctor_file =	"dp_BookConsultation_schedule_video_allow_doctor_file";	
	String Functionality_dp_BookConsultation_waiting_video_allow_doctor_file = "dp_BookConsultation_waiting_video_allow_doctor_file";
	String Functionality_dp_BookConsultation_schedule_video_allow_doctor_file_note = "dp_BookConsultation_schedule_video_allow_doctor_file_note";		
	String Functionality_dp_BookConsultation_waiting_video_allow_doctor_file_note =	"dp_BookConsultation_waiting_video_allow_doctor_file_note";	
	String Functionality_dp_BookConsultation_schedule_audio_allow_doctor = "dp_BookConsultation_schedule_audio_allow_doctor";
	String Functionality_dp_BookConsultation_waiting_audio_allow_doctor = "dp_BookConsultation_waiting_audio_allow_doctor";
	String Functionality_dp_BookConsultation_schedule_audio_allow_doctor_note = "dp_BookConsultation_schedule_audio_allow_doctor_note";
	String Functionality_dp_BookConsultation_waiting_audio_allow_doctor_note = "dp_BookConsultation_waiting_audio_allow_doctor_note";
	String Functionality_dp_BookConsultation_schedule_audio_allow_doctor_file = "dp_BookConsultation_schedule_audio_allow_doctor_file";
	String Functionality_dp_BookConsultation_waiting_audio_allow_doctor_file = "dp_BookConsultation_waiting_audio_allow_doctor_file";
	String Functionality_dp_BookConsultation_schedule_audio_allow_doctor_file_note = "dp_BookConsultation_schedule_audio_allow_doctor_file_note";		
	String Functionality_dp_BookConsultation_waiting_audio_allow_doctor_file_note =	"dp_BookConsultation_waiting_audio_allow_doctor_file_note";	
	String Functionality_dp_BookConsultation_schedule_audio_telephone_allow_doctor = "dp_BookConsultation_schedule_audio_telephone_allow_doctor";		
	String Functionality_dp_BookConsultation_waiting_audio_telephone_allow_doctor = "dp_BookConsultation_waiting_audio_telephone_allow_doctor";
	String Functionality_dp_BookConsultation_schedule_audio_telephone_allow_doctor_note = "dp_BookConsultation_schedule_audio_telephone_allow_doctor_note";
	String Functionality_dp_BookConsultation_waiting_audio_telephone_allow_doctor_note = "dp_BookConsultation_waiting_audio_telephone_allow_doctor_note";
	String Functionality_dp_BookConsultation_schedule_audio_telephone_allow_doctor_file = "dp_BookConsultation_schedule_audio_telephone_allow_doctor_file";
	String Functionality_dp_BookConsultation_waiting_audio_telephone_allow_doctor_file = "dp_BookConsultation_waiting_audio_telephone_allow_doctor_file";
	String Functionality_dp_BookConsultation_schedule_audio_telephone_allow_doctor_file_note = "dp_BookConsultation_schedule_audio_telephone_allow_doctor_file_note";
	String Functionality_dp_BookConsultation_waiting_audio_telephone_allow_doctor_file_note = "dp_BookConsultation_waiting_audio_telephone_allow_doctor_file_note";
	
	
	
	String Functionality_dp_Script_name_BookConsultation_Functionality = "BookConsultation_Functionality";
	String Functionality_dp_Script_name_BookConsultation_Functional = "BookConsultation_Functional";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Notes = "BookConsultation_Waiting_Notes";
	String Functionality_dp_Script_name_BookConsultation_Schedule = "BookConsultation_Schedule";
	String Functionality_dp_Script_name_BookConsultation_Schedule_upload = "BookConsultation_Schedule_upload";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Upload = "BookConsultation_Waiting_Upload";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Note_Upload = "BookConsultation_Schedule_Note_Upload";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Note_Upload = "BookConsultation_Waiting_Note_Upload";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Audio = "BookConsultation_Schedule_Audio";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Audio = "BookConsultation_Waiting_Audio";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Note_Audio = "BookConsultation_Schedule_Note_Audio";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Note_Audio = "BookConsultation_Waiting_Note_Audio";
	String Functionality_dp_Script_name_BookConsultation_Schedule_File_Audio = "BookConsultation_Schedule_File_Audio";
	String Functionality_dp_Script_name_BookConsultation_Waiting_File_Audio = "BookConsultation_Waiting_File_Audio";
	String Functionality_dp_Script_name_BookConsultation_Schedule_File_Note_Audio = "BookConsultation_Schedule_File_Note_Audio";
	String Functionality_dp_Script_name_BookConsultation_Waiting_File_Note_Audio = "BookConsultation_Waiting_File_Note_Audio";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Audio_Telephone = "BookConsultation_Schedule_Audio_Telephone";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Audio_Telephone = "BookConsultation_Waiting_Audio_Telephone";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Audio_Telephone_Notes = "BookConsultation_Schedule_Audio_Telephone_Notes";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Audio_Telephone_Notes = "BookConsultation_Waiting_Audio_Telephone_Notes";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Audio_Telephone_File = "BookConsultation_Schedule_Audio_Telephone_File";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Audio_Telephone_File = "BookConsultation_Waiting_Audio_Telephone_File";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Audio_Telephone_File_Note = "BookConsultation_Schedule_Audio_Telephone_File_Note";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Audio_Telephone_File_Note = "BookConsultation_Waiting_Audio_Telephone_File_Note";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Language = "BookConsultation_Schedule_Language";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Language = "BookConsultation_Waiting_Language";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Language_Note = "BookConsultation_Schedule_Language_Note";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Language_Note = "BookConsultation_Waiting_Language_Note";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Language_File = "BookConsultation_Schedule_Language_File";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Language_File = "BookConsultation_Waiting_Language_File";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Language_File_Note = "BookConsultation_Schedule_Language_File_Note";	
	String Functionality_dp_Script_name_BookConsultation_Waiting_Language_File_Note = "BookConsultation_Waiting_Language_File_Note";
	String Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Language = "BookConsultation_Audio_Schedule_Language";
	String Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Language = "BookConsultation_Audio_Waiting_Language";
	String Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Language_Note = "BookConsultation_Audio_Schedule_Language_Note";
	String Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Language_Note = "BookConsultation_Audio_Waiting_Language_Note";
	String Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Language_File = "BookConsultation_Audio_Schedule_Language_File";
	String Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Language_File = "BookConsultation_Audio_Waiting_Language_File";
	String Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Language_File_Note = "BookConsultation_Audio_Schedule_Language_File_Note";
	String Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Language_File_Note = "BookConsultation_Audio_Waiting_Language_File_Note";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Audio_Telephone_Language = "BookConsultation_Schedule_Audio_Telephone_Language";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Audio_Telephone_Language = "BookConsultation_Waiting_Audio_Telephone_Language";
	String Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Schedule_Language_Note = "BookConsultation_Audio_Telephone_Schedule_Language_Note";
	String Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Waiting_Language_Note = "BookConsultation_Audio_Telephone_Waiting_Language_Note";
	String Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Schedule_Language_File = "BookConsultation_Audio_Telephone_Schedule_Language_File";
	String Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Waiting_Language_File = "BookConsultation_Audio_Telephone_Waiting_Language_File";
	String Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Schedule_Language_File_Note = "BookConsultation_Audio_Telephone_Schedule_Language_File_Note";
	String Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Waiting_Language_File_Note = "BookConsultation_Audio_Telephone_Waiting_Language_File_Note";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Allowdoctor = "BookConsultation_Schedule_Allowdoctor";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Allowdoctor = "BookConsultation_Waiting_Allowdoctor";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Allowdoctor_Note = "BookConsultation_Schedule_Allowdoctor_Note";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Allowdoctor_Note = "BookConsultation_Waiting_Allowdoctor_Note";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Allowdoctor_File = "BookConsultation_Schedule_Allowdoctor_File";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Allowdoctor_File = "BookConsultation_Waiting_Allowdoctor_File";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Allowdoctor_File_Note = "BookConsultation_Schedule_Allowdoctor_File_Note";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Allowdoctor_File_Note = "BookConsultation_Waiting_Allowdoctor_File_Note";
	String Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Allowdoctor = "BookConsultation_Audio_Schedule_Allowdoctor";
	String Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Allowdoctor = "BookConsultation_Audio_Waiting_Allowdoctor";
	String Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Allowdoctor_Note = "BookConsultation_Audio_Schedule_Allowdoctor_Note";
	String Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Allowdoctor_Note = "BookConsultation_Audio_Waiting_Allowdoctor_Note";
	String Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Allowdoctor_File = "BookConsultation_Audio_Schedule_Allowdoctor_File";
	String Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Allowdoctor_File = "BookConsultation_Audio_Waiting_Allowdoctor_File";
	String Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Allowdoctor_File_Note = "BookConsultation_Audio_Schedule_Allowdoctor_File_Note";
	String Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Allowdoctor_File_Note = "BookConsultation_Audio_Waiting_Allowdoctor_File_Note";
	String Functionality_dp_Script_name_BookConsultation_Schedule_Audio_Telephone_Allowdoctor = "BookConsultation_Schedule_Audio_Telephone_Allowdoctor";
	String Functionality_dp_Script_name_BookConsultation_Waiting_Audio_Telephone_Allowdoctor = "BookConsultation_Waiting_Audio_Telephone_Allowdoctor";
	String Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Schedule_Allowdoctor_Note = "BookConsultation_Audio_Telephone_Schedule_Allowdoctor_Note";
	String Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Waiting_Allowdoctor_Note = "BookConsultation_Audio_Telephone_Waiting_Allowdoctor_Note";
	String Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Schedule_Allowdoctor_File = "BookConsultation_Audio_Telephone_Schedule_Allowdoctor_File";
	String Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Waiting_Allowdoctor_File = "BookConsultation_Audio_Telephone_Waiting_Allowdoctor_File";
	String Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Schedule_Allowdoctor_File_Note = "BookConsultation_Audio_Telephone_Schedule_Allowdoctor_File_Note";
	String Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Waiting_Allowdoctor_File_Note = "BookConsultation_Audio_Telephone_Waiting_Allowdoctor_File_Note";		
			
	String EXCEL_SHEET_NAME_Scenario_BookConsultation_Functionality = "Scenario_BookConsultation_Functionality";	
	
	//Scenario_BookConsultation_Functionality
	
	String Scenario_BookConsultation_Myself_Button_log_info_pass = "Passed as Myself button is Enabled & selected in the Book Consultation screen";
	String Scenario_BookConsultation_Myself_Button_extend_log_pass = "Myself button is Enabled & selected on the Book Consultation screen";
	String Scenario_BookConsultation_Myself_Button_log_info_fail = "Failed as Myself button is not selected on the Book Consultation screen";
	String Scenario_BookConsultation_Myself_Button_extend_log_fail = "Myself button is not selected on the Book Consultation screen";
	
	String Scenario_BookConsultation_Video_Button_log_info_pass = "Passed as Video button is Enabled & selected in the Book Consultation screen";
	String Scenario_BookConsultation_Video_Button_extend_log_pass = "Video button is Enabled & selected on the Book Consultation screen";
	String Scenario_BookConsultation_Video_Button_log_info_fail = "Failed as Video button is not selected on the Book Consultation screen";
	String Scenario_BookConsultation_Video_Button_extend_log_fail = "Video button is not selected on the Book Consultation screen";
	
	String Scenario_BookConsultation_Schedule_Time_log_info_pass = "Schedule Time Button";
	String Scenario_BookConsultation_Schedule_Time_extend_log_pass = "Schedule Time Button has been clicked successfully";
	
	String Scenario_BookConsultation_Select_Date_log_info_pass = "Select date";
	String Scenario_BookConsultation_Select_Date_extend_log_pass = "Date has been clicked successfully";
	
	String Scenario_BookConsultation_AM_PM_log_info_pass = "Select AM/PM";
	String Scenario_BookConsultation_AM_PM_extend_log_pass = "PM has been clicked successfully";
	
	String Scenario_BookConsultation_Select_Time_log_info_pass = "Select Time";
	String Scenario_BookConsultation_Select_Time_extend_log_pass = "Time has been selected successfully";
	
	String Scenario_BookConsultation_Add_Notes_log_info_pass = "Add Notes";
	String Scenario_BookConsultation_Add_Notes_extend_log_pass = "Note has been added successfully";
	
	String Scenario_BookConsultation_Button_log_info_pass = "Click Book Consultation Button";
	String Scenario_BookConsultation_Button_extend_log_pass = "Book Consultation Button has been clicked successfully";
	
	String NewConsultation_Button_log_info_pass = "Click new Consultation Button";
	String NewConsultation_Button_extend_log_pass = "New Consultation Radio Button has been clicked successfully";
	
	String Scenario_BookConsultation_OK_Button_log_info_pass = "Click OK Button";
	String Scenario_BookConsultation_OK_Button_extend_log_pass = "OK Button has been clicked successfully";
	
	String Scenario_BookConsultation_Appointment_Time_log_info_pass = "Get appointment time";
	String Scenario_BookConsultation_Appointment_Time_extend_log_pass = "My appointment time ";
	
	String Scenario_BookConsultation_Consent_Accept_log_info_pass = "Appointment Confirmed";
	String Scenario_BookConsultation_Consent_Accept_extend_log_pass = "Appointment Confirmed";
	
	String Scenario_BookConsultation_Waiting_Time_log_info_pass = "Passed as Waiting Time button is Enabled & selected in the Book Consultation screen";
	String Scenario_BookConsultation_Waiting_Time_extend_log_pass = "Waiting Time button is Enabled & selected on the Book Consultation screen";
	String Scenario_BookConsultation_Waiting_Time_log_info_fail = "Failed as Waiting Time button is not selected on the Book Consultation screen";
	String Scenario_BookConsultation_Waiting_Time_extend_log_fail = "Waiting Time button is not selected on the Book Consultation screen";
	
	
	String Scenario_BookConsultation_Upload_log_info_pass = "File Upload";
	String Scenario_BookConsultation_Upload_extend_log_pass = "File has been uploaded successfully";
	
	String Scenario_BookConsultation_Audio_Button_log_info_pass = "Audio Button";
	String Scenario_BookConsultation_Audio_Button_extend_log_pass = "Audio Button has been clicked successfully";
	
	String Scenario_BookConsultation_Internet_Button_log_info_pass = "Passed as Internet button is Enabled & selected in the Book Consultation screen";
	String Scenario_BookConsultation_Internet_Button_extend_log_pass = "Internet button is Enabled & selected on the Book Consultation screen";
	String Scenario_BookConsultation_Internet_Button_log_info_fail = "Failed as Internet button is not selected on the Book Consultation screen";
	String Scenario_BookConsultation_Internet_Button_extend_log_fail = "Internet button is not selected on the Book Consultation screen";
	
	String Scenario_BookConsultation_Telephone_Button_log_info_pass = "Telephone Button";
	String Scenario_BookConsultation_Telephone_Button_extend_log_pass = "Telephone button has been clicked successfully";
	
	String Scenario_BookConsultation_PreferredLang_Button_log_info_pass = "Preferred Language Toggle Button";
	String Scenario_BookConsultation_PreferredLang_Button_extend_log_pass = "Preferred Language Toggle Button has been clicked successfully";
	
	
	
	
	
	
	
	
	
	
	
	
}
