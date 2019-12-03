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

public class Scenario_BookConsultation extends Base_Class{

	public static Logger log= Logger.getLogger(Scenario_BookConsultation.class);
	SoftAssert sAssert= new SoftAssert();



	//To check if all the Dashboard elements are loding or not
	
	@Test(dataProvider = BookConsultation_dp_BookConsultationUI , dataProviderClass=DataProvider_Component.DataProvider_BookConsultation.class, groups={Smoke_Test}, priority=11)
	public void testUser_BookConsultation_UI(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

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

		Boolean Book_for_text = PB.Book_for_text_isVisible();

		if(Book_for_text)
		{
			log.info(Book_For_Text_log_info_pass);
			extenttest.log(LogStatus.PASS, Book_For_Text_extend_log_pass);
		}

		else
		{
			log.info(Book_For_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Book_For_Text_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean mode_consultation_text = PB.Mode_consultation_text_isVisible();	
		if(mode_consultation_text)
		{
			log.info(ModeOfConsultation_Text_log_info_pass);
			extenttest.log(LogStatus.PASS, ModeOfConsultation_Text_extend_log_pass);
		}

		else
		{
			log.info(ModeOfConsultation_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, ModeOfConsultation_Text_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean schedule_time_text = PB.schedule_time_text_isVisible();
		if(schedule_time_text)
		{
			log.info(Schedule_Time_Text_log_info_pass);
			extenttest.log(LogStatus.PASS, Schedule_Time_Text_extend_log_pass);
		}

		else
		{
			log.info(Schedule_Time_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Schedule_Time_Text_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean my_self_button = PB.my_self_button_isVisible();
		if(my_self_button)
		{
			log.info(Myself_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Myself_Button_extend_log_pass);
		}

		else
		{
			log.info(Myself_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Myself_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean family_member_button = PB.Family_Member_button_isVisible();
		if(family_member_button)
		{
			log.info(FamilyMember_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, FamilyMember_Button_extend_log_pass);
		}

		else
		{
			log.info(FamilyMember_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, FamilyMember_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean Video_button = PB.video_button_isVisible();
		if(Video_button)
		{
			log.info(Video_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Video_Button_extend_log_pass);
		}

		else
		{
			log.info(Video_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Video_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean audio_button = PB.audio_button_isVisible();
		if(audio_button)
		{
			log.info(Audio_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Audio_Button_extend_log_pass);
		}

		else
		{
			log.info(Audio_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Audio_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean waiting_room_button = PB.waiting_room_button_isVisible();
		if(waiting_room_button)
		{
			log.info(WaitingRoom_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, WaitingRoom_Button_extend_log_pass);
		}

		else
		{
			log.info(WaitingRoom_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, WaitingRoom_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean schedule_button = PB.schedule_button_isVisible();
		if(schedule_button)
		{
			log.info(Schedule_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Schedule_Button_extend_log_pass);
		}

		else
		{
			log.info(Schedule_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Schedule_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean book_consultation_button = PB.book_consultation_button_isVisible();
		if(book_consultation_button)
		{
			log.info(Book_Consultation_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Book_Consultation_Button_extend_log_pass);
		}

		else
		{
			log.info(Book_Consultation_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Book_Consultation_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean preferred_language_Toggle_button = PB.preferred_language_toggle_button_isVisible();
		if(preferred_language_Toggle_button)
		{
			log.info(Preferred_Language_Toggle_log_info_pass);
			extenttest.log(LogStatus.PASS, Preferred_Language_Toggle_extend_log_pass);
		}

		else
		{
			log.info(Preferred_Language_Toggle_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Preferred_Language_Toggle_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean preferred_language_Text = PB.my_preferred_language_text_isVisible();
		if(preferred_language_Text)
		{
			log.info(Preferred_Language_Text_log_info_pass);
			extenttest.log(LogStatus.PASS, Preferred_Language_Text_extend_log_pass);
		}

		else
		{
			log.info(Preferred_Language_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Preferred_Language_Text_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean allow_doctor_Toggle_button = PB.allow_doctor_toggle_button_isVisible();
		if(allow_doctor_Toggle_button)
		{
			log.info(Allow_Doctor_Toggle_log_info_pass);
			extenttest.log(LogStatus.PASS, Allow_Doctor_Toggle_extend_log_pass);
		}

		else
		{
			log.info(Allow_Doctor_Toggle_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Allow_Doctor_Toggle_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean your_preferred_lang_text = PB.your_preferred_language_text_isVisible();
		if(your_preferred_lang_text)
		{
			log.info(Your_Preferred_Language_Text_log_info_pass);
			extenttest.log(LogStatus.PASS, Your_Preferred_Language_Text_extend_log_pass);
		}

		else
		{
			log.info(Your_Preferred_Language_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Your_Preferred_Language_Text_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean additional_info_text = PB.additional_info_text_isVisible();
		if(additional_info_text)
		{
			log.info(Additional_Info_Text_log_info_pass);
			extenttest.log(LogStatus.PASS, Additional_Info_Text_extend_log_pass);
		}

		else
		{
			log.info(Additional_Info_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Additional_Info_Text_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean additional_info_i = PB.additional_info_i_isVisible();
		if(additional_info_i)
		{
			log.info(AdditionalInfo_I_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, AdditionalInfo_I_Button_extend_log_pass);
		}

		else
		{
			log.info(AdditionalInfo_I_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, AdditionalInfo_I_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean add_notes_text_field = PB.add_notes_text_field_isVisible();
		if(add_notes_text_field)
		{
			log.info(Add_Notes_Field_log_info_pass);
			extenttest.log(LogStatus.PASS, Add_Notes_Field_extend_log_pass);
		}

		else
		{
			log.info(Add_Notes_Field_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Add_Notes_Field_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean upload_file_text = PB.upload_files_text_isVisible();
		if(upload_file_text)
		{
			log.info(Upload_File_Text_log_info_pass);
			extenttest.log(LogStatus.PASS, Upload_File_Text_extend_log_pass);
		}

		else
		{
			log.info(Upload_File_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Upload_File_Text_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean upload_file_icon = PB.upload_file_icon_isVisible();
		if(upload_file_icon)
		{
			log.info(Upload_File_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS, Upload_File_Icon_extend_log_pass);
		}

		else
		{
			log.info(Upload_File_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Upload_File_Icon_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean allow_doctor_text = PB.allow_doctor_text_isVisible();
		if(allow_doctor_text)
		{
			log.info(Allow_Doctor_Text_log_info_pass);
			extenttest.log(LogStatus.PASS, Allow_Doctor_Text_extend_log_pass);
		}

		else
		{
			log.info(Allow_Doctor_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Allow_Doctor_Text_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean language_name_hindi = PB.language_name_hindi_isVisible();
		if(language_name_hindi)
		{
			log.info(LanguageName_Hindi_log_info_pass);
			extenttest.log(LogStatus.PASS, LanguageName_Hindi_extend_log_pass);
		}

		else
		{
			log.info(LanguageName_Hindi_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, LanguageName_Hindi_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		Boolean waiting_time_minutes = PB.waiting_time_minutes_isVisible();
		if(waiting_time_minutes)
		{
			log.info(WaitingTime_Minutes_log_info_pass);
			extenttest.log(LogStatus.PASS, WaitingTime_Minutes_extend_log_pass);
		}

		else
		{
			log.info(WaitingTime_Minutes_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, WaitingTime_Minutes_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean health_profile_text= PB.Health_profile_text_isVisible();
		if(health_profile_text)
		{
			log.info(Health_Profile_Text_log_info_pass);
			extenttest.log(LogStatus.PASS, Health_Profile_Text_extend_log_pass);
		}

		else
		{
			log.info(Health_Profile_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Health_Profile_Text_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean health_profile_edit_button= PB.Health_profile_edit_button_isVisible();
		if(health_profile_edit_button)
		{
			log.info(HealthProfile_Edit_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, HealthProfile_Edit_Button_extend_log_pass);
		}
		
		else
		{
			log.info(HealthProfile_Edit_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, HealthProfile_Edit_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Scroll);
		
		PBF.Book_consultation();
		log.info(Click_Book_Consultation_log_info_pass);
		extenttest.log(LogStatus.PASS, Click_Book_Consultation_extend_log_pass);
		
		Explicit_wait(PB.New_consultation_text, 2000);
		
		
		Boolean new_consultation_text = PB.New_consultation_text_isVisible();
		if(new_consultation_text)
		{
			log.info(New_Consultation_Text_log_info_pass);
			extenttest.log(LogStatus.PASS, New_Consultation_Text_extend_log_pass);
		}

		else
		{
			log.info(New_Consultation_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, New_Consultation_Text_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean second_opinion_text = PB.Second_opinion_text_isVisible();
		if(second_opinion_text)
		{
			log.info(Second_Opinion_Text_log_info_pass);
			extenttest.log(LogStatus.PASS, Second_Opinion_Text_extend_log_pass);
		}

		else
		{
			log.info(Second_Opinion_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Second_Opinion_Text_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		
		Boolean followup_consultation_text = PB.Followup_consultation_text_isVisible();
		if(followup_consultation_text)
		{
			log.info(Followup_consultation_Text_log_info_pass);
			extenttest.log(LogStatus.PASS, Followup_consultation_Text_extend_log_pass);
		}

		else
		{
			log.info(Followup_consultation_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Followup_consultation_Text_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		
		Boolean new_consultation_radio_button = PB.New_consultation_radio_button_isVisible();
		if(new_consultation_radio_button)
		{
			log.info(NewConsultation_Radio_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, NewConsultation_Radio_Button_extend_log_pass);
		}

		else
		{
			log.info(NewConsultation_Radio_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, NewConsultation_Radio_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean second_opinion_radio_button = PB.Second_opinion_radio_button_isVisible();
		if(second_opinion_radio_button)
		{
			log.info(SecondOpinion_Radio_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, SecondOpinion_Radio_Button_extend_log_pass);
		}

		else
		{
			log.info(SecondOpinion_Radio_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, SecondOpinion_Radio_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean followup_consultation_radio_button = PB.Followup_consultation_radio_button_isVisible();
		if(followup_consultation_radio_button)
		{
			log.info(Followup_Cons_Radio_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, Followup_Cons_Radio_Button_extend_log_pass);
		}

		else
		{
			log.info(Followup_Cons_Radio_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Followup_Cons_Radio_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean ok_button = PB.Ok_button_isVisible();
		if(ok_button)
		{
			log.info(OK_Button_log_info_pass);
			extenttest.log(LogStatus.PASS, OK_Button_extend_log_pass);
		}

		else
		{
			log.info(OK_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, OK_Button_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		
		Boolean consultation_title_text = PB.consultation_text_title_isVisible();
		if(consultation_title_text)
		{
			log.info(Consultation_Title_Text_log_info_pass);
			extenttest.log(LogStatus.PASS, Consultation_Title_Text_extend_log_pass);
		}

		else
		{
			log.info(Consultation_Title_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, Consultation_Title_Text_extend_log_fail,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
	
		System.gc();

		driver.close();
	}
}
