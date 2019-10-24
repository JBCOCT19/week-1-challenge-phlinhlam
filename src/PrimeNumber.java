import java.util.Scanner;
import java.util.Random;

public class PrimeNumber {
    public static void main(String[] args) {
        int userInput;
        String yesNo;
        boolean isPrime = true;
        Random rand = new Random();
        Scanner kb = new Scanner(System.in);

        System.out.println("Would you like to generate a random number or input a number? (R/I)");
        yesNo = kb.nextLine();
        int randomNum = 1 + rand.nextInt((250-1)+1);
        switch (yesNo)
        {
            case "r":
            case "R":
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
            case "I":
                System.out.println("Please enter a number");
                userInput = kb.nextInt();
                if (userInput  > 2) {
                    for (int i = 2; i <= (userInput / 2); i++) {
                        if (userInput % i == 0) {
                            isPrime = false;
                            System.out.println(userInput + " is not a prime");
                            break;
                        }
                    }//end for
                }//end if
                if (isPrime == true) {
                    System.out.println(userInput + " is a prime");//run no matter what
                }
                break;//break out of case i
        }


    }//end main
}//end class

