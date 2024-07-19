class DataBase{
	
	
		public static void emails(){
			String email1 = "john.doe@gmail.com";
			String email2 = "jane.smith@yahoo.com";
			String email3 = "emma.johnson@hotmail.com";
			String email4 = "michael.brown@outlook.com";
			String email5 = "sarah.wilson@icloud.com";
			String email6 = "contact@companyname.com";
			String email7 = "support@businessname.org";
			String email8 = "info@corporation.net";
			String email9 = "sales@startup.io";
			String email10 = "hr@enterprise.co";
			String email11 = "student1@university.edu";
			String email12 = "professor.jones@college.edu";
			String email13 = "admissions@school.edu";
			String email14 = "research.dept@institute.edu";
			String email15 = "library@academy.edu";
			String email16 = "engineering@websolutions.io";
			String email17 = "qa.team@devcompany.net";
			String email18 = "admin@cybersecurity.org";
			String email19 = "editor@newspaper.com";
			String email20 = "reporter@newsagency.org";
			
			String[] arr = {email1, email2, email3, email4, email5, email6, email7, email8, email9, email10, email11, email12, email13, email14, email15, 
			email16, email17, email18, email19, email20};
			
			for(int i = 0; i <= arr.length; i++){
				System.out.println(arr[i]);
			}
	}
		
	
 	public static void main(String[] args){
			emails();
	}
}