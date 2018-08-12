package com.pluralsight.www.game;
import java.util.Scanner;

public class Main {


    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        boolean keepPlaying = true;
        System.out.println("Let's play a guessing game!");
        while (keepPlaying) {
            boolean validInput;
            int number, guess;
            String answer;
            number = (int) (Math.random() * 10) + 1;
            System.out.println("\nI'm thinking of a number" + " between 1 and 10 ");
            System.out.println("What do you think it is");
            do {
                guess = sc.nextInt();
                validInput = true;
                if ((guess < 1) || (guess > 10)) {
                    System.out.print(" I said Between 1 and 10 " + " Try again ");
                    validInput = false;
                }
            } while (!validInput);
            if (guess == number)
                System.out.println("You're RIGHT!");
            else System.out.println("You are wrong!");
            do {
                {
                    System.out.println("\nPlay again? (Y or N) ");
                    answer = sc.next();
                    validInput = true;
                    if (answer.equalsIgnoreCase("Y")) ;
                    else if (answer.equalsIgnoreCase("N" +
                            ""))
                        keepPlaying = false;
                    else
                        validInput = false;

                }
            } while (!validInput);

            System.out.println("\nThank you for playing!");
        }
    }
}

