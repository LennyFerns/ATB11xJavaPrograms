package ex_07_Increment_Decrement_Op;

public class Task004_UserInput_CLI {
    public static void main(String[] args) {
        String Name = args[0];
        int age = Integer.parseInt(args[1]);
        int Salary = Integer.parseInt(args[2]);

        System.out.println("Name: " +Name+ "\n"+"Age: " +age+ "\n"+"Salary: " +Salary+ "\n");

    }
}
