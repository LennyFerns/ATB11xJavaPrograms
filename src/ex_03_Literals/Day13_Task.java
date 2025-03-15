package ex_03_Literals;

import java.util.Scanner;

public class Day13_Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Score:");
        int Score = scanner.nextInt();

        String grade = (Score >= 90) ? "A" : (Score >= 80) ? "B" : (Score >= 70) ? "C" : (Score >= 60) ? "D" : "F";

        System.out.println("Your grade is : "+grade);
    }
}
