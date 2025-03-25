package ex_07_Increment_Decrement_Op;

import java.util.Scanner;

public class Task007_Classify_Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of 3 sides of the triangle");
        System.out.println("Enter length of side 1: ");
        int side1 = scanner.nextInt();
        System.out.println("Enter length of side 2: ");
        int side2 = scanner.nextInt();
        System.out.println("Enter length of side 3: ");
        int side3 = scanner.nextInt();


        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is Equilateral.");
        } else if ((side1 == side2 || side2 == side3 || side1 == side3)) {
            System.out.println("The triangle is Isosceles");
            
        }
        else {
            System.out.println("The triangle is Scalene.");
        }

        scanner.close();


    }
}
