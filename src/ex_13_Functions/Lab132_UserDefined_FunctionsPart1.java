package ex_13_Functions;

public class Lab132_UserDefined_FunctionsPart1 {
    public static void main(String[] args) {
        int r1 = sum_of_two_numbers(3, 4);
        int r2 =sum_of_two_numbers(5,5);

        System.out.println(r1);
        System.out.println(r2);
    }


        static int sum_of_two_numbers(int a, int b){
            return a+b;
        }
    }

