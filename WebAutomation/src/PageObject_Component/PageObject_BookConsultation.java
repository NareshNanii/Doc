package PageObject_Component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject_BookConsultation {
	
	public WebDriver driver;
	
	public PageObject_BookConsultation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//label[contains(text(),'Whom would you like to book for?')]")
	public WebElement book_for_text;
	
	@FindBy(xpath = "//label[contains(text(),'What mode of consultation would you prefer?')]")
	public WebElement mode_consultation_text;
	
	@FindBy(xpath = "//label[contains(text(),'Would you like to book an appointment today or sch')]")
	public WebElement schedule_time_text;
	
	@FindBy(xpath = "//span[contains(text(),'My Self')]")
	public WebElement My_Self_Button;
	
	@FindBy(xpath = "//button[contains(text(),'Family Member')]")
	public WebElement family_member_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Video')]")
	public WebElement Video_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Audio')]")
	public WebElement Audio_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Waiting Room')]")
	public WebElement waiting_room_Button;
	
	@FindBy(xpath = "//div[@class='field has-padding-x-3']//button[@type='button']")
	public WebElement schedule_Button;
	
	@FindBy(xpath = "//button[@id='btn_book_consultation']")
	public WebElement book_consultation_Button;
	
	@FindBy(xpath = "//span[@class='check is-primary']")
	public WebElement preferred_language_toggle_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Use my preferred Language')]")
	public WebElement my_preferred_language_text;
	
	@FindBy(xpath = "//span[@class='check']")
	public WebElement allow_doctor_toggle_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Allow doctor to access my documents')]")
	public WebElement allow_doctor_text;
	
	@FindBy(xpath = "//p[contains(text(),'Your preferred language is')]")
	public WebElement your_preferred_language_text;
	
	@FindBy(xpath = "//div[@class='label is-size-6-mobile is-info-block']")
	public WebElement additional_info_text;
	
	@FindBy(xpath = "//i[@class='fa fa-info-circle']")
	public WebElement additional_info_i;
	
	@FindBy(xpath = "//textarea[@id='additional_notes']")
	public WebElement add_notes_text_field;
	
	@FindBy(xpath = "//span[@class='file-label']")
	public WebElement upload_files_text;
	
	@FindBy(xpath = "//span[contains(text(),'Hindi')]")
	public WebElement language_name_hindi;
	
	@FindBy(xpath = "//a[@class='button is-white']//*[@class='svg-icon svg-fill']")
	public WebElement upload_files_icon;
	
	@FindBy(xpath = "//span[contains (text(),'Minutes')]")
	public WebElement waiting_time_minutes;
	
	
	@FindBy(xpath = "//h5[@class='is-bolder has-padding-x-2 has-text-height-double']")
	public WebElement Health_profile_text;
	
	@FindBy(xpath = "//a[@id='btnUserProfileEditHealth']")
	public WebElement Health_profile_edit_button;
	
	
	@FindBy(xpath = "//span[contains(text(),'New Consultation')]")
	public WebElement New_consultation_text;
	
	
	@FindBy(xpath = "//span[contains(text(),'Is it a second opinion?')]")
	public WebElement Second_opinion_text;
	
	
	@FindBy(xpath = "//span[contains(text(),'Is it a follow up consultation?')]")
	public WebElement Followup_consultation_text;
	
	
	
	@FindBy(xpath = "//div[@id='followUpConsultationModal']//div[1]//label[1]//span[1]")
	public WebElement Followup_consultation_radio_button;
	
	
	@FindBy(xpath = "//div[@class='animation-content']//div[2]//label[1]//span[1]")
	public WebElement Second_opinion_radio_button;
	
	
	
	@FindBy(xpath = "//div[@class='modal is-active']//div[3]//label[1]//span[1]")
	public WebElement New_consultation_radio_button;
	
	
	@FindBy(xpath = "//button[@id='follow_up_ok']")
	public WebElement Ok_button;
	
	
	@FindBy(xpath = "//p[@class='modal-card-title']")
	public WebElement consultation_text_title;
	
	
	
	
	
	
	public boolean Book_for_text_isVisible() {
		try {
			
	return book_for_text.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	
	public boolean Health_profile_text_isVisible() {
		try {
			
	return Health_profile_text.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	
	public boolean Health_profile_edit_button_isVisible() {
		try {
			
	return Health_profile_edit_button.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	
	public boolean Mode_consultation_text_isVisible() {
		try {
			
	return mode_consultation_text.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean schedule_time_text_isVisible() {
		try {
			
	return schedule_time_text.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean my_self_button_isVisible() {
		try {
			
	return My_Self_Button.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean Family_Member_button_isVisible() {
		try {
			
	return family_member_Button.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean video_button_isVisible() {
		try {
			
	return Video_Button.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean audio_button_isVisible() {
		try {
			
	return Audio_Button.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean waiting_room_button_isVisible() {
		try {
			
	return waiting_room_Button.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean schedule_button_isVisible() {
		try {
			
	return schedule_Button.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean book_consultation_button_isVisible() {
		try {
			
	return book_consultation_Button.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean preferred_language_toggle_button_isVisible() {
		try {
			
	return preferred_language_toggle_Button.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean my_preferred_language_text_isVisible() {
		try {
			
	return my_preferred_language_text.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean allow_doctor_toggle_button_isVisible() {
		try {
			
	return allow_doctor_toggle_Button.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean your_preferred_language_text_isVisible() {
		try {
			
	return your_preferred_language_text.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean additional_info_text_isVisible() {
		try {
			
	return additional_info_text.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean additional_info_i_isVisible() {
		try {
			
	return additional_info_i.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean add_notes_text_field_isVisible() {
		try {
			
	return add_notes_text_field.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean upload_files_text_isVisible() {
		try {
			
	return upload_files_text.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean upload_file_icon_isVisible() {
		try {
			
	return upload_files_icon.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean allow_doctor_text_isVisible() {
		try {
			
	return allow_doctor_text.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean language_name_hindi_isVisible() {
		try {
			
	return language_name_hindi.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean waiting_time_minutes_isVisible() {
		try {
			
	return waiting_time_minutes.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean New_consultation_text_isVisible() {
		try {
			
	return New_consultation_text.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	
	public boolean Second_opinion_text_isVisible() {
		try {
			
	return Second_opinion_text.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	
	public boolean Followup_consultation_text_isVisible() {
		try {
			
	return Followup_consultation_text.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	
	
	public boolean Followup_consultation_radio_button_isVisible() {
		try {
			
	return Followup_consultation_radio_button.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	
	public boolean New_consultation_radio_button_isVisible() {
		try {
			
	return New_consultation_radio_button.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	
	public boolean Second_opinion_radio_button_isVisible() {
		try {
			
	return Second_opinion_radio_button.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	
	public boolean Ok_button_isVisible() {
		try {
			
	return Ok_button.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	public boolean consultation_text_title_isVisible() {
		try {
			
	return consultation_text_title.isDisplayed();
	}
		catch(Exception e) {
			e.printStackTrace();
		}return false;
	}
	
	
	
	
}
