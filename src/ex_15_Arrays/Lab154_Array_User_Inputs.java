package ex_15_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array (int) only");
        int size = sc.nextInt();

        int [] number_marks = new int[size]; // int[] array = new int[size]
        for (int i=0; i < number_marks.length ; i++){
        System.out.println("Enter the number");
        number_marks[i]= sc.nextInt();
    }
        System.out.println("-------");
        for (int i=0 ; i< number_marks.length; i ++){
            System.out.println(number_marks[i]);
        }
    }
}
