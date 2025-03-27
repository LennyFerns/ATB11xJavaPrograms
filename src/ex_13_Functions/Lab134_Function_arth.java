package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_arth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter num1");
        int num1= 0;
        if(scanner.hasNextInt()){
           num1 = scanner.nextInt();
        } else {
            System.out.println("Enter Integer value");
            System.exit(0);
        }


        System.out.println("Enter num2");
        int num2 = 0;
        if(scanner.hasNextInt()){
            num2 = scanner.nextInt();
        } else {
            System.out.println("Enter Integer value");
            System.exit(0);
        }


        int result_sum = sum_of_two_numbers(num1,num2);
        System.out.println("Sum = "+result_sum);

        int result_sub = sub_two_numbers(num1,num2);
        System.out.println("Substraction "+num1+ "-" +num2+ " = "+result_sub);

        int result_multiply = multiply_two_numbers(num1,num2);
        System.out.println("Multiply " +num1+ "*" +num2+ " = " +result_multiply);

        int result_divide = divide_two_numbers(num1,num2);
        System.out.println("division "+num1+ "/" +num2+ " = " +result_divide);

        int result_mod = mod(num1,num2);
        System.out.println("mod "+num1+ " % " +num2+ " = " +result_mod);

    }

    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }

    static int sub_two_numbers(int a, int b){
        return a-b;
    }
    static int multiply_two_numbers(int a, int b){
        return a*b;
    }

    static int divide_two_numbers(int a, int b){
        if (b == 0){
            System.out.println("Div by 0 is not allowed");
            System.exit(0);
        }
        return a/b;
    }

    static int mod(int a, int b){
        return a%b;
    }


}
