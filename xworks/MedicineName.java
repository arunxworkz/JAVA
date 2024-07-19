class MedicineName{
	
	public static double medicine(String name){
		
		if(name == "paracetomol"){
			return 10.5d;
		}
		
		if(name == "saridon"){
			return 10.5d;
		}
		
		if(name == "jandubam"){
			return 10.5d;
		}
		
		
		
		return 0;
	} 
	
	public static String symptom(String name){
		if(name == "runny nose"){
			return "Paractomel";
		}
		
		if(name == "Headache"){
			return "Influenza";
		}
		
		if(name == "Muscle or body aches"){
			return "COVID-19";
		}
		
		return "Nothing to return";
	}
	
	public static String doctorName(double time){
		if(time == 13.23){
			System.out.println("Doctor is available");
			return "Shobraj";
		}
		
		if(time == 9.30){
			System.out.println("Doctor is available");
			return "Kanthraj";
		}
		
		if(time > 20.30){
			System.out.println("Doctor is not available");
			return "Gopal";
		}
		
		return " nothing to return";
	}
	
	public static void main(String[] args){
		System.out.println(medicine("paracetomol"));
		System.out.println(symptom("Influenza"));
		System.out.println(doctorName(23.25));
	}
}