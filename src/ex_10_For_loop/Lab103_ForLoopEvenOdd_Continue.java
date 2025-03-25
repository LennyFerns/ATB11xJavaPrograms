package ex_10_For_loop;

public class Lab103_ForLoopEvenOdd_Continue {
    public static void main(String[] args) {
        for (int i = 0 ; i <= 50; i++){
            if (i%2 == 0){
                continue; //even will be skiped -> or CONTINUE
            }
            System.out.println(" Odd ->" +i);
        }
    }
}
