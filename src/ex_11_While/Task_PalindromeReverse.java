package ex_11_While;

public class Task_PalindromeReverse {
    public static void main(String[] args) {
        String str = "Madam";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str);
        System.out.println(rev);
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
            System.out.println(reversed);

        }
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is Palindrome ");
        } else {
            System.out.println(str + " is not Palindrome");
        }

    }
}
