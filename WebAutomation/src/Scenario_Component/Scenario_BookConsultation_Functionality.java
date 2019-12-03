package Scenario_Component;

import java.io.IOException;
import java.util.Map;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.LogStatus;
import Generic_Component.Base_Class;
import PageObject_Component.PageObject_BookConsultation;
import PageObject_Component.PageObject_BookConsultation_Functionality;
import PageObject_Component.PageObject_Dashboard;
import PageObject_Component.PageObject_Login;

public class Scenario_BookConsultation_Functionality extends Base_Class{

	public static Logger log= Logger.getLogger(Scenario_BookConsultation.class);
	SoftAssert sAssert= new SoftAssert();



	//Check the flow (Click Myself - Click Video - Schedule call @ today 7PM - Add note - Click book consultation - get Scheduled time - Accept it)

	@Test(dataProvider = Functionality_dp_BookConsultationFunctionality , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=12)
	public void testUser_BookConsultation_Functionality(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String note = search.get(Note).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 0);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Video_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Video_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);
		
		PBF.add_note(note);
		log.info(Scenario_BookConsultation_Add_Notes_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Add_Notes_extend_log_pass);
		
		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		
		
		
		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);
		
		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);

		System.gc();
		driver.quit();
	}

	//Check for the flow (Click Myself - click Video - Waiting room - Click book consultation - get scheduled time - Accept it)

	@Test(dataProvider = Functionality_dp_BookConsultationwaitingtime , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=13)
	public void testUser_BookConsultation_waitingtime(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Video_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Video_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Waiting_Time_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Waiting_Time_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		
		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		
		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);
		
		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();
	}

	
	//Check the flow (Click Myself - Click Video - Waiting Room - Add Note - Click book consultation - get schedule time - Accept it)

	@Test(dataProvider = Functionality_dp_BookConsultationwaitingtime_notes , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=14)
	public void testUser_BookConsultation_waitingtime_notes(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String note = search.get(Note).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Video_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Video_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Waiting_Time_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Waiting_Time_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.add_note(note);
		log.info(Scenario_BookConsultation_Add_Notes_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Add_Notes_extend_log_pass);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		
		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		
		
		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);
		
		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();
	}

	//check the flow (Click Myself - click video - Schedule call @ 7PM - Click book consultation - get scheduled time - Accept it)
	@Test(dataProvider = Functionality_dp_BookConsultation_schedule , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=15)
	public void testUser_BookConsultation_schedule(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Video_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Video_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		//Thread.sleep(3000);
		
		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		
		
		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);
		
		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}

	//check the flow (Click Myself - click video - Schedule call @ 7PM - upload file - Click book consultation - get scheduled time - Accept it)

	@Test(dataProvider = Functionality_dp_BookConsultation_uploadfile , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=16)
	public void testUser_BookConsultation_uploadfile(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String path = search.get(Path).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Video_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Video_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		//Thread.sleep(3000);		

		PBF.upload_File(path);
		log.info(Scenario_BookConsultation_Upload_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Upload_extend_log_pass);


		//Thread.sleep(3000);

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);
		
		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}



	//check the flow (Click Myself - click video - waiting room - upload file -  Click book consultation - get scheduled time - Accept it)

	@Test(dataProvider = Functionality_dp_BookConsultationwaitingtime_upload , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=17)
	public void testUser_BookConsultation_waitingtime_upload(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String path = search.get(Path).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Video_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Video_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Waiting_Time_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Waiting_Time_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.upload_File(path);
		log.info(Scenario_BookConsultation_Upload_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Upload_extend_log_pass);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		
		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		
		
		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);
		
		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();
	}


	//check the flow (Click Myself - click video - Schedule call @ 7PM - add notes - upload file - Click book consultation - get scheduled time - Accept it)


	@Test(dataProvider = Functionality_dp_BookConsultation_schedule_note_upload , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=18)
	public void testUser_BookConsultation_schedule_note_upload(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String path = search.get(Path).toString();
		String note = search.get(Note).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Video_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Video_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}


		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);		
		//Thread.sleep(3000);		

		PBF.add_note(note);
		log.info(Scenario_BookConsultation_Add_Notes_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Add_Notes_extend_log_pass);

		PBF.upload_File(path);
		log.info(Scenario_BookConsultation_Upload_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Upload_extend_log_pass);

		//Thread.sleep(3000);

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);

		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();
	}


	//check the flow (Click Myself - click video - waiting room - add notes - upload files - Click book consultation - get scheduled time - Accept it)


	@Test(dataProvider = Functionality_dp_BookConsultationwaitingtime_note_upload , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=19)
	public void testUser_BookConsultation_waitingtime_note_upload(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String path = search.get(Path).toString();
		String note = search.get(Note).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Video_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Video_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Waiting_Time_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Waiting_Time_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.add_note(note);
		log.info(Scenario_BookConsultation_Add_Notes_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Add_Notes_extend_log_pass);

		PBF.upload_File(path);
		log.info(Scenario_BookConsultation_Upload_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Upload_extend_log_pass);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);

		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();
	}


	//check the flow (Click Myself - click audio - Schedule call @ 7PM - Click book consultation - get scheduled time - Accept it)
	@Test(dataProvider = Functionality_dp_BookConsultation_schedule_audio , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=20)
	public void testUser_BookConsultation_schedule_audio(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}


		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		Boolean Internet_button = PBF.Internet_button();
		if(Internet_button)
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Internet_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Internet_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);	

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		//Thread.sleep(3000);

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);

		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}


	//check the flow (Click Myself - click audio - waiting room - Click book consultation - get scheduled time - Accept it)	

	@Test(dataProvider = Functionality_dp_BookConsultation_waiting_audio , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=21)
	public void testUser_BookConsultation_waiting_audio(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		Boolean Internet_button = PBF.Internet_button();
		if(Internet_button)
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Internet_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Internet_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Waiting_Time_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Waiting_Time_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}


		PBF.Book_consultation();
		log.info( Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);

		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}


	//check the flow (Click Myself - click audio - add notes - Schedule call @ 7PM - Click book consultation - get scheduled time - Accept it)

	@Test(dataProvider = Functionality_dp_BookConsultation_schedule_note_audio , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=22)
	public void testUser_BookConsultation_schedule_note_audio(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String note = search.get(Note).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		Boolean Internet_button = PBF.Internet_button();
		if(Internet_button)
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Internet_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Internet_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);	

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		//Thread.sleep(3000);

		PBF.add_note(note);
		log.info(Scenario_BookConsultation_Add_Notes_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Add_Notes_extend_log_pass);

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);

		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}

	//check the flow (Click Myself - click audio - add notes - waiting room - Click book consultation - get scheduled time - Accept it)	
	@Test(dataProvider = Functionality_dp_BookConsultation_waiting_note_audio , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=23)
	public void testUser_BookConsultation_waiting_note_audio(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String note = search.get(Note).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		Boolean Internet_button = PBF.Internet_button();
		if(Internet_button)
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Internet_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Internet_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Waiting_Time_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Waiting_Time_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		//Thread.sleep(3000);

		PBF.add_note(note);
		log.info(Scenario_BookConsultation_Add_Notes_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Add_Notes_extend_log_pass);

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);

		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}

	//check the flow (Click Myself - click audio - Schedule call @ 7PM - add files -Click book consultation - get scheduled time - Accept it)	

	@Test(dataProvider = Functionality_dp_BookConsultation_schedule_file_audio , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=24)
	public void testUser_BookConsultation_schedule_file_audio(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String path = search.get(Path).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		Boolean Internet_button = PBF.Internet_button();
		if(Internet_button)
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Internet_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Internet_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);	

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		//Thread.sleep(3000);

		PBF.upload_File(path);
		log.info(Scenario_BookConsultation_Upload_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Upload_extend_log_pass);		

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);

		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}

	//check the flow (Click Myself - click audio - Waiting room - add files -Click book consultation - get scheduled time - Accept it)	

	@Test(dataProvider = Functionality_dp_BookConsultation_waiting_file_audio , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=25)
	public void testUser_BookConsultation_waiting_file_audio(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String path = search.get(Path).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		Boolean Internet_button = PBF.Internet_button();
		if(Internet_button)
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Internet_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Internet_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Waiting_Time_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Waiting_Time_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		//Thread.sleep(3000);


		PBF.upload_File(path);
		log.info(Scenario_BookConsultation_Upload_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Upload_extend_log_pass);	
		//Thread.sleep(2000);

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);


		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}

