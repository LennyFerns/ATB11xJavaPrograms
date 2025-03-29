package ex_14_Strings;

import java.util.Scanner;

public class Task010_Count_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter word");
        String word = sc.next();
        int vowels = 0;
        int consonant = 0;

        word= word.toLowerCase();
        System.out.println(word);

        for(int i = 0; i < word.length();i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u' ){
                vowels++;
            }else {
                consonant++;
            }

        }
        System.out.println("Vowels: " +vowels+ " Consonant: " +consonant);

    }
}
