package ex_15_Arrays;

public class Lab156_Sum_Of_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10};
        int sum = 0;
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum = sum + numbers[i];
        }
        System.out.println("Sum: " + sum);


        System.out.println("-------");
        for (int n: numbers){   //Enhanced for loop
            total = total+n;

        }
        System.out.println("Total Array: "+total);

    }

}