//check the flow (Click Myself - click audio - Schedule call @ 7PM - add notes - add files - Click book consultation - get scheduled time - Accept it)


	@Test(dataProvider = Functionality_dp_BookConsultation_schedule_file_note_audio , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=26)
	public void testUser_BookConsultation_schedule_file_note_audio(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String note = search.get(Note).toString();
		String path = search.get(Path).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		Boolean Internet_button = PBF.Internet_button();
		if(Internet_button)
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Internet_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Internet_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);	

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		//Thread.sleep(3000);
		
		PBF.add_note(note);
		log.info(Scenario_BookConsultation_Add_Notes_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Add_Notes_extend_log_pass);

		PBF.upload_File(path);
		log.info(Scenario_BookConsultation_Upload_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Upload_extend_log_pass);		

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);

		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}

//check the flow (Click Myself - click audio - waiting room - add notes - add files - Click book consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider = Functionality_dp_BookConsultation_waiting_file_note_audio , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=27)
	public void testUser_BookConsultation_waiting_note_file_audio(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String path = search.get(Path).toString();
		String note = search.get(Note).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		Boolean Internet_button = PBF.Internet_button();
		if(Internet_button)
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Internet_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Internet_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Internet_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Waiting_Time_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Waiting_Time_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);

		PBF.add_note(note);
		log.info(Scenario_BookConsultation_Add_Notes_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Add_Notes_extend_log_pass);

		PBF.upload_File(path);
		log.info(Scenario_BookConsultation_Upload_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Upload_extend_log_pass);	
	

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);


		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio - click Telephone- Schedule call @ 7PM - Click book consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider = Functionality_dp_BookConsultation_schedule_Telephone_audio , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=28)
	public void testUser_BookConsultation_schedule_telephone_audio(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		PBF.Telephone_button();
		log.info(Scenario_BookConsultation_Telephone_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Telephone_Button_extend_log_pass);

		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);


		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio - click Telephone - waiting room - Click book consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider = Functionality_dp_BookConsultation_waiting_Telephone_audio , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=29)
	public void testUser_BookConsultation_waiting_telephone_audio(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		PBF.Telephone_button();
		log.info(Scenario_BookConsultation_Telephone_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Telephone_Button_extend_log_pass);

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Waiting_Time_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Waiting_Time_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
	//	Thread.sleep(5000);

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		
		
		
		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);
		

		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}
	
	
