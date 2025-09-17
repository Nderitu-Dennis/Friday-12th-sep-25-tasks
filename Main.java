package friday_tasks_12th_sep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any input: ");
        String input = sc.nextLine();

        //loop thru input

        char[] arr = input.toCharArray();

        for (char c : arr) {
            System.out.println(c);

            // check for digit
            if(c >= '0' && c <='9'){
                System.out.println("DIGIT FOUND: " + c);
            }
        }
    }
}















