package ex_11_While;

import java.util.Scanner;

public class Task_vowels_Consonants_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.next();
        int vowel = 0, consonant = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else {
                consonant++;
            }

        }
        System.out.println("Vowels: " + vowel + "\nConsonant: " + consonant);

    }
}