//check the flow (Click Myself - click audio -click Telephone - add notes - Schedule call @ 7PM - Click book consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider = Functionality_dp_BookConsultation_schedule_Telephone_audio_notes , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=30)
	public void testUser_BookConsultation_schedule_telephone_audio_notes(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String note = search.get(Note).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		PBF.Telephone_button();
		log.info(Scenario_BookConsultation_Telephone_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Telephone_Button_extend_log_pass);

		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		//Thread.sleep(3000);
		
		PBF.add_note(note);
		log.info(Scenario_BookConsultation_Add_Notes_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Add_Notes_extend_log_pass);


		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);

		
		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio- click Telephone - add notes - waiting room - Click book consultation - get scheduled time - Accept it)
	
	@Test(dataProvider = Functionality_dp_BookConsultation_waiting_Telephone_audio_Notes , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=31)
	public void testUser_BookConsultation_waiting_telephone_audio_Notes(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String note = search.get(Note).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		PBF.Telephone_button();
		log.info(Scenario_BookConsultation_Telephone_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Telephone_Button_extend_log_pass);

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Waiting_Time_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Waiting_Time_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		//Thread.sleep(5000);
		
		PBF.add_note(note);
		log.info(Scenario_BookConsultation_Add_Notes_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Add_Notes_extend_log_pass);

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		
		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);
		
		

		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio-click Telephone - Schedule call @ 7PM - Upload files -Click book consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider = Functionality_dp_BookConsultation_schedule_Telephone_audio_upload , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=32)
	public void testUser_BookConsultation_schedule_telephone_audio_upload(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String path = search.get(Path).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		PBF.Telephone_button();
		log.info(Scenario_BookConsultation_Telephone_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Telephone_Button_extend_log_pass);

		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		
		PBF.upload_File(path);
		log.info(Scenario_BookConsultation_Upload_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Upload_extend_log_pass);	


		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		
		

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);

		
		
		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}
	
	
//check the flow (Click Myself - click audio- click Telephone - waiting room - Upload files - Click book consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider = Functionality_dp_BookConsultation_waiting_Telephone_audio_File , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=33)
	public void testUser_BookConsultation_waiting_telephone_audio_File(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String path = search.get(Path).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		PBF.Telephone_button();
		log.info(Scenario_BookConsultation_Telephone_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Telephone_Button_extend_log_pass);

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Waiting_Time_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Waiting_Time_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		
		PBF.upload_File(path);
		log.info(Scenario_BookConsultation_Upload_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Upload_extend_log_pass);

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass);
		
		System.gc();
		driver.quit();

	}


