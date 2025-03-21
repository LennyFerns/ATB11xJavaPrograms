package ex_07_Increment_Decrement_Op;

public class Task003_Increment_decrement_operator2 {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(--a + a++ + a--); // 19+19(20)+20(19)
        System.out.println(a);
    }
}
