package friday_tasks_12th_sep;

import java.util.Scanner;

public class MovieTicket {
   static Scanner scanner = new Scanner(System.in);

    public static void showTime() {
        System.out.println("choose time\n1. Morning show\n2. Afternoon show\n3. Evening show");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("The price is R.150");
                break;
            case 2:
                System.out.println("The price is R.200");
                break;
            case 3:
                System.out.println("The price is R.250");
                break;
            default:
                System.out.println("invalid show time");
        }
    }

    public static void main(String[] args) {

        while(true){
        System.out.println("MOVIES\n1. Action\n2. Comedy\n3. Drama\n What movie do you want?: ");
        int input = scanner.nextInt();
        if(input<1 || input>3) {
            System.out.println("wrong entry");
            continue;

        }
        showTime();
        break;
        }

    }
}
