package ex_07_Increment_Decrement_Op;

public class Task005_UserInput_max_value {
    public static void main(String[] args) {
        int value1= Integer.parseInt(args[0]);
        int value2= Integer.parseInt(args[1]);

        System.out.println(value1>value2 ? "value1 is MAX": "Value2 is max");

    }
}
