package bank.Personfolder;

import java.security.SecureRandom;

public class PasswordGeneratior {
    
    private static final String charactersAZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String charactersaz = "abcdefghijklmnopqrstuvwxyz";
    private static final String characters09 = "0123456789";
    private static final String specialCharacter = "@#$%^&*()?/><";

    private static final String finalCharactres = charactersAZ + charactersaz + characters09 + specialCharacter;



    static void passwordGeneratoe(){
        
        SecureRandom sr = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i< 8;i++){
            int index = sr.nextInt(finalCharactres.length());
            sb.append(finalCharactres.charAt(index));
        }

        System.out.println("OAssword is: "+sb.toString());
        
    }

    public static void main(String[] args) {
        passwordGeneratoe();

        String name = "Arun";
        StringBuffer sb = new StringBuffer(name);
        //appending
        sb.append("Belavadi");
        System.err.println(sb);
        //insert - based on index
        sb.insert(0, "Mr. ");
        System.err.println(sb);
        //replace - based on the begin index and end index
        sb.replace(1, 3, "good boy");
        System.err.println(sb);
        //delete - deletes the string from begin index and end index(end index will not be deleted)
        sb.delete(1, 3);
        System.out.println(sb); 
        //reverse - revreses the string
        System.out.println(sb.reverse());

    }


}
