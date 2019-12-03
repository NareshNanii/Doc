package DataProvider_Component;


import Generic_Component.Base_Class;
import Generic_Component.Excel_ReadWrite;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.*;

public class DataProvider_Dashboard extends Base_Class{
	
	@DataProvider(name = Dashboard_dp_DashboardUI)
	public static Iterator<Object[]> getvalidUIdata() throws IOException
	{
		List<Object[]> Obj = flagRowCount(Dashboard_dp_Script_name_DashboardUI);
		return Obj.iterator();
		
	}
	
	
	
	public static List<Object[]> flagRowCount(String Scriptname) throws IOException
	{
		
		Excel_ReadWrite xl= new Excel_ReadWrite(Excel_data_PATH);
		HSSFSheet Scenario_Dashboard = xl.Setsheet(EXCEL_SHEET_NAME_Scenario_Dashboard);
		
		int RowCount = xl.getrowcount(Scenario_Dashboard);
		int ColCount = xl.getcolcount(Scenario_Dashboard, 0);
		
		//Create a List of Object array
		List<Object[]> List_Search= new ArrayList<Object[]>();
		
		for(int iRow=1;iRow<=RowCount;iRow++)
		{
			String Execute_Flag = xl.Readvalue(Scenario_Dashboard, iRow, EXCEL_EXECUTE_FLAG_TEXT);
			String Script_name = xl.Readvalue(Scenario_Dashboard, iRow, EXCEL_SCRIPT_NAME_TEXT);
			
			if((Execute_Flag.equals(EXECUTE_FLAG_Y))&&(Script_name.equals(Scriptname)))
			{
				Map<String,String> dsMap= new HashMap<String,String>();
				
				for(int jcol=0;jcol<=ColCount;jcol++)
				{
					
					String Skey = xl.Readvalue(Scenario_Dashboard, 0, jcol);
					String Value = xl.Readvalue(Scenario_Dashboard, iRow, jcol);
					
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
