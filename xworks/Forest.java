class Forest{
		public static void main(String[] forests){
			
			if(forests.length != 3){
				System.out.println("Provide the required number of entries");
			}
			
			else{
				String forestName = forests[0];
				String forestArea = forests[1];
				String forestState = forests[2];
				System.out.println("NAme: "+forestName+" "+"Area: "+forestArea+" "+"State: "+forestState);
			}
			
			
			
		}
}









/*public class PassingValueToMain {
    public static void main(String[] args) {
        // Ensure that the correct number of arguments are passed
        if (args.length != 4) {
            System.out.println("Please provide exactly four arguments: name, email, age, and password.");
            return;
        }

        // Read the arguments
        String name = args[0];
        String email = args[1];
        int age;
        
        try {
            age = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Age must be a valid integer.");
            return;
        }

        String password = args[3];

        // Display the information entered by the user
        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Password: " + password);
    }
}
*/