package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Factorial Number");
        int num = scanner.nextInt();

        int factorial = 1;
        if (factorial <= 0){
            System.out.println(factorial);
        }else {
            for (int i = 1; i<=num; i++){
                factorial = factorial * i;
                System.out.print(factorial+" ");
            }


        }
        System.out.println("\n Factorial value is : " +factorial);

        scanner.close();
    }
}
