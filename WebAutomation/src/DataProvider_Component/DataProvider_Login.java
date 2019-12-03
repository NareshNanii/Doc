package DataProvider_Component;

import Generic_Component.Base_Class;
import Generic_Component.Excel_ReadWrite;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.*;


public class DataProvider_Login extends Base_Class{
	
	@DataProvider(name = Login_dp_LoginUI)
	public static Iterator<Object[]> getvalidUIdata() throws IOException
	{
		List<Object[]> Obj = flagRowCount(LOGIN_dp_Script_name_LoginUI);
		return Obj.iterator();
	
	}
	
	
	
	@DataProvider(name = LOGIN_dp_ValidLogin)
	public static Iterator<Object[]> getvalidLogindataforEmail() throws IOException
	{
		List<Object[]> Obj = flagRowCount(LOGIN_dp_Script_name_ValidLogin);
		return Obj.iterator();
		
	}
	
	@DataProvider(name = LOGIN_dp_ValidLogin1)
	public static Iterator<Object[]> getvalidLogindataforMRN() throws IOException
	{
		List<Object[]> Obj = flagRowCount(LOGIN_dp_Script_name_ValidLogin1);
		return Obj.iterator();
		
	}
	
	
	@DataProvider(name = LOGIN_dp_ValidLogin2)
	public static Iterator<Object[]> getvalidLogindataforMobile() throws IOException
	{
		List<Object[]> Obj = flagRowCount(LOGIN_dp_Script_name_ValidLogin2);
		return Obj.iterator();
		
	}
	
	

	@DataProvider(name = LOGIN_dp_InValidlogin)
	public static Iterator<Object[]> getInValidSearchdata() throws IOException
	{
		List<Object[]> Obj = flagRowCount(LOGIN_dp_Script_name_InValidLogin);
		return Obj.iterator();
		
	}
	
	@DataProvider(name = LOGIN_dp_PageTitle)
	public static Iterator<Object[]> getPagetitledata() throws IOException
	{
		List<Object[]> Obj = flagRowCount(LOGIN_dp_Script_name_PageTitle_User);
		return Obj.iterator();
		
	}
	
	
	@DataProvider(name = LOGIN_dp_InValidLogin_EmptyEmail)
	public static Iterator<Object[]> getInvalidemptyemaildata() throws IOException
	{
		List<Object[]> Obj = flagRowCount(LOGIN_dp_Script_name_InValidLogin_EmptyEmail);
		return Obj.iterator();
		
	}
	
	
	@DataProvider(name = LOGIN_dp_InValidLogin_EmptyPassword)
	public static Iterator<Object[]> getInvalidemptypassworddata() throws IOException
	{
		List<Object[]> Obj = flagRowCount(LOGIN_dp_Script_name_InValidLogin_EmptyPassword);
		return Obj.iterator();
		
	}
	
	
	@DataProvider(name = LOGIN_dp_InValidLogin_EmptyAll)
	public static Iterator<Object[]> getInvalidemptyalldata() throws IOException
	{
		List<Object[]> Obj = flagRowCount(LOGIN_dp_Script_name_InValidLogin_EmptyAll);
		return Obj.iterator();
		
	}
	
	
	
	
	
	public static List<Object[]> flagRowCount(String Scriptname) throws IOException
	{
		
		Excel_ReadWrite xl= new Excel_ReadWrite(Excel_data_PATH);
		HSSFSheet Scenario_Login = xl.Setsheet(EXCEL_SHEET_NAME_LOGIN);
		
		int RowCount = xl.getrowcount(Scenario_Login);
		int ColCount = xl.getcolcount(Scenario_Login, 0);
		
		//Create a List of Object array
		List<Object[]> List_Search= new ArrayList<Object[]>();
		
		for(int iRow=1;iRow<=RowCount;iRow++)
		{
			String Execute_Flag = xl.Readvalue(Scenario_Login, iRow, EXCEL_EXECUTE_FLAG_TEXT);
			String Script_name = xl.Readvalue(Scenario_Login, iRow, EXCEL_SCRIPT_NAME_TEXT);
			
			if((Execute_Flag.equals(EXECUTE_FLAG_Y))&&(Script_name.equals(Scriptname)))
			{
				Map<String,String> dsMap= new HashMap<String,String>();
				
				for(int jcol=0;jcol<=ColCount;jcol++)
				{
					
					String Skey = xl.Readvalue(Scenario_Login, 0, jcol);
					String Value = xl.Readvalue(Scenario_Login, iRow, jcol);
					
					dsMap.put(Skey, Value);
					
				}//end of for
				
				Object[] x= new Object[1];
				x[0]=dsMap;
				List_Search.add(x);
				
			}//end of  if
			
		}//end of for
		
		
		return List_Search;
		
		
	}
	
	
	
	

}
