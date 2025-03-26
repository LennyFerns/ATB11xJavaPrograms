package ex_11_While;

public class Task_reverse_charArray {
    public static void main(String[] args) {
        String original = "Madam";
        char [] chars= original.toCharArray();
        for (int i = 0, j = chars.length-1; i < j; i++, j--){
            char temp = chars[i];

            System.out.println(temp);

        }


    }
}
