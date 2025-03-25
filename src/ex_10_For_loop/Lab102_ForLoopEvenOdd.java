package ex_10_For_loop;

public class Lab102_ForLoopEvenOdd {
    public static void main(String[] args) {
        for (int i=0; i<=50; i++){
            if (i%2 == 0){
                System.out.println(i+" is Even");
            } else {
                System.out.println(i+ " is Odd");
            }
        }
    }
}
