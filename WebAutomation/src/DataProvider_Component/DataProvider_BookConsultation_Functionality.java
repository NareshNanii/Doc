package DataProvider_Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import Generic_Component.Base_Class;
import Generic_Component.Excel_ReadWrite;

public class DataProvider_BookConsultation_Functionality extends Base_Class{
	
	@DataProvider(name = Functionality_dp_BookConsultationFunctionality)
	public static Iterator<Object[]> getvalidUIdata() throws IOException
	{
		List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Functionality);
		return Obj.iterator();
		
	}
	
	
	//Book a Consultation through waiting time
	
		@DataProvider(name = Functionality_dp_BookConsultationwaitingtime)
		public static Iterator<Object[]> waitingtime() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Functional);
			return Obj.iterator();
			
		}
	
		
		
		
		//Book a Consultation through waiting time with notes added
		
		@DataProvider(name = Functionality_dp_BookConsultationwaitingtime_notes)
		public static Iterator<Object[]> waitingtime_notes() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Notes);
			return Obj.iterator();
			
		}
		
		
		//check the flow (Click Myself - click video - Schedule call @ 7PM - Click book consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule)
		public static Iterator<Object[]> schedule_video() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click video - Schedule call @ 7PM - upload file - Click book consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_uploadfile)
		public static Iterator<Object[]> upload_file() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_upload);
			return Obj.iterator();
			
		}
		
		
		//check the flow (Click Myself - click video - waiting room - upload file -  Click book consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultationwaitingtime_upload)
		public static Iterator<Object[]> waitingtime_upload() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Upload);
			return Obj.iterator();
			
		}
		
		
		//check
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_note_upload)
		public static Iterator<Object[]> schedule_note_upload() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Note_Upload);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click video - waiting room - add notes - upload files - Click book consultation - get scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultationwaitingtime_note_upload)
		public static Iterator<Object[]> waitingtime_note_upload() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Note_Upload);
			return Obj.iterator();
			
		}
		
		
		//check the flow (Click Myself - click audio - Schedule call @ 7PM - Click book consultation - get scheduled time - Accept it)
		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio)
		public static Iterator<Object[]> audio_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Audio);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click audio - waiting room - Click book consultation - get scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio)
		public static Iterator<Object[]> audio_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Audio);
			return Obj.iterator();
			
		}
		
		
		//check the flow (Click Myself - click audio - add notes - Schedule call @ 7PM - Click book consultation - get scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_note_audio)
		public static Iterator<Object[]> audio_note_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Note_Audio);
			return Obj.iterator();
			
		}
		
		
		//check the flow (Click Myself - click audio - add notes - waiting room - Click book consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_note_audio)
		public static Iterator<Object[]> audio_note_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Note_Audio);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click audio - Schedule call @ 7PM - add files -Click book consultation - get scheduled time - Accept it)		
		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_file_audio)
		public static Iterator<Object[]> audio_file_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_File_Audio);
			return Obj.iterator();
			
		}
		
		
		//check the flow (Click Myself - click audio - Waiting room - add files -Click book consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_file_audio)
		public static Iterator<Object[]> audio_file_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_File_Audio);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click audio - Schedule call @ 7PM - add notes - add files - Click book consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_file_note_audio)
		public static Iterator<Object[]> audio_file_note_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_File_Note_Audio);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click audio - waiting room - add notes - add files - Click book consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_file_note_audio)
		public static Iterator<Object[]> audio_note_file_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_File_Note_Audio);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click audio - click Telephone- Schedule call @ 7PM - Click book consultation - get scheduled time - Accept it)		
		
		@DataProvider(name=Functionality_dp_BookConsultation_schedule_Telephone_audio)
		public static Iterator<Object[]> audio_telephone_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Audio_Telephone);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click audio - click Telephone - waiting room - Click book consultation - get scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_Telephone_audio)
		public static Iterator<Object[]> audio_telephone_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Audio_Telephone);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click audio -click Telephone - add notes - Schedule call @ 7PM - Click book consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_Telephone_audio_notes)
		public static Iterator<Object[]> audio_telephone_notes_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Audio_Telephone_Notes);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click audio- click Telephone - add notes - waiting room - Click book consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_Telephone_audio_Notes)
		public static Iterator<Object[]> audio_telephone_waiting_notes() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Audio_Telephone_Notes);
			return Obj.iterator();
			
		}
		
		
		//check the flow (Click Myself - click audio-click Telephone - Schedule call @ 7PM - Upload files -Click book consultation - get scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_Telephone_audio_upload)
		public static Iterator<Object[]> audio_telephone_upload_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Audio_Telephone_File);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click audio- click Telephone - waiting room - Upload files - Click book consultation - get scheduled time - Accept it)	
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_Telephone_audio_File)
		public static Iterator<Object[]> audio_telephone_waiting_File() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Audio_Telephone_File);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click audio- click Telephone - Schedule call @ 7PM - add notes - add files - Click book consultation - get scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_Telephone_audio_upload_notes)
		public static Iterator<Object[]> audio_telephone_upload_note_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Audio_Telephone_File_Note);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click audio- click Telephone - waiting room - add notes - add files - Click book consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_Telephone_audio_File_Note)
		public static Iterator<Object[]> audio_telephone_waiting_File_Note() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Audio_Telephone_File_Note);
			return Obj.iterator();
			
		}
		
		
		
		//Check the flow (Click Myself - Click Video - Schedule call @ today 7PM - click preferred language - Click book consultation - get Scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_video_lang)
		public static Iterator<Object[]> video_lang_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Language);
			return Obj.iterator();
			
		}
		
		
		
		//Check for the flow (Click Myself - click Video - Waiting room - click Preferred language - Click book consultation - get scheduled time - Accept it)	
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_video_lang)
		public static Iterator<Object[]> video_lang_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Language);
			return Obj.iterator();
			
		}
		
		
		
		//Check the flow (Click Myself - Click Video - Schedule call @ today 7PM - click preferred language - Add note - Click book consultation - get Scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_video_lang_note)
		public static Iterator<Object[]> video_lang_note_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Language_Note);
			return Obj.iterator();
			
		}
		
		
		//Check the flow (Click Myself - Click Video - Waiting Room - click Preferred language -  Add Note - Click book consultation - get schedule time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_video_lang_note)
		public static Iterator<Object[]> video_lang_waiting_note() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Language_Note);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click video - Schedule call @ 7PM - click preferred language - upload file - Click book consultation - get scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_video_lang_file)
		public static Iterator<Object[]> video_lang_file_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Language_File);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click video - waiting room - click Preferred language - upload file -  Click book consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_video_lang_file)
		public static Iterator<Object[]> video_lang_waiting_file() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Language_File);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click video - Schedule call @ 7PM - click preferred language - add notes - upload file - Click book consultation - get scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_video_lang_file_note)
		public static Iterator<Object[]> video_lang_file_note_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Language_File_Note);
			return Obj.iterator();
			
		}
		
		
		
		//check the flow (Click Myself - click video - waiting room - click Preferred language -  add notes - upload files - Click book consultation - get scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_video_lang_file_note)
		public static Iterator<Object[]> video_lang_waiting_file_note() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Language_File_Note);
			return Obj.iterator();
			
		}
		
		
		//check the flow (Click Myself - click audio - Schedule call @ 7PM - Click Preferred language - Click book consultation - get scheduled time - Accept it)			
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_lang)
		public static Iterator<Object[]> Audio_lang_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Language);
			return Obj.iterator();
			
		}
		
		//check the flow (Click Myself - click audio - waiting room - Click Preferred language -  Click book consultation -  New Consultation -get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_lang)
		public static Iterator<Object[]> Audio_lang_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Language);
			return Obj.iterator();
			
		}
		
		//check the flow (Click Myself - click audio  - Schedule call @ 7PM - Click Preferred language - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_lang_note)
		public static Iterator<Object[]> Audio_lang_note_scheduling() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Language_Note);
			return Obj.iterator();
			
		}
		
		//check the flow (Click Myself - click audio  - Waiting room - Click Preferred language - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_lang_note)
		public static Iterator<Object[]> Audio_lang_note_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Language_Note);
			return Obj.iterator();
			
		}
		
		//check the flow (Click Myself - click audio - Schedule call @ 7PM - Click Preferred language - add files -Click book consultation - New Consultation - get scheduled time - Accept it)			
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_lang_file)
		public static Iterator<Object[]> Audio_lang_file_scheduling() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Language_File);
			return Obj.iterator();
			
		}
		
		//check the flow (Click Myself - click audio - Waiting Room - Click Preferred language - add files -Click book consultation - New Consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_lang_file)
		public static Iterator<Object[]> Audio_lang_file_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Language_File);
			return Obj.iterator();
			
		}
		
		//check the flow (Click Myself - click audio - Schedule call @ 7PM - Click Preferred language - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_lang_file_note)
		public static Iterator<Object[]> Audio_lang_file_note_scheduling() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Language_File_Note);
			return Obj.iterator();
			
		}
		
		//check the flow (Click Myself - click audio - Waiting Room - Click Preferred language - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_lang_file_note)
		public static Iterator<Object[]> Audio_lang_file_note_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Language_File_Note);
			return Obj.iterator();
			
		}
		
