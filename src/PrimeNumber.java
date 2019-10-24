import java.util.Scanner;
import java.util.Random;

public class PrimeNumber {
    public static void main(String[] args) {
       // int userInput;
        Random rand = new Random();
        //Part1
//        Scanner kb = new Scanner(System.in);
//        System.out.println("Enter a number");
//        userInput = kb.nextInt();
        int randomNum = 1 + rand.nextInt((250-1)+1);
        boolean isPrime = true;
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

    }//end main
}//end class

