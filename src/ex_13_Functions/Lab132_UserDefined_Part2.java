package ex_13_Functions;

public class Lab132_UserDefined_Part2 {
    public static void main(String[] args) {
        // User Defined Function

       //1. Without Parameter and Without Return Type
        //2.Without Parameters but with return type
        //3.With Parameters and without Return Type
        //4.With Parameter and with Return Type


        //String msg = greet_wp_with_RT();

        //1.Without Argument/ Parameters and without Return Type
        wp_wrp_greet();

        //2.Without Parameters but with return type
        String msg = wp_RT_greet();
        System.out.println(msg);

        //3.With Parameters and without Return Type
        wp_withoutRT("Lenny",34,4500);
        wp_withoutRT("Priyanka",25,4500);

        wp_withoutRT_greet_with_fullName("Lennox","Fernandes");
        wp_withoutRT_greet_with_fullName("Priyanka","Revankar");

        //4.With Parameter and with Return Type
        int sum = wp_wRT_Sum_of_two_numbers(2,3);
        System.out.println(sum);

        int sum_of_three_num = wp_wRT_Sum_of_three_numbers(2,3,4);
        System.out.println(sum_of_three_num);

        int result = Math.max(3,4); // 4th type




    }

    //1. Without Parameter and Without Return Type
    static void wp_wrp_greet(){
        System.out.println("Hi, How are you! ");
    }

    //2.Without Parameters but with return type
    static String wp_RT_greet(){
        System.out.println("Hi");
        return "Hi, how are you!";
    }

    //3.With Parameters and without Return Type
    static void wp_withoutRT(String name, int age, double salary){
        System.out.println("your name is: "+name+ " , age: "+age+" , Salary: "+salary);
    }

    static void  wp_withoutRT_greet_with_fullName(String firstname, String lastname){
        System.out.println("Hi your Fullname is : "+firstname +" " +lastname);
    }

    //4.With Parameter and with Return Type
    static int wp_wRT_Sum_of_two_numbers(int a, int b){
        return a+b;
    }

    static int wp_wRT_Sum_of_three_numbers(int a, int b, int c){
        return a+b+c;
    }



}