//check the flow (Click Myself - click audio - click Telephone- Schedule call @ 7PM - Click Preferred language - Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_telephone_lang)
		public static Iterator<Object[]> Audio_telephone_lang_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Audio_Telephone_Language);
			return Obj.iterator();
			
		}
		
		//check the flow (Click Myself - click audio - click Telephone- Waiting Room - Click Preferred language - Click book consultation - New Consultation - get scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_telephone_lang)
		public static Iterator<Object[]> Audio_telephone_lang_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Audio_Telephone_Language);
			return Obj.iterator();
			
		}
		
		//check the flow (Click Myself - click audio -click Telephone  - Schedule call @ 7PM - Click Preferred language - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_telephone_lang_note)
		public static Iterator<Object[]> Audio_telephone_lang_note_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Schedule_Language_Note);
			return Obj.iterator();
			
		}
		
		//check the flow (Click Myself - click audio -click Telephone  - Waiting Room - Click Preferred language - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_telephone_lang_note)
		public static Iterator<Object[]> Audio_telephone_lang_note_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Waiting_Language_Note);
			return Obj.iterator();
			
		}
		
//check the flow (Click Myself - click audio-click Telephone - Schedule call @ 7PM - Click Preferred language - Upload files -Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_telephone_lang_file)
		public static Iterator<Object[]> Audio_telephone_lang_file_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Schedule_Language_File);
			return Obj.iterator();
			
		}
		
