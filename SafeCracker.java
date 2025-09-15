package friday_tasks_12th_sep;

import java.util.Scanner;

public class SafeCracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //base conversion from decimal-> String var= Integer.toString(decimalNumber, base);
        //reverse from any base to decimal-> int var = Integer.parseInt("number",base);

        //10 to binary
   /*     String binNum = Integer.toString(10, 2);
        System.out.println(binNum);

        int decNum = Integer.parseInt("1010",2);
        System.out.println(decNum);*/

        //a no. in base 4, 5 and 6

        try {
            String A, B, C;

            System.out.print("Enter code A:");
            A = sc.nextLine();
            System.out.print("Enter code B:");
            B = sc.nextLine();
            System.out.print("Enter code C:");
            C = sc.nextLine();

//        check if all of them are the same in decimal
            int numA, numB, numC;
            numA = Integer.parseInt(A, 4);
            System.out.println(A + " to decimal: " + numA);

            numB = Integer.parseInt(B, 5);
            System.out.println(B + " to decimal: " + numB);

            numC = Integer.parseInt(C, 6);
            System.out.println(C + " to decimal: " + numC);

            if (numA == numB && numB == numC)
                System.out.println("SAFE OPEN");
            else
                System.out.println("SAFE LOCKED");
        }
        catch (NumberFormatException e){
            System.out.println(e.getLocalizedMessage());

        }

    }
}
