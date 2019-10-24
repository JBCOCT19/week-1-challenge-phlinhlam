//Problem: while loop works when user chooses to generate random number,
//but when user choose to input, it still prints out the right result
//and run the loop again, but it fails to take user input
//for whether they want to try again

import java.util.Scanner;
import java.util.Random;

public class PrimeNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner kb = new Scanner(System.in);
        int userInput;
        String yesNo, start, start1;
        boolean isPrime = true;
        boolean againOrNot = true;
        int randomNum = 1 + rand.nextInt((250 - 1) + 1);

        while(againOrNot == true) {
            System.out.println("Would you like to generate a random number or input a number? (R/I)");
            yesNo = kb.nextLine();
            yesNo.toLowerCase();

            switch (yesNo) {
                case "r":
                    System.out.println("Generating random number....");
                    if (randomNum > 2) {
                        for (int i = 2; i <= (randomNum / 2); i++) {
                            if (randomNum % i == 0) {
                                isPrime = false;
                                System.out.println(randomNum + " is not a prime");
                                break;
                            }
                        }//end for
                    }//end if
                    if (isPrime == true) {
                        System.out.println(randomNum + " is a prime");//run no matter what
                    }
                    break;//break out of case r
                case "i":
                    System.out.println("Please enter a number");
                    userInput = kb.nextInt();
                    if (userInput > 2) {
                        for (int i = 2; i <= (userInput / 2); i++) {
                            if (userInput % i == 0) {
                                isPrime = false;
                                System.out.println(userInput + " is not a prime");
                                break;
                            }
                        }//end for
                    }//end if
                    if (isPrime == true) {
                        System.out.println(userInput + " is a prime");
                    }
                    break;//break out of case i

            }//end switch case

            System.out.println("Would you like to try again? (Y/N)");
            start1 = kb.nextLine();

            switch (start1.toLowerCase()) {
                case "y":
                    againOrNot = true;
                    break;
                case "n":
                    System.out.println("Exiting the program");
                    againOrNot = false;
                    break;
            }//end switch to ask if want to continue

        }// end while
    }//end main
}//end class