//check the flow (Click Myself - click audio- click Telephone - Schedule call @ 7PM - add notes - add files - Click book consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider = Functionality_dp_BookConsultation_schedule_Telephone_audio_upload_notes , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=34)
	public void testUser_BookConsultation_schedule_telephone_audio_upload_notes(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String path = search.get(Path).toString();
		String note = search.get(Note).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		PBF.Telephone_button();
		log.info(Scenario_BookConsultation_Telephone_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Telephone_Button_extend_log_pass);

		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		
		PBF.add_note(note);
		log.info(Scenario_BookConsultation_Add_Notes_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Add_Notes_extend_log_pass);
		
		PBF.upload_File(path);
		log.info(Scenario_BookConsultation_Upload_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Upload_extend_log_pass);	


		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		
		

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);

		
		
		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio- click Telephone - waiting room - add notes - add files - Click book consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider = Functionality_dp_BookConsultation_waiting_Telephone_audio_File_Note , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=35)
	public void testUser_BookConsultation_waiting_telephone_audio_File_Note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String path = search.get(Path).toString();
		String note = search.get(Note).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		PBF.Audio_Call();
		log.info(Scenario_BookConsultation_Audio_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Audio_Button_extend_log_pass);
		
		PBF.Telephone_button();
		log.info(Scenario_BookConsultation_Telephone_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Telephone_Button_extend_log_pass);

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Waiting_Time_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Waiting_Time_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		
		PBF.add_note(note);
		log.info(Scenario_BookConsultation_Add_Notes_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Add_Notes_extend_log_pass);
		
		PBF.upload_File(path);
		log.info(Scenario_BookConsultation_Upload_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Upload_extend_log_pass);

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		
		
		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);
		

		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}
	
//Check the flow (Click Myself - Click Video - Schedule call @ today 7PM - click preferred language - Click book consultation - get Scheduled time - Accept it)	
	
	@Test(dataProvider = Functionality_dp_BookConsultation_schedule_video_lang , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=36)
	public void testUser_BookConsultation_schedule_video_lang(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Video_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Video_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		

		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		
		PBF.select_Language();
		log.info(Scenario_BookConsultation_PreferredLang_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_PreferredLang_Button_extend_log_pass);

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);		
		
		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}
	
//Check for the flow (Click Myself - click Video - Waiting room - click Preferred language - Click book consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider = Functionality_dp_BookConsultation_waiting_video_lang , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=37)
	public void testUser_BookConsultation_waiting_video_lang(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Video_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Video_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Waiting_Time_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Waiting_Time_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		
		PBF.select_Language();
		log.info(Scenario_BookConsultation_PreferredLang_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_PreferredLang_Button_extend_log_pass);


		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		
		
		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);
		

		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}
	
//Check the flow (Click Myself - Click Video - Schedule call @ today 7PM - click preferred language - Add note - Click book consultation - get Scheduled time - Accept it)	
	
	@Test(dataProvider = Functionality_dp_BookConsultation_schedule_video_lang_note , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=38)
	public void testUser_BookConsultation_schedule_video_lang_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String note = search.get(Note).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Video_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Video_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		

		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		
		PBF.select_Language();
		log.info(Scenario_BookConsultation_PreferredLang_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_PreferredLang_Button_extend_log_pass);
		
		PBF.add_note(note);
		log.info(Scenario_BookConsultation_Add_Notes_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Add_Notes_extend_log_pass);

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);		
		
		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}
	
//Check the flow (Click Myself - Click Video - Waiting Room - click Preferred language -  Add Note - Click book consultation - get schedule time - Accept it)	
	
	@Test(dataProvider = Functionality_dp_BookConsultation_waiting_video_lang_note , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=39)
	public void testUser_BookConsultation_waiting_video_lang_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String note = search.get(Note).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Video_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Video_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Waiting_Time_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Waiting_Time_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Waiting_Time_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);

		
		PBF.select_Language();
		log.info(Scenario_BookConsultation_PreferredLang_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_PreferredLang_Button_extend_log_pass);


		PBF.add_note(note);
		log.info(Scenario_BookConsultation_Add_Notes_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Add_Notes_extend_log_pass);
		
		
		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);
		
		
		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);
		

		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}
	
	
