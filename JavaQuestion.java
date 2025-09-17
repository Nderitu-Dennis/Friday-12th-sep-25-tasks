package friday_tasks_12th_sep;

/*
Question:

Write a Java program that:
Accepts a string input from the user.
Counts how many vowels, consonants, digits, and special characters are in the string.
Prints the counts for each category.
*/

import java.util.Scanner;

public class JavaQuestion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input;
        boolean isConsonant = false;
        System.out.print("Enter a string: ");
        input = sc.nextLine().toLowerCase();

//        check vowels
//        define an array with vowels and check wats not inside
        char[] vowelArr = {'a', 'e', 'i', 'o', 'u'};
        int vowelCounter = 0;
        int consonantCounter = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            for (int n : vowelArr) {
//               compare c with  vowelArr:
                if (c == n) {
                    vowelCounter++;
                    System.out.println("vowels: " + c);
                    isConsonant = false;
                    break;
                }

//     decide if a character is a consonant after checking all vowels
                else {
                    isConsonant = true;
                }
            }

            if (isConsonant) {
                consonantCounter++;
                System.out.println("consonant: " + c);
            }
        }

        System.out.println("\nvowel count: " + vowelCounter);
        System.out.println("consonant count: " + consonantCounter);


    }


}










