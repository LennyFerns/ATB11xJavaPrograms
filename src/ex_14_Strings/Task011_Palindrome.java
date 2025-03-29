package ex_14_Strings;

public class Task011_Palindrome {
    public static void main(String[] args) {
        String word = "Lenny";
        String reverse = reverseString(word); //using reverseString function

        String stringBuilderReverse = stringBuilderSB(word);  //using stringBuilder Reverse  function
        System.out.println(stringBuilderReverse);


        if (reverse.equalsIgnoreCase(word)) {
            System.out.println(reverse + " is a Palindrome");
        } else {
            System.out.println(reverse + "Not a Palindrome");
        }

    }

    //using reverseString function
    private static String reverseString(String word) {
        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            rev = rev + ch;
        }
        return rev;

    }

    //using stringBuilder Reverse  function
    private static String stringBuilderSB(String userInput){
        StringBuilder stringbuilder = new StringBuilder(userInput);
        return stringbuilder.reverse().toString();
    }

}
