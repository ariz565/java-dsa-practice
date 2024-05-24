// Write a java program to accept a Integer and display the numbers in words form

import java.util.*;

public class IntToWords {

    // create a string array to store the names of the units
    private static final String[] units = { "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen" };

    // create a string array to store the names of the tens
    private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };


            private static String convertLessThanOneThousand(int number) {
                String word = "";
            
                // if the number is zero, return an empty string
                if (number == 0) {
                    return "";
                }
            
                // if the number is greater than or equal to 100, add the word for the hundreds place
                if (number >= 100) {
                    word += units[number / 100] + " Hundred";
                    number %= 100;
                }
            
                // if the number is less than 20, add the word for the units place
                if (number < 20) {
                    word += units[number];
                } else {
                    // otherwise, add the word for the tens place and the units place
                    word += tens[number / 10];
                    if ((number % 10) > 0) {
                        word += "-" + units[number % 10];
                    }
                }
            
                // return the word
                return word;
            }
 
    // // create a method that converts a number less than 1000 into words
    // private static String convertLessThanOneThousand(int number) {
    //     String word = "";

    //     // if the number is zero, return the word for zero
    //     if (number == 0) {
    //         return units[0];
    //     }

    //     // if the number is greater than or equal to 100, add the word for the hundreds
    //     // place
    //     if (number >= 100) {
    //         word += units[number / 100] + " Hundred";
    //         number %= 100;
    //     }

    //     // if the number is less than 20, add the word for the units place
    //     if (number < 20) {
    //         word += units[number];
    //     } else {
    //         // otherwise, add the word for the tens place and the units place
    //         word += tens[number / 10];
    //         if ((number % 10) > 0) {
    //             word += "-" + units[number % 10];
    //         }
    //     }

    //     // return the word
    //     return word;
    // }

    // create a method that converts any number into words
    public static String convert(int number) {

        // if the number is zero, return the word for zero
        if (number == 0) {
            return units[0];
        }

        // create a string to store the final word
        String word = "";

        // if the number is negative, add the word for minus
        if (number < 0) {
            word = "Minus ";
            number = -number;
        }

        // divide the number into billions, millions, thousands and hundreds
        int billion = number / 1000000000;
        int million = (number % 1000000000) / 1000000;
        int thousand = (number % 1000000) / 1000;
        int hundred = number % 1000;

        // if the number has billions, add the word for the billions place
        if (billion > 0) {
            word += convertLessThanOneThousand(billion) + " Billion";
            if (million + thousand + hundred > 0) {
                word += ", ";
            }
        }

        // if the number has millions, add the word for the millions place
        if (million > 0) {
            word += convertLessThanOneThousand(million) + " Million";
            if (thousand + hundred > 0) {
                word += ", ";
            }
        }

        // if the number has thousands, add the word for the thousands place
        if (thousand > 0) {
            word += convertLessThanOneThousand(thousand) + " Thousand";
            if (hundred > 0) {
                word += ", ";
            }
        }

        // if the number has hundreds, add the word for the hundreds place
        if (hundred > 0) {
            word += convertLessThanOneThousand(hundred);
        }

        // return the final word
        return word;
    }

    // create a main method to test the program
    public static void main(String[] args) {

        // create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter an integer
        System.out.print("Please enter an integer: ");

        // read the input as an integer
        int input = scanner.nextInt();

        // close the scanner object
        scanner.close();

        // convert the input into words and print it
        System.out.println("The number in words is: ");
        System.out.println(convert(input));
    }
}
