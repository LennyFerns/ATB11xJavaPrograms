package ex_03_Literals;

public class Day12th_Task {
    public static void main(String[] args) {
        double x = 10;
        double y = 10;
        double z = 10;

        double result ;
        double xSquared = Math.pow(x,2);
        double ySquared = Math.pow(y,2);
        double absoluteZ = Math.abs(z);


        result = Math.cbrt(xSquared+ySquared-absoluteZ);
        System.out.println(result);



    }
}
