package ex_11_While;

public class Task_reverse_charArray {
    public static void main(String[] args) {
        String original = "Madam";
        char [] chars= original.toCharArray();
        for (int i = 0, j = chars.length-1; i < j; i++, j--){
            char temp = chars[i];
            chars[i] = chars[j]; //moves the right character to the left position
            //First iteration (i=0, j=4):
            //Swap 'H' and 'O' → ['O','E','L','L','H']
            chars[j] = temp;
            String reversed = new String(chars);

            System.out.println(reversed);

        }



    }
}