//check the flow (Click Myself - click audio - click Telephone - Waiting Room - Click Preferred language - Upload files -Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name=Functionality_dp_BookConsultation_waiting_audio_telephone_lang_file)
		public static Iterator<Object[]> Audio_telephone_lang_file_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Waiting_Language_File);
			return Obj.iterator();
			
		}
		
//check the flow (Click Myself - click audio- click Telephone - Schedule call @ 7PM - Click Preferred language - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_telephone_lang_file_note)
		public static Iterator<Object[]> Audio_telephone_lang_file_note_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Schedule_Language_File_Note);
			return Obj.iterator();
			
		}
		
//check the flow (Click Myself - click audio- click Telephone - Waiting Room - Click Preferred language - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_telephone_lang_file_note)
		public static Iterator<Object[]> Audio_telephone_lang_file_note_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Waiting_Language_File_Note);
			return Obj.iterator();
			
		}
		
		
//Check the flow (Click Myself - Click Video - Schedule call @ today 7PM - click Allow Doctor - Click book consultation - New Consultation -get Scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_video_allowdoctor)
		public static Iterator<Object[]> Video_allow_doctor_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Allowdoctor);
			return Obj.iterator();
			
		}
		
//Check for the flow (Click Myself - click Video - Waiting room - click Allow Doctor - Click book consultation -New Consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_video_allow_doctor)
		public static Iterator<Object[]> Video_allow_doctor_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Allowdoctor);
			return Obj.iterator();
			
		}
		
//Check the flow (Click Myself - Click Video - Schedule call @ today 7PM - click Allow Doctors - Add note - Click book consultation - New Consultation -get Scheduled time - Accept it)			
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_video_allow_doctor_note)
		public static Iterator<Object[]> Video_allow_doctor_note_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Allowdoctor_Note);
			return Obj.iterator();
			
		}
		
