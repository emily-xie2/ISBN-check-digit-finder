/**
 * [ISBNCheckDigit.java]
 * Finds the check digit of the first 9-digits of an ISBN code
 * @author Emily Xie
 * @version Feb 2022
 */
// Import classes
import java.util.Scanner;

public class ISBNCheckDigit {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        // Ask for 9-digit ISBN code
        System.out.println("Enter 9-digit ISBN code: ");
        String isbnNumber = myObj.nextLine();  
        
        // Check if 9-digits
        if (isbnNumber.length() != 9){
            System.out.println("Wrong input.");
        } 
        else {
            // Declare variables and constants
            int isbnSum = 0; 
            int weightDigit = 10; 
            int divisorDigit = 100000000; 
            int isbnInteger = Integer.parseInt(isbnNumber); 
            final int ISBN_LENGTH = 9;
            
            // Calculate the weighted sum
            for (int i = 0; i < ISBN_LENGTH; i++) {
                int isbnDigit = isbnInteger/divisorDigit;
                isbnInteger = isbnInteger - (isbnDigit*divisorDigit);
                divisorDigit = divisorDigit/10;
                int productDigit = isbnDigit * weightDigit;
                isbnSum = isbnSum + productDigit;
                weightDigit = weightDigit - 1;
            }
            
            // Calculate the remainder
            int sumRemainder = isbnSum % 11; 
            
            // Check digit cannot be 11, print 0 if the remainder is 0
            if (sumRemainder == 0) {
                System.out.println("The complete 10-digit ISBN code is: " + isbnNumber + "-0");
                }
            else {
                // Find check digit of a value of 1-10
                int checkDigit = 11 - sumRemainder;
                
                // Determine whether to print a value of 1-9 or X
                if (checkDigit == 10) { 
                    System.out.println("The complete 10-digit ISBN code is: " + isbnNumber + "-X");
                }
                else {
                    System.out.println("The complete 10-digit ISBN code is: " + isbnNumber + "-" + checkDigit);
                }
            }
        }
    }
}