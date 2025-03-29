package ex_15_Arrays;

import java.util.Arrays;

public class Lab157_Interview_2nd_highest_number_array {
    public static void main(String[] args) {

        int [] numbers = {12,34,10,1,100,3,4,32};


        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        System.out.println("Highest Number: "+numbers[numbers.length-1]);
        System.out.println("Second Highest after sorting: " +numbers[numbers.length-2]);
        System.out.println("3rd Highest after sorting: " +numbers[numbers.length-3]);

    }
}
