package ex_07_Increment_Decrement_Op;

import java.util.Scanner;

public class Task006_UserInput_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("the number entered is even");
        } else {
            System.out.println("the number entered is odd");
        }


    }
}
