package friday_tasks_12th_sep;

import static friday_tasks_12th_sep.MovieTicket.scanner;

public class RailwayTT {
    public static void main(String[] args) {



        int choice;
        System.out.println("\nTRAINS AVAILABLE\n1. Bhubaneswar to Delhi\n2. Bhubaneswar to Kolkata\n3. Bhubaneswar to Chennai");
        System.out.print("\nSelect your train of choice:");
        choice=scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Dep 8 AM, Arr 8PM");
                break;
            case 2:
                System.out.println("Dep 6 AM, Arr 2 PM");
                break;
            case 3:
                System.out.println("Dep 9 AM, Arr 9PM");
                break;
            default:
                System.out.println("Train not Available");


        }


    }

}
