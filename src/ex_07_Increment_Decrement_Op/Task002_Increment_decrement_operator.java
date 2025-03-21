package ex_07_Increment_Decrement_Op;

public class Task002_Increment_decrement_operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++); // 11 + 11(value is now 12)+ 12(value is incremented to 13)
        System.out.println(a);
    }
}
