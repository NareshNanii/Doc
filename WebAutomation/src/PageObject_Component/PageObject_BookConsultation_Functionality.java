package PageObject_Component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject_BookConsultation_Functionality {
	public WebDriver driver;

	public PageObject_BookConsultation_Functionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'My Self')]")
	public WebElement active_myself;

	@FindBy(xpath = "//span[contains(text(),'Video')]")
	public WebElement video_call;
	
	@FindBy(xpath = "//span[contains(text(),'Audio')]")
	public WebElement audio_call;

	@FindBy(xpath = "//div[@class='field has-padding-x-3']//button[@type='button']")
	public WebElement schedule_time;

	@FindBy(xpath = "//a[@class='dropdown-item is-active']")
	public WebElement click_current_date;

	@FindBy(xpath = "//span[contains(text(),'07:00')]")
	public WebElement select_time;


	@FindBy(xpath = "//textarea[@id='additional_notes']")
	public WebElement add_notes;

	@FindBy(xpath = "//button[@id='btn_book_consultation']")
	public WebElement book_consultation;


	@FindBy(xpath = "//span[contains(text(),'PM')]")
	public WebElement select_PM;

	@FindBy(xpath = "//tr[3]//td[2]//strong[1]")
	public WebElement consultation_date;

	@FindBy(xpath = "//button[@class='button is-primary']")
	public WebElement consent_accept;

	@FindBy(xpath = "//span[contains(text(),'Waiting Room')]")
	public WebElement waiting_time;


	@FindBy(xpath = "//input[@id='upload_files']")
	public WebElement upload_file;
	
	@FindBy(xpath = "//span[contains(text(),'Telephone')]")
	public WebElement Telephone_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Internet')]")
	public WebElement Internet_Button;
	
	@FindBy(xpath = "//span[@class='check is-primary']")
	public WebElement Language_Toggle;
	
	
	@FindBy(xpath = "//span[@class='check']")
	public WebElement Allow_doctor_Toggle;
	
	
	
	@FindBy(xpath = "//div[@class='modal is-active']//div[3]//label[1]//span[1]")
	public WebElement click_new_consultation;
	
	@FindBy(xpath = "//button[@id='follow_up_ok']")
	public WebElement Ok_button;
	



	public boolean check_myself() {
		try {
			return active_myself.isEnabled();
		}
		catch(Exception e){
			e.printStackTrace();
		}return false;
	}


	public boolean check_video() {
		try {
			return video_call.isEnabled();
		}
		catch(Exception e){
			e.printStackTrace();
		}return false;
	}

	public void schedule_time() {
		try {
			schedule_time.click();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public void Audio_Call() {
		try {
			audio_call.click();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	public void current_date() {
		try {
			click_current_date.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void time_select() {
		try {
			select_time.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void add_note(String note) {
		try {
			add_notes.sendKeys(note);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void Book_consultation() {
		try {
			book_consultation.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public boolean waiting_Time() {
		try {
			return waiting_time.isDisplayed();
		}
		catch(Exception e){
			e.printStackTrace();
		}return false;
	}


	public String consultation_Date() {
		try {
			return consultation_date.getText();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void consent_Accept() {
		try {
			consent_accept.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void select_pm() {
		try {
			select_PM.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void upload_File(String path) {
		try {		

			//File f = new File(path);
			upload_file.sendKeys(path);	
		}		catch(Exception e) {
			e.printStackTrace();
		}
	}


	public void Telephone_button() {
		try {
			Telephone_Button.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public boolean Internet_button() {
		try {
		return	Internet_Button.isDisplayed();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void select_Language() {
		try {
			Language_Toggle.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void new_consultation_button() {
		try {
			click_new_consultation.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void ok_button() {
		try {
			Ok_button.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void Allow_doctor() {
		try {
			Allow_doctor_Toggle.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	


}
