package Scenario_Component;

import java.io.IOException;


import Generic_Component.*;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.Map;


public class Scenario_CheckURLs extends Base_Class{
	
	public static Logger log= Logger.getLogger(Scenario_CheckURLs.class);
	SoftAssert sAssert= new SoftAssert();
	
	
	@Test(dataProvider="dp_PageTitle" , dataProviderClass=DataProvider_Component.DataProvider_Login.class, groups={"smoke"}, priority=10)
	public void testurl_User(@SuppressWarnings("rawtypes") Map search) throws IOException, InterruptedException{
		
		String TC_ID = search.get("TC_ID").toString();
		String Order_Set = search.get("Order_Set").toString();
	
		
		
		open_DocOnline_User_WebApp();
		
		extenttest =  extentreport.startTest(TC_ID);
		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully");
		
		String LoginPage_Title = driver.getTitle();
		
		System.out.println("The actual Page title displayed is :" + LoginPage_Title);
		
		String Implemented_PageTitle = "User Login - DocOnline"; 
	
		if(LoginPage_Title.equals(Implemented_PageTitle)) {
			
			log.info("Passed as Actual Result is "+LoginPage_Title  + "  Expected Result is  " +Implemented_PageTitle);
			Capture_Screenshot1(TC_ID, Order_Set);
			
			extenttest.log(LogStatus.PASS, "Passed as Actual Result is "+LoginPage_Title  + "  Expected Result is  " +Implemented_PageTitle);
		}
		
		else {
			
			log.info("Failed as Actual Result is "+LoginPage_Title  + "  Expected Result is  " +Implemented_PageTitle);
			Capture_Screenshot1(TC_ID, Order_Set);
			
			extenttest.log(LogStatus.FAIL, "Passed as Actual Result is "+LoginPage_Title  + "  Expected Result is  " +Implemented_PageTitle,
					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
		}
		
		System.gc();
		sAssert.assertAll();
		quit_execution();
	} 
	


//	@Test(dataProvider="dp_PageTitle" , dataProviderClass=DataProvider_Component.DataProvider_Login.class, groups={"smoke"})
//	public void testurl_Employer(Map search) throws IOException, InterruptedException{
//		
//		String TC_ID = search.get("TC_ID").toString();
//		String Order_Set = search.get("Order_Set").toString();
//		String Base_Url = search.get("Base_Url").toString();
//		
//	
//				
//		
//		open_DocOnline_User_WebApp();
//		
//		extenttest =  extentreport.startTest(TC_ID);
//		extenttest.log(LogStatus.PASS, "DocOnline User Application opened successfully");
//		
//		String LoginPage_Title = driver.getTitle();
//		
//		System.out.println("The actual Page title displayed is :" + LoginPage_Title);
//		
//		String Implemented_PageTitle = "User Login - DocOnline"; 
//	
//		if(LoginPage_Title.equals(Implemented_PageTitle)) {
//			
//			log.info("Passed as Actual Result is "+LoginPage_Title  + "  Expected Result is  " +Implemented_PageTitle);
//			Capture_Screenshot1(TC_ID, Order_Set);
//			
//			extenttest.log(LogStatus.PASS, "Passed as Actual Result is "+LoginPage_Title  + "  Expected Result is  " +Implemented_PageTitle,
//					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
//		}
//		
//		else {
//			
//			log.info("Failed as Actual Result is "+LoginPage_Title  + "  Expected Result is  " +Implemented_PageTitle);
//			Capture_Screenshot1(TC_ID, Order_Set);
//			
//			extenttest.log(LogStatus.FAIL, "Passed as Actual Result is "+LoginPage_Title  + "  Expected Result is  " +Implemented_PageTitle,
//					extenttest.addScreenCapture(Capture_Screenshot1(TC_ID, Order_Set)));
//		}
//		
//		
//		sAssert.assertAll();
//	} */


}
