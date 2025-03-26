package ex_11_While;

import java.util.Scanner;

public class Task_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = scanner.nextInt();

        int first = 0;
        int second = 1;
        System.out.println("Fibonacci Sequence: " + first + " " + second);

        for (int i = 2; i < num; i++) {
            int next = first + second;
            System.out.print(" "+next);
            first = second;
            second = next;


        }
        scanner.close();

        {
        }
    }
}
