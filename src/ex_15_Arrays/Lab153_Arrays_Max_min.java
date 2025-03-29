package ex_15_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Max_min {
    public static void main(String[] args) {
        int [] arrayNumbers = {25,14,56,15,36,56,77,18,29,49};

        Arrays.sort(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));

        int max= give_me_maximium(arrayNumbers);
        System.out.println("Maximun: "+max);

        int min= give_me_minimum(arrayNumbers);
        System.out.println("Minimum: "+min);

    }

    private static int give_me_minimum(int[] arrayNumbers) {
        int min = arrayNumbers[0];
        for (int i = 0; i < arrayNumbers.length; i++){
            if (arrayNumbers[i]< min) {
                min=arrayNumbers[i];

            }
        }
        return min;
    }



    private static int give_me_maximium(int [] arrayNumbers) {
        int max = arrayNumbers[0];
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > max) {
                max = arrayNumbers[i];

            }

        }
        return max;
    }
}



