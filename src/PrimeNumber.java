import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int userInput;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number");
        userInput = kb.nextInt();

        boolean isPrime = true;
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
            System.out.println(userInput + " is a prime");//run no matter what
        }

    }//end main
}//end class

