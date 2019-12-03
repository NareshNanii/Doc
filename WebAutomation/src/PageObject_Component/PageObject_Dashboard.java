package PageObject_Component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject_Dashboard {

	public WebDriver driver;


	//This section is to initialise driver
	public PageObject_Dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}

	// This section is required to identify the UI elements on the User Dashboard

	@FindBy(xpath = "//div[@class='user-sidebar-small']//li[@id='lnkUserSdbrToSettings']//*[@class='svg-icon svg-fill']")
	public WebElement LeftNav_Settings;

	@FindBy(xpath = "//div[@id='btnUserSdbrToggle']")
	public WebElement LeftNav_Toggle_Button;


	@FindBy(xpath="//*[@class='logo-small router-link-exact-active active']")
	public WebElement Dashboard_DocOnline_Logo;


	@FindBy(xpath = "//span[@class='navbar-item']")
	public WebElement Top_Menu_Dashboard_text;

	@FindBy(xpath = "//div[@class='navbar-brand']//a[1]//span[1]")
	public WebElement TopMenu_Book_consultation_Icon ;

	@FindBy(xpath = "//span[contains(text(),'Book a Consultation')]")
	public WebElement TopMenu_Book_consultation_Text ;

	@FindBy(xpath = "//a[2]//span[1]")
	public WebElement TopMenu_chat_with_doctor_Icon ;

	@FindBy(xpath = "//span[contains(text(),'Chat with Doctor')]")
	public WebElement TopMenu_chat_with_doctor_Text ;

	@FindBy(xpath = "//p[@class='has-text-right nav-to-plans']")
	public WebElement TopMenu_choose_plan_button;

	@FindBy(xpath = "//div[@class='dropdown is-custom is-disabled is-mobile-modal']")
	public WebElement TopMenu_cart_Icon;

	@FindBy(xpath = "//div[@class='dropdown is-custom is-mobile-modal not-empty']//*[@class='svg-icon svg-fill']")
	public WebElement TopMenu_notification_Icon;

	@FindBy(xpath = "//article[@class='media align-items-center']//div[@class='media-content']")
	public WebElement TopMenu_Name_Text;

	@FindBy(xpath = "//span[@title='Online']")
	public WebElement TopMenu_profile_icon;

	@FindBy(xpath = "//i[@class='fa fa-angle-down fa-lg']")
	public WebElement TopMenu_drop_down_icon;

	@FindBy(xpath = "//h4[contains(text(),'Book a Consultation')]")
	public WebElement Dashboard_tile_book_consultation_text;

	@FindBy(xpath = "//h4[contains(text(),'My Appointments')]")
	public WebElement Dashboard_tile_my_appointments_text;

	@FindBy(xpath = "//h4[contains(text(),'Chat with Doctor')]")
	public WebElement Dashboard_tile_chat_with_doctor_text;

	@FindBy(xpath = "//h4[contains(text(),'Order Medicines')]")
	public WebElement Dashboard_tile_order_medicines_text;

	@FindBy(xpath = "//h4[contains(text(),'Book Diagnostics')]")
	public WebElement Dashboard_tile_book_diagnostics_text;

	@FindBy(xpath = "//h4[contains(text(),'Add-Ons')]")
	public WebElement Dashboard_tile_add_ons_text;

	@FindBy(xpath = "//h4[contains(text(),'Medical Records (EHR)')]")
	public WebElement Dashboard_tile_medical_records_text;

	@FindBy(xpath = "//body/div[@id='main']/div[@class='content-part']/div[@class='dashboard']/"
			+ "div[contains(@class,'columns is-mobile is-multiline is-marginless')]/div[1]/article[1]/figure[1]/*[2] ")
	public WebElement Dashboard_tile_bookConsultation_Icon;

	@FindBy(xpath = "//body/div[@id='main']/div[@class='content-part']/div[@class='dashboard']"
			+ "/div[contains(@class,'columns is-mobile is-multiline is-marginless')]/div[2]/article[1]/figure[1]/*[2] ")
	public WebElement Dashboard_tile_my_appointments_Icon;

	@FindBy(xpath = "//body/div[@id='main']/div[@class='content-part']/div[@class='dashboard']"
			+ "/div[contains(@class,'columns is-mobile is-multiline is-marginless')]/div[3]/article[1]/figure[1]/*[2]")
	public WebElement Dashboard_tile_chat_with_doctor_Icon;

	@FindBy(xpath = "//body/div[@id='main']/div[@class='content-part']/div[@class='dashboard']/"
			+ "div[contains(@class,'columns is-mobile is-multiline is-marginless')]/div[4]/article[1]/figure[1]/*[2] ")
	public WebElement Dashboard_tile_order_medicines_Icon;

	@FindBy(xpath = "//body/div[@id='main']/div[@class='content-part']/div[@class='dashboard']/"
			+ "div[contains(@class,'columns is-mobile is-multiline is-marginless')]/div[5]/article[1]/figure[1]/*[2]")
	public WebElement Dashboard_tile_book_diagnostics_Icon;

	@FindBy(xpath = "//body/div[@id='main']/div[@class='content-part']/div[@class='dashboard']/"
			+ "div[contains(@class,'columns is-mobile is-multiline is-marginless')]/div[6]/article[1]/figure[1]/*[2]")
	public WebElement Dashboard_tile_Add_Ons_Icon;

	@FindBy(xpath = "//body/div[@id='main']/div[@class='content-part']/div[@class='dashboard']/"
			+ "div[contains(@class,'columns is-mobile is-multiline is-marginless')]/div[7]/article[1]/figure[1]/*[2]")
	public WebElement Dashboard_tile_medical_records_Icon;

	@FindBy(xpath = "//div[contains(@class,'columns is-mobile is-multiline is-marginless')]//div[1]//article[1]//div[1]//p[1]")
	public WebElement Dashboard_tile_book_consultation_description;

	@FindBy(xpath = "//p[contains(text(),'View all your appointment details in one place!')]")
	public WebElement Dashboard_tile_my_appointments_description;

	@FindBy(xpath = "//p[contains(text(),'Put your questions to our panel of experts!')]")
	public WebElement Dashboard_tile_chat_with_doctor_description;

	@FindBy(xpath = "//p[@class='subtitle has-text-grey'][contains(text(),'M')]")
	public WebElement Dashboard_tile_order_medicines_description;

	@FindBy(xpath = "//p[contains(text(),'Book Diagnostic tests/packages at your doorstep.')]")
	public WebElement Dashboard_tile_book_diagnostics_description;

	@FindBy(xpath = "//p[contains(text(),'Are you monitoring your health regularly?')]")
	public WebElement Dashboard_tile_add_ons_description;

	@FindBy(xpath = "//p[contains(text(),'You can save all your Medical Records here.')]")
	public WebElement Dashboard_tile_medical_records_description;
	
	@FindBy(xpath = "//p[@class='title is-size-3-desktop is-size-4-tablet is-size-5-mobile']")
	public WebElement Dashboard_tile_download_the_app_text;
	
	@FindBy(xpath = "//div[@class='content-part']//p[2]")
	public WebElement Dashboard_tile_description_below_downloadapp_text;
	
	@FindBy(xpath = "//input[@id='inpUserDownloadLinkMob']")
	public WebElement Dashboard_tile_mobile_number_field;
	
	@FindBy(xpath = "//button[@id='btnUserDownloadLinkSubmit']")
	public WebElement Dashboard_tile_get_download_link;
	
	@FindBy(xpath = "//img[@alt='Get it on Google Play']")
	public WebElement Dashboard_tile_google_play_link;
	
	@FindBy(xpath = "//img[@src='/images/btn_apple.png']")
	public WebElement Dashboard_tile_app_store_link;
	
	@FindBy(xpath = "//div[@id='btnUserSdbrToggle']")
	public WebElement TopMenu_options;
	
	@FindBy(xpath = "//div[@id='btnUserSdbrToggle']")
	public WebElement LeftNavigation_dashboard_Icon;
	
	@FindBy(xpath = "//div[@id='btnUserSdbrToggle']")
	public WebElement LeftNavigation_appointments_Icon;
	
	@FindBy(xpath = "//div[@id='btnUserSdbrToggle']")
	public WebElement LeftNavigation_chats_Icon;
	
	@FindBy(xpath = "//div[@id='btnUserSdbrToggle']")
	public WebElement LeftNavigation_medical_records_Icon;
	
	@FindBy(xpath = "//div[@id='btnUserSdbrToggle']")
	public WebElement LeftNavigation_vitals_Icon;
	
	@FindBy(xpath = "//div[@id='btnUserSdbrToggle']")
	public WebElement LeftNavigation_orders_Icon;
	
	@FindBy(xpath = "//div[@class='user-sidebar-small']//li[@id='lnkUserDiagnosticsHistory']//*[@class='svg-icon svg-fill']")
	public WebElement LeftNavigation_diagnostics_history_Icon;
	
	@FindBy(xpath = "//div[@class='user-sidebar-small']//li[@id='lnkUserSdbrToPlan']//*[@class='svg-icon svg-fill']")
	public WebElement LeftNavigation_select_plan_Icon;
	
	@FindBy(xpath = "//div[@class='user-sidebar-small']//li[@id='lnkUserSdbrToBillingHistory']//*[@class='svg-icon svg-fill']")
	public WebElement LeftNavigation_billing_history_Icon;

	@FindBy(xpath = "//div[@class='user-sidebar-small']//li[@id='lnkUserSdbrToFamily']//*[@class='svg-icon svg-fill']")
	public WebElement LeftNavigation_family_Icon;
	
	@FindBy(xpath = "//div[@class='user-sidebar-small']//li[@id='lnkUserSdbrToProfile']//*[@class='svg-icon svg-fill']")
	public WebElement LeftNavigation_profile_Icon;
	
	@FindBy(xpath = "//div[@class='user-sidebar-small']//li[@id='lnkUserSdbrToSettings']//*[@class='svg-icon svg-fill']")
	public WebElement LeftNavigation_settings_Icon;
	
	@FindBy(xpath = "//li[@id='lnkUserSdbrCCNumber']//i[@class='fa fa-2x fa-phone']")
	public WebElement LeftNavigation_customer_care_Icon;
	
	@FindBy(xpath = "//span[contains(text(),'Settings')]")
	public WebElement LeftNavigation_settings_inside;
	

	// This section is to perform actions or validations 




	public Boolean Dashboard_Doconline_Logo_isVisible()
	{
		try {
			return Dashboard_DocOnline_Logo.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;
	}


	public void LeftNav_Settings_click()
	{

		LeftNav_Settings.click();
	}

	public void LeftNav_Toggle_Button_click()
	{

		LeftNav_Toggle_Button.click();
	}

	public Boolean Dashboard_Text_isVisible()
	{
		try {
			return Top_Menu_Dashboard_text.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean Book_consultation_Icon_isVisible()
	{
		try {
			return TopMenu_Book_consultation_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean Book_consultation_Text_isVisible()
	{
		try {
			return TopMenu_Book_consultation_Text.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean Chat_with_doctor_Icon_isVisible()
	{
		try {
			return TopMenu_chat_with_doctor_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean Chat_with_doctor_Text_isVisible()
	{
		try {
			return TopMenu_chat_with_doctor_Text.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean choose_plan_button_isVisible()
	{
		try {
			return TopMenu_choose_plan_button.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean cart_Icon_isVisible()
	{
		try {
			return TopMenu_cart_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean notification_Icon_isVisible()
	{
		try {
			return TopMenu_notification_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean name_isVisible()
	{
		try {
			return TopMenu_Name_Text.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean profile_icon_isVisible()
	{
		try {
			return TopMenu_profile_icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean drop_down_icon_isVisible()
	{
		try {
			return TopMenu_drop_down_icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean Book_consultation_tile_isVisible()
	{
		try {
			return Dashboard_tile_book_consultation_text.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean My_appointments_text_tile_isVisible()
	{
		try {
			return Dashboard_tile_my_appointments_text.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean chat_with_doctor_text_tile_isVisible()
	{
		try {
			return Dashboard_tile_chat_with_doctor_text.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean order_medicines_text_tile_isVisible()
	{
		try {
			return Dashboard_tile_order_medicines_text.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean book_diagnostics_text_tile_isVisible()
	{
		try {
			return Dashboard_tile_book_diagnostics_text.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean add_ons_text_tile_isVisible()
	{
		try {
			return Dashboard_tile_add_ons_text.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean medical_records_text_tile_isVisible()
	{
		try {
			return Dashboard_tile_medical_records_text.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean book_consulatant_icon_tile_isVisible()
	{
		try {
			return Dashboard_tile_bookConsultation_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean my_appointments_icon_tile_isVisible()
	{
		try {
			return Dashboard_tile_my_appointments_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean chat_with_doctor_icon_tile_isVisible()
	{
		try {
			return Dashboard_tile_chat_with_doctor_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean order_medicine_icon_tile_isVisible()
	{
		try {
			return Dashboard_tile_order_medicines_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean book_diagnostics_icon_tile_isVisible()
	{
		try {
			return Dashboard_tile_book_diagnostics_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean Add_Ons_icon_tile_isVisible()
	{
		try {
			return Dashboard_tile_Add_Ons_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean medical_records_icon_tile_isVisible()
	{
		try {
			return Dashboard_tile_medical_records_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}


	public Boolean bookConsultation_description_tile_isVisible()
	{
		try {
			return Dashboard_tile_book_consultation_description.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean my_appointments_description_tile_isVisible()
	{
		try {
			return Dashboard_tile_my_appointments_description.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean chat_with_doctor_description_tile_isVisible()
	{
		try {
			return Dashboard_tile_chat_with_doctor_description.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean order_medicines_description_tile_isVisible()
	{
		try {
			return Dashboard_tile_order_medicines_description.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean book_diagnostics_description_tile_isVisible()
	{
		try {
			return Dashboard_tile_book_diagnostics_description.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean add_ons_description_tile_isVisible()
	{
		try {
			return Dashboard_tile_add_ons_description.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean medical_records_description_tile_isVisible()
	{
		try {
			return Dashboard_tile_medical_records_description.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}

	public Boolean download_the_app_text_tile_isVisible()
	{
		try {
			return Dashboard_tile_download_the_app_text.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean downloadapp_below_description_tile_isVisible()
	{
		try {
			return Dashboard_tile_description_below_downloadapp_text.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean mobile_number_field_tile_isVisible()
	{
		try {
			return Dashboard_tile_mobile_number_field.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean get_download_link_tile_isVisible()
	{
		try {
			return Dashboard_tile_get_download_link.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean google_play_link_button_tile_isVisible()
	{
		try {
			return Dashboard_tile_google_play_link.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean app_store_link_button_tile_isVisible()
	{
		try {
			return Dashboard_tile_app_store_link.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean TopMenu_option_button_isVisible()
	{
		try {
			return TopMenu_options.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean LeftNavigation_dashboard_Icon_isVisible()
	{
		try {
			return LeftNavigation_dashboard_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean LeftNavigation_appointments_Icon_isVisible()
	{
		try {
			return LeftNavigation_appointments_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean LeftNavigation_chats_Icon_isVisible()
	{
		try {
			return LeftNavigation_chats_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean LeftNavigation_medical_records_Icon_isVisible()
	{
		try {
			return LeftNavigation_medical_records_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean LeftNavigation_vitals_Icon_isVisible()
	{
		try {
			return LeftNavigation_vitals_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean LeftNavigation_orders_Icon_isVisible()
	{
		try {
			return LeftNavigation_orders_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean LeftNavigation_diagnostics_history_Icon_isVisible()
	{
		try {
			return LeftNavigation_diagnostics_history_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean LeftNavigation_select_plan_Icon_isVisible()
	{
		try {
			return LeftNavigation_select_plan_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean LeftNavigation_billing_history_Icon_isVisible()
	{
		try {
			return LeftNavigation_billing_history_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean LeftNavigation_family_Icon_isVisible()
	{
		try {
			return LeftNavigation_family_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean LeftNavigation_profile_Icon_isVisible()
	{
		try {
			return LeftNavigation_profile_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean LeftNavigation_settings_Icon_isVisible()
	{
		try {
			return LeftNavigation_settings_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public Boolean LeftNavigation_customer_care_Icon_isVisible()
	{
		try {
			return LeftNavigation_customer_care_Icon.isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} return false;

	}
	
	public void LeftNav_Settings_inside_click()
	{

		LeftNavigation_settings_inside.click();
	}
	




}
