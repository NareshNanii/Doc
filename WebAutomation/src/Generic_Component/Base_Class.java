

package Generic_Component;


import atu.testrecorder.ATUTestRecorder;

import atu.testrecorder.exceptions.ATUTestRecorderException;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base_Class implements IAutoConstant{
	
	public static ExtentReports extentreport;
	public static ExtentTest extenttest;
	
	public static WebDriver driver;
	
	static ATUTestRecorder recorder;
	
	
	// To open the DocOnline Web URl
	public static void open_DocOnline_User_WebApp() throws InterruptedException, IOException{
		
		DateFormat dateFormat = new SimpleDateFormat(Date_Formate);
		Date date = new Date();
		try {
			recorder = new ATUTestRecorder(ATUTest_Recorder_PATH, TEXT_VIDEO_TEXT_FILE_NAME + dateFormat.format(date), false);
		} catch (ATUTestRecorderException e) {
			e.printStackTrace();
		} 
		
		Thread.sleep(2000);
		
		// To start video recording of your PC screen.
		try {
			recorder.start();
			System.out.print(CONSOLE_TEXT_VIDEO);
		} catch (ATUTestRecorderException e) {
			e.printStackTrace();
		}
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver = new ChromeDriver();
		 driver.get(URL);
		driver.manage().window().maximize();
		 System.out.println(OPEN_BROWSER_TEXT_CONSOLE);
		 
		
	}
	
	//Wait till an element is found
	public static void Explicit_wait(WebElement ele,long T1)
	{
		WebDriverWait wait= new WebDriverWait(driver, T1);
		wait.until(ExpectedConditions.visibilityOf(ele)).isDisplayed();
		
	}
	
	//To generate html report
	@BeforeSuite
	public static void Report_extent()
	{
		Date date= new Date();
		SimpleDateFormat df= new SimpleDateFormat(Date_Formate);
		
		String Report = df.format(date);
		
		extentreport= new ExtentReports(ExtendReports_PATH +EXTEND_REPORT_FILE_NAME + EXTEND_REPORT_FILE_NAME_SYMBOL + Report + EXTEND_REPORT_FILE_NAME_EXT,false);
		
		
	}
	
	//To capture the screenshots and swtore it in a specific location
	public static String Capture_Screenshot1(String TC_ID,String Order_Set) throws IOException
	{
		Date date= new Date();
		SimpleDateFormat df= new SimpleDateFormat(Date_Formate);
		File file= new File(df.format(date) + SCREENSHOT_PNG);
		
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		String path= ScreenShot_PATH +TC_ID + SCREENSHOT_SYMBOL + Order_Set + SCREENSHOT_SYMBOL + file;
		Files.copy(screenshotAs, new File(path));

		return path;
		
	}
	
	
	public static void send_email_report() 
	{
		 String to="jaswanth.matam@doconline.com";//change accordingly  
		 String to1="anudeep.gunde@doconline.com";//change accordingly
		 String to2="naresh.krishnamoorthy@doconline.com";//change accordingly  
		  final String user="jaswanthmatamtest@gmail.com";//change accordingly  
		  final String password="Doconline@123";//change accordingly  
		  
		  	Properties prop = System.getProperties();  
		  	prop.put("mail.smtp.host", "smtp.gmail.com");
	        prop.put("mail.smtp.port", "587");
	        prop.put("mail.smtp.auth", "true");
	        prop.put("mail.smtp.starttls.enable", "true"); //TLS
		  
		  Session session = Session.getDefaultInstance(prop,  
				   new javax.mail.Authenticator() {  
				   protected PasswordAuthentication getPasswordAuthentication() {  
				   return new PasswordAuthentication(user,password);  
				   }  
				  }); 
		  
		  
		  try{ 
			    MimeMessage message = new MimeMessage(session);  
			    message.setFrom(new InternetAddress(user));  
			    message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
			    message.addRecipient(Message.RecipientType.CC,new InternetAddress(to1)); 
			    message.addRecipient(Message.RecipientType.CC,new InternetAddress(to2)); 
			    message.setSubject("DocOnline Web Automation report");  
			    
			    BodyPart messageBodyPart1 = new MimeBodyPart();  
			    messageBodyPart1.setText("Hi All," + "\n" + "PFA, of the html report of Web Automation execution"); 
			    
			    MimeBodyPart messageBodyPart2 = new MimeBodyPart();  
			    
			    String filename = "/Users/doconline_testing/eclipse-workspace/DocOnline_Web_Automation/WebAutomation/test-output/emailable-report.html";//change accordingly  
			    DataSource source = new FileDataSource(filename);  
			    messageBodyPart2.setDataHandler(new DataHandler(source));  
			    messageBodyPart2.setFileName(filename); 
			    
			    Multipart multipart = new MimeMultipart();  
			    multipart.addBodyPart(messageBodyPart1);  
			    multipart.addBodyPart(messageBodyPart2);
			    
			    message.setContent(multipart );  
			    
			    Transport.send(message);
			    
			    System.out.println("message sent....");
			    
		  }catch (MessagingException ex) {ex.printStackTrace();}  
	 } 
			    
			    
		  
		  
	
	
	//To quit execution
	@AfterSuite
	public static void quit_execution() {
		
		extentreport.endTest(extenttest);
		extentreport.flush();
		driver.quit();
		send_email_report();
		
		
		
		// Stop video recording.
//				try {
//					recorder.stop();
//					System.out.print("Video Recording Stopped");
//				} catch (ATUTestRecorderException e) {
//					e.getCause().getStackTrace();
//				} finally {
//					driver.quit();
//				}
		
	}

}
