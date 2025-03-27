package ex_14_Strings;

public class Lab141_String_Interview {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s3));

        System.out.println(s4.equals(s5));

        System.out.println(s4.equalsIgnoreCase(s5));

        System.out.println(s1.length());

        System.out.println(s5.concat(" World"));

        System.out.println(s5.contains("Wo"));

        //Split()
        String name4= "lennox.fernandes@gmail.com";
        String [] split= name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);





    }
}