//check the flow (Click Myself - click video - Schedule call @ 7PM - click preferred language - upload file - Click book consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider = Functionality_dp_BookConsultation_schedule_video_lang_file , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=40)
	public void testUser_BookConsultation_schedule_video_lang_file(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String path = search.get(Path).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + Userbookconsultation);
		System.out.println(Console_The_given_title_is + BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info(Screen_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + Screen_Title_match_extend_log_pass);
		}
		else {
			log.info(Screen_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + Screen_Title_match_extend_log_fail);
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Video_Button_extend_log_pass);
		}

		else
		{
			log.info(Scenario_BookConsultation_Video_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Scenario_BookConsultation_Video_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		

		PBF.schedule_time();
		log.info(Scenario_BookConsultation_Schedule_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Schedule_Time_extend_log_pass);	

		PBF.current_date();
		log.info(Scenario_BookConsultation_Select_Date_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Date_extend_log_pass);	

		PBF.select_pm();
		log.info(Scenario_BookConsultation_AM_PM_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_AM_PM_extend_log_pass);	

		PBF.time_select();
		log.info(Scenario_BookConsultation_Select_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Select_Time_extend_log_pass);	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
	
		
		PBF.select_Language();
		log.info(Scenario_BookConsultation_PreferredLang_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_PreferredLang_Button_extend_log_pass);
		
		PBF.upload_File(path);
		log.info(Scenario_BookConsultation_Upload_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Upload_extend_log_pass);

		PBF.Book_consultation();
		log.info(Scenario_BookConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Button_extend_log_pass);	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info(NewConsultation_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, NewConsultation_Button_extend_log_pass);
		
		
		PBF.ok_button();
		log.info(Scenario_BookConsultation_OK_Button_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_OK_Button_extend_log_pass);

		String date =	PBF.consultation_Date();
		log.info(Scenario_BookConsultation_Appointment_Time_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Appointment_Time_extend_log_pass + date);		
		
		PBF.consent_Accept();
		log.info(Scenario_BookConsultation_Consent_Accept_log_info_pass);
		extenttest.log(LogStatus.PASS, Scenario_BookConsultation_Consent_Accept_extend_log_pass);
		
		System.gc();
		driver.quit();

	}
	
	
//check the flow (Click Myself - click video - waiting room - click Preferred language - upload file -  Click book consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider = Functionality_dp_BookConsultation_waiting_video_lang_file , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={Smoke_Test}, priority=41)
	public void testUser_BookConsultation_waiting_video_lang_file(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String path = search.get(Path).toString();
		String BookConsultation_Screen_Title = search.get(BookConsultation_Screen_Title_).toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info("Passed as Video button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Video button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Video button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Video button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
		//Thread.sleep(5000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");


		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click video - Schedule call @ 7PM - click preferred language - add notes - upload file - Click book consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_schedule_video_lang_file_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=42)
	public void testUser_BookConsultation_schedule_video_lang_file_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info("Passed as Video button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Video button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Video button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Video button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
	//	Thread.sleep(3000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}

//check the flow (Click Myself - click video - waiting room - click Preferred language -  add notes - upload files - Click book consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_video_lang_file_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=43)
	public void testUser_BookConsultation_waiting_video_lang_file_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info("Passed as Video button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Video button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Video button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Video button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
	//	Thread.sleep(5000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");


		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}

	
//check the flow (Click Myself - click audio - Schedule call @ 7PM - Click Preferred language - Click book consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_lang" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=44)
	public void testUser_BookConsultation_schedule_audio_lang(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
	//	Thread.sleep(3000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio - waiting room - Click Preferred language -  Click book consultation -  New Consultation -get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_lang" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=45)
	public void testUser_BookConsultation_waiting_audio_lang(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
//		Thread.sleep(5000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio  - Schedule call @ 7PM - Click Preferred language - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_lang_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=46)
	public void testUser_BookConsultation_schedule_audio_lang_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
	//	Thread.sleep(3000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");		
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio  - Waiting room - Click Preferred language - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_lang_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=47)
	public void testUser_BookConsultation_waiting_audio_lang_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
	//	Thread.sleep(5000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio - Schedule call @ 7PM - Click Preferred language - add files -Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_lang_file" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=48)
	public void testUser_BookConsultation_schedule_audio_lang_file(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
	//	Thread.sleep(3000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio - Waiting Room - Click Preferred language - add files -Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_lang_file" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=49)
	public void testUser_BookConsultation_waiting_audio_lang_file(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
	//	Thread.sleep(5000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio - Schedule call @ 7PM - Click Preferred language - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_lang_file_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=50)
	public void testUser_BookConsultation_schedule_audio_lang_file_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
//		Thread.sleep(3000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");		
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio - Waiting Room - Click Preferred language - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_lang_file_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=51)
	public void testUser_BookConsultation_waiting_audio_lang_file_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
//		Thread.sleep(5000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio - click Telephone- Schedule call @ 7PM - Click Preferred language - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_telephone_lang" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=52)
	public void testUser_BookConsultation_schedule_audio_telephone_lang(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
	//	Thread.sleep(3000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio - click Telephone- Waiting Room - Click Preferred language - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_telephone_lang" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=53)
	public void testUser_BookConsultation_waiting_audio_telephone_lang(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
//		Thread.sleep(5000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}

	
//check the flow (Click Myself - click audio -click Telephone  - Schedule call @ 7PM - Click Preferred language - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_telephone_lang_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=54)
	public void testUser_BookConsultation_schedule_audio_telephone_lang_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
//		Thread.sleep(3000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");	
		
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
	
//check the flow (Click Myself - click audio -click Telephone  - Waiting Room - Click Preferred language - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_telephone_lang_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=55)
	public void testUser_BookConsultation_waiting_audio_telephone_lang_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
	//	Thread.sleep(5000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio-click Telephone - Schedule call @ 7PM - Click Preferred language - Upload files -Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_telephone_lang_file" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=56)
	public void testUser_BookConsultation_schedule_audio_telephone_lang_file(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
//		Thread.sleep(3000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio - click Telephone - Waiting Room - Click Preferred language - Upload files -Click book consultation - New Consultation - get scheduled time - Accept it)
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_telephone_lang_file" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=57)
	public void testUser_BookConsultation_waiting_audio_telephone_lang_file(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
	//	Thread.sleep(5000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio- click Telephone - Schedule call @ 7PM - Click Preferred language - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_telephone_lang_file_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=58)
	public void testUser_BookConsultation_schedule_audio_telephone_lang_file_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
//		Thread.sleep(3000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");		
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio- click Telephone - Waiting Room - Click Preferred language - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_telephone_lang_file_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=59)
	public void testUser_BookConsultation_waiting_audio_telephone_lang_file_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
	//	Thread.sleep(5000);
		
		PBF.select_Language();
		log.info("Preferred Language Toggle Button");
		extenttest.log(LogStatus.PASS, "Preferred Language Toggle Button has been clicked successfully");
		
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
	
	
	
//Check the flow (Click Myself - Click Video - Schedule call @ today 7PM - click Allow Doctor - Click book consultation - New Consultation -get Scheduled time - Accept it)	
	
	
	@Test(dataProvider="dp_BookConsultation_schedule_video_allowdoctor" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=60)
	public void testUser_BookConsultation_schedule_video_allowdoctor(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info("Passed as Video button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Video button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Video button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Video button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(2000);

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//Check for the flow (Click Myself - click Video - Waiting room - click Allow Doctor - Click book consultation -New Consultation - get scheduled time - Accept it)
	
	@Test(dataProvider="dp_BookConsultation_waiting_video_allow_doctor" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=61)
	public void testUser_BookConsultation_waiting_video_allow_doctor(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info("Passed as Video button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Video button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Video button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Video button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,20000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(2000);


		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//Check the flow (Click Myself - Click Video - Schedule call @ today 7PM - click Allow Doctors - Add note - Click book consultation - New Consultation -get Scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_schedule_video_allow_doctor_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=62)
	public void testUser_BookConsultation_schedule_video_allow_doctor_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info("Passed as Video button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Video button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Video button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Video button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(2000);
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
	
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.close();

	}
	
	
//Check the flow (Click Myself - Click Video - Waiting Room - click Allow Doctor -  Add Note - Click book consultation - New Consultation -get schedule time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_video_allow_doctor_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=63)
	public void testUser_BookConsultation_waiting_video_allow_doctor_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info("Passed as Video button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Video button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Video button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Video button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,30000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(2000);


		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	

//check the flow (Click Myself - click video - Schedule call @ 7PM - click Allow Doctors - upload file - Click book consultation -New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_schedule_video_allow_doctor_file" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=64)
	public void testUser_BookConsultation_schedule_video_allow_doctor_file(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
	
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info("Passed as Video button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Video button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Video button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Video button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,30000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click video - waiting room - click Allow Doctors - upload file -  Click book consultation - New Consultation -get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_video_allow_doctor_file" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=65)
	public void testUser_BookConsultation_waiting_video_allow_doctor_file(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info("Passed as Video button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Video button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Video button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Video button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);

		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click video - Schedule call @ 7PM - click Allow Doctors - add notes - upload file - Click book consultation - New Consultation -get scheduled time - Accept it)
	
	@Test(dataProvider="dp_BookConsultation_schedule_video_allow_doctor_file_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=66)
	public void testUser_BookConsultation_schedule_video_allow_doctor_file_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info("Passed as Video button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Video button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Video button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Video button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		
		driver.quit();
		

	}
	

//check the flow (Click Myself - click video - waiting room - click Allow Doctors -  add notes - upload files - Click book consultation - New Consultation -get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_video_allow_doctor_file_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=67)
	public void testUser_BookConsultation_waiting_video_allow_doctor_file_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean video_button = PBF.check_video();
		if(video_button)
		{
			log.info("Passed as Video button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Video button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Video button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Video button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,30000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");


		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		
		System.gc();
		driver.quit();

	}
	

//check the flow (Click Myself - click audio - Schedule call @ 7PM - Click Allow Doctors - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_allow_doctor" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=68)
	public void testUser_BookConsultation_schedule_audio_allow_doctor(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(2000);
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
	
//check the flow (Click Myself - click audio - waiting room - Click Allow Doctors -  Click book consultation -  New Consultation -get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_allow_doctor" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=69)
	public void testUser_BookConsultation_waiting_audio_allow_doctor(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
	
	
//check the flow (Click Myself - click audio  - Schedule call @ 7PM - Click Allow Doctors - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_allow_doctor_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=70)
	public void testUser_BookConsultation_schedule_audio_allow_doctor_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
	
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");		
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
	
//check the flow (Click Myself - click audio  - Waiting room - Click Allow Doctors - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_allow_doctor_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=71)
	public void testUser_BookConsultation_waiting_audio_allow_doctor_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,30000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		
		System.gc();
		driver.quit();

	}
	

//check the flow (Click Myself - click audio - Schedule call @ 7PM - Click Allow Doctors - add files -Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_allow_doctor_file" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=72)
	public void testUser_BookConsultation_schedule_audio_allow_doctor_file(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio - Waiting Room - Click Allow Doctors - add files -Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_allow_doctor_file" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=73)
	public void testUser_BookConsultation_waiting_audio_allow_doctor_file(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,30000)");
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio - Schedule call @ 7PM - Click  Allow Doctors - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_allow_doctor_file_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=74)
	public void testUser_BookConsultation_schedule_audio_allow_doctor_file_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");		
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	

//check the flow (Click Myself - click audio - Waiting Room - Click Allow Doctors - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_allow_doctor_file_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=75)
	public void testUser_BookConsultation_waiting_audio_allow_doctor_file_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,30000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	

	
	
//check the flow (Click Myself - click audio - click Telephone- Schedule call @ 7PM - Click Allow Doctors - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_telephone_allow_doctor" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=76)
	public void testUser_BookConsultation_schedule_audio_telephone_allow_doctor(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,30000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio - click Telephone- Waiting Room - Click Allow Doctors - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_telephone_allow_doctor" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=77)
	public void testUser_BookConsultation_waiting_audio_telephone_allow_doctor(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,30000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		
		System.gc();
		driver.quit();

	}
	

//check the flow (Click Myself - click audio -click Telephone  - Schedule call @ 7PM - Click Allow Doctors - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_telephone_allow_doctor_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=78)
	public void testUser_BookConsultation_schedule_audio_telephone_allow_doctor_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,30000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");	
		
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	

//check the flow (Click Myself - click audio -click Telephone  - Waiting Room - Click Allow Doctors - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_telephone_allow_doctor_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=79)
	public void testUser_BookConsultation_waiting_audio_telephone_allow_doctor_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,20000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio-click Telephone - Schedule call @ 7PM - Click Allow Doctors - Upload files -Click book consultation - New Consultation - get scheduled time - Accept it)
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_telephone_allow_doctor_file" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=80)
	public void testUser_BookConsultation_schedule_audio_telephone_allow_doctor_file(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,20000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
//check the flow (Click Myself - click audio - click Telephone - Waiting Room - Click Allow Doctors- Upload files -Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_telephone_allow_doctor_file" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=81)
	public void testUser_BookConsultation_waiting_audio_telephone_allow_doctor_file(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,20000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
	
//check the flow (Click Myself - click audio- click Telephone - Schedule call @ 7PM - Click Allow Doctors - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)
	
	@Test(dataProvider="dp_BookConsultation_schedule_audio_telephone_allow_doctor_file_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=82)
	public void testUser_BookConsultation_schedule_audio_telephone_allow_doctor_file_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 3000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		

		PBF.schedule_time();
		log.info("Schedule Time Button");
		extenttest.log(LogStatus.PASS, "Schedule Time Button has been clicked successfully");	

		PBF.current_date();
		log.info("Select date");
		extenttest.log(LogStatus.PASS, "Date has been clicked successfully");	

		PBF.select_pm();
		log.info("Select AM/PM");
		extenttest.log(LogStatus.PASS, "PM has been clicked successfully");	

		PBF.time_select();
		log.info("Select Time");
		extenttest.log(LogStatus.PASS, "Time has been selected successfully");	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,20000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		

		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");		
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");

		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);		
		
		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		driver.quit();

	}
	
	
//check the flow (Click Myself - click audio- click Telephone - Waiting Room - Click Allow Doctors  - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)	
	
	@Test(dataProvider="dp_BookConsultation_waiting_audio_telephone_allow_doctor_file_note" , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation_Functionality.class, groups={"smoke"}, priority=83)
	public void testUser_BookConsultation_waiting_audio_telephone_allow_doctor_file_note(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
		String Username = search.get("Username").toString();
		String Password = search.get("Password").toString();
		String path = search.get("Path").toString();
		String note = search.get("Notes").toString();
		String BookConsultation_Screen_Title = search.get("BookConsultation_Screen_Title").toString();



		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully in chrome browser");
		PageObject_Login PL = new PageObject_Login(driver);
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);
		PageObject_BookConsultation PB = new PageObject_BookConsultation(driver);
		PageObject_BookConsultation_Functionality PBF = new PageObject_BookConsultation_Functionality(driver);

		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		PD.TopMenu_Book_consultation_Text.click();
		Explicit_wait(PB.book_for_text, 2000);
		String Userbookconsultation = driver.getTitle();
		System.out.println("The Actual Title displayed is: " + Userbookconsultation);
		System.out.println("The given title is: "+BookConsultation_Screen_Title);
		if(Userbookconsultation.equalsIgnoreCase(BookConsultation_Screen_Title))
		{
			log.info("Passed as the Screen Title match");
			extenttest.log(LogStatus.PASS, Username + " : User is successfully able to go to Book Consultation Screen");
		}
		else {
			log.info("Failed as Screen titles does not match");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + " : User is not able to go to Book Consultation Screen as titles are different");
		}

		Boolean myself_button = PBF.check_myself();
		if(myself_button)
		{
			log.info("Passed as Myself button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Myself button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Myself button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Myself button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}

		

		
		PBF.Audio_Call();
		log.info("Audio Button");
		extenttest.log(LogStatus.PASS, "Audio Button has been clicked successfully");
		
		PBF.Telephone_button();
		log.info("Telephone Button");
		extenttest.log(LogStatus.PASS, "Telephone button has been clicked successfully");
		
		

		Boolean Waiting_time_button = PBF.waiting_Time();
		if(Waiting_time_button)
		{
			log.info("Passed as Waiting Time button is Enabled & selected in the Book Consultation screen");
			extenttest.log(LogStatus.PASS, "Waiting Time button is Enabled & selected on the Book Consultation screen");
		}

		else
		{
			log.info("Failed as Waiting Time button is not selected on the Book Consultation screen");
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, "Waiting Time button is not selected on the Book Consultation screen",
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
		
		
		PBF.Allow_doctor();
		log.info("Allow Doctor Toggle Button");
		extenttest.log(LogStatus.PASS, "Allow Doctor Toggle Button has been clicked successfully");
		
		Thread.sleep(3000);
		
		
		PBF.add_note(note);
		log.info("Add Notes");
		extenttest.log(LogStatus.PASS, "Note has been added successfully");
		
		PBF.upload_File(path);
		log.info("File Upload");
		extenttest.log(LogStatus.PASS, "File has been uploaded successfully");
		
		
		
		PBF.Book_consultation();
		log.info("Click Book Consultation Button");
		extenttest.log(LogStatus.PASS, "Book Consultation Button has been clicked successfully");	
		
		Explicit_wait(PBF.click_new_consultation, 1000);
		
		PBF.new_consultation_button();
		log.info("Click new Consultation Button");
		extenttest.log(LogStatus.PASS, "New Consultation Radio Button has been clicked successfully");
		
		
		PBF.ok_button();
		log.info("Click OK Button");
		extenttest.log(LogStatus.PASS, "OK Button has been clicked successfully");
		
		
		String date =	PBF.consultation_Date();
		log.info("Get appointment time");
		extenttest.log(LogStatus.PASS, "My appointment time " + date);
		

		PBF.consent_Accept();
		log.info("Appointment Confirmed");
		extenttest.log(LogStatus.PASS, "Appointment Confirmed");
		
		System.gc();
		
		driver.quit();

	}
	
	
	
	
	
	
	

}
