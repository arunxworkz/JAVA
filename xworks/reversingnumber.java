public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 1221; // You can change this number to test other cases
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        System.out.println("The reversed number is: "+reversedNumber);
    }
}
