package Scenario_Component;

import java.io.IOException;


import Generic_Component.*;
import PageObject_Component.*;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.Map;

public class Scenario_Dashboard extends Base_Class{

	public static Logger log= Logger.getLogger(Scenario_Dashboard.class);
	SoftAssert sAssert= new SoftAssert();



	//To check if all the Dashboard elements are loding or not
	@Test(dataProvider = Dashboard_dp_DashboardUI , dataProviderClass=DataProvider_Component.DataProvider_Dashboard.class, groups={Smoke_Test}, priority=9)
	public void testUser_Dashboard_UI(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{

		// Getting the required details from the Excel sheet to execute the test case
		String TC_ID = search.get(TC_ID_).toString();
		String Order_Set = search.get(Order_Set_).toString();
		String Username = search.get(User_Name).toString();
		String Password = search.get(Password_Login).toString();
		String Dashboard_Title = search.get(Dashboard_Title_).toString();
		


		open_DocOnline_User_WebApp();
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, OPEN_BROWSER_TEXT_CONSOLE);
		PageObject_Login PL = new PageObject_Login(driver);//PL(PageObject_Login)
		PageObject_Dashboard PD = new PageObject_Dashboard(driver);//(PageObject_Dashboard)
		
		PL.Enter_Email(Username);
		PL.Enter_Password(Password);
		PL.Login_click();
		Explicit_wait(PD.LeftNav_Settings, 3000);
		String UserDashboard = driver.getTitle();
		System.out.println(Console_Actual_Title_displayed_is + UserDashboard);
		System.out.println(Console_The_given_title_is + Dashboard_Title);
		if(UserDashboard.equalsIgnoreCase(Dashboard_Title))
		{
			log.info(DashBoard_Title_match_log_info_pass);
			extenttest.log(LogStatus.PASS, Username + DashBoard_Title_match_extend_log_pass);
		}
		else {
			log.info(DashBoard_Title_match_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,  Username + DashBoard_Title_match_extend_log_fail);
		}

		Boolean Dashboard_Logo = PD.Dashboard_Doconline_Logo_isVisible();

		if(Dashboard_Logo)
		{
			log.info(Dashboard_DocOnline_Logo_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_DocOnline_Logo_extend_log_pass);
		}
		else {
			log.info(Dashboard_DocOnline_Logo_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,Dashboard_DocOnline_Logo_extend_log_fail);
		}

		Boolean Dashboard_Text = PD.Dashboard_Text_isVisible();

		if(Dashboard_Text)
		{
			log.info(Dashboard_Text_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_Text_extend_log_pass);					
		}
		else {
			log.info(Dashboard_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,Dashboard_Text_extend_log_fail);
		}

		Boolean Book_Consultation_Icon = PD.Book_consultation_Icon_isVisible();

		if(Book_Consultation_Icon)
		{
			log.info(Dashboard_BookConsultation_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_BookConsultation_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_BookConsultation_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,Dashboard_BookConsultation_Icon_extend_log_fail);
		}

		Boolean Book_Consultation_Text = PD.Book_consultation_Text_isVisible();

		if(Book_Consultation_Text)
		{
			log.info(Dashboard_BookConsultation_Text_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_BookConsultation_Text_extend_log_pass);					
		}
		else {
			log.info(Dashboard_BookConsultation_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,Dashboard_BookConsultation_Text_extend_log_fail);
		}

		Boolean chat_doctor_icon = PD.Chat_with_doctor_Icon_isVisible();

		if(chat_doctor_icon)
		{
			log.info(Dashboard_Chat_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_Chat_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_Chat_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,Dashboard_Chat_Icon_extend_log_fail);
		}

		Boolean chat_doctor_Text = PD.Chat_with_doctor_Text_isVisible();

		if(chat_doctor_Text)
		{
			log.info(Dashboard_ChatWithDoc_Text_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_ChatWithDoc_Text_extend_log_pass);					
		}
		else {
			log.info(Dashboard_ChatWithDoc_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,Dashboard_ChatWithDoc_Text_extend_log_fail);
		}

		Boolean choose_plan = PD.choose_plan_button_isVisible();

		if(choose_plan)
		{
			log.info(Dashboard_ChoosePlan_Button_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_ChoosePlan_Button_extend_log_pass);					
		}
		else {
			log.info(Dashboard_ChoosePlan_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,Dashboard_ChoosePlan_Button_extend_log_fail);
		}

		Boolean cart_icon = PD.cart_Icon_isVisible();

		if(cart_icon)
		{
			log.info(Dashboard_Cart_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_Cart_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_Cart_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,Dashboard_Cart_Icon_extend_log_fail);
		}

		Boolean Notification_icon = PD.notification_Icon_isVisible();

		if(Notification_icon)
		{
			log.info(Dashboard_Notification_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_Notification_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_Notification_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,Dashboard_Notification_Icon_extend_log_fail);
		}

		Boolean text_name = PD.name_isVisible();

		if(text_name)
		{
			log.info(Dashboard_User_Name_Text_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_User_Name_Text_extend_log_pass);					
		}
		else {
			log.info(Dashboard_User_Name_Text_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_User_Name_Text_extend_log_fail);
		}

		Boolean profile_icon = PD.profile_icon_isVisible();

		if(profile_icon)
		{
			log.info(Dashboard_Profile_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_Profile_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_Profile_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_Profile_Icon_extend_log_fail);
		}

		Boolean drop_down_icon = PD.drop_down_icon_isVisible();

		if(drop_down_icon)
		{
			log.info(Dashboard_DropDown_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_DropDown_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_DropDown_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,Dashboard_DropDown_Icon_extend_log_fail);
		}

		Boolean tile_book_consultation = PD.Book_consultation_tile_isVisible();

		if(tile_book_consultation)
		{
			log.info(Dashboard_BookConsultation_Text_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_BookConsultation_Text_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_BookConsultation_Text_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,Dashboard_BookConsultation_Text_Tile_extend_log_fail);
		}

		Boolean tile_my_appoinments = PD.My_appointments_text_tile_isVisible();

		if(tile_my_appoinments)
		{
			log.info(Dashboard_MyAppointment_Text_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_MyAppointment_Text_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_MyAppointment_Text_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_MyAppointment_Text_Tile_extend_log_fail);
		}

		Boolean tile_chat_with_doctor = PD.chat_with_doctor_text_tile_isVisible();

		if(tile_chat_with_doctor)
		{
			log.info(Dashboard_ChatWithDoc_Text_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_ChatWithDoc_Text_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_ChatWithDoc_Text_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_ChatWithDoc_Text_Tile_extend_log_fail);
		}

		Boolean tile_order_medicines = PD.order_medicines_text_tile_isVisible();

		if(tile_order_medicines)
		{
			log.info(Dashboard_OrderMedicine_Text_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_OrderMedicine_Text_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_OrderMedicine_Text_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_OrderMedicine_Text_Tile_extend_log_fail);
		}

		Boolean tile_book_diagnostics = PD.book_diagnostics_text_tile_isVisible();

		if(tile_book_diagnostics)
		{
			log.info(Dashboard_BookDiagnostics_Text_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_BookDiagnostics_Text_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_BookDiagnostics_Text_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_BookDiagnostics_Text_Tile_extend_log_fail);
		}

		Boolean tile_add_ons = PD.add_ons_text_tile_isVisible();

		if(tile_add_ons)
		{
			log.info(Dashboard_AddOns_Text_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_AddOns_Text_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_AddOns_Text_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_AddOns_Text_Tile_extend_log_fail);
		}

		Boolean tile_medical_records = PD.medical_records_text_tile_isVisible();

		if(tile_medical_records)
		{
			log.info(Dashboard_MedicalRecords_Text_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_MedicalRecords_Text_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_MedicalRecords_Text_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,Dashboard_MedicalRecords_Text_Tile_extend_log_fail);
		}

		Boolean BookConsultation_Icon_tile = PD.Book_consultation_Icon_isVisible();

		if(BookConsultation_Icon_tile)
		{
			log.info(Dashboard_BookConsultation_Icon_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_BookConsultation_Icon_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_BookConsultation_Icon_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_BookConsultation_Icon_Tile_extend_log_fail);
		}

		Boolean my_appointments_Icon_tile = PD.my_appointments_icon_tile_isVisible();

		if(my_appointments_Icon_tile)
		{
			log.info(Dashboard_MyAppointment_Icon_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_MyAppointment_Icon_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_MyAppointment_Icon_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL,Dashboard_MyAppointment_Icon_Tile_extend_log_fail);
		}

		Boolean chat_with_doctor_Icon_tile = PD.chat_with_doctor_icon_tile_isVisible();

		if(chat_with_doctor_Icon_tile)
		{
			log.info(Dashboard_ChatWithDoc_Icon_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_ChatWithDoc_Icon_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_ChatWithDoc_Icon_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_ChatWithDoc_Icon_Tile_extend_log_fail);
		}

		Boolean order_medicines_Icon_tile = PD.order_medicine_icon_tile_isVisible();

		if(order_medicines_Icon_tile)
		{
			log.info(Dashboard_OrderMedicine_Icon_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_OrderMedicine_Icon_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_OrderMedicine_Icon_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_OrderMedicine_Icon_Tile_extend_log_fail);
		}
		
		
		Boolean Book_Diagnostics_Icon_tile = PD.book_diagnostics_icon_tile_isVisible();

		if(Book_Diagnostics_Icon_tile)
		{
			log.info(Dashboard_BookDiagnostics_Icon_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_BookDiagnostics_Icon_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_BookDiagnostics_Icon_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_BookDiagnostics_Icon_Tile_extend_log_fail);
		}
		
		
		
		
		Boolean Add_Ons_Icon_tile = PD.Add_Ons_icon_tile_isVisible();

		if(Add_Ons_Icon_tile)
		{
			log.info(Dashboard_AddOns_Icon_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_AddOns_Icon_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_AddOns_Icon_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_AddOns_Icon_Tile_extend_log_fail);
		}
		
		
		Boolean Medical_Records_Icon_tile = PD.medical_records_icon_tile_isVisible();

		if(Medical_Records_Icon_tile)
		{
			log.info(Dashboard_MedicalRecords_Icon_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_MedicalRecords_Icon_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_MedicalRecords_Icon_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_MedicalRecords_Icon_Tile_extend_log_fail);
		}
				

		Boolean book_consultation_description_tile = PD.bookConsultation_description_tile_isVisible();

		if(book_consultation_description_tile)
		{
			log.info(Dashboard_BookConsultation_Description_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_BookConsultation_Description_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_BookConsultation_Description_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_BookConsultation_Description_Tile_extend_log_fail);
		}

		Boolean my_appointments_description_tile = PD.my_appointments_description_tile_isVisible();

		if(my_appointments_description_tile)
		{
			log.info(Dashboard_MyAppointment_Description_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_MyAppointment_Description_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_MyAppointment_Description_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_MyAppointment_Description_Tile_extend_log_fail);
		}

		Boolean chat_with_doctor_description_tile = PD.chat_with_doctor_description_tile_isVisible();

		if(chat_with_doctor_description_tile)
		{
			log.info(Dashboard_ChatWithDoc_Description_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_ChatWithDoc_Description_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_ChatWithDoc_Description_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_ChatWithDoc_Description_Tile_extend_log_fail);
		}

		Boolean Order_Medicines_description_tile = PD.order_medicines_description_tile_isVisible();

		if(Order_Medicines_description_tile)
		{
			log.info(Dashboard_OrderMedicine_Description_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_OrderMedicine_Description_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_OrderMedicine_Description_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_OrderMedicine_Description_Tile_extend_log_fail);
		}

		Boolean book_diagnostics_description_tile = PD.book_diagnostics_description_tile_isVisible();

		if(book_diagnostics_description_tile)
		{
			log.info(Dashboard_BookDiagnostic_Description_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_BookDiagnostic_Description_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_BookDiagnostic_Description_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_BookDiagnostic_Description_Tile_extend_log_fail);
		}

		Boolean add_ons_description_tile = PD.add_ons_description_tile_isVisible();

		if(add_ons_description_tile)
		{
			log.info(Dashboard_AddOns_Description_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_AddOns_Description_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_AddOns_Description_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_AddOns_Description_Tile_extend_log_fail);
		}

		Boolean medical_records_description_tile = PD.medical_records_description_tile_isVisible();

		if(medical_records_description_tile)
		{
			log.info(Dashboard_MedicalRecord_Description_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_MedicalRecord_Description_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_MedicalRecord_Description_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_MedicalRecord_Description_Tile_extend_log_fail);
		}
		
		Boolean get_download_text_tile = PD.download_the_app_text_tile_isVisible();
		if(get_download_text_tile)
		{
			log.info(Dashboard_DownloadApp_Text_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_DownloadApp_Text_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_DownloadApp_Text_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_DownloadApp_Text_Tile_extend_log_fail);
		}

		Boolean downloadapp_below_description_tile = PD.downloadapp_below_description_tile_isVisible();
		if(downloadapp_below_description_tile)
		{
			log.info(Dashboard_DownloadApp_Description_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_DownloadApp_Description_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_DownloadApp_Description_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_DownloadApp_Description_Tile_extend_log_fail);
		}
		
		Boolean mobile_number_field_tile = PD.mobile_number_field_tile_isVisible();
		if(mobile_number_field_tile)
		{
			log.info(Dashboard_MobileNo_Field_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_MobileNo_Field_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_MobileNo_Field_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_MobileNo_Field_Tile_extend_log_fail);
		}
		
		Boolean get_download_link_tile = PD.get_download_link_tile_isVisible();
		if(get_download_link_tile)
		{
			log.info(Dashboard_GetDownload_Link_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_GetDownload_Link_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_GetDownload_Link_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_GetDownload_Link_Tile_extend_log_fail);
		}
		
		Boolean google_play_link_button_tile = PD.google_play_link_button_tile_isVisible();
		if(google_play_link_button_tile)
		{
			log.info(Dashboard_GooglePlay_Link_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_GooglePlay_Link_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_GooglePlay_Link_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_GooglePlay_Link_Tile_extend_log_fail);
		}
		
		Boolean app_store_link_button_tile = PD.app_store_link_button_tile_isVisible();
		if(app_store_link_button_tile)
		{
			log.info(Dashboard_AppStore_Link_Tile_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_AppStore_Link_Tile_extend_log_pass);					
		}
		else {
			log.info(Dashboard_AppStore_Link_Tile_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_AppStore_Link_Tile_extend_log_fail);
		}
		
		Boolean topmenu_Options_button = PD.TopMenu_option_button_isVisible();
		if(topmenu_Options_button)
		{
			log.info(Dashboard_TopMenu_Option_Button_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_TopMenu_Option_Button_extend_log_pass);					
		}
		else {
			log.info(Dashboard_TopMenu_Option_Button_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_TopMenu_Option_Button_extend_log_fail);
		}
		
		Boolean LeftNavigation_dashboard_icon = PD.LeftNavigation_dashboard_Icon_isVisible();
		if(LeftNavigation_dashboard_icon)
		{
			log.info(Dashboard_LeftNavigation_Dashboard_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_LeftNavigation_Dashboard_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_LeftNavigation_Dashboard_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_LeftNavigation_Dashboard_Icon_extend_log_fail);
		}
		
		Boolean LeftNavigation_appointments_icon = PD.LeftNavigation_appointments_Icon_isVisible();
		if(LeftNavigation_appointments_icon)
		{
			log.info(Dashboard_LeftNavigation_Appointment_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_LeftNavigation_Appointment_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_LeftNavigation_Appointment_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_LeftNavigation_Appointment_Icon_extend_log_fail);
		}
		
		Boolean LeftNavigation_chats_icon = PD.LeftNavigation_chats_Icon_isVisible();
		if(LeftNavigation_chats_icon)
		{
			log.info(Dashboard_LeftNavigation_Chat_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_LeftNavigation_Chat_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_LeftNavigation_Chat_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_LeftNavigation_Chat_Icon_extend_log_fail);
		}
		
		Boolean LeftNavigation_medical_records_icon = PD.LeftNavigation_medical_records_Icon_isVisible();
		if(LeftNavigation_medical_records_icon)
		{
			log.info(Dashboard_LeftNavigation_MedicalRecord_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_LeftNavigation_MedicalRecord__Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_LeftNavigation_MedicalRecord_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_LeftNavigation_MedicalRecord_Icon_extend_log_fail);
		}
		
		Boolean LeftNavigation_vitals_icon = PD.LeftNavigation_vitals_Icon_isVisible();
		if(LeftNavigation_vitals_icon)
		{
			log.info(Dashboard_LeftNavigation_Vitals_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_LeftNavigation_Vitals__Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_LeftNavigation_Vitals_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_LeftNavigation_Vitals_Icon_extend_log_fail);
		}

		Boolean LeftNavigation_orders_icon = PD.LeftNavigation_orders_Icon_isVisible();
		if(LeftNavigation_orders_icon)
		{
			log.info(Dashboard_LeftNavigation_Orders_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_LeftNavigation_Orders__Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_LeftNavigation_Orders_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_LeftNavigation_Orders_Icon_extend_log_fail);
		}
		
		Boolean LeftNavigation_diagnostics_history_icon = PD.LeftNavigation_diagnostics_history_Icon_isVisible();
		if(LeftNavigation_diagnostics_history_icon)
		{
			log.info(Dashboard_LeftNavigation_DiagnosticHistory_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_LeftNavigation_DiagnosticHistory_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_LeftNavigation_DiagnosticHistory_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_LeftNavigation_DiagnosticHistory_Icon_extend_log_fail);
		}
		
		Boolean LeftNavigation_select_plan_icon = PD.LeftNavigation_select_plan_Icon_isVisible();
		if(LeftNavigation_select_plan_icon)
		{
			log.info(Dashboard_LeftNavigation_SelectPlan_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_LeftNavigation_SelectPlan_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_LeftNavigation_SelectPlan_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_LeftNavigation_SelectPlan_Icon_extend_log_fail);
		}
		
		Boolean LeftNavigation_billing_history_icon = PD.LeftNavigation_billing_history_Icon_isVisible();
		if(LeftNavigation_billing_history_icon)
		{
			log.info(Dashboard_LeftNavigation_BillingHistory_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_LeftNavigation_BillingHistory_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_LeftNavigation_BillingHistory_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_LeftNavigation_BillingHistory_Icon_extend_log_fail);
		}
		
		Boolean LeftNavigation_family_icon = PD.LeftNavigation_family_Icon_isVisible();
		if(LeftNavigation_family_icon)
		{
			log.info(Dashboard_LeftNavigation_Family_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_LeftNavigation_Family_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_LeftNavigation_Family_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_LeftNavigation_Family_Icon_extend_log_fail);
		}

		Boolean LeftNavigation_profile_icon = PD.LeftNavigation_profile_Icon_isVisible();
		if(LeftNavigation_profile_icon)
		{
			log.info(Dashboard_LeftNavigation_Profile_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_LeftNavigation_Profile_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_LeftNavigation_Profile_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_LeftNavigation_Profile_Icon_extend_log_fail);
		}
		
		Boolean LeftNavigation_settings_icon = PD.LeftNavigation_settings_Icon_isVisible();
		if(LeftNavigation_settings_icon)
		{
			log.info(Dashboard_LeftNavigation_Settings_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS,  Dashboard_LeftNavigation_Settings_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_LeftNavigation_Settings_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_LeftNavigation_Settings_Icon_extend_log_fail);
		}
		
		Boolean LeftNavigation_customer_care_icon = PD.LeftNavigation_customer_care_Icon_isVisible();
		if(LeftNavigation_customer_care_icon)
		{
			log.info(Dashboard_LeftNavigation_CustomerCare_Icon_log_info_pass);
			extenttest.log(LogStatus.PASS, Dashboard_LeftNavigation_CustomerCare_Icon_extend_log_pass);					
		}
		else {
			log.info(Dashboard_LeftNavigation_CustomerCare_Icon_log_info_fail);
			Capture_Screenshot1(TC_ID, Order_Set);
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
			extenttest.log(LogStatus.FAIL, Dashboard_LeftNavigation_CustomerCare_Icon_extend_log_fail);
		}

		System.gc();

		quit_execution();
	}



}
