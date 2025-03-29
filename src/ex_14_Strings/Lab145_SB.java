package ex_14_Strings;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer stringbuffer = new StringBuffer("Lennox");
        stringbuffer.append("Fernandes");
        System.out.println(stringbuffer);
        System.out.println(stringbuffer.reverse());
        System.out.println(stringbuffer.charAt(7));
    }
}