//Check the flow (Click Myself - Click Video - Waiting Room - click Allow Doctor -  Add Note - Click book consultation - New Consultation -get schedule time - Accept it)		
		
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_video_allow_doctor_note)
		public static Iterator<Object[]> Video_allow_doctor_note_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Allowdoctor_Note);
			return Obj.iterator();
			
		}
		
//check the flow (Click Myself - click video - Schedule call @ 7PM - click Allow Doctors - upload file - Click book consultation -New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_video_allow_doctor_file)
		public static Iterator<Object[]> Video_allow_doctor_file_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Allowdoctor_File);
			return Obj.iterator();
			
		}
		
//check the flow (Click Myself - click video - waiting room - click Allow Doctors - upload file -  Click book consultation - New Consultation -get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_video_allow_doctor_file)
		public static Iterator<Object[]> Video_allow_doctor_file_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Allowdoctor_File);
			return Obj.iterator();
			
		}

//check the flow (Click Myself - click video - Schedule call @ 7PM - click Allow Doctors - add notes - upload file - Click book consultation - New Consultation -get scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_video_allow_doctor_file_note)
		public static Iterator<Object[]> Video_allow_doctor_file_note_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Allowdoctor_File_Note);
			return Obj.iterator();
			
		}

		
//check the flow (Click Myself - click video - waiting room - click Allow Doctors -  add notes - upload files - Click book consultation - New Consultation -get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_video_allow_doctor_file_note)
		public static Iterator<Object[]> Video_allow_doctor_file_note_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Allowdoctor_File_Note);
			return Obj.iterator();
		}
		

//check the flow (Click Myself - click audio - Schedule call @ 7PM - Click Allow Doctors - Click book consultation - New Consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_allow_doctor)
		public static Iterator<Object[]> Audio_allow_doctor_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Allowdoctor);
			return Obj.iterator();
		}
		

//check the flow (Click Myself - click audio - waiting room - Click Allow Doctors -  Click book consultation -  New Consultation -get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_allow_doctor)
		public static Iterator<Object[]> Audio_allow_doctor_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Allowdoctor);
			return Obj.iterator();
		}
		
	
//check the flow (Click Myself - click audio  - Schedule call @ 7PM - Click Allow Doctors - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_allow_doctor_note)
		public static Iterator<Object[]> Audio_allow_doctor_note_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Allowdoctor_Note);
			return Obj.iterator();
		}
		
//check the flow (Click Myself - click audio  - Waiting room - Click Allow Doctors - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_allow_doctor_note)
		public static Iterator<Object[]> Audio_allow_doctor_note_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Allowdoctor_Note);
			return Obj.iterator();
		}
		
//check the flow (Click Myself - click audio - Schedule call @ 7PM - Click Allow Doctors - add files -Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_allow_doctor_file)
		public static Iterator<Object[]> Audio_allow_doctor_file_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Allowdoctor_File);
			return Obj.iterator();
		}
		
		
//check the flow (Click Myself - click audio - Waiting Room - Click Allow Doctors - add files -Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_allow_doctor_file)
		public static Iterator<Object[]> Audio_allow_doctor_file_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Allowdoctor_File);
			return Obj.iterator();
		}
		
//check the flow (Click Myself - click audio - Schedule call @ 7PM - Click  Allow Doctors - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_allow_doctor_file_note)
		public static Iterator<Object[]> Audio_allow_doctor_file_note_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Schedule_Allowdoctor_File_Note);
			return Obj.iterator();
		}
		
		
//check the flow (Click Myself - click audio - Waiting Room - Click Allow Doctors - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_allow_doctor_file_note)
		public static Iterator<Object[]> Audio_allow_doctor_file_note_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Waiting_Allowdoctor_File_Note);
			return Obj.iterator();
		}
		

		
//check the flow (Click Myself - click audio - click Telephone- Schedule call @ 7PM - Click Allow Doctors - Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_telephone_allow_doctor)
		public static Iterator<Object[]> Audio_telephone_allow_doctor_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Schedule_Audio_Telephone_Allowdoctor);
			return Obj.iterator();
		}
		
