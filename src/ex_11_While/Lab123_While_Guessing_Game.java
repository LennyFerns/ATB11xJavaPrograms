package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1;
        //System.out.println(numberToGuess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int guess;
        int attempts = 0;

        while (true) {
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too Low try again");
            } else if (guess > numberToGuess) {
                System.out.println("Too High try again");
            } else {
                System.out.println("Right Guess!!! in " + attempts + " attempts");
                break;
            }
        }
    }
}
