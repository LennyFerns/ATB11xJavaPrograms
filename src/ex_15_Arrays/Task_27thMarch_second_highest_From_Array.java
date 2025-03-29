package ex_15_Arrays;

public class Task_27thMarch_second_highest_From_Array {
    public static void main(String[] args) {
        int [] numbers = {25,35,45,55,65,75,85,95,100};
        int firstlargerst = 0;
        int secondlargest = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i]>firstlargerst){
                secondlargest = firstlargerst;
                firstlargerst= numbers[i];
            } else if (numbers[i]>secondlargest && numbers[i]!=firstlargerst) {
                secondlargest =numbers[i];
                
            }


        }
        System.out.println(firstlargerst);
        System.out.println("Second Largest: " +secondlargest);

    }
}