//check the flow (Click Myself - click audio - click Telephone- Waiting Room - Click Allow Doctors - Click book consultation - New Consultation - get scheduled time - Accept it)	
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_telephone_allow_doctor)
		public static Iterator<Object[]> Audio_telephone_allow_doctor_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Waiting_Audio_Telephone_Allowdoctor);
			return Obj.iterator();
		}
		
	
//check the flow (Click Myself - click audio -click Telephone  - Schedule call @ 7PM - Click Allow Doctors - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_telephone_allow_doctor_note)
		public static Iterator<Object[]> Audio_telephone_allow_doctor_note_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Schedule_Allowdoctor_Note);
			return Obj.iterator();
		}
		
//check the flow (Click Myself - click audio -click Telephone  - Waiting Room - Click Allow Doctors - add notes - Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_telephone_allow_doctor_note)
		public static Iterator<Object[]> Audio_telephone_allow_doctor_note_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Waiting_Allowdoctor_Note);
			return Obj.iterator();
		}
		
//check the flow (Click Myself - click audio-click Telephone - Schedule call @ 7PM - Click Allow Doctors - Upload files -Click book consultation - New Consultation - get scheduled time - Accept it)
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_telephone_allow_doctor_file)
		public static Iterator<Object[]> Audio_telephone_allow_doctor_file_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Schedule_Allowdoctor_File);
			return Obj.iterator();
		}
		
//check the flow (Click Myself - click audio - click Telephone - Waiting Room - Click Allow Doctors- Upload files -Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_telephone_allow_doctor_file)
		public static Iterator<Object[]> Audio_telephone_allow_doctor_file_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Waiting_Allowdoctor_File);
			return Obj.iterator();
		}
		
//check the flow (Click Myself - click audio- click Telephone - Schedule call @ 7PM - Click Allow Doctors - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		@DataProvider(name = Functionality_dp_BookConsultation_schedule_audio_telephone_allow_doctor_file_note)
		public static Iterator<Object[]> Audio_telephone_allow_doctor_file_note_schedule() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Schedule_Allowdoctor_File_Note);
			return Obj.iterator();
		}
		
		
//check the flow (Click Myself - click audio- click Telephone - Waiting Room - Click Allow Doctors  - add notes - add files - Click book consultation - New Consultation - get scheduled time - Accept it)		
		
		
		@DataProvider(name = Functionality_dp_BookConsultation_waiting_audio_telephone_allow_doctor_file_note)
		public static Iterator<Object[]> Audio_telephone_allow_doctor_file_note_waiting() throws IOException
		{
			List<Object[]> Obj = flagRowCount(Functionality_dp_Script_name_BookConsultation_Audio_Telephone_Waiting_Allowdoctor_File_Note);
			return Obj.iterator();
		}
		
		
		
		
		
		
	
	
	public static List<Object[]> flagRowCount(String Scriptname) throws IOException
	{
		
		Excel_ReadWrite xl= new Excel_ReadWrite(Excel_data_PATH);
		HSSFSheet Scenario_Bookconsultation_Fn = xl.Setsheet(EXCEL_SHEET_NAME_Scenario_BookConsultation_Functionality);
		
		int RowCount = xl.getrowcount(Scenario_Bookconsultation_Fn);
		int ColCount = xl.getcolcount(Scenario_Bookconsultation_Fn, 0);
		
		//Create a List of Object array
		List<Object[]> List_Search= new ArrayList<Object[]>();
		
		for(int iRow=1;iRow<=RowCount;iRow++)
		{
			String Execute_Flag = xl.Readvalue(Scenario_Bookconsultation_Fn, iRow, EXCEL_EXECUTE_FLAG_TEXT);
			String Script_name = xl.Readvalue(Scenario_Bookconsultation_Fn, iRow, EXCEL_SCRIPT_NAME_TEXT);
			
			if((Execute_Flag.equals(EXECUTE_FLAG_Y))&&(Script_name.equals(Scriptname)))
			{
				Map<String,String> dsMap= new HashMap<String,String>();
				
				for(int jcol=0;jcol<=ColCount;jcol++)
				{
					
					String Skey = xl.Readvalue(Scenario_Bookconsultation_Fn, 0, jcol);
					String Value = xl.Readvalue(Scenario_Bookconsultation_Fn, iRow, jcol);
					
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
