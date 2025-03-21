package ex_06_Ternary_operator;

public class Lab067_To_Three_Max {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        int result = n1>n2 ? n1>n3 ? n1 : n3 : ((n2>n3) ? n2 : n3);
        System.out.println("Max number is "+result);

    }
}
