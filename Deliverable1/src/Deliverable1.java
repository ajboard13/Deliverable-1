import java.util.Scanner;

/**
 * Created by Aaron on 5/22/2017.
 */
public class Deliverable1 {
    public static void main(String[] args) {
        //declaring the int that will be given by the user
        int number;

        //declaring the int that will store the sum of the cubes
        int sumOfCubedDigits;

        //initializing the scanner object
        Scanner input = new Scanner(System.in);

        //check to make sure the user has entered a positive integer
        do {
            System.out.println("Please enter a positive number!");
            while (!input.hasNextInt()) {
                System.out.println("That's not a number!");
                input.next();
            }
            number = input.nextInt();
        } while (number <= 0);

        //use method to create an array of digits from the given number
        int[] digits = separateDigits(number);

        //use method to calculate the sum of the cubes of the individual digits
        sumOfCubedDigits = cubeIndividualDigits(digits);

        //printing some info to show the user
        System.out.printf("the sum of the individual digits is: %d\n", sumOfCubedDigits);
        System.out.printf("Is %d = %d?\n", number, sumOfCubedDigits);

        //if statement to compare the integers
        if (number == sumOfCubedDigits){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }


    //method for separating numbers into arrays of digits
    private static int[] separateDigits(int number){
        char[] digitsAsChars = String.valueOf(number).toCharArray();
        int[] digits = new int[digitsAsChars.length];
        for(int i=0; i< digitsAsChars.length; i++){
            digits[i] = digitsAsChars[i]-48;//convert char to int
        }
        return digits;
    }


    //method for summing the cubes of an array of digits
    private static int cubeIndividualDigits(int[] digits){
        int sumOfCubedDigits = 0;
        for (int digit : digits){
            digit = digit * digit * digit;
            sumOfCubedDigits += digit;
        }
        return sumOfCubedDigits;
    }
}
